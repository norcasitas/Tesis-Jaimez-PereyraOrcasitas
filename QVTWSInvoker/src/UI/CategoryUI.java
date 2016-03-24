/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package UI;

import java.awt.event.ActionListener;
import javax.swing.JButton;
import javax.swing.JTable;
import javax.swing.JTextField;
import javax.swing.table.DefaultTableModel;


public class CategoryUI extends javax.swing.JInternalFrame {

    private DefaultTableModel categoriesDefault;


    public CategoryUI() {
        initComponents();
        categoriesDefault = (DefaultTableModel) tableCategory.getModel();
    }

    public void setActionListener(ActionListener lis) {
        this.save.addActionListener(lis);
        this.delete.addActionListener(lis);
        this.newCat.addActionListener(lis);
        this.edit.addActionListener(lis);
    }

    public void clickNew() {
        clear();
        clickEdit();
    }

    public void clickSave() {
        clear();
        name.setEnabled(false);
        newCat.setEnabled(true);
        save.setEnabled(false);
        edit.setEnabled(false);
        delete.setEnabled(false);
    }

      public void clickEdit() {
        newCat.setEnabled(false);
        name.setEnabled(true);
        save.setEnabled(true);
        edit.setEnabled(false);
        delete.setEnabled(false);
    }
    
    public void clear() {
        id.setText("");
        name.setText("");
    }
    
    public void categorySelected(boolean b){
        if (!b)
            clear();
        edit.setEnabled(b);
        delete.setEnabled(b);
    }

    public DefaultTableModel getCategoriesDefault() {
        return categoriesDefault;
    }

    public void setCategoriesDefault(DefaultTableModel categoriesDefault) {
        this.categoriesDefault = categoriesDefault;
    }

    public JButton getDelete() {
        return delete;
    }

    public void setDelete(JButton delete) {
        this.delete = delete;
    }

    public JButton getEdit() {
        return edit;
    }

    public void setEdit(JButton edit) {
        this.edit = edit;
    }

    public JTextField getId() {
        return id;
    }

    public void setId(JTextField id) {
        this.id = id;
    }

    public JTextField getNameCat() {
        return name;
    }

    public void setName(JTextField name) {
        this.name = name;
    }

    public JButton getNewCat() {
        return newCat;
    }

    public void setNewCat(JButton newCat) {
        this.newCat = newCat;
    }

    public JButton getSave() {
        return save;
    }

    public void setSave(JButton save) {
        this.save = save;
    }

    public JTextField getSearch() {
        return search;
    }

    public void setSearch(JTextField search) {
        this.search = search;
    }

    public JTable getTableCategory() {
        return tableCategory;
    }

    public void setTableCategory(JTable tableCategory) {
        this.tableCategory = tableCategory;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        scroolClientes = new javax.swing.JScrollPane();
        panelEnteroClientes = new javax.swing.JPanel();
        panelClientes = new javax.swing.JPanel();
        jScrollPane2 = new javax.swing.JScrollPane();
        tableCategory = new javax.swing.JTable();
        search = new javax.swing.JTextField();
        jPanel2 = new javax.swing.JPanel();
        name = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        id = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        jPanel4 = new javax.swing.JPanel();
        delete = new javax.swing.JButton();
        newCat = new javax.swing.JButton();
        edit = new javax.swing.JButton();
        save = new javax.swing.JButton();

        setClosable(true);
        setDefaultCloseOperation(javax.swing.WindowConstants.HIDE_ON_CLOSE);
        setIconifiable(true);
        setMaximizable(true);
        setResizable(true);
        setTitle("Management category");
        setPreferredSize(new java.awt.Dimension(876, 600));
        getContentPane().setLayout(new java.awt.GridLayout(1, 0));

        scroolClientes.setName(""); // NOI18N
        scroolClientes.setPreferredSize(new java.awt.Dimension(855, 480));
        scroolClientes.setRequestFocusEnabled(false);

        panelEnteroClientes.setPreferredSize(new java.awt.Dimension(825, 475));

        panelClientes.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Category", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Century Schoolbook L", 3, 15))); // NOI18N

        tableCategory.setAutoCreateRowSorter(true);
        tableCategory.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {

            },
            new String [] {
                "ID", "Name"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        tableCategory.setSelectionMode(javax.swing.ListSelectionModel.SINGLE_SELECTION);
        jScrollPane2.setViewportView(tableCategory);

        search.setToolTipText("Búsqueda personalizada");

        javax.swing.GroupLayout panelClientesLayout = new javax.swing.GroupLayout(panelClientes);
        panelClientes.setLayout(panelClientesLayout);
        panelClientesLayout.setHorizontalGroup(
            panelClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 0, Short.MAX_VALUE)
            .addComponent(search)
        );
        panelClientesLayout.setVerticalGroup(
            panelClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, panelClientesLayout.createSequentialGroup()
                .addGap(2, 2, 2)
                .addComponent(search, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(0, 0, 0)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.DEFAULT_SIZE, 271, Short.MAX_VALUE))
        );

        jPanel2.setBorder(javax.swing.BorderFactory.createTitledBorder(null, "Category data", javax.swing.border.TitledBorder.DEFAULT_JUSTIFICATION, javax.swing.border.TitledBorder.DEFAULT_POSITION, new java.awt.Font("Century Schoolbook L", 3, 15))); // NOI18N

        name.setEnabled(false);

        jLabel1.setText("Name");

        id.setEnabled(false);

        jLabel3.setText("ID");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(12, 12, 12)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel3))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(name)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, 112, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 655, Short.MAX_VALUE)))
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(id, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(name, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );

        jPanel4.setBorder(javax.swing.BorderFactory.createBevelBorder(javax.swing.border.BevelBorder.RAISED));
        jPanel4.setLayout(new java.awt.GridLayout(1, 0));

        delete.setFont(new java.awt.Font("Cantarell", 0, 12)); // NOI18N
        delete.setToolTipText("Borrar cliente seleccionado");
        delete.setEnabled(false);
        delete.setPreferredSize(new java.awt.Dimension(55, 33));
        jPanel4.add(delete);

        newCat.setFont(new java.awt.Font("Cantarell", 0, 12)); // NOI18N
        newCat.setToolTipText("Crear cliente nuevo");
        newCat.setPreferredSize(new java.awt.Dimension(55, 33));
        jPanel4.add(newCat);

        edit.setFont(new java.awt.Font("Cantarell", 0, 12)); // NOI18N
        edit.setToolTipText("Modificar cliente seleccionado");
        edit.setEnabled(false);
        edit.setPreferredSize(new java.awt.Dimension(55, 33));
        edit.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                editActionPerformed(evt);
            }
        });
        jPanel4.add(edit);

        save.setFont(new java.awt.Font("Cantarell", 0, 12)); // NOI18N
        save.setToolTipText("Guardar cambios realizados");
        save.setEnabled(false);
        save.setPreferredSize(new java.awt.Dimension(55, 33));
        jPanel4.add(save);

        javax.swing.GroupLayout panelEnteroClientesLayout = new javax.swing.GroupLayout(panelEnteroClientes);
        panelEnteroClientes.setLayout(panelEnteroClientesLayout);
        panelEnteroClientesLayout.setHorizontalGroup(
            panelEnteroClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEnteroClientesLayout.createSequentialGroup()
                .addGroup(panelEnteroClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addComponent(jPanel2, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(panelClientes, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                    .addComponent(jPanel4, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 851, Short.MAX_VALUE))
                .addGap(0, 0, 0))
        );
        panelEnteroClientesLayout.setVerticalGroup(
            panelEnteroClientesLayout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(panelEnteroClientesLayout.createSequentialGroup()
                .addComponent(panelClientes, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addGap(7, 7, 7)
                .addComponent(jPanel2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jPanel4, javax.swing.GroupLayout.PREFERRED_SIZE, 46, javax.swing.GroupLayout.PREFERRED_SIZE))
        );

        scroolClientes.setViewportView(panelEnteroClientes);
        panelEnteroClientes.getAccessibleContext().setAccessibleName("");
        panelEnteroClientes.getAccessibleContext().setAccessibleDescription("");

        getContentPane().add(scroolClientes);
        scroolClientes.getAccessibleContext().setAccessibleName("Panel");
        scroolClientes.getAccessibleContext().setAccessibleDescription("");

        getAccessibleContext().setAccessibleName("clienteGui");

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void editActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_editActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_editActionPerformed

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton delete;
    private javax.swing.JButton edit;
    private javax.swing.JTextField id;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel4;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTextField name;
    private javax.swing.JButton newCat;
    private javax.swing.JPanel panelClientes;
    private javax.swing.JPanel panelEnteroClientes;
    private javax.swing.JButton save;
    private javax.swing.JScrollPane scroolClientes;
    private javax.swing.JTextField search;
    private javax.swing.JTable tableCategory;
    // End of variables declaration//GEN-END:variables
}
