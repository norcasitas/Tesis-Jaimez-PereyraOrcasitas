package tesis.controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.beans.PropertyVetoException;
import javax.swing.JFrame;
import javax.swing.UIManager;
import tesis.ui.CategoryUI;
import tesis.ui.InvokerUI;
import tesis.ui.MainUI;
import tesis.ui.WSDLUI;
import tesis.utils.DataBase;
import tesis.utils.InvokeWS;

public class Main implements ActionListener {

    private CategoryUI categoryUI;
    private InvokerUI invoketUI;
    private WSDLUI wsdlUI;
    private MainUI mainUI;
    private CategoryController categoryController;
    private InvokerController invokertController;
    private WSDLController wsdlController;

    public Main() {
        try {
            UIManager.setLookAndFeel("com.sun.java.swing.plaf.nimbus.NimbusLookAndFeel");
        } catch (Exception e) {
            e.printStackTrace();
        }
        DataBase.openDataBase();
        mainUI = new MainUI();
        mainUI.setExtendedState(JFrame.MAXIMIZED_BOTH);
        categoryUI = new CategoryUI();
        invoketUI = new InvokerUI();
        wsdlUI = new WSDLUI();
        categoryController = new CategoryController(mainUI, categoryUI);
        invokertController = new InvokerController(mainUI, invoketUI);
        wsdlController = new WSDLController(mainUI, wsdlUI);
        mainUI.getContainer().add(wsdlUI);
        mainUI.getContainer().add(invoketUI);
        mainUI.getContainer().add(categoryUI);
        mainUI.setVisible(true);
        mainUI.toFront();
        mainUI.setActionListener(this);
        InvokeWS invkws = new InvokeWS();
        invkws.qoSStatistics();
        try {
            invoketUI.setMaximum(true);
        } catch (PropertyVetoException e) {
            // Vetoed by internalFrame
        }
    }

    @Override
    public void actionPerformed(ActionEvent ae) {
        if (ae.getSource() == mainUI.getCategory()) {
            categoryUI.setVisible(true);
            categoryUI.toFront();
        }
        if (ae.getSource() == mainUI.getInvoker()) {
            invoketUI.setVisible(true);
            invoketUI.toFront();
        }
        if (ae.getSource() == mainUI.getWsdl()) {
            wsdlUI.setVisible(true);
            wsdlUI.toFront();
        }
    }

    public static void main(String[] args) {
        Main m = new Main();
    }

}
