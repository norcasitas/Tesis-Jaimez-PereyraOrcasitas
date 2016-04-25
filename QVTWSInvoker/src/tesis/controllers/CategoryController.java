package tesis.controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Iterator;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import org.javalite.activejdbc.Base;
import tesis.utils.StringTreatment;
import tesis.ui.CategoryUI;
import tesis.ui.MainUI;
import tesis.crud.CategoryCRUD;
import tesis.models.Category;
import tesis.utils.DataBase;

public class CategoryController implements ActionListener {

    private CategoryUI categoryUI; //(*-)gui for management of categories
    private DefaultTableModel tableCategoryDefault;
    private JTable tableCategory;
    private MainUI mainUI;
    private JTextField categoryNameSearch; //(*-)textfield for search
    private boolean isNew, editing;
    private CategoryCRUD categoryCRUD; //(*-)crud for categories
    private java.util.List<Category> categories;

    public CategoryController(MainUI mainUI, CategoryUI categoryUI) {
        DataBase.openDataBase();
        this.categoryUI = categoryUI;
        this.mainUI = mainUI;
        isNew = true;
        editing = false;
        categoryCRUD = new CategoryCRUD();
        tableCategory = categoryUI.getTableCategory();
        tableCategoryDefault = categoryUI.getCategoriesDefault();
        categoryNameSearch = categoryUI.getTxtSearch();
        categories = categoryCRUD.searchCategory("");
        refreshList();
        categoryNameSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            @Override
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchKeyReleased();
            }
        });
        tableCategory.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableCategoryEvent();
            }
        });
        tableCategory.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                tableCategoryEvent();
            }
        });
        categoryUI.setActionListener(this);
    }

    /**
     * (*-)realiza una busqueda cada vez que se teclea sobre el textfield de
     * búsqueda
     *
     * @param evt
     */
    private void searchKeyReleased() {
        DataBase.openDataBase();
        categories = categoryCRUD.searchCategory(categoryUI.getTxtSearch().getText());
        refreshList();
        Base.close();
    }

    /**
     * (*-)carga los datos para ser mostrados cuando cambia la selección sobre
     * la tabla
     */
    private void tableCategoryEvent() {
        int r = tableCategory.getSelectedRow();
        if (r != -1) {
            categoryUI.getTxtId().setText((String) tableCategoryDefault.getValueAt(r, 0));
            categoryUI.getTxtName().setText((String) tableCategoryDefault.getValueAt(r, 1));
            categoryUI.categorySelected(true);
        } else {
            categoryUI.categorySelected(false);
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        DataBase.openDataBase();
        if (e.getSource() == categoryUI.getBtnNewCat()) {
            categoryUI.clickNew();
            isNew = true;
            editing = true;
        }
        if (e.getSource() == categoryUI.getBtnDelete()) {
            if (!editing) {
                Integer resp = JOptionPane.showConfirmDialog(categoryUI, "Do you want to delete the category " + categoryUI.getTxtName().getText() + "?", "Confirm deletion", JOptionPane.YES_NO_OPTION);
                if (resp == JOptionPane.YES_OPTION) {
                    if (categoryCRUD.delete(Integer.valueOf(categoryUI.getTxtId().getText()))) {
                        JOptionPane.showMessageDialog(categoryUI, "Category deleted successfully!");
                        categoryUI.clickSave();
                        categories = categoryCRUD.searchCategory("");
                        refreshList();
                    } else {
                        JOptionPane.showMessageDialog(categoryUI, "An error has occurred, the category wasn't deleted", "Error!", JOptionPane.ERROR_MESSAGE);
                    }
                }
            } else {
                Integer resp = JOptionPane.showConfirmDialog(categoryUI, "Do you want to cancel the edition? ", "Confirm cancel", JOptionPane.YES_NO_OPTION);
                if (resp == JOptionPane.YES_OPTION) {
                    categoryUI.clickSave();
                    editing = false;
                }
            }
        }
        if (e.getSource() == categoryUI.getBtnEdit()) {
            isNew = false;
            editing = true;
            categoryUI.clickEdit();
        }
        if (e.getSource() == categoryUI.getBtnSave() && editing && isNew) {
            Category c = new Category();
            if (loadData(c)) {
                if (categoryCRUD.create(c)) {
                    categoryUI.clickSave();
                    editing = false;
                    categories = categoryCRUD.searchCategory("");
                    refreshList();
                    JOptionPane.showMessageDialog(categoryUI, "¡Category successfully saved!");
                } else {
                    JOptionPane.showMessageDialog(categoryUI, "There was an error, review the data", "Error!", JOptionPane.ERROR_MESSAGE);
                }
            }
        }
        if (e.getSource() == categoryUI.getBtnSave() && editing && !isNew) {
            Category c = new Category();
            if (loadData(c)) {
                if (categoryCRUD.edit(c)) {
                    categoryUI.clickSave();
                    editing = false;
                    categories = categoryCRUD.searchCategory("");
                    refreshList();
                    JOptionPane.showMessageDialog(categoryUI, "¡Category successfully saved!");
                } else {
                    JOptionPane.showMessageDialog(categoryUI, "There was an error, review the data", "Error!", JOptionPane.ERROR_MESSAGE);
                }
            }
        }
        Base.close();
    }

    /**
     * (*-)this method loads a category from the gui
     *
     * @param c
     * @return
     */
    private boolean loadData(Category c) {
        boolean ret = true;
        if (!categoryUI.getTxtId().getText().isEmpty()) {
            c.set("id", Integer.valueOf(categoryUI.getTxtId().getText()));
        }
        try {
            String name = StringTreatment.deleteAccent(categoryUI.getTxtName().getText());
            c.set("name", name);
        } catch (ClassCastException e) {
            ret = false;
            JOptionPane.showMessageDialog(categoryUI, "Error in the name", "Error!", JOptionPane.ERROR_MESSAGE);
        }
        return ret;
    }

    /**
     * (*-)this method updates the table
     */
    private void refreshList() {
        tableCategoryDefault.setRowCount(0);
        Iterator<Category> it = categories.iterator();
        while (it.hasNext()) {
            Category c = it.next();
            Object row[] = new String[2];
            row[0] = c.getString("id");
            row[1] = c.getString("name");
            tableCategoryDefault.addRow(row);
        }
    }

}
