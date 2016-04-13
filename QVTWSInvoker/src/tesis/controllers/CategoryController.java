package tesis.controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
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

    private CategoryUI categoryUI;
    private DefaultTableModel tableCategoryDefault;
    private JTable tableCategory;
    private MainUI mainUI;
    private JTextField categoryNameSearch;
    private boolean isNew, editing;
    private CategoryCRUD categoryCRUD;
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
        categoryNameSearch = categoryUI.getSearch();
        categories  = categoryCRUD.searchCategory("");
        refreshList();
        categoryNameSearch.addKeyListener(new java.awt.event.KeyAdapter() {
            @Override
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchKeyReleased(evt);
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

    private void searchKeyReleased(KeyEvent evt) {
        DataBase.openDataBase();
        categories = categoryCRUD.searchCategory(categoryUI.getSearch().getText());
        refreshList();
        Base.close();
    }

    private void tableCategoryEvent() {
        int r = tableCategory.getSelectedRow();
       
        if (r != -1) {
        	categoryUI.getId().setText( (String) tableCategoryDefault.getValueAt(r, 0));
        	categoryUI.getNameCat().setText((String) tableCategoryDefault.getValueAt(r, 1));
            categoryUI.categorySelected(true);
        } else {
            categoryUI.categorySelected(false);
        }
    }

    @Override
    public void actionPerformed(ActionEvent e) {
        DataBase.openDataBase();
        if (e.getSource() == categoryUI.getNewCat()) {
            categoryUI.clickNew();
            isNew = true;
            editing = true;
        }
        if (e.getSource() == categoryUI.getDelete()) {
            Integer resp = JOptionPane.showConfirmDialog(categoryUI, "Do you want to delete the category " + categoryUI.getNameCat().getText() + "?", "Confirm deletion", JOptionPane.YES_NO_OPTION);
            if (resp == JOptionPane.YES_OPTION) {
                if (categoryCRUD.delete(Integer.valueOf(categoryUI.getId().getText()))) {
                    JOptionPane.showMessageDialog(categoryUI, "Category deleted successfully!");
                    categoryUI.clickSave();
                    categories  = categoryCRUD.searchCategory("");
                    refreshList();
                } else {
                    JOptionPane.showMessageDialog(categoryUI, "An error has occurred, the category wasn't deleted", "Error!", JOptionPane.ERROR_MESSAGE);
                }
            }
        }
        if (e.getSource() == categoryUI.getEdit()) {
            isNew = false;
            editing = true;
            categoryUI.clickEdit();
        }
        if (e.getSource() == categoryUI.getSave() && editing && isNew) {
            Category c = new Category();
            if (loadData(c)) {
                if (categoryCRUD.create(c)) {
                    categoryUI.clickSave();
                    editing = false;
                    categories  = categoryCRUD.searchCategory("");
                    refreshList();
                    JOptionPane.showMessageDialog(categoryUI, "¡Category successfully saved!");
                } else {
                    JOptionPane.showMessageDialog(categoryUI, "There was an error, review the data", "Error!", JOptionPane.ERROR_MESSAGE);
                }
            }
        }
        if (e.getSource() == categoryUI.getSave() && editing && !isNew) {
            Category c = new Category();
            if (loadData(c)) {
                if (categoryCRUD.edit(c)) {
                    categoryUI.clickSave();
                    editing = false;
                    categories  = categoryCRUD.searchCategory("");
                    refreshList();
                    JOptionPane.showMessageDialog(categoryUI, "¡Category successfully saved!");
                } else {
                    JOptionPane.showMessageDialog(categoryUI, "There was an error, review the data", "Error!", JOptionPane.ERROR_MESSAGE);
                }
            }
        }
        Base.close();
    }

    private boolean loadData(Category c) {
        boolean ret = true;
        if (!categoryUI.getId().getText().isEmpty()){
        	 c.set("id", Integer.valueOf(categoryUI.getId().getText()));
        }
        try {
            String name = StringTreatment.deleteAccent(categoryUI.getNameCat().getText());
            c.set("name", name);
        } catch (ClassCastException e) {
            ret = false;
            JOptionPane.showMessageDialog(categoryUI, "Error in the name", "Error!", JOptionPane.ERROR_MESSAGE);
        }
        return ret;
    }

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
