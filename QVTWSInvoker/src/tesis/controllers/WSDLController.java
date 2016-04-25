package tesis.controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.util.Iterator;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import org.javalite.activejdbc.Base;
import tesis.utils.StringTreatment;
import tesis.ui.MainUI;
import tesis.ui.WSDLUI;
import tesis.crud.CategoryCRUD;
import tesis.crud.WsdlCRUD;
import tesis.models.Category;
import tesis.models.Wsdl;
import tesis.utils.DataBase;

public class WSDLController implements ActionListener {

    private WSDLUI wsdlUI;
    private DefaultTableModel tableWSDLDefault;
    private JTable tableWSDL;
    private MainUI mainUI;
    private boolean isNew, editing;
    private WsdlCRUD wsdlCRUD;

    private CategoryCRUD categoryCRUD; 
    private java.util.List<Wsdl> wsdls;
    private java.util.List<Category> categories;

    public WSDLController(MainUI mainUI, WSDLUI wsdlUI) {
        DataBase.openDataBase();
        this.wsdlUI = wsdlUI;
        this.mainUI = mainUI;
        isNew = true;
        editing = false;
        categoryCRUD = new CategoryCRUD();
        wsdlCRUD = new WsdlCRUD();
        tableWSDLDefault = wsdlUI.getWsdlDefault();
        tableWSDL = wsdlUI.getTableWSDL();
        wsdls = wsdlCRUD.searchWSDLbyName("");
        refreshList();
        loadCB();
        wsdlUI.getTxtSearch().addKeyListener(new java.awt.event.KeyAdapter() {
            @Override
            public void keyReleased(java.awt.event.KeyEvent evt) {
                searchKeyReleased(evt);
            }
        });
        tableWSDL.addMouseListener(new java.awt.event.MouseAdapter() {
            @Override
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tableWSDLEvent();
            }
        });

        tableWSDL.getSelectionModel().addListSelectionListener(new ListSelectionListener() {
            @Override
            public void valueChanged(ListSelectionEvent e) {
                tableWSDLEvent();
            }
        });
        wsdlUI.setActionListener(this);
    }

    /**
     * laod category spinner
     */
    private void loadCB() {
        wsdlUI.getSpnCategory().removeAllItems();
        categories = categoryCRUD.getAllCategories();
        for (Category c : categories) {
            wsdlUI.getSpnCategory().addItem(c.getString("name"));
        }
    }

    /**
     * it does a search every time you type on the search textfield
     *
     * @param evt
     */
    private void searchKeyReleased(KeyEvent evt) {
        DataBase.openDataBase();
        wsdls = wsdlCRUD.searchWSDL(wsdlUI.getTxtSearch().getText());
        refreshList();
    }

    /**
     * upload the data to be displayed when the selection on the table changes.
     */
    private void tableWSDLEvent() {
        int r = tableWSDL.getSelectedRow();
        if (r != -1) {
            wsdlUI.getTxtId().setText((String) tableWSDLDefault.getValueAt(r, 0));
            wsdlUI.getTxtName().setText((String) tableWSDLDefault.getValueAt(r, 1));
            wsdlUI.getTxtUrl().setText((String) tableWSDLDefault.getValueAt(r, 2));
            wsdlUI.getSpnCategory().setSelectedItem((String) tableWSDLDefault.getValueAt(r, 3));
            wsdlUI.wsdlSelected(true);
        } else {
            wsdlUI.wsdlSelected(false);
        }

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        DataBase.openDataBase();
        if (e.getSource() == wsdlUI.getBtnNewWSDL()) {
            wsdlUI.clickNew();
            loadCB();
            isNew = true;
            editing = true;
        }
        if (e.getSource() == wsdlUI.getBtnDelete()) {
            if (!editing) {
                Integer resp = JOptionPane.showConfirmDialog(wsdlUI, "Do you want to delete the WSDL " + wsdlUI.getTxtName().getText() + "?", "Confirm deletion", JOptionPane.YES_NO_OPTION);
                if (resp == JOptionPane.YES_OPTION) {
                    if (wsdlCRUD.delete(Integer.valueOf(wsdlUI.getTxtId().getText()))) {
                        JOptionPane.showMessageDialog(wsdlUI, "WSDL deleted successfully!");
                        wsdlUI.clickSave();
                        wsdls = wsdlCRUD.searchWSDLbyName("");
                        refreshList();
                    } else {
                        JOptionPane.showMessageDialog(wsdlUI, "An error has occurred, the WSDL wasn't deleted", "Error!", JOptionPane.ERROR_MESSAGE);
                    }
                }
            } else {
                Integer resp = JOptionPane.showConfirmDialog(wsdlUI, "Do you want to cancel the edition? ", "Confirm cancel", JOptionPane.YES_NO_OPTION);
                if (resp == JOptionPane.YES_OPTION) {
                    wsdlUI.clickSave();
                    editing = false;
                }
            }
        }
        if (e.getSource() == wsdlUI.getBtnEdit()) {
            isNew = false;
            editing = true;
            wsdlUI.clickEdit();
        }
        if (e.getSource() == wsdlUI.getBtnSave() && editing && isNew) {
            Wsdl w = new Wsdl();
            if (loadData(w)) {
                if (wsdlCRUD.create(w)) {
                    wsdlUI.clickSave();
                    editing = false;
                    wsdls = wsdlCRUD.searchWSDLbyName("");
                    refreshList();
                    JOptionPane.showMessageDialog(wsdlUI, "¡WSDL successfully saved!");
                } else {
                    JOptionPane.showMessageDialog(wsdlUI, "There was an error, review the data", "Error!", JOptionPane.ERROR_MESSAGE);
                }
            }
        }
        if (e.getSource() == wsdlUI.getBtnSave() && editing && !isNew) {
            Wsdl w = new Wsdl();
            if (loadData(w)) {
                if (wsdlCRUD.editInformation(w)) {
                    wsdlUI.clickSave();
                    editing = false;
                    wsdls = wsdlCRUD.searchWSDLbyName("");
                    refreshList();
                    JOptionPane.showMessageDialog(wsdlUI, "¡WSDL successfully saved!");
                } else {
                    JOptionPane.showMessageDialog(wsdlUI, "There was an error, review the data", "Error!", JOptionPane.ERROR_MESSAGE);
                }
            }
        }
        Base.close();
    }

    private void refreshList() {

        tableWSDLDefault.setRowCount(0);
        Iterator<Wsdl> it = wsdls.iterator();
        while (it.hasNext()) {
            Wsdl w = it.next();
            Object row[] = new String[4];
            row[0] = w.getString("id");
            row[1] = w.getString("name");
            row[2] = w.getString("url");
            row[3] = Category.findById(w.getInteger("category_id")).getString("name");
            tableWSDLDefault.addRow(row);
        }
    }

    /**
     * load a Wsdl and returns it
     *
     * @param w
     * @return
     */
    private boolean loadData(Wsdl w) {
        boolean ret = true;
        if (!wsdlUI.getTxtId().getText().isEmpty()) {
            w.set("id", Integer.valueOf(wsdlUI.getTxtId().getText()));
        }
        try {
            String name = StringTreatment.deleteAccent(wsdlUI.getTxtName().getText());
            w.set("name", name);
        } catch (ClassCastException e) {
            ret = false;
            JOptionPane.showMessageDialog(wsdlUI, "Error in the name", "Error!", JOptionPane.ERROR_MESSAGE);
        }
        try {
            String url = wsdlUI.getTxtUrl().getText();
            w.set("url", url);
        } catch (ClassCastException e) {
            ret = false;
            JOptionPane.showMessageDialog(wsdlUI, "Error in the url", "Error!", JOptionPane.ERROR_MESSAGE);
        }
        try {
            int id = categories.get(wsdlUI.getSpnCategory().getSelectedIndex()).getInteger("id");
            w.set("category_id", id);
        } catch (ClassCastException e) {
            ret = false;
            JOptionPane.showMessageDialog(wsdlUI, "Error in the category", "Error!", JOptionPane.ERROR_MESSAGE);
        }
        return ret;
    }

}
