/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;

import javax.swing.JOptionPane;
import javax.swing.JPanel;
import javax.swing.event.ListSelectionEvent;
import javax.swing.event.ListSelectionListener;
import javax.swing.table.DefaultTableModel;
import model.CarsCatalog;
import model.Car;
import java.text.SimpleDateFormat;   
/**
 *
 * @author reddy
 */
public class ModifyDetails extends javax.swing.JPanel {

        private JPanel userProcessContainer;
    private CarsCatalog carsCatalog;
    /**
     * Creates new form ModifyDetails
     */
     
    public ModifyDetails(JPanel userProcessContainer,CarsCatalog carsCatalog) {
        initComponents();
        // setvisibility(false);
        this.userProcessContainer = userProcessContainer;
        this.carsCatalog = carsCatalog;
        populateTable();
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel1 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        tblCars = new javax.swing.JTable();
        btnUpdate = new javax.swing.JButton();
        l2 = new javax.swing.JLabel();
        txtcompany = new javax.swing.JTextField();
        l3 = new javax.swing.JLabel();
        txtmodel = new javax.swing.JTextField();
        l4 = new javax.swing.JLabel();
        txtseatcapacity = new javax.swing.JTextField();
        l5 = new javax.swing.JLabel();
        checked = new javax.swing.JCheckBox();
        l6 = new javax.swing.JLabel();
        txtlocation = new javax.swing.JTextField();
        l7 = new javax.swing.JLabel();
        txtcertificate = new javax.swing.JTextField();
        btnconfirmupdate = new javax.swing.JButton();

        jLabel1.setText("         Modify Car Details");

        tblCars.setModel(new javax.swing.table.DefaultTableModel(
            new Object [][] {
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null},
                {null, null, null, null, null, null, null}
            },
            new String [] {
                "Serial Number", "Company", "Model", "Seat Capacity", "Available For Uber", "Location", "Maintenance Certificate Expiry Date"
            }
        ));
        tblCars.addMouseListener(new java.awt.event.MouseAdapter() {
            public void mouseClicked(java.awt.event.MouseEvent evt) {
                tblCarsMouseClicked(evt);
            }
        });
        jScrollPane1.setViewportView(tblCars);

        btnUpdate.setText("Update");
        btnUpdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnUpdateActionPerformed(evt);
            }
        });

        l2.setText("company");

        l3.setText("model");

        l4.setText("seat capacity");

        l5.setText("Available for Uber");

        checked.setText("YES");

        l6.setText("Location");

        l7.setText("Certificate");

        btnconfirmupdate.setText("Confirm Update");
        btnconfirmupdate.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnconfirmupdateActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(272, 272, 272)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 148, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(68, 68, 68)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 567, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(53, 53, 53)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(l2)
                            .addComponent(l3)
                            .addComponent(l4))
                        .addGap(51, 51, 51)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnUpdate)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                    .addComponent(txtcompany)
                                    .addComponent(txtmodel)
                                    .addComponent(txtseatcapacity, javax.swing.GroupLayout.DEFAULT_SIZE, 157, Short.MAX_VALUE))
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(104, 104, 104)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                            .addComponent(l5)
                                            .addComponent(l6, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                            .addComponent(l7, javax.swing.GroupLayout.DEFAULT_SIZE, 97, Short.MAX_VALUE))
                                        .addGap(24, 24, 24)
                                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                            .addComponent(checked)
                                            .addComponent(txtlocation, javax.swing.GroupLayout.PREFERRED_SIZE, 108, javax.swing.GroupLayout.PREFERRED_SIZE)
                                            .addComponent(txtcertificate, javax.swing.GroupLayout.PREFERRED_SIZE, 125, javax.swing.GroupLayout.PREFERRED_SIZE)))
                                    .addGroup(layout.createSequentialGroup()
                                        .addGap(140, 140, 140)
                                        .addComponent(btnconfirmupdate)))))))
                .addContainerGap(46, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 24, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 97, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(68, 68, 68)
                .addComponent(btnUpdate)
                .addGap(178, 178, 178)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(l5)
                    .addComponent(checked))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(l2)
                    .addComponent(txtcompany, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(l6, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtlocation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(32, 32, 32)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(l3)
                    .addComponent(txtmodel, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(l7, javax.swing.GroupLayout.PREFERRED_SIZE, 20, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtcertificate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(32, 32, 32)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(l4)
                            .addComponent(txtseatcapacity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addComponent(btnconfirmupdate))))
        );
    }// </editor-fold>//GEN-END:initComponents
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd");  
    private void btnUpdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnUpdateActionPerformed
        // TODO add your handling code here:

        int selectedrow = tblCars.getSelectedRow();
        System.out.print(selectedrow);
        if(selectedrow>=0)
        {
            txtcompany.setText(tblCars.getValueAt(selectedrow, 1).toString());
             txtmodel.setText(tblCars.getValueAt(selectedrow, 2).toString());
             txtlocation.setText(tblCars.getValueAt(selectedrow, 5).toString());
            txtseatcapacity.setText(tblCars.getValueAt(selectedrow, 3).toString());
            txtcertificate.setText(tblCars.getValueAt(selectedrow, 6).toString());
            if(tblCars.getValueAt(selectedrow, 4).toString()=="Yes")
            {
                checked.setSelected(true);
            }
            else
            {
                checked.setSelected(false); 
            }
           
        }
        else
        {
                JOptionPane.showMessageDialog(null,"Please select a row"); 
        }
    }//GEN-LAST:event_btnUpdateActionPerformed

    private void tblCarsMouseClicked(java.awt.event.MouseEvent evt) {//GEN-FIRST:event_tblCarsMouseClicked
        // TODO add your handling code here:
        //int selectedrow = tblCars.getSelectedRow();
    }//GEN-LAST:event_tblCarsMouseClicked

    private void btnconfirmupdateActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnconfirmupdateActionPerformed
        // TODO add your handling code here:
        int selectedrow=tblCars.getSelectedRow();
        if(selectedrow>=0)
        {
         String x=tblCars.getValueAt(selectedrow, 0).toString() ;
         for(Car c: carsCatalog.getCarsCatalog())
         {
             if(c.getSerialno()==x)
             {
                  if(txtlocation.getText()==null ||txtlocation.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Location cannot be empty!");
            return;
        }
                 c.setLocation( txtlocation.getText());
                    
                    if(txtcompany.getText()==null ||txtcompany.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Company cannot be empty!");
            return;
        } 
                 c.setCompany(txtcompany.getText());
                 if(txtmodel.getText()==null ||txtmodel.getText().equals("")){
            JOptionPane.showMessageDialog(null, "Model cannot be empty!");
            return;
        }  
                 c.setModelNumber(txtmodel.getText());
                 try
                 {
                        int seatCap = Integer.parseInt(txtseatcapacity.getText());
                 }
                 
                      catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Please input a valid number!");
            return;
                         }
                 c.setSeatCapacity(Integer.parseInt(txtseatcapacity.getText()));
                 //c.setMaintainExpdate(tblCars.getValueAt(selectedrow, 6).toString());
                 c.setStatusOfCar(checked.isSelected());
               populateTable();
               txtlocation.setText("");
                   txtcompany.setText("");
                     txtmodel.setText("");
                     txtseatcapacity.setText("");
                     checked.setSelected(false); 
                     txtcertificate.setText("");
                     
             }
         }
          
        }
       
    }//GEN-LAST:event_btnconfirmupdateActionPerformed

    

    public void setvisibility( boolean flag)
    {
         l2.setVisible(flag);
          l3.setVisible(flag);
          l4.setVisible(flag);
          l5.setVisible(flag); 
          l6.setVisible(flag);
          l7.setVisible(flag);
          txtcompany.setVisible(flag);
         checked.setVisible(flag);
  txtlocation.setVisible(flag);
  txtmodel.setVisible(flag);
   txtseatcapacity.setVisible(flag);
  txtcertificate.setVisible(flag);
            
            
    }
      public void populateTable(){
          
          
    DefaultTableModel dtm = (DefaultTableModel) tblCars.getModel();
    dtm.setRowCount(0);
    for(Car c:carsCatalog.getCarsCatalog()){
        Object[] row = new Object[10];
            row[0] = c.getSerialno();
            row[1]=c.getCompany();
            row[2]=c.getModelNumber();
            row[3]=c.getSeatCapacity();
            if(c.getisStatusOfCar()){
                row[4]="Yes";
            }
            else{
                row[4]="No";
            }
            row[5]=c.getLocation();
            row[6]=formatter.format(c.getMaintainExpdate());
                 
        dtm.addRow(row);
    }
        
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnUpdate;
    private javax.swing.JButton btnconfirmupdate;
    private javax.swing.JCheckBox checked;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JLabel l2;
    private javax.swing.JLabel l3;
    private javax.swing.JLabel l4;
    private javax.swing.JLabel l5;
    private javax.swing.JLabel l6;
    private javax.swing.JLabel l7;
    private javax.swing.JTable tblCars;
    private javax.swing.JTextField txtcertificate;
    private javax.swing.JTextField txtcompany;
    private javax.swing.JTextField txtlocation;
    private javax.swing.JTextField txtmodel;
    private javax.swing.JTextField txtseatcapacity;
    // End of variables declaration//GEN-END:variables
}
