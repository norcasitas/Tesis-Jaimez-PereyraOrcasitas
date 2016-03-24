package controllers;

import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import UI.InvokerUI;
import UI.MainUI;



public class InvokerController implements ActionListener{

    private InvokerUI invokerUI;
    private MainUI mainUI;

    public InvokerController( MainUI mainUI, InvokerUI invokerUI) {
        this.invokerUI = invokerUI;
        this.mainUI = mainUI;
        invokerUI.setActionListener(this);
    }
    
    
    
    @Override
    public void actionPerformed(ActionEvent e) {

    }
    
}
