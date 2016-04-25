package tesis.ui;

import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JComboBox;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;

public class WSDLUI extends javax.swing.JInternalFrame {

    private DefaultTableModel wsdlDefault;

    public WSDLUI() {
        initComponents();
        wsdlDefault = (DefaultTableModel) tableWSDL.getModel();
    }

    /**
     * (*-) This method adds an actionListener to the buttons
     *
     * @param lis
     */
    public void setActionListener(ActionListener lis) {
        this.btnSave.addActionListener(lis);
        this.btnDelete.addActionListener(lis);
        this.btnNewWSDL.addActionListener(lis);
        this.btnEdit.addActionListener(lis);
    }

    /**
     * (*-)Click en boton nuevo, limpia los campos,bloquea los botones y deja
     * solo el boton cancel
     */
    public void clickNew() {
        clear();
        clickEdit();
    }

    /**
     * (*-)habilita los botones de cancel y save
     */
    public void clickEdit() {
        btnNewWSDL.setEnabled(false);
        txtName.setEnabled(true);
        btnSave.setEnabled(true);
        btnEdit.setEnabled(false);
        btnDelete.setEnabled(true);

    }

    public void enableFields(boolean b) {
        txtName.setEnabled(b);
        txtUrl.setEnabled(b);
        spnCategory.setEnabled(b);
    }

    /**
     * (*-)limpia los campos
     */
    private void clear() {
        txtId.setText("");
        txtName.setText("");
        txtUrl.setText("");
        spnCategory.removeAll();
        spnCategory.setSelectedIndex(-1);
        tableWSDL.clearSelection();
    }

    /**
     * (*-)limpia los campos, y bloquea los botones dejando solo nuevo
     */
    public void clickSave() {
        clear();
        txtName.setEnabled(false);
        btnNewWSDL.setEnabled(true);
        txtUrl.setEnabled(false);
        spnCategory.setEnabled(false);
        btnSave.setEnabled(false);
        btnEdit.setEnabled(false);
        btnDelete.setEnabled(false);
    }

    public void wsdlSelected(boolean b) {
        if (!b) {
            clear();
        }
        btnEdit.setEnabled(b);
        btnDelete.setEnabled(b);
    }

    public DefaultTableModel getWsdlDefault() {
        return wsdlDefault;
    }

    public JButton getBtnDelete() {
        return btnDelete;
    }

    public JButton getBtnEdit() {
        return btnEdit;
    }

    public JButton getBtnNewWSDL() {
        return btnNewWSDL;
    }

    public JButton getBtnSave() {
        return btnSave;
    }

    public JComboBox<String> getSpnCategory() {
        return spnCategory;
    }

    public JTable getTableWSDL() {
        return tableWSDL;
    }

    public JTextField getTxtId() {
        return txtId;
    }

    public JTextField getTxtName() {
        return txtName;
    }

    public JTextField getTxtSearch() {
        return txtSearch;
    }

    public JTextField getTxtUrl() {
        return txtUrl;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        pnlScroll = new javax.swing.JScrollPane();
        panel1 = new javax.swing.JPanel();
        panel2 = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableWSDL = new javax.swing.JTable();
        txtSearch = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        txtName = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        txtId = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        txtUrl = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        spnCategory = new javax.swing.JComboBox<String>();
        jPanel4 = new javax.swing.JPanel();
        btnDelete = new javax.swing.JButton();
        btnNewWSDL = new javax.swing.JButton();
        btnEdit = new javax.swing.JButton();
        btnSave = new javax.swing.JButton();

        setClosable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Management wsdl");
        setPreferredSize(new java.awt.Dimension(876, 600));
        getContentPane().setLayout(new java.awt.GridLayout(1, 0));

        pnlScroll.setName(""); // NOI18N
        pnlScroll.setPreferredSize(new java.awt.Dimension(855, 480));
        pnlScroll.setRequestFocusEnabled(false);

        panel1.setPreferredSize(new java.awt.Dimension(825, 475));

        panel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "WSDL", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Century Schoolbook L", 3, 15))); // NOI18N

        tableWSDL.setAutoCreateRowSorter(true);
        tableWSDL.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name", "Url", "Categoty"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, true, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableWSDL.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane2.setViewportView(tableWSDL);

        txtSearch.setToolTipText("Search");

        javax.swing.GroupLayout panel2Layout = new javax.swing.GroupLayout(panel2);
        panel2.setLayout(panel2Layout);
        panel2Layout.setHorizontalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addComponent(txtSearch)
        );
        panel2Layout.setVerticalGroup(
            panel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panel2Layout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addComponent(txtSearch, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 206, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "WSDL data", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Century Schoolbook L", 3, 15))); // NOI18N

        txtName.setEnabled(false);

        jLabel1.setText("Name");

        txtId.setEnabled(false);

        jLabel3.setText("ID");

        jLabel4.setText("Url");

        txtUrl.setEnabled(false);

        jLabel2.setText("Category");

        spnCategory.setModel(new javax.swing.DefaultComboBoxModel(new String[] { "Item 1", "Item 2", "Item 3", "Item 4" }));
        spnCategory.setEnabled(false);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel3))
                        .addGap(26, 26, 26)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE))
                            .addComponent(txtName)))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel4)
                            .addComponent(jLabel2))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtUrl)
                            .addGroup(jPanel2Layout.createSequentialGroup()
                                .addComponent(spnCategory, javax.swing.GroupLayout.PREFERRED_SIZE, 186, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(0, 0, Short.MAX_VALUE)))))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(txtUrl, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(spnCategory, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap())
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel4.setLayout(new java.awt.GridLayout(1, 0));

        btnDelete.setFont(new java.awt.Font("Cantarell", 0, 12)); // NOI18N
        btnDelete.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/Icons/borrar.png"))); // NOI18N
        btnDelete.setToolTipText("Delete or Cancel");
        btnDelete.setEnabled(false);
        btnDelete.setPreferredSize(new java.awt.Dimension(55, 33));
        jPanel4.add(btnDelete);

        btnNewWSDL.setFont(new java.awt.Font("Cantarell", 0, 12)); // NOI18N
        btnNewWSDL.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/Icons/nuevo.png"))); // NOI18N
        btnNewWSDL.setToolTipText("New");
        btnNewWSDL.setPreferredSize(new java.awt.Dimension(55, 33));
        jPanel4.add(btnNewWSDL);

        btnEdit.setFont(new java.awt.Font("Cantarell", 0, 12)); // NOI18N
        btnEdit.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/Icons/modificar.png"))); // NOI18N
        btnEdit.setToolTipText("Edit");
        btnEdit.setEnabled(false);
        btnEdit.setPreferredSize(new java.awt.Dimension(55, 33));
        jPanel4.add(btnEdit);

        btnSave.setFont(new java.awt.Font("Cantarell", 0, 12)); // NOI18N
        btnSave.setIcon(new javax.swing.ImageIcon(getClass().getResource("/resources/Icons/guardar.png"))); // NOI18N
        btnSave.setToolTipText("Save");
        btnSave.setEnabled(false);
        btnSave.setPreferredSize(new java.awt.Dimension(55, 33));
        jPanel4.add(btnSave);

        javax.swing.GroupLayout panel1Layout = new javax.swing.GroupLayout(panel1);
        panel1.setLayout(panel1Layout);
        panel1Layout.setHorizontalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addGroup(panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 851, Short.MAX_VALUE))
                .addGap(0, 0, 0))
        );
        panel1Layout.setVerticalGroup(
            panel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panel1Layout.createSequentialGroup()
                .addComponent(panel2, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(7, 7, 7)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        pnlScroll.setViewportView(panel1);
        panel1.getAccessibleContext().setAccessibleName("");
        panel1.getAccessibleContext().setAccessibleDescription("");

        getContentPane().add(pnlScroll);
        pnlScroll.getAccessibleContext().setAccessibleName("Panel");
        pnlScroll.getAccessibleContext().setAccessibleDescription("");

        getAccessibleContext().setAccessibleName("clienteGui");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnDelete;
    private javax.swing.JButton btnEdit;
    private javax.swing.JButton btnNewWSDL;
    private javax.swing.JButton btnSave;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JPanel panel1;
    private javax.swing.JPanel panel2;
    private javax.swing.JScrollPane pnlScroll;
    private javax.swing.JComboBox<String> spnCategory;
    private javax.swing.JTable tableWSDL;
    private javax.swing.JTextField txtId;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtSearch;
    private javax.swing.JTextField txtUrl;
    // End of variables declaration//GEN-END:variables

}
