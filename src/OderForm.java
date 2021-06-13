
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.logging.Level;
import java.util.logging.Logger;
import javax.swing.JOptionPane;
import javax.swing.table.DefaultTableModel;
import javax.swing.table.TableModel;

/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

/**
 *
 * @author Mohammad
 */
public class OderForm extends javax.swing.JFrame {

    /**
     * Creates new form OderForm
     */
    public OderForm() {
        initComponents();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        ProductCode = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        ProductDesc = new javax.swing.JTextField();
        jLabel2 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        QTY = new javax.swing.JTextField();
        saveBtn = new javax.swing.JButton();
        jScrollPane1 = new javax.swing.JScrollPane();
        OrderTable = new javax.swing.JTable();
        jLabel5 = new javax.swing.JLabel();
        OrderNo = new javax.swing.JTextField();
        jLabel1 = new javax.swing.JLabel();
        IsActive = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        OrderDesc = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        Unit = new javax.swing.JTextField();
        jLabel8 = new javax.swing.JLabel();
        Price = new javax.swing.JTextField();
        jLabel9 = new javax.swing.JLabel();
        TotalPrice = new javax.swing.JTextField();
        ProductId = new javax.swing.JTextField();
        OrderId = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.DISPOSE_ON_CLOSE);
        setAlwaysOnTop(true);
        addWindowListener(new java.awt.event.WindowAdapter() {
            public void windowOpened(java.awt.event.WindowEvent evt) {
                formWindowOpened(evt);
            }
        });

        ProductCode.setName("ProductCode"); // NOI18N
        ProductCode.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                ProductCodeFocusLost(evt);
            }
        });

        jLabel3.setText("Product Desc");

        ProductDesc.setEditable(false);
        ProductDesc.setEnabled(false);
        ProductDesc.setName("ProductDesc"); // NOI18N

        jLabel2.setText("Product Code");

        jLabel4.setText("QTY");

        QTY.setName("QTY"); // NOI18N
        QTY.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                QTYFocusLost(evt);
            }
        });

        saveBtn.setText("Save");
        saveBtn.setEnabled(false);
        saveBtn.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                saveBtnActionPerformed(evt);
            }
        });

        OrderTable.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null, null}
            },
            new String [] {
                "id", "Product code", "Product Desc", "QTY", "Price", "Status", "ProductId", "OrderDesc"
            }
        ) {
            Class[] types = new Class [] {
                java.lang.Integer.class, java.lang.String.class, java.lang.String.class, java.lang.Double.class, java.lang.Double.class, java.lang.Integer.class, java.lang.Integer.class, java.lang.String.class
            };
            boolean[] canEdit = new boolean [] {
                false, false, false, false, false, false, false, true
            };

            public Class getColumnClass(int columnIndex) {
                return types [columnIndex];
            }

            public boolean isCellEditable(int rowIndex, int columnIndex) {
                return canEdit [columnIndex];
            }
        });
        OrderTable.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                OrderTableMouseClicked(evt);
            }
            public void mousePressed(java.awt.event.MouseEvent evt) {
                OrderTableMousePressed(evt);
            }
        });
        jScrollPane1.setViewportView(OrderTable);
        if (OrderTable.getColumnModel().getColumnCount() > 0) {
            OrderTable.getColumnModel().getColumn(0).setResizable(false);
            OrderTable.getColumnModel().getColumn(1).setResizable(false);
            OrderTable.getColumnModel().getColumn(2).setResizable(false);
            OrderTable.getColumnModel().getColumn(3).setResizable(false);
            OrderTable.getColumnModel().getColumn(4).setResizable(false);
            OrderTable.getColumnModel().getColumn(5).setResizable(false);
            OrderTable.getColumnModel().getColumn(6).setResizable(false);
        }

        jLabel5.setText("Order No");

        OrderNo.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                OrderNoFocusLost(evt);
            }
        });

        jLabel1.setText("Status");

        IsActive.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Active", "Deactive" }));

        jLabel6.setText("Order Desc");

        OrderDesc.addFocusListener(new java.awt.event.FocusAdapter() {
            public void focusLost(java.awt.event.FocusEvent evt) {
                OrderDescFocusLost(evt);
            }
        });

        jLabel7.setText("Unit");

        Unit.setEnabled(false);

        jLabel8.setText("Price");

        Price.setEnabled(false);

        jLabel9.setText("Total Price");

        TotalPrice.setEnabled(false);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel2)
                                    .addComponent(jLabel3))
                                .addGap(33, 33, 33)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(ProductDesc, javax.swing.GroupLayout.PREFERRED_SIZE, 231, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(ProductCode, javax.swing.GroupLayout.PREFERRED_SIZE, 105, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(Unit, javax.swing.GroupLayout.PREFERRED_SIZE, 111, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(18, 18, 18)
                                        .addComponent(jLabel8)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(Price, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel1)
                                    .addComponent(saveBtn))
                                .addGap(41, 41, 41)
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(ProductId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(30, 30, 30)
                                        .addComponent(OrderId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(0, 0, Short.MAX_VALUE))
                                    .addComponent(IsActive, javax.swing.GroupLayout.PREFERRED_SIZE, 137, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addGroup(layout.createSequentialGroup()
                                        .addComponent(QTY, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                        .addComponent(jLabel9)
                                        .addGap(18, 18, 18)
                                        .addComponent(TotalPrice, javax.swing.GroupLayout.PREFERRED_SIZE, 114, javax.swing.GroupLayout.PREFERRED_SIZE))))))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(23, 23, 23)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel5)
                            .addComponent(jLabel6))
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(OrderDesc, javax.swing.GroupLayout.PREFERRED_SIZE, 309, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(OrderNo, javax.swing.GroupLayout.PREFERRED_SIZE, 134, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 411, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel7)))
                .addContainerGap(13, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                .addGap(19, 19, 19)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(OrderNo, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(OrderDesc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(ProductCode, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(ProductDesc, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel7)
                    .addComponent(Unit, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel8)
                    .addComponent(Price, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 27, Short.MAX_VALUE)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel4)
                    .addComponent(QTY, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel9)
                    .addComponent(TotalPrice, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(IsActive, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(saveBtn)
                    .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(ProductId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(OrderId, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(22, 22, 22))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void OrderNoFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_OrderNoFocusLost
        // TODO add your handling code here:
        LoadOrderInf();
        EnableSaveKey();
    }//GEN-LAST:event_OrderNoFocusLost

    private void ProductCodeFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_ProductCodeFocusLost
        // TODO add your handling code here:
        
        ProdutInf();
        EnableSaveKey();
    }//GEN-LAST:event_ProductCodeFocusLost

    private void formWindowOpened(java.awt.event.WindowEvent evt) {//GEN-FIRST:event_formWindowOpened
        // TODO add your handling code here:
        ProductId.setVisible(false);
        OrderId.setVisible(false);
    }//GEN-LAST:event_formWindowOpened

    private void QTYFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_QTYFocusLost
        // TODO add your handling code here:
        if(!Price.getText().trim().equals("") && !QTY.getText().trim().equals("")){
            double qty = Double.parseDouble(QTY.getText());
            double price = Double.parseDouble(Price.getText());
            double result = qty * price;
            TotalPrice.setText(Double.toString(result));
        }
        EnableSaveKey();
    }//GEN-LAST:event_QTYFocusLost

    private void OrderDescFocusLost(java.awt.event.FocusEvent evt) {//GEN-FIRST:event_OrderDescFocusLost
        // TODO add your handling code here:
        EnableSaveKey();
    }//GEN-LAST:event_OrderDescFocusLost

    private void saveBtnActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_saveBtnActionPerformed
        // TODO add your handling code here:
        
             try{
            CrudClass crudClass = new CrudClass();
            String sqlStr = "";
           if(OrderId.getText().equals("")){
                sqlStr = "insert into torder(OrderNo, orderDesc, productId, QTY, price, IsActive) Values (";
                
                sqlStr += "'" + OrderNo.getText() + "'";
                sqlStr += ", '" + OrderDesc.getText() + "'";
                
                sqlStr += ", '" + ProductId.getText() + "'" ;
                sqlStr += ", " + QTY.getText() ;
                sqlStr += ", " + TotalPrice.getText() ;
                sqlStr += ", " + IsActive.getSelectedIndex() ;
                sqlStr += ")";

            }else{
                sqlStr = " update torder set OrderNo = '" + OrderNo.getText() + "'";
                sqlStr += ", orderDesc = '" + OrderDesc.getText() + "'" ;
                sqlStr += ", productId = " + ProductId.getText() ;
                sqlStr += ", QTY = " + QTY.getText();
                sqlStr += ", price = " + TotalPrice.getText();
                sqlStr += ", IsActive = " + IsActive.getSelectedIndex() ;
                
                sqlStr += " where id = " + OrderId.getText().trim(); 
            }
           
            if(crudClass.RunSql(sqlStr) > 0 ) {
                JOptionPane.showMessageDialog(null, "Update Inf Successfully");
                ResetForm();
            }else{
                JOptionPane.showMessageDialog(null, "Goes something Wrong");
            }     
            
        } catch (SQLException ex) {
            Logger.getLogger(CategoryForm.class.getName()).log(Level.SEVERE, null, ex);
        }catch (ClassNotFoundException ex) {
            Logger.getLogger(CategoryForm.class.getName()).log(Level.SEVERE, null, ex);
        }        

    }//GEN-LAST:event_saveBtnActionPerformed

    private void OrderTableMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_OrderTableMouseClicked
        // TODO add your handling code here:
        selectedRows();
    }//GEN-LAST:event_OrderTableMouseClicked

    private void OrderTableMousePressed(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_OrderTableMousePressed
        // TODO add your handling code here:
        selectedRows();
    }//GEN-LAST:event_OrderTableMousePressed
    
       private void selectedRows(){
        int ind = OrderTable.getSelectedRow();
        TableModel model = OrderTable.getModel();
        
        
        OrderDesc.setText(model.getValueAt(ind, 8).toString());
        ProductCode.setText(model.getValueAt(ind, 1).toString());
        OrderId.setText(model.getValueAt(ind, 0).toString());
        ProductDesc.setText(model.getValueAt(ind, 2).toString());
        QTY.setText(model.getValueAt(ind, 3).toString());
        Price.setText(model.getValueAt(ind, 4).toString());
        TotalPrice.setText(Double.toString(Double.parseDouble(model.getValueAt(ind, 4).toString()) * Double.parseDouble(model.getValueAt(ind, 3).toString())));
        IsActive.setSelectedIndex(Integer.parseInt( model.getValueAt(ind, 5).toString()));
        
        ProductId.setText(model.getValueAt(ind, 6).toString());

    }

    private void ResetForm(){
        ProductCode.setText("");
        ProductDesc.setText("");
        Unit.setText("");
        Price.setText("");
        QTY.setText("");
        TotalPrice.setText("");
        IsActive.setSelectedIndex(0);
        OrderId.setText("");
        OrderDesc.setText("");
        OrderNo.setText("");
    }
    /**********************************************************
     * ProdutInf
     * @param productscategoryId 
     */
    private void ProdutInf(){

        try {
    
            CrudClass crudClass = new CrudClass();
             
            String sqlStr = "";
           
            sqlStr = "select id, productcode, productdesc, price, unitdesc from tprouduct "; 
            sqlStr += "Where productcode = '" + ProductCode.getText().trim() + "'";

            ResultSet rs = crudClass.ReadData(sqlStr);
            
           if(rs.next()){
               ProductDesc.setText(rs.getString("productdesc"));
               Unit.setText(rs.getString("unitdesc"));
               Price.setText(rs.getString("price"));
               ProductId.setText(rs.getString("id"));
           }else{
               ProductDesc.setText("");
               Unit.setText("");
               Price.setText("");
               ProductId.setText("");               
           }
            
        } catch (SQLException ex) {
            Logger.getLogger(CategoryForm.class.getName()).log(Level.SEVERE, null, ex);
        }catch (ClassNotFoundException ex) {
                Logger.getLogger(CategoryForm.class.getName()).log(Level.SEVERE, null, ex);
        }   
        
    }
    
        /**************************************************************
     * EnableSaveKey
     */
    private void EnableSaveKey(){
        
        if(!OrderNo.getText().trim().equals("") && !OrderDesc.getText().trim().equals("") && !ProductId.getText().trim().equals("") && !ProductDesc.getText().trim().equals("") && !QTY.getText().trim().equals("")){
            saveBtn.setEnabled(true);
        }else{
            saveBtn.setEnabled(false);
        }
    }

    /*****************************************************************************
     *  LoadOrderInf
     */    
    private void LoadOrderInf(){
        DefaultTableModel catTable = new DefaultTableModel();
        try {
            
            CrudClass crudClass = new CrudClass();
             
            String sqlStr = "";
            sqlStr = "select torder.id, productcode, productdesc, Qty, tprouduct.price, IsActive status, productid, productid, orderdesc from torder inner join tprouduct on torder.productid  = tprouduct.id where IsActive = 0";
            sqlStr += " And orderno = '"  + OrderNo.getText() + "' ";
            
            ResultSet rs = crudClass.ReadData(sqlStr);
            //if(rs.next()){
            //    OrderDesc.setText(rs.getString(1).toString());
            //}
            catTable = crudClass.resultSetToTableModel(rs);
            catTable.setNumRows(100);
            catTable.setRowCount(100);
            
            OrderTable.setModel(catTable);
            if(rs.first()){
                OrderDesc.setText(rs.getString(1).toString());
            }
            
            
        } catch (SQLException ex) {
            Logger.getLogger(CategoryForm.class.getName()).log(Level.SEVERE, null, ex);
        }catch (ClassNotFoundException ex) {
                Logger.getLogger(CategoryForm.class.getName()).log(Level.SEVERE, null, ex);
        }   
        
        //return catTable;
    }

    /**
     * @param args the command line arguments
     */
    public static void main(String args[]) {
        /* Set the Nimbus look and feel */
        //<editor-fold defaultstate="collapsed" desc=" Look and feel setting code (optional) ">
        /* If Nimbus (introduced in Java SE 6) is not available, stay with the default look and feel.
         * For details see http://download.oracle.com/javase/tutorial/uiswing/lookandfeel/plaf.html 
         */
        try {
            for (javax.swing.UIManager.LookAndFeelInfo info : javax.swing.UIManager.getInstalledLookAndFeels()) {
                if ("Nimbus".equals(info.getName())) {
                    javax.swing.UIManager.setLookAndFeel(info.getClassName());
                    break;
                }
            }
        } catch (ClassNotFoundException ex) {
            java.util.logging.Logger.getLogger(OderForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (InstantiationException ex) {
            java.util.logging.Logger.getLogger(OderForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (IllegalAccessException ex) {
            java.util.logging.Logger.getLogger(OderForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        } catch (javax.swing.UnsupportedLookAndFeelException ex) {
            java.util.logging.Logger.getLogger(OderForm.class.getName()).log(java.util.logging.Level.SEVERE, null, ex);
        }
        //</editor-fold>

        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new OderForm().setVisible(true);
            }
        });
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JComboBox<String> IsActive;
    private javax.swing.JTextField OrderDesc;
    private javax.swing.JTextField OrderId;
    private javax.swing.JTextField OrderNo;
    private javax.swing.JTable OrderTable;
    private javax.swing.JTextField Price;
    private javax.swing.JTextField ProductCode;
    private javax.swing.JTextField ProductDesc;
    private javax.swing.JTextField ProductId;
    private javax.swing.JTextField QTY;
    private javax.swing.JTextField TotalPrice;
    private javax.swing.JTextField Unit;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JButton saveBtn;
    // End of variables declaration//GEN-END:variables
}