package tesis.controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.event.ItemEvent;
import java.awt.event.ItemListener;
import java.io.File;
import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.List;
import java.util.logging.Level;
import java.util.logging.Logger;
import t2m.T2Mwsdl;
import t2m.Transformation;
import tesis.crud.CategoryCRUD;
import tesis.crud.WsdlCRUD;
import tesis.models.Category;
import tesis.models.Wsdl;
import tesis.ui.InvokerUI;
import tesis.ui.MainUI;
import tesis.utils.DataBase;
import utils.Utils;

public class InvokerController implements ActionListener, ItemListener {

    private InvokerUI invokerUI;
    private MainUI mainUI;
    private CategoryCRUD categoryCRUD;
    private WsdlCRUD wsdlCRUD;
    private List<Category> categories;

    public InvokerController(MainUI mainUI, InvokerUI invokerUI) {
        this.invokerUI = invokerUI;
        this.mainUI = mainUI;
        categoryCRUD = new CategoryCRUD();
        loadCategories();
        invokerUI.setActionListener(this);
        invokerUI.setItemListener(this);
    }

    private void loadCategories() {
        DataBase.openDataBase();
        categories = categoryCRUD.getAllCategories();
        for (Category c : categories) {
            invokerUI.getSpnCategory().addItem(c.get("name"));
        }
        invokerUI.getBtnSearchInvoke().setEnabled(invokerUI.getSpnCategory().getItemCount() != 0);

    }

    @Override
    public void actionPerformed(ActionEvent e) {
        DataBase.openDataBase();
        if (e.getSource() == invokerUI.getBtnSearchInvoke()) {
            List<Wsdl> wsdls = categoryCRUD.getChilds(categories.get(invokerUI.getSpnCategory().getSelectedIndex()));
            for (Wsdl wsdl : wsdls) {
                try {
                    String nameDefinition = new T2Mwsdl().transformT2M(wsdl.getString("url"));
                    new Transformation().startTransformation(Utils.getAbsolutePathRunning() + "/folder_outputs/" + nameDefinition + ".xmi", Utils.getAbsolutePathRunning() + "/folder_outputs/" + nameDefinition + ".xmi");
                } catch (MalformedURLException ex) {
                    Logger.getLogger(InvokerController.class.getName()).log(Level.SEVERE, null, ex);
                } catch (IOException ex) {
                    Logger.getLogger(InvokerController.class.getName()).log(Level.SEVERE, null, ex);
                }
            }
        }
    }

    @Override
    public void itemStateChanged(ItemEvent e) {
        invokerUI.enableParams(Integer.valueOf((String) e.getItem()));
    }

    /**
     * Return true if the url is a local file and exists if a url web then
     * return false
     *
     * @param url
     * @return
     */
    private boolean isLocalFileAndExists(String url) {
        try {
            new URL(url);
        } catch (java.net.MalformedURLException ex) {
            return new File(url).exists();
        }
        return false;
    }
}
