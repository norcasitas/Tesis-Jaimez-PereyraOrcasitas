package controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.KeyEvent;
import java.awt.event.MouseEvent;
import java.util.Iterator;
import java.util.LinkedList;
import javax.swing.JOptionPane;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import org.javalite.activejdbc.Model;
import utils.StringTreatment;
import UI.MainUI;
import UI.WSDLUI;
import crud.CategoryCRUD;
import crud.WsdlCRUD;
import models.Category;
import models.Wsdl;

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
        this.wsdlUI = wsdlUI;
        this.mainUI = mainUI;
        isNew = true;
        editing = false;
        categoryCRUD = new CategoryCRUD();
        wsdlCRUD = new WsdlCRUD();
        tableWSDLDefault = wsdlUI.getWsdlDefault();
        tableWSDL = wsdlUI.getTableWSDL();
        wsdls = new LinkedList<>();
        categories  = new LinkedList<>();
        //wsdls = Wsdl.findAll();
        refreshList();
//        categories = Category.findAll();
        for (Category c : categories) {
            wsdlUI.getCbCategory().addItem(c.getString("name"));
        }
        wsdlUI.getSearch().addKeyListener(new java.awt.event.KeyAdapter() {
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

    private void searchKeyReleased(KeyEvent evt) {
        wsdlCRUD.searchWSDL(wsdlUI.getSearch().getText());
        refreshList();
    }

    private void tableWSDLEvent() {
        int r = tableWSDL.getSelectedRow();
        if (r != -1) {
            wsdlUI.wsdlSelected(true);
        } else {
            wsdlUI.wsdlSelected(false);
        }

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        if (e.getSource() == wsdlUI.getNewWSDL()) {
            wsdlUI.clickNew();
            isNew = true;
            editing = true;
        }
        if (e.getSource() == wsdlUI.getDelete()) {
            Integer resp = JOptionPane.showConfirmDialog(wsdlUI, "Do you want to delete the WSDL " + wsdlUI.getNameWSDL().getText() + "?", "Confirm deletion", JOptionPane.YES_NO_OPTION);
            if (resp == JOptionPane.YES_OPTION) {
                if (wsdlCRUD.delete(Integer.valueOf(wsdlUI.getId().getText()))) {
                    JOptionPane.showMessageDialog(wsdlUI, "WSDL deleted successfully!");
                    wsdlUI.clickSave();
                } else {
                    JOptionPane.showMessageDialog(wsdlUI, "An error has occurred, the WSDL wasn't deleted", "Error!", JOptionPane.ERROR_MESSAGE);
                }
            }
        }
        if (e.getSource() == wsdlUI.getEdit()) {
            isNew = false;
            editing = true;
            wsdlUI.clickEdit();
        }
        if (e.getSource() == wsdlUI.getSave() && editing && isNew) {
            Wsdl w = new Wsdl();
            if (loadData(w)) {
                if (wsdlCRUD.create(w)) {
                    wsdlUI.clickSave();
                    editing = false;
                    JOptionPane.showMessageDialog(wsdlUI, "¡WSDL successfully saved!");
                } else {
                    JOptionPane.showMessageDialog(wsdlUI, "There was an error, review the data", "Error!", JOptionPane.ERROR_MESSAGE);
                }
            }
        }
        if (e.getSource() == wsdlUI.getSave() && editing && !isNew) {
            Wsdl w = new Wsdl();
            if (loadData(w)) {
                if (wsdlCRUD.editInformation(w)) {
                    wsdlUI.clickSave();
                    editing = false;
                    JOptionPane.showMessageDialog(wsdlUI, "¡WSDL successfully saved!");
                } else {
                    JOptionPane.showMessageDialog(wsdlUI, "There was an error, review the data", "Error!", JOptionPane.ERROR_MESSAGE);
                }
            }
        }
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
            row[3] = Category.findById(w.getString("category_id")).getString("name");
            tableWSDLDefault.addRow(row);
        }
    }

    private boolean loadData(Wsdl w) {
        boolean ret = true;
        try {
            String name = StringTreatment.deleteAccent(wsdlUI.getNameWSDL().getText());
            w.set("name", name);
        } catch (ClassCastException e) {
            ret = false;
            JOptionPane.showMessageDialog(wsdlUI, "Error in the name", "Error!", JOptionPane.ERROR_MESSAGE);
        }
        try {
            String url = wsdlUI.getUrl().getText();
            w.set("url", url);
        } catch (ClassCastException e) {
            ret = false;
            JOptionPane.showMessageDialog(wsdlUI, "Error in the url", "Error!", JOptionPane.ERROR_MESSAGE);
        }
        try {
            String id = categories.get(wsdlUI.getCbCategory().getSelectedIndex()).getString("id");
            w.set("category_id", id);
        } catch (ClassCastException e) {
            ret = false;
            JOptionPane.showMessageDialog(wsdlUI, "Error in the name", "Error!", JOptionPane.ERROR_MESSAGE);
        }
        return ret;
    }

}
