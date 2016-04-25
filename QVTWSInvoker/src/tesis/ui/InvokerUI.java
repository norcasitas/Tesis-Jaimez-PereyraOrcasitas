package tesis.ui;

import java.awt.event.ActionListener;
import java.awt.event.ItemListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import tesis.utils.TypesOfWsdl;

public class InvokerUI extends javax.swing.JInternalFrame {

    public InvokerUI() {
        initComponents();
        setTypes();
    }

    /**
     * (*-)Agrega los tipos permitidos en la requestModel, a los parametros
     */
    private void setTypes() {
        for (String type : TypesOfWsdl.typesWSDL) {
            spnType1.addItem(type);
            spnType2.addItem(type);
            spnType3.addItem(type);
            spnType4.addItem(type);
            spnType5.addItem(type);
        }
    }

    /**
     * (*-) This method adds an actionListener to the buttons
     *
     * @param lis
     */
    public void setActionListener(ActionListener lis) {
        this.btnSearchInvoke.addActionListener(lis);
        this.btnYes.addActionListener(lis);
        this.btnNo.addActionListener(lis);
        this.spnCategory.addActionListener(lis);
    }

    /**
     * (*-) This method adds an ItemListenerr to the spinner param
     *
     * @param lis
     */
    public void setItemListener(ItemListener lis) {
        this.spnNumberParam.addItemListener(lis);
    }

    /**
     * (*-) habilita los botones para votar por el resultado de la invocación
     *
     * @param b
     */
    public void enableResult(Boolean b) {
        btnYes.setEnabled(b);
        btnNo.setEnabled(b);
    }

    public JComboBox getSpnNumberParam() {
        return spnNumberParam;
    }

    /**
     * (*-)habilita los parametros que se desean
     *
     * @param i
     */
    public void enableParams(int i) {
        for (int j = 0; j < 5; j++) {
            getPanelParamater(j).setVisible((j < i));
        }

    }

    public JComboBox getSpnCategory() {
        return spnCategory;
    }

    public JPanel getPanelParamater(int i) {
        switch (i) {
            case 0:
                return pnlParam1;
            case 1:
                return pnlParam2;
            case 2:
                return pnlParam3;
            case 3:
                return pnlParam4;
            case 4:
                return pnlParam5;
            default:
                return null;
        }
    }

    public JTextField getTxtMethodName() {
        return txtMethodName;
    }

    public JButton getBtnNo() {
        return btnNo;
    }

    public JButton getBtnSearchInvoke() {
        return btnSearchInvoke;
    }

    public JButton getBtnYes() {
        return btnYes;
    }

    public void clear() {
        txtValue1.setText("");
        txtValue2.setText("");
        txtValue4.setText("");
        txtValue5.setText("");
        txtMethodName.setText("");
        spnCategory.setSelectedIndex(-1);
        spnNumberParam.setSelectedIndex(0);
        txtResult.setText("");
        enableParams(0);
        enableResult(false);
    }

    public JComboBox getSpnType1() {
        return spnType1;
    }

    public JComboBox getSpnType2() {
        return spnType2;
    }

    public JComboBox getSpnType3() {
        return spnType3;
    }

    public JComboBox getSpnType4() {
        return spnType4;
    }

    public JComboBox getSpnType5() {
        return spnType5;
    }

    public JTextArea getTxtResult() {
        return txtResult;
    }

    public JTextField getTxtValue1() {
        return txtValue1;
    }

    public JTextField getTxtValue2() {
        return txtValue2;
    }

    public JTextField getTxtValue3() {
        return txtValue3;
    }

    public JTextField getTxtValue4() {
        return txtValue4;
    }

    public JTextField getTxtValue5() {
        return txtValue5;
    }

    public JLabel getWsInvoked() {
        return wsInvoked;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jScrollPane1 = new javax.swing.JScrollPane();
        jPanel1 = new javax.swing.JPanel();
        jPanel3 = new javax.swing.JPanel();
        jScrollPane5 = new javax.swing.JScrollPane();
        txtResult = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();
        wsInvoked = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        btnYes = new javax.swing.JButton();
        btnNo = new javax.swing.JButton();
        jPanel5 = new javax.swing.JPanel();
        btnSearchInvoke = new javax.swing.JButton();
        jLabel35 = new javax.swing.JLabel();
        spnCategory = new javax.swing.JComboBox();
        txtMethodName = new javax.swing.JTextField();
        jLabel36 = new javax.swing.JLabel();
        jLabel21 = new javax.swing.JLabel();
        spnNumberParam = new javax.swing.JComboBox();
        jPanel4 = new javax.swing.JPanel();
        pnlParam1 = new javax.swing.JPanel();
        labelType1 = new javax.swing.JLabel();
        labelValue1 = new javax.swing.JLabel();
        txtValue1 = new javax.swing.JTextField();
        spnType1 = new javax.swing.JComboBox();
        pnlParam2 = new javax.swing.JPanel();
        labelType2 = new javax.swing.JLabel();
        labelValue2 = new javax.swing.JLabel();
        txtValue2 = new javax.swing.JTextField();
        spnType2 = new javax.swing.JComboBox();
        pnlParam3 = new javax.swing.JPanel();
        labelType20 = new javax.swing.JLabel();
        labelValue20 = new javax.swing.JLabel();
        txtValue3 = new javax.swing.JTextField();
        spnType3 = new javax.swing.JComboBox();
        pnlParam4 = new javax.swing.JPanel();
        labelType21 = new javax.swing.JLabel();
        labelValue21 = new javax.swing.JLabel();
        txtValue4 = new javax.swing.JTextField();
        spnType4 = new javax.swing.JComboBox();
        pnlParam5 = new javax.swing.JPanel();
        labelType22 = new javax.swing.JLabel();
        labelValue22 = new javax.swing.JLabel();
        txtValue5 = new javax.swing.JTextField();
        spnType5 = new javax.swing.JComboBox();

        setClosable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Web services Invoker");
        setPreferredSize(new java.awt.Dimension(990, 540));

        jPanel3.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Result", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Century Schoolbook L", 1, 18))); // NOI18N

        jScrollPane5.setAutoscrolls(true);

        txtResult.setEditable(false);
        txtResult.setColumns(14);
        jScrollPane5.setViewportView(txtResult);

        jLabel5.setText(" Web service invoked:");

        jLabel6.setText(" Are you satisfied with the result?");

        btnYes.setText("Yes");
        btnYes.setEnabled(false);

        btnNo.setText("No");
        btnNo.setEnabled(false);

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 314, Short.MAX_VALUE)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel6)
                            .addGroup(jPanel3Layout.createSequentialGroup()
                                .addGap(11, 11, 11)
                                .addComponent(btnYes, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(18, 18, 18)
                                .addComponent(btnNo, javax.swing.GroupLayout.PREFERRED_SIZE, 63, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(wsInvoked, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jLabel5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(wsInvoked, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addComponent(jScrollPane5, javax.swing.GroupLayout.DEFAULT_SIZE, 339, Short.MAX_VALUE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnYes)
                    .addComponent(btnNo))
                .addContainerGap())
        );

        jPanel5.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Search", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Century Schoolbook L", 1, 14))); // NOI18N

        btnSearchInvoke.setText("Search & Invoke");

        jLabel35.setText("Category");

        spnCategory.setPreferredSize(new java.awt.Dimension(85, 21));

        jLabel36.setText("Method name");

        jLabel21.setText("Number of parameters");

        spnNumberParam.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "0", "1", "2", "3", "4", "5" }));
        spnNumberParam.setSelectedIndex(5);
        spnNumberParam.setPreferredSize(new java.awt.Dimension(85, 21));

        jPanel4.setBorder(javax.swing.BorderFactory.createTitledBorder("Parameters"));

        labelType1.setText("Type of 1º parameter");

        labelValue1.setText("Value");

        spnType1.setPreferredSize(new java.awt.Dimension(85, 21));

        javax.swing.GroupLayout pnlParam1Layout = new javax.swing.GroupLayout(pnlParam1);
        pnlParam1.setLayout(pnlParam1Layout);
        pnlParam1Layout.setHorizontalGroup(
            pnlParam1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlParam1Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(labelType1, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(spnType1, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(labelValue1)
                .addGap(10, 10, 10)
                .addComponent(txtValue1, javax.swing.GroupLayout.DEFAULT_SIZE, 128, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnlParam1Layout.setVerticalGroup(
            pnlParam1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlParam1Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(pnlParam1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(spnType1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pnlParam1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(labelType1)
                        .addComponent(labelValue1)
                        .addComponent(txtValue1)))
                .addGap(5, 5, 5))
        );

        labelType2.setText("Type of 2º parameter");

        labelValue2.setText("Value");

        spnType2.setPreferredSize(new java.awt.Dimension(85, 21));

        javax.swing.GroupLayout pnlParam2Layout = new javax.swing.GroupLayout(pnlParam2);
        pnlParam2.setLayout(pnlParam2Layout);
        pnlParam2Layout.setHorizontalGroup(
            pnlParam2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlParam2Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(labelType2, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(spnType2, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(labelValue2)
                .addGap(10, 10, 10)
                .addComponent(txtValue2, javax.swing.GroupLayout.DEFAULT_SIZE, 106, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnlParam2Layout.setVerticalGroup(
            pnlParam2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlParam2Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(pnlParam2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(spnType2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pnlParam2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(labelType2)
                        .addComponent(labelValue2)
                        .addComponent(txtValue2)))
                .addGap(5, 5, 5))
        );

        labelType20.setText("Type of 3º parameter");

        labelValue20.setText("Value");

        spnType3.setPreferredSize(new java.awt.Dimension(85, 21));

        javax.swing.GroupLayout pnlParam3Layout = new javax.swing.GroupLayout(pnlParam3);
        pnlParam3.setLayout(pnlParam3Layout);
        pnlParam3Layout.setHorizontalGroup(
            pnlParam3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlParam3Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(labelType20, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(spnType3, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(labelValue20)
                .addGap(10, 10, 10)
                .addComponent(txtValue3, javax.swing.GroupLayout.DEFAULT_SIZE, 106, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnlParam3Layout.setVerticalGroup(
            pnlParam3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlParam3Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(pnlParam3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(spnType3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pnlParam3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(labelType20)
                        .addComponent(labelValue20)
                        .addComponent(txtValue3)))
                .addGap(5, 5, 5))
        );

        labelType21.setText("Type of 4º parameter");

        labelValue21.setText("Value");

        spnType4.setPreferredSize(new java.awt.Dimension(85, 21));

        javax.swing.GroupLayout pnlParam4Layout = new javax.swing.GroupLayout(pnlParam4);
        pnlParam4.setLayout(pnlParam4Layout);
        pnlParam4Layout.setHorizontalGroup(
            pnlParam4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlParam4Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(labelType21, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(spnType4, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(labelValue21)
                .addGap(10, 10, 10)
                .addComponent(txtValue4, javax.swing.GroupLayout.DEFAULT_SIZE, 106, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnlParam4Layout.setVerticalGroup(
            pnlParam4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlParam4Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(pnlParam4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(spnType4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pnlParam4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(labelType21)
                        .addComponent(labelValue21)
                        .addComponent(txtValue4)))
                .addGap(5, 5, 5))
        );

        labelType22.setText("Type of 5º parameter");

        labelValue22.setText("Value");

        spnType5.setPreferredSize(new java.awt.Dimension(85, 21));

        javax.swing.GroupLayout pnlParam5Layout = new javax.swing.GroupLayout(pnlParam5);
        pnlParam5.setLayout(pnlParam5Layout);
        pnlParam5Layout.setHorizontalGroup(
            pnlParam5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlParam5Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addComponent(labelType22, javax.swing.GroupLayout.PREFERRED_SIZE, 154, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(spnType5, javax.swing.GroupLayout.PREFERRED_SIZE, 165, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(labelValue22)
                .addGap(10, 10, 10)
                .addComponent(txtValue5, javax.swing.GroupLayout.DEFAULT_SIZE, 106, Short.MAX_VALUE)
                .addContainerGap())
        );
        pnlParam5Layout.setVerticalGroup(
            pnlParam5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(pnlParam5Layout.createSequentialGroup()
                .addGap(5, 5, 5)
                .addGroup(pnlParam5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(spnType5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addGroup(pnlParam5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(labelType22)
                        .addComponent(labelValue22)
                        .addComponent(txtValue5)))
                .addGap(5, 5, 5))
        );

        javax.swing.GroupLayout jPanel4Layout = new javax.swing.GroupLayout(jPanel4);
        jPanel4.setLayout(jPanel4Layout);
        jPanel4Layout.setHorizontalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(pnlParam1, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlParam2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlParam3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlParam4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(pnlParam5, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addContainerGap())
        );
        jPanel4Layout.setVerticalGroup(
            jPanel4Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel4Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(pnlParam1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(pnlParam2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(pnlParam3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(pnlParam4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(10, 10, 10)
                .addComponent(pnlParam5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        javax.swing.GroupLayout jPanel5Layout = new javax.swing.GroupLayout(jPanel5);
        jPanel5.setLayout(jPanel5Layout);
        jPanel5Layout.setHorizontalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel5Layout.createSequentialGroup()
                        .addGap(0, 0, Short.MAX_VALUE)
                        .addComponent(btnSearchInvoke, javax.swing.GroupLayout.PREFERRED_SIZE, 196, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel5Layout.createSequentialGroup()
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel35, javax.swing.GroupLayout.PREFERRED_SIZE, 136, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel36, javax.swing.GroupLayout.PREFERRED_SIZE, 129, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel21))
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addGroup(jPanel5Layout.createSequentialGroup()
                                        .addComponent(spnNumberParam, javax.swing.GroupLayout.PREFERRED_SIZE, 123, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 232, Short.MAX_VALUE))
                                    .addComponent(txtMethodName)
                                    .addComponent(spnCategory, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(jPanel4, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))))
                .addContainerGap())
        );
        jPanel5Layout.setVerticalGroup(
            jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel5Layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel35)
                    .addComponent(spnCategory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel36)
                    .addComponent(txtMethodName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(jPanel5Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(14, 14, 14)
                        .addComponent(jLabel21))
                    .addGroup(jPanel5Layout.createSequentialGroup()
                        .addGap(11, 11, 11)
                        .addComponent(spnNumberParam, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(btnSearchInvoke)
                .addGap(10, 10, 10))
        );

        jPanel5Layout.linkSize(javax.swing.SwingConstants.VERTICAL, new java.awt.Component[] {spnCategory, spnNumberParam, txtMethodName});

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addComponent(jPanel5, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel3, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel5, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                .addGap(0, 0, 0))
        );

        jScrollPane1.setViewportView(jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(0, 0, 0)
                .addComponent(jScrollPane1)
                .addGap(0, 0, 0))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addComponent(jScrollPane1)
                .addGap(0, 0, 0))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnNo;
    private javax.swing.JButton btnSearchInvoke;
    private javax.swing.JButton btnYes;
    private javax.swing.JLabel jLabel21;
    private javax.swing.JLabel jLabel35;
    private javax.swing.JLabel jLabel36;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JPanel jPanel5;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JLabel labelType1;
    private javax.swing.JLabel labelType2;
    private javax.swing.JLabel labelType20;
    private javax.swing.JLabel labelType21;
    private javax.swing.JLabel labelType22;
    private javax.swing.JLabel labelValue1;
    private javax.swing.JLabel labelValue2;
    private javax.swing.JLabel labelValue20;
    private javax.swing.JLabel labelValue21;
    private javax.swing.JLabel labelValue22;
    private javax.swing.JPanel pnlParam1;
    private javax.swing.JPanel pnlParam2;
    private javax.swing.JPanel pnlParam3;
    private javax.swing.JPanel pnlParam4;
    private javax.swing.JPanel pnlParam5;
    private javax.swing.JComboBox spnCategory;
    private javax.swing.JComboBox spnNumberParam;
    private javax.swing.JComboBox spnType1;
    private javax.swing.JComboBox spnType2;
    private javax.swing.JComboBox spnType3;
    private javax.swing.JComboBox spnType4;
    private javax.swing.JComboBox spnType5;
    private javax.swing.JTextField txtMethodName;
    private javax.swing.JTextArea txtResult;
    private javax.swing.JTextField txtValue1;
    private javax.swing.JTextField txtValue2;
    private javax.swing.JTextField txtValue3;
    private javax.swing.JTextField txtValue4;
    private javax.swing.JTextField txtValue5;
    private javax.swing.JLabel wsInvoked;
    // End of variables declaration//GEN-END:variables
}
