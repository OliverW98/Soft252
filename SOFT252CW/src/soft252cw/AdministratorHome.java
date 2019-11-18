/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soft252cw;

import java.util.Random;

/**
 *
 * @author Oliver
 */
public class AdministratorHome extends javax.swing.JFrame {

    /**
     * Creates new form AdministratorHome
     */
    private Administrator currentAdmin;
    private Hospital hospital;
    private Doctor currentDoctor;

    public AdministratorHome(Administrator admin, Hospital hospital) {
        initComponents();
        this.currentAdmin = admin;
        this.hospital = hospital;
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel5 = new javax.swing.JLabel();
        jTextField4 = new javax.swing.JTextField();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jLabel11 = new javax.swing.JLabel();
        cbSelectDoctor = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAreaDoctorReviews = new javax.swing.JTextArea();
        jLabel12 = new javax.swing.JLabel();
        jLabel13 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtAreaFeedback = new javax.swing.JTextArea();
        btnPostFeedback = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        txtName = new javax.swing.JTextField();
        jLabel3 = new javax.swing.JLabel();
        txtSurname = new javax.swing.JTextField();
        jLabel4 = new javax.swing.JLabel();
        txtAddress = new javax.swing.JTextField();
        jLabel6 = new javax.swing.JLabel();
        txtPassword = new javax.swing.JTextField();
        jLabel7 = new javax.swing.JLabel();
        btnAddPerson = new javax.swing.JButton();
        cbAddOccupation = new javax.swing.JComboBox<>();
        lblAddOutput = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        cbRemoveOccupation = new javax.swing.JComboBox<>();
        cbRemovePerson = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        btnRemovePerson = new javax.swing.JButton();
        lblRemoveOutput = new javax.swing.JLabel();

        jLabel5.setText("jLabel2");

        jTextField4.setText("jTextField1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel11.setText("Select Doctor :");

        cbSelectDoctor.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbSelectDoctorActionPerformed(evt);
            }
        });

        txtAreaDoctorReviews.setColumns(20);
        txtAreaDoctorReviews.setRows(5);
        jScrollPane1.setViewportView(txtAreaDoctorReviews);

        jLabel12.setText("Doctor Reviews");

        jLabel13.setText("Feedback");

        txtAreaFeedback.setColumns(20);
        txtAreaFeedback.setRows(5);
        jScrollPane2.setViewportView(txtAreaFeedback);

        btnPostFeedback.setText("Post Feedback");
        btnPostFeedback.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPostFeedbackActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(btnPostFeedback)
                    .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                        .addComponent(jLabel13)
                        .addComponent(jLabel12)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.DEFAULT_SIZE, 400, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createSequentialGroup()
                            .addComponent(jLabel11)
                            .addGap(18, 18, 18)
                            .addComponent(cbSelectDoctor, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addComponent(jScrollPane2)))
                .addContainerGap(317, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(51, 51, 51)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel11)
                    .addComponent(cbSelectDoctor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(38, 38, 38)
                .addComponent(jLabel12)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(30, 30, 30)
                .addComponent(jLabel13)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(18, 18, 18)
                .addComponent(btnPostFeedback)
                .addContainerGap(36, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Doctor Feedback", jPanel2);

        jLabel1.setText("Add Doctor / Secretary");

        jLabel2.setText("Name :");

        jLabel3.setText("Surname :");

        jLabel4.setText("Address :");

        jLabel6.setText("Password :");

        jLabel7.setText("Occupation :");

        btnAddPerson.setText("Add Perosn");
        btnAddPerson.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnAddPersonActionPerformed(evt);
            }
        });

        cbAddOccupation.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Doctor", "Secretary" }));

        lblAddOutput.setText("jLabel8");

        jLabel8.setText("Remove Doctor / Secretary");

        cbRemoveOccupation.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "Doctor", "Secretary" }));
        cbRemoveOccupation.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbRemoveOccupationActionPerformed(evt);
            }
        });

        jLabel9.setText("Occupation :");

        jLabel10.setText("Person :");

        btnRemovePerson.setText("Remove Person");
        btnRemovePerson.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemovePersonActionPerformed(evt);
            }
        });

        lblRemoveOutput.setText("jLabel11");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3)
                            .addComponent(jLabel4)
                            .addComponent(jLabel6)
                            .addComponent(jLabel7))
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(txtSurname)
                                .addComponent(txtName)
                                .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, 240, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbAddOccupation, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 72, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblRemoveOutput)
                            .addComponent(jLabel8)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel10)
                                    .addComponent(jLabel9))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(cbRemoveOccupation, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(cbRemovePerson, javax.swing.GroupLayout.PREFERRED_SIZE, 130, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addComponent(btnRemovePerson)))
                    .addComponent(jLabel1)
                    .addComponent(btnAddPerson)
                    .addComponent(lblAddOutput))
                .addGap(109, 109, 109))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(30, 30, 30)
                .addComponent(jLabel1)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(txtName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(txtSurname, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel4)
                            .addComponent(txtAddress, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(txtPassword, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(76, 76, 76)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(jLabel10)
                                    .addComponent(cbRemovePerson, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel8)
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                                    .addComponent(cbRemoveOccupation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(jLabel9))))
                        .addGap(42, 42, 42)
                        .addComponent(btnRemovePerson)))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel7)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cbAddOccupation, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(lblRemoveOutput)))
                .addGap(18, 18, 18)
                .addComponent(btnAddPerson)
                .addGap(18, 18, 18)
                .addComponent(lblAddOutput)
                .addContainerGap(150, Short.MAX_VALUE))
        );

        jTabbedPane1.addTab("Add / Remove", jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(jTabbedPane1)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void onLoad() {
        lblAddOutput.setText("");
        lblRemoveOutput.setText("");
        populateCBs();
        displayDoctorReviews();
    }


    private void btnAddPersonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnAddPersonActionPerformed
        Random rand = new Random();
        String id = String.format("%04d%n", rand.nextInt(10000));

        if (cbAddOccupation.getSelectedItem().equals("Doctor") && !"".equals(txtName.getText()) && !"".equals(txtSurname.getText())
                && !"".equals(txtAddress.getText()) && !"".equals(txtPassword.getText())) {
            Doctor doctor = new Doctor(txtName.getText(), txtSurname.getText(), txtAddress.getText(),
                    "D" + id, txtPassword.getText());
            hospital.people.add(doctor);
            lblAddOutput.setText(txtName.getText() + " " + txtSurname.getText() + " was added to the system as a Doctor.");
        } else if (cbAddOccupation.getSelectedItem().equals("Secretary") && !"".equals(txtName.getText()) && !"".equals(txtSurname.getText())
                && !"".equals(txtAddress.getText()) && !"".equals(txtPassword.getText())) {
            Secretary secretary = new Secretary(txtName.getText(), txtSurname.getText(), txtAddress.getText(),
                    "S" + id, txtPassword.getText());
            hospital.people.add(secretary);
            lblAddOutput.setText(txtName.getText() + " " + txtSurname.getText() + " was added as a Secretary.");
        } else {
            lblAddOutput.setText("Please fill in TextBoxes");
        }
        populateCBs();
        // LogIn.updateHospital(this.hospital);
    }//GEN-LAST:event_btnAddPersonActionPerformed

    public void populateCBs() {
        cbRemovePerson.removeAllItems();
        cbSelectDoctor.removeAllItems();
        char IDletter = cbRemoveOccupation.getSelectedItem().toString().charAt(0);

        for (HospitalPerson person : hospital.people) {
            if (person.getID().charAt(0) == IDletter) {
                cbRemovePerson.addItem(person.getName() + " " + person.getSurname());
            }
            if (person.getID().charAt(0) == 'D') {
                cbSelectDoctor.addItem(person.getName() + " " + person.getSurname());
            }
        }

    }

    private void btnRemovePersonActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemovePersonActionPerformed
        String selectedPerson = (String) cbRemovePerson.getSelectedItem();

        for (int i = 0; i < hospital.people.size(); i++) {
            if (selectedPerson.equals(hospital.people.get(i).getName() + " " + hospital.people.get(i).getSurname())) {
                hospital.people.remove(i);
            }
        }
        populateCBs();
        lblRemoveOutput.setText(selectedPerson + " has been removed.");
    }//GEN-LAST:event_btnRemovePersonActionPerformed

    private void cbSelectDoctorActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbSelectDoctorActionPerformed
        if (cbSelectDoctor.getSelectedItem() == null) {
            System.out.println("oopsie");
        } else {
            displayDoctorReviews();
        }
    }//GEN-LAST:event_cbSelectDoctorActionPerformed

    private void cbRemoveOccupationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbRemoveOccupationActionPerformed
        populateCBs();
    }//GEN-LAST:event_cbRemoveOccupationActionPerformed

    private void btnPostFeedbackActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPostFeedbackActionPerformed
        txtAreaFeedback.getText();
    }//GEN-LAST:event_btnPostFeedbackActionPerformed

    public void displayDoctorReviews() {
        txtAreaDoctorReviews.setText("");
        
        getCurrentDoctor(cbSelectDoctor.getSelectedItem().toString());

        for (int i = 0; i < currentDoctor.getReview().size(); i++) {
            txtAreaDoctorReviews.append("- "+currentDoctor.getName() + " " + currentDoctor.getSurname() + " was given "
                    + currentDoctor.getReview().get(i).getRating() + "/5 stars : "
                    + currentDoctor.getReview().get(i).getReview() + "\n");
        }
    }

    public void getCurrentDoctor(String selectedDoctor) {
        String DoctorName = selectedDoctor;

        hospital.people.forEach((_item) -> {

            boolean nameTest = DoctorName.equals(_item.getName() + " " + _item.getSurname());

            if (nameTest == true) {

                currentDoctor = (Doctor) _item;

            }
        });
    }
    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnAddPerson;
    private javax.swing.JButton btnPostFeedback;
    private javax.swing.JButton btnRemovePerson;
    private javax.swing.JComboBox<String> cbAddOccupation;
    private javax.swing.JComboBox<String> cbRemoveOccupation;
    private javax.swing.JComboBox<String> cbRemovePerson;
    private javax.swing.JComboBox<String> cbSelectDoctor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
    private javax.swing.JLabel jLabel13;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JTextField jTextField4;
    private javax.swing.JLabel lblAddOutput;
    private javax.swing.JLabel lblRemoveOutput;
    private javax.swing.JTextField txtAddress;
    private javax.swing.JTextArea txtAreaDoctorReviews;
    private javax.swing.JTextArea txtAreaFeedback;
    private javax.swing.JTextField txtName;
    private javax.swing.JTextField txtPassword;
    private javax.swing.JTextField txtSurname;
    // End of variables declaration//GEN-END:variables
}
