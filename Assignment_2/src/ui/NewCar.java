/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package ui;
import java.text.ParseException;
import javax.swing.JOptionPane;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.time.LocalDate; 
import javax.swing.JPanel;
import model.Car;
import BusinessLogic.*;

/**
 *
 * @author sravyaganda
 */
public class NewCar extends javax.swing.JPanel {

    /**
     * Creates new form NewCar
     */
      private JPanel userProcessContainer;
    private CarsCatalog carsCatalog;
    public NewCar(JPanel userProcessContainer,CarsCatalog carsCatalog) {
        initComponents();
        this.carsCatalog=carsCatalog;
        this.userProcessContainer=userProcessContainer;
        
    }
    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jButton2 = new javax.swing.JButton();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        txtcompany = new javax.swing.JTextField();
        txtseatcapacity = new javax.swing.JTextField();
        txtcarmodel = new javax.swing.JTextField();
        txtcolor = new javax.swing.JTextField();
        txtserialnumber = new javax.swing.JTextField();
        txtlocation = new javax.swing.JTextField();
        txtavailable = new javax.swing.JCheckBox();
        jButton3 = new javax.swing.JButton();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        txtyear = new javax.swing.JTextField();
        txtcertificate = new javax.swing.JTextField();

        jButton2.setText("jButton2");

        jLabel1.setFont(new java.awt.Font("Tahoma", 1, 14)); // NOI18N
        jLabel1.setForeground(new java.awt.Color(51, 51, 0));
        jLabel1.setText("                                  ADD YOUR CAR TO CATALOG");

        jLabel2.setText("Company");

        jLabel3.setText("Year of Manufacture");

        jLabel4.setText("Seat Capacity");

        jLabel5.setText("Color");

        jLabel6.setText("Car Model");

        jLabel7.setText("Serial Number");

        jLabel8.setText("Available for Uber");

        txtcompany.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                txtcompanyActionPerformed(evt);
            }
        });

        txtavailable.setText("YES");

        jButton3.setText("ADD CAR");
        jButton3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                jButton3ActionPerformed(evt);
            }
        });

        jLabel9.setText("Location");

        jLabel10.setText("Maintenance Certificate Expiry Date");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(this);
        this.setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(296, 296, 296)
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 355, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(74, 74, 74)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 102, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(87, 87, 87)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtserialnumber, javax.swing.GroupLayout.DEFAULT_SIZE, 158, Short.MAX_VALUE)
                                .addComponent(txtcarmodel)
                                .addComponent(txtyear))
                            .addComponent(txtcompany, javax.swing.GroupLayout.Alignment.TRAILING, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(143, 143, 143)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel9, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                            .addGroup(layout.createSequentialGroup()
                                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel4)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 86, javax.swing.GroupLayout.PREFERRED_SIZE))
                                .addGap(0, 0, Short.MAX_VALUE)))
                        .addGap(120, 120, 120)))
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addComponent(txtcertificate, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(95, 95, 95))
                    .addGroup(layout.createSequentialGroup()
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(txtlocation, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtcolor, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtseatcapacity, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addContainerGap())))
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(379, 379, 379)
                        .addComponent(jLabel8)
                        .addGap(57, 57, 57)
                        .addComponent(txtavailable))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(426, 426, 426)
                        .addComponent(jButton3, javax.swing.GroupLayout.PREFERRED_SIZE, 158, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addGroup(layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jLabel1, javax.swing.GroupLayout.PREFERRED_SIZE, 42, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(63, 63, 63)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtcompany, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel4, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(36, 36, 36)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtyear, javax.swing.GroupLayout.PREFERRED_SIZE, 34, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel3, javax.swing.GroupLayout.PREFERRED_SIZE, 30, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(230, 230, 230)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtcarmodel, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, layout.createSequentialGroup()
                        .addGap(109, 109, 109)
                        .addComponent(txtseatcapacity, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9, javax.swing.GroupLayout.PREFERRED_SIZE, 36, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(txtlocation, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(txtcertificate, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10))
                        .addGap(19, 19, 19)))
                .addGap(24, 24, 24)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(txtserialnumber, javax.swing.GroupLayout.PREFERRED_SIZE, 31, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel7, javax.swing.GroupLayout.PREFERRED_SIZE, 29, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtcolor, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5, javax.swing.GroupLayout.PREFERRED_SIZE, 22, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(41, 41, 41)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel8, javax.swing.GroupLayout.PREFERRED_SIZE, 28, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(txtavailable))
                .addGap(29, 29, 29)
                .addComponent(jButton3)
                .addContainerGap(21, Short.MAX_VALUE))
        );

        txtcompany.getAccessibleContext().setAccessibleName("companyname");
        txtseatcapacity.getAccessibleContext().setAccessibleName("seatcapacity");
        txtcarmodel.getAccessibleContext().setAccessibleName("carmodel");
        txtcolor.getAccessibleContext().setAccessibleName("color");
        txtserialnumber.getAccessibleContext().setAccessibleName("serialnumber");
        txtlocation.getAccessibleContext().setAccessibleName("location");
    }// </editor-fold>//GEN-END:initComponents

    private void txtcompanyActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_txtcompanyActionPerformed
        // TODO add your handling code here:
    }//GEN-LAST:event_txtcompanyActionPerformed

    private void jButton3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_jButton3ActionPerformed
        // TODO add your handling code here:
        try{
                  
        int seatCap = Integer.parseInt(txtseatcapacity.getText());   
        }
        catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Seat Capacity should be a Valid Number");
            return;
        }
         try{
        int yearManufacture=Integer.parseInt(txtyear.getText());   
        }
        catch(NumberFormatException e){
            JOptionPane.showMessageDialog(null, "Year of Manufacture should be a Valid Number");
            return;
        }
        String companyname = txtcompany.getText();
        if(companyname==null || companyname.equals("")){
            JOptionPane.showMessageDialog(null, "Company cannot be empty!");
            return;
        }
         String maincertificate = txtcertificate.getText();
        
        if(maincertificate==null || maincertificate.equals("")){
            JOptionPane.showMessageDialog(null, "maincertificate cannot be empty!");
            return;
        }
        try{
            SimpleDateFormat sdff = new SimpleDateFormat("yyyy-MM-dd");
            sdff.parse(maincertificate);
        }
         catch(ParseException e)
      {
           JOptionPane.showMessageDialog(null, "Input Certificate Date In yyyy-MM-dd Format"); 
           return;
      }
        String color = txtcolor.getText();
        if(color==null || color.equals("")){
            JOptionPane.showMessageDialog(null, "Color cannot be empty!");
            return;
        }
          String model = txtcarmodel.getText();
        if(model==null || model.equals("")){
            JOptionPane.showMessageDialog(null, "Car Model cannot be empty!");
            return;
        }
          String serialnumber = txtserialnumber.getText();
        if(serialnumber==null || serialnumber.equals("")){
            JOptionPane.showMessageDialog(null, "Serial Number cannot be empty!");
            return;
        }
        for(Car c:carsCatalog.getCarsCatalog())
        {
            if(c.getSerialno().equals(serialnumber))
            {
                JOptionPane.showMessageDialog(null, "Serial Number already exists");
                txtserialnumber.setText("");
                serialnumber="";
            return;
            }
        }
          String location = txtlocation.getText();
        if(location==null || location.equals("")){
            JOptionPane.showMessageDialog(null, "Location cannot be empty!");
            return;
        }
          String maincerticate = txtcertificate.getText();
        if(maincerticate==null || maincerticate.equals("")){
            JOptionPane.showMessageDialog(null, "Certificate ExpiryDate cannot be empty!");
            return;
        }
        
        
          boolean isAvailable = txtavailable.isSelected();
        
        
           SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd");
           
          
           
        int seatCap = Integer.parseInt(txtseatcapacity.getText());
        int yearManufacture=Integer.parseInt(txtyear.getText());
          //CarsCatalog.add(new Car("Tyota",2015,5,"Red","Innova","1234",true,sdf.parse("2022-05-11"),"Boston"));
          try{
          Car newcar=new Car(companyname,yearManufacture,seatCap,color,model,serialnumber,isAvailable,sdf.parse(maincerticate),location);
          carsCatalog.addCar(newcar);
          }
          catch(ParseException e)
          {
               System.out.println("Exception occured while parsing the date parameter" ); 
          }
          
          
        
        JOptionPane.showMessageDialog(null,"Car Successfully Created");
        
        txtcompany.setText("");
        txtcolor.setText("");
        txtlocation.setText("");
        txtcarmodel.setText("");
        txtserialnumber.setText("");
        txtavailable.setSelected(false);
        txtseatcapacity.setText("");
        txtyear.setText("");
        txtcertificate.setText("");
        
    }//GEN-LAST:event_jButton3ActionPerformed


    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton jButton2;
    private javax.swing.JButton jButton3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JCheckBox txtavailable;
    private javax.swing.JTextField txtcarmodel;
    private javax.swing.JTextField txtcertificate;
    private javax.swing.JTextField txtcolor;
    private javax.swing.JTextField txtcompany;
    private javax.swing.JTextField txtlocation;
    private javax.swing.JTextField txtseatcapacity;
    private javax.swing.JTextField txtserialnumber;
    private javax.swing.JTextField txtyear;
    // End of variables declaration//GEN-END:variables
}
