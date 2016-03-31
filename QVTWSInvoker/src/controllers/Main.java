package controllers;

import java.awt.Cursor;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.sql.SQLException;

import javax.swing.JFrame;
import javax.swing.JOptionPane;
import javax.swing.UIManager;
import org.javalite.activejdbc.Base;
import UI.CategoryUI;
import UI.InvokerUI;
import UI.MainUI;
import UI.WSDLUI;

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
        if (!Base.hasConnection()) {
        Base.open("org.postgresql.Driver", "jdbc:postgresql://localhost:5432/qvtwsinvoker", "postgres", "root");
        }
        mainUI = new MainUI();
        mainUI.setCursor(Cursor.WAIT_CURSOR);
       
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

    static public void openDB() {
        if (!Base.hasConnection()) {
            try {
                Base.open("org.postgresql.Driver", "jdbc:postgresql://localhost:5432/qvtwsinvoker", "postgres", "root");
                Base.connection().setAutoCommit(true);
            } catch (Exception e) {
                JOptionPane.showMessageDialog(null, "Ocurrió un error, no se realizó la conexión con el servidor, verifique la conexión \n " + e.getMessage(), null, JOptionPane.ERROR_MESSAGE);
            }
        }
    }

    public static void main(String[] args) {
    	openDB();
         Main m = new Main();
    }

}
