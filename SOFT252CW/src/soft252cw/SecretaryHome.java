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
public class SecretaryHome extends javax.swing.JFrame {

    /**
     * Creates new form SecretaryHome
     */
    public Hospital hospital;
    public Patient currentPatient;
    public MedicineStock medStock;

    public SecretaryHome(Hospital hospital, MedicineStock medStock) {
        initComponents();
        this.hospital = hospital;
        this.medStock = medStock;
    }

    public void onLoad() {

        Prescription pre = new Prescription(medStock.medicine.get(3), 10, "all day ", false);
        Patient pat = (Patient) hospital.people.get(5);

        pat.setPrescription(pre);

        lblPrescriptionOutput.setText("");
        lblMedicineOutput.setText("");
        lblApproveOutput.setText("");
        lblRemoveOutput.setText("");
        lblAppointmentsOutput.setText("");
        displayPatientsToApprove();
        displayPatientsToRemove();
        displayPatientsWithAppointments();
        displayPatientsWithPrescriptions();
        displayMedicineToRestock();
    }

    public void displayPatientsToApprove() {
        cbApprovePatient.removeAllItems();
        for (HospitalPerson person : hospital.people) {
            if (person.getID().charAt(0) == 'P') {
                Patient pat = (Patient) person;
                if (pat.isApproved() == false) {
                    cbApprovePatient.addItem(pat.getName() + " " + pat.getSurname());
                }
            }
        }
    }

    public void displayPatientsToRemove() {
        cbRemovePatient.removeAllItems();

        for (HospitalPerson person : hospital.people) {
            if (person.getID().charAt(0) == 'P') {
                Patient pat = (Patient) person;
                if (pat.isRemoveRequest() == true) {
                    cbRemovePatient.addItem(pat.getName() + " " + pat.getSurname());
                }
            }
        }
    }

    public void displayPatientsWithPrescriptions() {
        cbPatientsPrescription.removeAllItems();

        for (HospitalPerson person : hospital.people) {
            if (person.getID().charAt(0) == 'P') {
                Patient pat = (Patient) person;
                if (pat.getPrescription() != null && pat.getPrescription().isHandedOut() == false) {
                    cbPatientsPrescription.addItem(pat.getName() + " " + pat.getSurname());
                }
            }
        }
        displayPrescriptions();
    }

    public void displayPrescriptions() {
        txtAreaPrescrpitions.setText("");
        if (cbPatientsPrescription.getSelectedItem() != null) {
            getCurrentPatient(cbPatientsPrescription.getSelectedItem().toString());

            if (currentPatient.getPrescription() != null) {
                txtAreaPrescrpitions.setText("Medicine : " + currentPatient.getPrescription().getMedicine().getName() + "\n"
                        + "Quantity : " + currentPatient.getPrescription().getQuantity() + "\n"
                        + "Dosage : " + currentPatient.getPrescription().getDosage());
            }
        } else {
            lblPrescriptionOutput.setText("There are no prescriptions to handout.");
        }
    }

    public void displayMedicineToRestock() {
        txtAreaMedicine.setText("");
        for (int i = 0; i < medStock.medicine.size(); i++) {
            if (medStock.medicine.get(i).getStock() < 100) {
                txtAreaMedicine.append(medStock.medicine.get(i).getName() + " has a stock of "
                        + medStock.medicine.get(i).getStock() + " and needs to be restocked.\n");
            }
        }
    }

    public void displayPatientsWithAppointments() {
        cbPatientsAppointments.removeAllItems();

        System.out.println("Here ");
        for (HospitalPerson person : hospital.people) {
            if (person.getID().charAt(0) == 'P') {
                System.out.println("Here 1");
                Patient pat = (Patient) person;
                for (int i = 0; i < pat.getAppointment().size(); i++) {
                    System.out.println("Here 2");
                    if (pat.getAppointment().get(i).isApprovesd() == false) {
                        System.out.println("Here 3");
                        cbPatientsAppointments.addItem(person.getName() + " " + person.getSurname());

                        // a name is added twice if have two appointments to approve.
                    }
                }
            }
        }
        displayAppointmentsToCreate();
    }

    public void displayAppointmentsToCreate() {
        txtAreaAppointment.setText("");
        if (cbPatientsAppointments.getSelectedItem() != null) {
            getCurrentPatient(cbPatientsAppointments.getSelectedItem().toString());

            for (int i = 0; i < currentPatient.getAppointment().size(); i++) {
                if (currentPatient.getAppointment().get(i).isApprovesd() == false) {
                    txtAreaAppointment.append(currentPatient.getAppointment().get(i).getDoctorName()
                            + " on " + currentPatient.getAppointment().get(i).getDate() + "\n");
                }
            }
        }
    }

    public void getCurrentPatient(String selectedPatient) {
        String PatientName = selectedPatient;

        hospital.people.forEach((_item) -> {

            boolean nameTest = PatientName.equals(_item.getName() + " " + _item.getSurname());

            if (nameTest == true) {
                currentPatient = (Patient) _item;
            }
        });
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jLabel4 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        jLabel1 = new javax.swing.JLabel();
        cbApprovePatient = new javax.swing.JComboBox<>();
        btnApprove = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        cbRemovePatient = new javax.swing.JComboBox<>();
        btnRemove = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        cbPatientsAppointments = new javax.swing.JComboBox<>();
        btnCreateAppointment = new javax.swing.JButton();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAreaAppointment = new javax.swing.JTextArea();
        lblApproveOutput = new javax.swing.JLabel();
        lblRemoveOutput = new javax.swing.JLabel();
        lblAppointmentsOutput = new javax.swing.JLabel();
        btnClose2 = new javax.swing.JButton();
        jPanel2 = new javax.swing.JPanel();
        jLabel6 = new javax.swing.JLabel();
        cbPatientsPrescription = new javax.swing.JComboBox<>();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtAreaPrescrpitions = new javax.swing.JTextArea();
        btnHandOut = new javax.swing.JButton();
        btnClose1 = new javax.swing.JButton();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtAreaMedicine = new javax.swing.JTextArea();
        btnRestock = new javax.swing.JButton();
        lblMedicineOutput = new javax.swing.JLabel();
        lblPrescriptionOutput = new javax.swing.JLabel();

        jLabel4.setText("jLabel4");

        jLabel7.setText("jLabel7");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        jLabel1.setText("Patient accounts to be approved :");

        btnApprove.setText("Approve");
        btnApprove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnApproveActionPerformed(evt);
            }
        });

        jLabel2.setText("Patient accounts to be removed :");

        btnRemove.setText("Remove");
        btnRemove.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRemoveActionPerformed(evt);
            }
        });

        jLabel3.setText("Patients with Requests for appointmets:");

        cbPatientsAppointments.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                cbPatientsAppointmentsActionPerformed(evt);
            }
        });

        btnCreateAppointment.setText("Create Appointment");
        btnCreateAppointment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateAppointmentActionPerformed(evt);
            }
        });

        jLabel5.setText("Requested Appointments:");

        txtAreaAppointment.setColumns(20);
        txtAreaAppointment.setRows(5);
        jScrollPane1.setViewportView(txtAreaAppointment);

        lblApproveOutput.setText("jLabel6");

        lblRemoveOutput.setText("jLabel6");

        lblAppointmentsOutput.setText("jLabel6");

        btnClose2.setText("Close");
        btnClose2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClose2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jLabel2)
                    .addComponent(jLabel3)
                    .addComponent(jLabel5))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 330, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(btnCreateAppointment)
                        .addGap(18, 18, 18)
                        .addComponent(lblAppointmentsOutput))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(cbApprovePatient, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(cbRemovePatient, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cbPatientsAppointments, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE)))
                        .addGap(45, 45, 45)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnApprove)
                                .addGap(18, 18, 18)
                                .addComponent(lblApproveOutput))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnRemove)
                                .addGap(18, 18, 18)
                                .addComponent(lblRemoveOutput)))))
                .addContainerGap(171, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnClose2)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(36, 36, 36)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel1)
                    .addComponent(cbApprovePatient, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnApprove)
                    .addComponent(lblApproveOutput))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(cbRemovePatient, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnRemove)
                    .addComponent(lblRemoveOutput))
                .addGap(28, 28, 28)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(cbPatientsAppointments, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel5)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCreateAppointment)
                    .addComponent(lblAppointmentsOutput))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 85, Short.MAX_VALUE)
                .addComponent(btnClose2)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Approve Patients", jPanel1);

        jLabel6.setText("Patients with Precscriptions to pickup :");

        txtAreaPrescrpitions.setColumns(20);
        txtAreaPrescrpitions.setRows(5);
        jScrollPane2.setViewportView(txtAreaPrescrpitions);

        btnHandOut.setText("Hand Out");
        btnHandOut.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnHandOutActionPerformed(evt);
            }
        });

        btnClose1.setText("Close");
        btnClose1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClose1ActionPerformed(evt);
            }
        });

        jLabel8.setText("Medicine to be restocked :");

        txtAreaMedicine.setColumns(20);
        txtAreaMedicine.setRows(5);
        jScrollPane3.setViewportView(txtAreaMedicine);

        btnRestock.setText("Restock");
        btnRestock.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRestockActionPerformed(evt);
            }
        });

        lblMedicineOutput.setText("jLabel9");

        lblPrescriptionOutput.setText("jLabel9");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnClose1)
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(47, 47, 47)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel6)
                    .addComponent(jLabel8))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnRestock)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(lblMedicineOutput))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(cbPatientsPrescription, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(40, 40, 40)
                        .addComponent(btnHandOut)
                        .addGap(33, 33, 33)
                        .addComponent(lblPrescriptionOutput))
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 380, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(116, Short.MAX_VALUE))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel6)
                    .addComponent(cbPatientsPrescription, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(btnHandOut)
                    .addComponent(lblPrescriptionOutput))
                .addGap(18, 18, 18)
                .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 71, Short.MAX_VALUE)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel8)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(18, 18, 18)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnRestock)
                    .addComponent(lblMedicineOutput))
                .addGap(9, 9, 9)
                .addComponent(btnClose1)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Medicine", jPanel2);

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

    private void cbPatientsAppointmentsActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_cbPatientsAppointmentsActionPerformed
        if (cbPatientsAppointments.getSelectedItem() == null) {
            System.out.println("oopsie");
        } else {
            for (HospitalPerson person : hospital.people) {
                if (cbPatientsAppointments.getSelectedItem().equals(person.getName() + " " + person.getSurname())) {
                    displayAppointmentsToCreate();
                }
            }
        }
    }//GEN-LAST:event_cbPatientsAppointmentsActionPerformed

    private void btnApproveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnApproveActionPerformed
        if (cbApprovePatient.getSelectedItem() != null) {
            String patientName = cbApprovePatient.getSelectedItem().toString();

            for (HospitalPerson person : hospital.people) {
                if (patientName.equals(person.getName() + " " + person.getSurname())) {
                    Patient pat = (Patient) person;
                    pat.setApproved(true);
                }
            }
            displayPatientsToApprove();
        } else {
            lblApproveOutput.setText("No accounts to approve.");
        }
    }//GEN-LAST:event_btnApproveActionPerformed

    private void btnRemoveActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRemoveActionPerformed
        if (cbRemovePatient.getSelectedItem() != null) {
            String patientName = cbRemovePatient.getSelectedItem().toString();

            for (int i = 0; i < hospital.people.size(); i++) {
                if (patientName.equals(hospital.people.get(i).getName() + " " + hospital.people.get(i).getSurname())) {
                    Patient pat = (Patient) hospital.people.get(i);
                    pat.setRemoveRequest(true);
                    hospital.people.remove(hospital.people.get(i));
                }
            }
            displayPatientsToRemove();
        } else {
            lblRemoveOutput.setText("No accounts to remove");
        }

    }//GEN-LAST:event_btnRemoveActionPerformed

    private void btnCreateAppointmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateAppointmentActionPerformed
        if (cbPatientsAppointments.getSelectedItem() != null) {
            for (int i = 0; i < currentPatient.getAppointment().size(); i++) {
                if (currentPatient.getAppointment().get(i).isApprovesd() == false) {
                    currentPatient.getAppointment().get(i).setApprovesd(true);
                }
            }
            displayPatientsWithAppointments();
        } else {
            lblAppointmentsOutput.setText("No appointments to approve");
        }
    }//GEN-LAST:event_btnCreateAppointmentActionPerformed

    private void btnHandOutActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnHandOutActionPerformed
        if (cbPatientsPrescription.getSelectedItem() != null) {
            getCurrentPatient(cbPatientsPrescription.getSelectedItem().toString());

            currentPatient.getPrescription().setHandedOut(true);

            for (int i = 0; i < medStock.medicine.size(); i++) {

                if (currentPatient.getPrescription().getMedicine().equals(medStock.medicine.get(i))) {
                    medStock.medicine.get(i).setStock(medStock.medicine.get(i).getStock()
                            - currentPatient.getPrescription().getQuantity());
                }
            }
            displayPatientsWithPrescriptions();
        }
    }//GEN-LAST:event_btnHandOutActionPerformed

    private void btnClose2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClose2ActionPerformed
        exitPage();
    }//GEN-LAST:event_btnClose2ActionPerformed

    private void btnClose1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClose1ActionPerformed
        exitPage();
    }//GEN-LAST:event_btnClose1ActionPerformed

    private void btnRestockActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRestockActionPerformed
        for (int i = 0; i < medStock.medicine.size(); i++) {
            if (medStock.medicine.get(i).getStock() < 100) {
                medStock.medicine.get(i).setStock(100);
            }
        }
        lblMedicineOutput.setText("Order for Medicine has been placed.");
        displayMedicineToRestock();
    }//GEN-LAST:event_btnRestockActionPerformed

    public void exitPage() {
        this.setVisible(false);
        LogIn tempLogIn = new LogIn();
        tempLogIn.setVisible(true);
        tempLogIn.updateHospital(hospital);
        tempLogIn.updateMedicineStock(medStock);
    }
    /**
     * @param args the command line arguments
     */

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnApprove;
    private javax.swing.JButton btnClose1;
    private javax.swing.JButton btnClose2;
    private javax.swing.JButton btnCreateAppointment;
    private javax.swing.JButton btnHandOut;
    private javax.swing.JButton btnRemove;
    private javax.swing.JButton btnRestock;
    private javax.swing.JComboBox<String> cbApprovePatient;
    private javax.swing.JComboBox<String> cbPatientsAppointments;
    private javax.swing.JComboBox<String> cbPatientsPrescription;
    private javax.swing.JComboBox<String> cbRemovePatient;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lblAppointmentsOutput;
    private javax.swing.JLabel lblApproveOutput;
    private javax.swing.JLabel lblMedicineOutput;
    private javax.swing.JLabel lblPrescriptionOutput;
    private javax.swing.JLabel lblRemoveOutput;
    private javax.swing.JTextArea txtAreaAppointment;
    private javax.swing.JTextArea txtAreaMedicine;
    private javax.swing.JTextArea txtAreaPrescrpitions;
    // End of variables declaration//GEN-END:variables
}
