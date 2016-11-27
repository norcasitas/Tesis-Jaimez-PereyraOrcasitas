package tesis.controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.IOException;
import java.net.MalformedURLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JFrame;
import javax.swing.UIManager;
import t2m.T2Mwsdl;
import t2m.Transformation;
import tesis.ui.CategoryUI;
import tesis.ui.InvokerUI;
import tesis.ui.MainUI;
import tesis.ui.WSDLUI;
import tesis.utils.DataBase;
import tesis.utils.InvokeWS;
import utils.Utils;

public class Main implements ActionListener {

    private CategoryUI categoryUI;
    private InvokerUI invokerUI;
    private WSDLUI wsdlUI;
    private MainUI mainUI;
    private CategoryController categoryController;
    private InvokerController invokerController;
    private WSDLController wsdlController;

    public Main() {
        try {
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
        } catch (Exception e) {
            System.err.println(e);
        }
        DataBase.openDataBase();
        mainUI = new MainUI();
        mainUI.setExtendedState(JFrame.MAXIMIZED_BOTH);
        categoryUI = new CategoryUI();
        invokerUI = new InvokerUI();
        wsdlUI = new WSDLUI();
        categoryController = new CategoryController(mainUI, categoryUI);
        invokerController = new InvokerController(mainUI, invokerUI);
        wsdlController = new WSDLController(mainUI, wsdlUI);
        mainUI.getContainer().add(wsdlUI);
        mainUI.getContainer().add(invokerUI);
        mainUI.getContainer().add(categoryUI);
        mainUI.setVisible(true);
        mainUI.toFront();
        mainUI.setActionListener(this);
        //runs the QoS statistics
        new Runnable() {

            @Override
            public void run() {
                InvokeWS invkws = new InvokeWS();
                invkws.qoSStatistics();
            }
        }.run();
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == mainUI.getCategory()) {
            categoryUI.setVisible(true);
            categoryUI.toFront();
        }
        if (ae.getSource() == mainUI.getInvoker()) {
            invokerController.loadCategories();
            invokerUI.setVisible(true);
            invokerUI.toFront();
        }
        if (ae.getSource() == mainUI.getWsdl()) {
            wsdlUI.setVisible(true);
            wsdlUI.toFront();
        }
    }

    public static void main(String[] args) {
        new Main();
        /*String url = "http://www.ignyte.com/webservices/ignyte.whatsshowing.webservice/moviefunctions.asmx?wsdl";
        try {
            String nameDefinition = new T2Mwsdl().transformT2M(url);
            String outputPath = Utils.getAbsolutePathRunning() + "/folder_outputs/" + nameDefinition + ".xmi";
            new Transformation().startTransformation(Utils.getAbsolutePathRunning() + "/folder_outputs/" + nameDefinition + ".xmi", outputPath);
        } catch (MalformedURLException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        } catch (IOException ex) {
            Logger.getLogger(Main.class.getName()).log(Level.SEVERE, null, ex);
        }*/
    }

}
