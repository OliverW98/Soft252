/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soft252cw;

/**
 *
 * @author Oliver
 */
public class LogIn extends javax.swing.JFrame {

    /**
     * Creates new form LogIn
     */
    
    public Hospital hospital;
    public MedicineStock medStock;
    
    public LogIn() {
        initComponents();
        lblOutput.setText("");
        hospital = new Hospital();
        medStock = new MedicineStock();
    }
    
    public void updateHospital(Hospital hospital){
        this.hospital = hospital;
    }
    
    public void updateMedicineStock(MedicineStock medStock){
        this.medStock = medStock;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        btnLogin = new javax.swing.JButton();
        btnRequestAccount = new javax.swing.JButton();
        lblUniqueID = new javax.swing.JLabel();
        txtUniqueID = new javax.swing.JTextField();
        lblPassword = new javax.swing.JLabel();
        lblOutput = new javax.swing.JLabel();
        txtPassword = new javax.swing.JTextField();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnLogin.setText("Login");
        btnLogin.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnLoginActionPerformed(evt);
            }
        });

        btnRequestAccount.setText("Request Account");
        btnRequestAccount.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRequestAccountActionPerformed(evt);
            }
        });

        lblUniqueID.setText("Unique ID :");
        lblUniqueID.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        lblPassword.setText("Password :");
        lblPassword.setCursor(new java.awt.Cursor(java.awt.Cursor.DEFAULT_CURSOR));

        lblOutput.setText("output");

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(layout.createSequentialGroup()
                        .addGap(107, 107, 107)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(btnLogin)
                            .addComponent(lblOutput))
                        .addGap(47, 47, 47)
                        .addComponent(btnRequestAccount))
                    .addGroup(layout.createSequentialGroup()
                        .addGap(69, 69, 69)
                        .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblUniqueID)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtUniqueID, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(layout.createSequentialGroup()
                                .addComponent(lblPassword)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))))
                .addContainerGap(106, Short.MAX_VALUE))
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(layout.createSequentialGroup()
                .addGap(61, 61, 61)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblUniqueID)
                    .addComponent(txtUniqueID, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(27, 27, 27)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(lblPassword)
                    .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(43, 43, 43)
                .addGroup(layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnLogin)
                    .addComponent(btnRequestAccount))
                .addGap(18, 18, 18)
                .addComponent(lblOutput)
                .addContainerGap(74, Short.MAX_VALUE))
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    private void btnRequestAccountActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRequestAccountActionPerformed
        this.setVisible(false);
        RequestAccountCreation tempRequestAccountCreation = new RequestAccountCreation(hospital);
        tempRequestAccountCreation.setVisible(true);
        tempRequestAccountCreation.onLoad(); 
    }//GEN-LAST:event_btnRequestAccountActionPerformed

    private void btnLoginActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnLoginActionPerformed
        hospital.people.forEach((_item) -> {
            
             boolean uniqueid =  txtUniqueID.getText().equals(_item.getID());
             boolean password = txtPassword.getText().equals(_item.getPassword());
                    
        if(_item.getID().substring(0, 1).equals("A") &&uniqueid == true && password == true){
            AdministratorHome tempAdministratorHome = new AdministratorHome(hospital);
            tempAdministratorHome.setVisible(true);
            tempAdministratorHome.onLoad();
        } else if(_item.getID().substring(0, 1).equals("S") && uniqueid == true && password == true){
            SecretaryHome tempSecretaryHome = new SecretaryHome(hospital,medStock);
            tempSecretaryHome.setVisible(true);
            tempSecretaryHome.onLoad();
        }  else if(_item.getID().substring(0, 1).equals("D") && uniqueid == true && password == true){
            DoctorHome tempDoctorHome = new DoctorHome((Doctor)_item, hospital,medStock);
            tempDoctorHome.setVisible(true);
            tempDoctorHome.onLoad();
        }   else if(_item.getID().substring(0, 1).equals("P") && uniqueid == true &&password == true){
            PatientHome tempPatientHome = new PatientHome((Patient)_item, hospital);
            tempPatientHome.setVisible(true);
            tempPatientHome.onLoad();
        }   else {
            lblOutput.setText("Please Enter Vaild ID and Password");     
        }
        });

    }//GEN-LAST:event_btnLoginActionPerformed
   
    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnLogin;
    private javax.swing.JButton btnRequestAccount;
    private javax.swing.JLabel lblOutput;
    private javax.swing.JLabel lblPassword;
    private javax.swing.JLabel lblUniqueID;
    private javax.swing.JTextField txtPassword;
    private javax.swing.JTextField txtUniqueID;
    // End of variables declaration//GEN-END:variables
}
