/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soft252cw;

import java.util.Calendar;
import java.util.Date;

/**
 *
 * @author Oliver
 */
public class DoctorHome extends javax.swing.JFrame {

    /**
     * Creates new form DoctorHome
     */
    public Doctor currentDoctor;
    public Hospital hospital;
    public MedicineStock medStock;
    public Patient currentPatient;
    public Medicine selectedMedicine;

    public DoctorHome(Doctor doctor, Hospital hospital, MedicineStock medStock) {
        initComponents();
        this.currentDoctor = doctor;
        this.hospital = hospital;
        this.medStock = medStock;
    }

    public void onLoad() {
        lblCurrentPatient.setText("You currently don't have an appointment with a patient.");
        lblCreateMedicineOutput.setText("");
        lblAppointmentOutput.setText("");
        lblNotesOutput.setText("");
        lblPrescribeMedicineOutput.setText("");
        loadDoctorAppointments();
        hasAppointment();
        displayPatientHistroy();
        loadMedicineNames();
    }

    /**
     * Loads the doctors future appointments
     * <p>
     * gets the current doctors name and checks each patient in the ArrayList
     * who has an appointment with the current doctor which has been approved.
     * </p>
     */
    public void loadDoctorAppointments() {
        String currentDoctorName = currentDoctor.getName() + " " + currentDoctor.getSurname();
        Date date = new Date();

        for (HospitalPerson person : hospital.people) {
            if (person.getID().charAt(0) == 'P') {
                Patient pat = (Patient) person;
                for (int i = 0; i < pat.getAppointment().size(); i++) {
                    if (pat.getAppointment().get(i).getDate().after(date)
                            && currentDoctorName.equals(pat.getAppointment().get(i).getDoctorName())
                            && pat.getAppointment().get(i).isApprovesd() == true) {
                        txtAreaAppointments.append("- You have an appointment with " + pat.getName() + " " + pat.getSurname()
                                + " on " + pat.getAppointment().get(i).getDate() + "\n");
                    }
                }
            }
        }
    }
    
     /**
     * checks if the current Doctor is in an appointment
     * <p>
     * gets the current doctors name and checks each patient in the ArrayList
     * who has an appointment with the current doctor at this current time 
     * which has been approved.
     * </p>
     */
    public void hasAppointment() {
        String currentDoctorName = currentDoctor.getName() + " " + currentDoctor.getSurname();
        Date date = new Date();

        for (HospitalPerson person : hospital.people) {
            if (person.getID().charAt(0) == 'P') {
                Patient pat = (Patient) person;
                for (int i = 0; i < pat.getAppointment().size(); i++) {
                    if (pat.getAppointment().get(i).getDate().equals(date)
                            && currentDoctorName.equals(pat.getAppointment().get(i).getDoctorName())
                            && pat.getAppointment().get(i).isApprovesd() == true) {
                        currentPatient = (Patient) person;
                        lblCurrentPatient.setText("Current appointment patient : "
                                +currentPatient.getName()+" "+currentPatient.getSurname());
                    }
                }
            }
        }
    }
    
    /**
     * displays the current patient past appointments.
     */
    public void displayPatientHistroy() {

        Date date = new Date();

        for (int i = 0; i < currentPatient.getAppointment().size(); i++) {
            if (currentPatient.getAppointment().get(i).getDate().before(date)) {
                txtAreaHistory.append("- they had a appointment with " + currentPatient.getAppointment().get(i).getDoctorName()
                        + " on " + currentPatient.getAppointment().get(i).getDate() + "\n");
            }

        }
    }

    /**
     * fills comboBoxes with the names of the medicines.
     */
    public void loadMedicineNames() {
        for (Medicine med : medStock.medicine) {
            cbMedicineName.addItem(med.getName());
        }
    }

    /**
     * a name of a medicine is pasted in and search for in the ArrayList of Medicine.
     * @param medicineName a String of the name of the medicine.
     */
    public void getSelectedMedicine(String medicineName) {
        for (Medicine med : medStock.medicine) {
            if (cbMedicineName.getSelectedItem().toString().equals(medicineName)) {
                selectedMedicine = med;
            }
        }
    }

    /**
     * This method is called from within the constructor to initialize the form.
     * WARNING: Do NOT modify this code. The content of this method is always
     * regenerated by the Form Editor.
     */
    @SuppressWarnings("unchecked")
    // <editor-fold defaultstate="collapsed" desc="Generated Code">//GEN-BEGIN:initComponents
    private void initComponents() {

        jTabbedPane1 = new javax.swing.JTabbedPane();
        jPanel1 = new javax.swing.JPanel();
        btnClose1 = new javax.swing.JButton();
        jLabel2 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtAreaNotes = new javax.swing.JTextArea();
        btnPostNotes = new javax.swing.JButton();
        jLabel4 = new javax.swing.JLabel();
        jLabel5 = new javax.swing.JLabel();
        cbMedicineName = new javax.swing.JComboBox<>();
        jLabel6 = new javax.swing.JLabel();
        spinnerQuantity = new javax.swing.JSpinner();
        jLabel7 = new javax.swing.JLabel();
        txtDosage = new javax.swing.JTextField();
        btnPrescribe = new javax.swing.JButton();
        lblNotesOutput = new javax.swing.JLabel();
        lblPrescribeMedicineOutput = new javax.swing.JLabel();
        jLabel8 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtAreaHistory = new javax.swing.JTextArea();
        cbRequestDay = new javax.swing.JComboBox<>();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        cbRequestHour = new javax.swing.JComboBox<>();
        cbRequestMonth = new javax.swing.JComboBox<>();
        cbRequestYear = new javax.swing.JComboBox<>();
        btnRequestAppointment = new javax.swing.JButton();
        cbRequestMins = new javax.swing.JComboBox<>();
        jLabel11 = new javax.swing.JLabel();
        jLabel12 = new javax.swing.JLabel();
        lblAppointmentOutput = new javax.swing.JLabel();
        lblCurrentPatient = new javax.swing.JLabel();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAreaAppointments = new javax.swing.JTextArea();
        jLabel1 = new javax.swing.JLabel();
        btnClose2 = new javax.swing.JButton();
        jPanel3 = new javax.swing.JPanel();
        btnClose3 = new javax.swing.JButton();
        jLabel3 = new javax.swing.JLabel();
        txtMedicineName = new javax.swing.JTextField();
        btnCreateMedicine = new javax.swing.JButton();
        lblCreateMedicineOutput = new javax.swing.JLabel();

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        btnClose1.setText("Log Out");
        btnClose1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClose1ActionPerformed(evt);
            }
        });

        jLabel2.setText("Make Notes :");

        txtAreaNotes.setColumns(20);
        txtAreaNotes.setLineWrap(true);
        txtAreaNotes.setRows(5);
        jScrollPane2.setViewportView(txtAreaNotes);

        btnPostNotes.setText("Post Notes");
        btnPostNotes.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPostNotesActionPerformed(evt);
            }
        });

        jLabel4.setText("Prescribe Medicine :");

        jLabel5.setText("Medicine :");

        jLabel6.setText("Quantity :");

        jLabel7.setText("Dosage :");

        btnPrescribe.setText("Prescribe");
        btnPrescribe.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPrescribeActionPerformed(evt);
            }
        });

        lblNotesOutput.setText("jLabel8");

        lblPrescribeMedicineOutput.setText("jLabel8");

        jLabel8.setText("Patient History :");

        txtAreaHistory.setColumns(20);
        txtAreaHistory.setLineWrap(true);
        txtAreaHistory.setRows(5);
        jScrollPane3.setViewportView(txtAreaHistory);

        cbRequestDay.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));

        jLabel9.setText("Date :");

        jLabel10.setText("Time :");

        cbRequestHour.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "9", "10", "11", "12", "12", "13", "14", "15", "16", " " }));

        cbRequestMonth.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December" }));

        cbRequestYear.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2019", "2020" }));

        btnRequestAppointment.setText("Create Appointment");
        btnRequestAppointment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRequestAppointmentActionPerformed(evt);
            }
        });

        cbRequestMins.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "00", "10", "20", "30", "40", "50" }));

        jLabel11.setText(":");

        jLabel12.setText("Create Appointment :");

        lblAppointmentOutput.setText("jLabel13");

        lblCurrentPatient.setText("jLabel13");

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(664, Short.MAX_VALUE)
                .addComponent(btnClose1)
                .addContainerGap())
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(lblCurrentPatient)
                    .addComponent(jLabel8)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING, false)
                            .addComponent(jScrollPane3, javax.swing.GroupLayout.Alignment.LEADING, javax.swing.GroupLayout.DEFAULT_SIZE, 300, Short.MAX_VALUE)
                            .addComponent(jLabel2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane2, javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(javax.swing.GroupLayout.Alignment.LEADING, jPanel1Layout.createSequentialGroup()
                                .addComponent(btnPostNotes)
                                .addGap(18, 18, 18)
                                .addComponent(lblNotesOutput)))
                        .addGap(59, 59, 59)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(btnPrescribe)
                                .addGap(18, 18, 18)
                                .addComponent(lblPrescribeMedicineOutput))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(jLabel5)
                                .addGap(18, 18, 18)
                                .addComponent(cbMedicineName, javax.swing.GroupLayout.PREFERRED_SIZE, 120, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addComponent(jLabel4)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(jLabel6)
                                    .addComponent(jLabel7))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addComponent(spinnerQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addComponent(txtDosage, javax.swing.GroupLayout.PREFERRED_SIZE, 220, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                                    .addComponent(jLabel9)
                                    .addComponent(jLabel10))
                                .addGap(18, 18, 18)
                                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(cbRequestHour, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(jLabel11)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                        .addComponent(cbRequestMins, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                                    .addGroup(jPanel1Layout.createSequentialGroup()
                                        .addComponent(cbRequestMonth, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addGap(9, 9, 9)
                                        .addComponent(cbRequestDay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                        .addComponent(cbRequestYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                            .addComponent(jLabel12)
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addGap(1, 1, 1)
                                .addComponent(btnRequestAppointment)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(lblAppointmentOutput)))))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addComponent(lblCurrentPatient)
                .addGap(13, 13, 13)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel2)
                    .addComponent(jLabel4))
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel5)
                            .addComponent(cbMedicineName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(13, 13, 13)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel6)
                            .addComponent(spinnerQuantity, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(txtDosage, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(btnPostNotes))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(19, 19, 19)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnPrescribe)
                            .addComponent(lblNotesOutput)
                            .addComponent(lblPrescribeMedicineOutput))))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(31, 31, 31)
                        .addComponent(jLabel8))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addComponent(jLabel12)))
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 10, Short.MAX_VALUE)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel9)
                            .addComponent(cbRequestMonth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbRequestYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbRequestDay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel10)
                            .addComponent(cbRequestHour, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbRequestMins, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel11))
                        .addGap(26, 26, 26)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnRequestAppointment)
                            .addComponent(lblAppointmentOutput))
                        .addGap(30, 30, 30)))
                .addComponent(btnClose1)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Current Appointment", jPanel1);

        txtAreaAppointments.setColumns(20);
        txtAreaAppointments.setLineWrap(true);
        txtAreaAppointments.setRows(5);
        jScrollPane1.setViewportView(txtAreaAppointments);

        jLabel1.setText("Your Appointments");

        btnClose2.setText("Log Out");
        btnClose2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClose2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(34, 34, 34)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jLabel1)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 360, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(351, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnClose2)
                .addContainerGap())
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(42, 42, 42)
                .addComponent(jLabel1)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 218, Short.MAX_VALUE)
                .addComponent(btnClose2)
                .addContainerGap())
        );

        jTabbedPane1.addTab("View Appointments", jPanel2);

        btnClose3.setText("Log Out");
        btnClose3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClose3ActionPerformed(evt);
            }
        });

        jLabel3.setText("Medicine Name :");

        btnCreateMedicine.setText("Create Medicine");
        btnCreateMedicine.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnCreateMedicineActionPerformed(evt);
            }
        });

        lblCreateMedicineOutput.setText("lblCreateMedicineOutput");

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(664, Short.MAX_VALUE)
                .addComponent(btnClose3)
                .addContainerGap())
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(66, 66, 66)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(btnCreateMedicine)
                        .addGap(30, 30, 30)
                        .addComponent(lblCreateMedicineOutput))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel3)
                        .addGap(18, 18, 18)
                        .addComponent(txtMedicineName, javax.swing.GroupLayout.PREFERRED_SIZE, 150, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addGap(39, 39, 39)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(txtMedicineName, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(36, 36, 36)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnCreateMedicine)
                    .addComponent(lblCreateMedicineOutput))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 270, Short.MAX_VALUE)
                .addComponent(btnClose3)
                .addContainerGap())
        );

        jTabbedPane1.addTab("Create Medicine", jPanel3);

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

    private void btnClose1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClose1ActionPerformed
        exitPage();
    }//GEN-LAST:event_btnClose1ActionPerformed

    private void btnClose2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClose2ActionPerformed
        exitPage();
    }//GEN-LAST:event_btnClose2ActionPerformed

    private void btnClose3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClose3ActionPerformed
        exitPage();
    }//GEN-LAST:event_btnClose3ActionPerformed

    /**
     * Creates a new medicine from the name entered into the text field and 
     * adds it to the ArrayList of medicines.
     * @param evt 
     */
    private void btnCreateMedicineActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnCreateMedicineActionPerformed
        
        if(!"".equals(txtMedicineName.getText())){
        Medicine medicine = new Medicine(txtMedicineName.getText(),0);
        
        medStock.medicine.add(medicine);
        
        lblCreateMedicineOutput.setText("Medicine has been created and needs to be ordered.");
        }else{
            lblCreateMedicineOutput.setText("Please enter a name.");
        }
    }//GEN-LAST:event_btnCreateMedicineActionPerformed

    /**
     * creates an appointment with a current patient
     * <p>
     * the year ,month , day , hour and minutes are taken from the comboBoxs and 
     * a new calendar date is created. A new appointment is created with the calendar 
     * date with the approved variable set to false.
     * this appointment is then added to the current patient.
     * </p>
     * @param evt 
     */
    private void btnRequestAppointmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRequestAppointmentActionPerformed

        int year = Integer.parseInt(cbRequestYear.getSelectedItem().toString());
        int month = cbRequestMonth.getSelectedIndex() + 1;
        int day = Integer.parseInt(cbRequestDay.getSelectedItem().toString());
        int hour = Integer.parseInt(cbRequestHour.getSelectedItem().toString());
        int mins = Integer.parseInt(cbRequestMins.getSelectedItem().toString());

        Calendar cal = Calendar.getInstance();

        cal.set(year, month, day, hour, mins,0);

        Appointment appointment = new Appointment(cal.getTime(), currentDoctor.getSurname() + " " + currentDoctor.getSurname(), true);
        currentPatient.setAppointment(appointment);
        lblAppointmentOutput.setText("Appointment set.");
    }//GEN-LAST:event_btnRequestAppointmentActionPerformed

    /**
     * add the notes the doctor has made to the current patient.
     * @param evt 
     */
    private void btnPostNotesActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPostNotesActionPerformed
        currentPatient.setNotes(txtAreaNotes.getText());
        lblNotesOutput.setText("Notes have been saved");
    }//GEN-LAST:event_btnPostNotesActionPerformed

    /**
     * Creates a new prescription for the name and quantity entered and adds it
     * to the current patient. the variable handedOut is set to false.
     * @param evt 
     */
    private void btnPrescribeActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPrescribeActionPerformed
        if (!"".equals(txtDosage.getText())) {
            getSelectedMedicine(cbMedicineName.getSelectedItem().toString());

            Prescription pre = new Prescription(selectedMedicine,
                    (int) spinnerQuantity.getValue(), txtDosage.getText(), false);

            currentPatient.setPrescription(pre);

            lblPrescribeMedicineOutput.setText("Medicine prescribed.");
        } else {
            lblPrescribeMedicineOutput.setText("Please Enter a Quantity and Dosage.");
        }

    }//GEN-LAST:event_btnPrescribeActionPerformed

    /**
     * close the current page and sends the updated hospital ArrayList
     *  and updated medStock ArrayList to the log in page.
     */
    public void exitPage() {
        this.setVisible(false);
        LogIn tempLogIn = new LogIn();
        tempLogIn.setVisible(true);
        tempLogIn.updateHospital(hospital);
        tempLogIn.updateMedicineStock(medStock);
    }
    



    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClose1;
    private javax.swing.JButton btnClose2;
    private javax.swing.JButton btnClose3;
    private javax.swing.JButton btnCreateMedicine;
    private javax.swing.JButton btnPostNotes;
    private javax.swing.JButton btnPrescribe;
    private javax.swing.JButton btnRequestAppointment;
    private javax.swing.JComboBox<String> cbMedicineName;
    private javax.swing.JComboBox<String> cbRequestDay;
    private javax.swing.JComboBox<String> cbRequestHour;
    private javax.swing.JComboBox<String> cbRequestMins;
    private javax.swing.JComboBox<String> cbRequestMonth;
    private javax.swing.JComboBox<String> cbRequestYear;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel12;
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
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JTabbedPane jTabbedPane1;
    private javax.swing.JLabel lblAppointmentOutput;
    private javax.swing.JLabel lblCreateMedicineOutput;
    private javax.swing.JLabel lblCurrentPatient;
    private javax.swing.JLabel lblNotesOutput;
    private javax.swing.JLabel lblPrescribeMedicineOutput;
    private javax.swing.JSpinner spinnerQuantity;
    private javax.swing.JTextArea txtAreaAppointments;
    private javax.swing.JTextArea txtAreaHistory;
    private javax.swing.JTextArea txtAreaNotes;
    private javax.swing.JTextField txtDosage;
    private javax.swing.JTextField txtMedicineName;
    // End of variables declaration//GEN-END:variables
}
