/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soft252cw;

import java.time.Month;
import java.util.Calendar;
import java.util.Date;
/**
 *
 * @author Oliver
 */
public class PatientHome extends javax.swing.JFrame {

    private Patient currentPatient;
    private Hospital hospital;
    private Doctor currentDoctor;

    public PatientHome(Patient patient, Hospital hospital) {
        initComponents();
        this.currentPatient = patient;
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

        jMenu1 = new javax.swing.JMenu();
        tabPatientHome = new javax.swing.JTabbedPane();
        jPanel2 = new javax.swing.JPanel();
        jScrollPane4 = new javax.swing.JScrollPane();
        txtAreaHistory = new javax.swing.JTextArea();
        jScrollPane5 = new javax.swing.JScrollPane();
        txtAreaPerscription = new javax.swing.JTextArea();
        jLabel9 = new javax.swing.JLabel();
        jLabel10 = new javax.swing.JLabel();
        btnClose1 = new javax.swing.JButton();
        btnTermination = new javax.swing.JButton();
        jLabel11 = new javax.swing.JLabel();
        lblRemoveOutput = new javax.swing.JLabel();
        jPanel3 = new javax.swing.JPanel();
        cbViewDoctor = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtAreaDoctorReviews = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtAreaDoctorWritenReview = new javax.swing.JTextArea();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        cbDoctorStarRating = new javax.swing.JComboBox<>();
        btnPostReview = new javax.swing.JButton();
        lblViewDoctorOutput = new javax.swing.JLabel();
        btnClose2 = new javax.swing.JButton();
        jPanel1 = new javax.swing.JPanel();
        lblYourApps = new javax.swing.JLabel();
        lblRequestApp = new javax.swing.JLabel();
        cbRequestDoctor = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAreaAppointments = new javax.swing.JTextArea();
        cbRequestDay = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        cbRequestHour = new javax.swing.JComboBox<>();
        cbRequestMonth = new javax.swing.JComboBox<>();
        cbRequestYear = new javax.swing.JComboBox<>();
        btnRequestAppointment = new javax.swing.JButton();
        cbRequestMins = new javax.swing.JComboBox<>();
        jLabel8 = new javax.swing.JLabel();
        btnClose3 = new javax.swing.JButton();

        jMenu1.setText("jMenu1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        txtAreaHistory.setColumns(20);
        txtAreaHistory.setLineWrap(true);
        txtAreaHistory.setRows(5);
        jScrollPane4.setViewportView(txtAreaHistory);

        txtAreaPerscription.setColumns(20);
        txtAreaPerscription.setLineWrap(true);
        txtAreaPerscription.setRows(5);
        jScrollPane5.setViewportView(txtAreaPerscription);

        jLabel9.setText("Your History");

        jLabel10.setText("Your Perscripton");

        btnClose1.setText("Log Out");
        btnClose1.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClose1ActionPerformed(evt);
            }
        });

        btnTermination.setText("Request Termination");
        btnTermination.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnTerminationActionPerformed(evt);
            }
        });

        jLabel11.setText("Request for account termination.");

        lblRemoveOutput.setText("jLabel12");

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel2Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnClose1)
                .addContainerGap())
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(35, 35, 35)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addComponent(btnTermination)
                        .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel9))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 139, Short.MAX_VALUE)
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 244, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel10))
                        .addGap(83, 83, 83))
                    .addGroup(jPanel2Layout.createSequentialGroup()
                        .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addComponent(lblRemoveOutput)
                            .addComponent(jLabel11))
                        .addGap(0, 0, Short.MAX_VALUE))))
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel2Layout.createSequentialGroup()
                .addGap(81, 81, 81)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel9)
                    .addComponent(jLabel10))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane5, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jScrollPane4, javax.swing.GroupLayout.PREFERRED_SIZE, 145, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 67, Short.MAX_VALUE)
                .addComponent(jLabel11)
                .addGap(18, 18, 18)
                .addComponent(btnTermination)
                .addGap(18, 18, 18)
                .addComponent(lblRemoveOutput)
                .addGap(33, 33, 33)
                .addComponent(btnClose1)
                .addContainerGap())
        );

        tabPatientHome.addTab("View History and Perscription", jPanel2);

        cbViewDoctor.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cbViewDoctorItemStateChanged(evt);
            }
        });

        jLabel4.setText("Select a Doctor :");

        txtAreaDoctorReviews.setColumns(20);
        txtAreaDoctorReviews.setLineWrap(true);
        txtAreaDoctorReviews.setRows(5);
        jScrollPane2.setViewportView(txtAreaDoctorReviews);

        jLabel5.setText("Doctors Reviews");

        txtAreaDoctorWritenReview.setColumns(20);
        txtAreaDoctorWritenReview.setLineWrap(true);
        txtAreaDoctorWritenReview.setRows(5);
        jScrollPane3.setViewportView(txtAreaDoctorWritenReview);

        jLabel6.setText("Write a review");

        jLabel7.setText("Star rating :");

        cbDoctorStarRating.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5" }));

        btnPostReview.setText("Post Review");
        btnPostReview.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPostReviewActionPerformed(evt);
            }
        });

        lblViewDoctorOutput.setText("jLabel8");

        btnClose2.setText("Log Out");
        btnClose2.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClose2ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel3Layout = new javax.swing.GroupLayout(jPanel3);
        jPanel3.setLayout(jPanel3Layout);
        jPanel3Layout.setHorizontalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel5)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel4)
                        .addGap(47, 47, 47)
                        .addComponent(cbViewDoctor, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(108, 108, 108)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(btnPostReview)
                        .addGap(35, 35, 35)
                        .addComponent(lblViewDoctorOutput))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cbDoctorStarRating, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel6)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(104, Short.MAX_VALUE))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel3Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnClose2)
                .addContainerGap())
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbViewDoctor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addComponent(jLabel6)
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 181, Short.MAX_VALUE)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel7)
                            .addComponent(cbDoctorStarRating, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addGap(34, 34, 34)
                        .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(btnPostReview)
                            .addComponent(lblViewDoctorOutput))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 71, Short.MAX_VALUE)
                        .addComponent(btnClose2)
                        .addContainerGap())
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel5)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane2, javax.swing.GroupLayout.PREFERRED_SIZE, 157, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addGap(0, 0, Short.MAX_VALUE))))
        );

        tabPatientHome.addTab("View Doctors", jPanel3);

        lblYourApps.setText("Your Appointments");

        lblRequestApp.setText("Request Appointment");

        txtAreaAppointments.setColumns(20);
        txtAreaAppointments.setFont(new java.awt.Font("Monospaced", 0, 10)); // NOI18N
        txtAreaAppointments.setLineWrap(true);
        txtAreaAppointments.setRows(5);
        jScrollPane1.setViewportView(txtAreaAppointments);

        cbRequestDay.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));

        jLabel1.setText("Doctor :");

        jLabel2.setText("Date :");

        jLabel3.setText("Time :");

        cbRequestHour.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "9", "10", "11", "12", "12", "13", "14", "15", "16", " " }));

        cbRequestMonth.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December" }));

        cbRequestYear.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2019", "2020" }));

        btnRequestAppointment.setText("Request Appointment");
        btnRequestAppointment.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnRequestAppointmentActionPerformed(evt);
            }
        });

        cbRequestMins.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "00", "10", "20", "30", "40", "50" }));

        jLabel8.setText(":");

        btnClose3.setText("Log Out");
        btnClose3.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnClose3ActionPerformed(evt);
            }
        });

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addContainerGap()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(26, 26, 26)
                        .addComponent(lblYourApps)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 54, Short.MAX_VALUE)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(lblRequestApp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cbRequestDoctor, javax.swing.GroupLayout.PREFERRED_SIZE, 104, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGroup(jPanel1Layout.createSequentialGroup()
                                    .addComponent(cbRequestHour, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(jLabel8)
                                    .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                                    .addComponent(cbRequestMins, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(cbRequestMonth, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addGap(9, 9, 9)
                                .addComponent(cbRequestDay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(cbRequestYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(20, 20, 20)
                        .addComponent(btnRequestAppointment)))
                .addGap(57, 57, 57))
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                .addComponent(btnClose3)
                .addContainerGap())
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGap(85, 85, 85)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblRequestApp)
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(cbRequestDoctor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel1))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel2)
                            .addComponent(cbRequestMonth, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbRequestYear, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbRequestDay, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                            .addComponent(jLabel3)
                            .addComponent(cbRequestHour, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(cbRequestMins, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                            .addComponent(jLabel8))
                        .addGap(45, 45, 45)
                        .addComponent(btnRequestAppointment))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addComponent(lblYourApps)
                        .addGap(18, 18, 18)
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED, 146, Short.MAX_VALUE)
                .addComponent(btnClose3)
                .addContainerGap())
        );

        tabPatientHome.addTab("View Appointments", jPanel1);

        javax.swing.GroupLayout layout = new javax.swing.GroupLayout(getContentPane());
        getContentPane().setLayout(layout);
        layout.setHorizontalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tabPatientHome)
        );
        layout.setVerticalGroup(
            layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addComponent(tabPatientHome, javax.swing.GroupLayout.Alignment.TRAILING)
        );

        pack();
    }// </editor-fold>//GEN-END:initComponents

    public void onLoad() {
        populateDoctorCBs(); 
        displayPatientsAppointments();
        displayDoctorReview();
        dispalyPatientPrescription();
        dispalyPatientHistory();
        lblViewDoctorOutput.setText("");
        lblRemoveOutput.setText("");
    }

    private void cbViewDoctorItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cbViewDoctorItemStateChanged
        displayDoctorReview();
    }//GEN-LAST:event_cbViewDoctorItemStateChanged

     /**
     * loads the selected doctors reviews into the text area.
     */
    public void displayDoctorReview() {
        txtAreaDoctorReviews.setText("");

        getCurrentDoctor(cbViewDoctor.getSelectedItem().toString());

        for (int i = 0; i < currentDoctor.getReview().size(); i++) {
            txtAreaDoctorReviews.append(currentDoctor.getName() + " " + currentDoctor.getSurname() + " was given "
                    + currentDoctor.getReview().get(i).getRating() + "/5 stars : "
                    + currentDoctor.getReview().get(i).getReview() + "\n");
        }
    }

    /**
     * get the name of the doctor from the comboBox and and search the hospital ArrayList 
     * for the doctor that matches the name.
     * @param selectedDoctor a String of the Doctors name.
     */
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
     * post review to doctor
     * <p>
     * takes the text from the text area and the number from the comboBox 
     * and creates a new review. This review is the added to the selected doctors
     * account.
     * </p>
     * @param evt 
     */
    private void btnPostReviewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPostReviewActionPerformed

        String stringRating = (String) cbDoctorStarRating.getSelectedItem();
        int intRating = 1;

        if (stringRating.equals("1")) {
            intRating = 1;
        } else if (stringRating.equals("2")) {
            intRating = 2;
        } else if (stringRating.equals("3")) {
            intRating = 3;
        } else if (stringRating.equals("4")) {
            intRating = 4;
        } else if (stringRating.equals("5")) {
            intRating = 5;
        }

        boolean emptyTextArea = txtAreaDoctorWritenReview.getText().equals("");
        if (emptyTextArea == false) {
            Review review = new Review(txtAreaDoctorWritenReview.getText(), intRating);
            currentDoctor.setReview(review);
            lblViewDoctorOutput.setText("Posted review");
        } else {
            lblViewDoctorOutput.setText("Please select a rating and write a review");
        }
        displayDoctorReview();
        txtAreaDoctorWritenReview.setText("");
    }//GEN-LAST:event_btnPostReviewActionPerformed

    /**
     * Request an appointment with a doctor
     * <p>
     * the year ,month , day , hour and minutes are taken from the comboBoxs and 
     * a new calendar date is created. A new appointment is created with the calendar 
     * date and doctor name with the approved variable set to false.
     * this appointment is then added to the current patient.
     * </p>
     * @param evt 
     */
    private void btnRequestAppointmentActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnRequestAppointmentActionPerformed
        getCurrentDoctor(cbRequestDoctor.getSelectedItem().toString());

        int year = Integer.parseInt(cbRequestYear.getSelectedItem().toString());
        int month = cbRequestMonth.getSelectedIndex() + 1;
        int day = Integer.parseInt(cbRequestDay.getSelectedItem().toString());
        int hour = Integer.parseInt(cbRequestHour.getSelectedItem().toString());
        int mins = Integer.parseInt(cbRequestMins.getSelectedItem().toString());

        Calendar cal = Calendar.getInstance();

        cal.set(year, month, day, hour, mins,0);

        Appointment appointment = new Appointment(cal.getTime(), currentDoctor.getSurname() + " " + currentDoctor.getSurname(), false);
        currentPatient.setAppointment(appointment);
    }//GEN-LAST:event_btnRequestAppointmentActionPerformed

    private void btnClose1ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClose1ActionPerformed
        exitPage();
    }//GEN-LAST:event_btnClose1ActionPerformed

    private void btnClose2ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClose2ActionPerformed
        exitPage();
    }//GEN-LAST:event_btnClose2ActionPerformed

    private void btnClose3ActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnClose3ActionPerformed
        exitPage();
    }//GEN-LAST:event_btnClose3ActionPerformed

    private void btnTerminationActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnTerminationActionPerformed
        currentPatient.setRemoveRequest(true);
        lblRemoveOutput.setText("You Request has been sent");
    }//GEN-LAST:event_btnTerminationActionPerformed

    /**
     * close the current page and sends the updated hospital ArrayList to the log in page.
     */
    public void exitPage() {
        this.setVisible(false);
        LogIn tempLogIn = new LogIn();
        tempLogIn.setVisible(true);
        tempLogIn.updateHospital(hospital);
    }
    
    
    /**
     * goes through hospital ArrayList and fills the comboBox with doctors.
     */
    public void populateDoctorCBs() {       
        hospital.people.forEach((_item) -> {
            if (_item.getID().substring(0, 1).equals("D")) {
                cbViewDoctor.addItem(_item.getName() + " " + _item.getSurname());
                cbRequestDoctor.addItem(_item.getName() + " " + _item.getSurname());
            }
        });
        this.currentDoctor = (Doctor) hospital.people.get(2);
    }

    /**
     * goes through the ArrayList of a patient and added appointments to a text area
     * that are after today's date.
     */
    public void dispalyPatientHistory() {

        Date date = new Date();

        for (int i = 0; i < currentPatient.getAppointment().size(); i++) {
            if (currentPatient.getAppointment().get(i).getDate().before(date)) {
                txtAreaHistory.append("- You had an a appointment with " + currentPatient.getAppointment().get(i).getDoctorName()
                        + " on " + currentPatient.getAppointment().get(i).getDate() + "\n");
            }

        }
    }

    /**
     * displays the prescription of the current patient
     */
    public void dispalyPatientPrescription() {
        if(currentPatient.getPrescription() != null){
                    txtAreaPerscription.setText("Medicine : " + currentPatient.getPrescription().getMedicine().getName() + "\n"
                + "Quantity : " + currentPatient.getPrescription().getQuantity() + "\n"
                + "Dosage : " + currentPatient.getPrescription().getDosage());
        }
    }

    /**
     * display appointments for the patient that are after today's date.
     */
    public void displayPatientsAppointments() {
        
        Date date = new Date();
    
        for (int i = 0; i < currentPatient.getAppointment().size(); i++) {
            if (currentPatient.getAppointment().get(i).getDate().after(date)) {
                txtAreaAppointments.append("- You have an a appointment with " + currentPatient.getAppointment().get(i).getDoctorName()
                        + " on " + currentPatient.getAppointment().get(i).getDate() + "\n");
            }
        }
    }

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnClose1;
    private javax.swing.JButton btnClose2;
    private javax.swing.JButton btnClose3;
    private javax.swing.JButton btnPostReview;
    private javax.swing.JButton btnRequestAppointment;
    private javax.swing.JButton btnTermination;
    private javax.swing.JComboBox<String> cbDoctorStarRating;
    private javax.swing.JComboBox<String> cbRequestDay;
    private javax.swing.JComboBox<String> cbRequestDoctor;
    private javax.swing.JComboBox<String> cbRequestHour;
    private javax.swing.JComboBox<String> cbRequestMins;
    private javax.swing.JComboBox<String> cbRequestMonth;
    private javax.swing.JComboBox<String> cbRequestYear;
    private javax.swing.JComboBox<String> cbViewDoctor;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel10;
    private javax.swing.JLabel jLabel11;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JLabel jLabel8;
    private javax.swing.JLabel jLabel9;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JScrollPane jScrollPane4;
    private javax.swing.JScrollPane jScrollPane5;
    private javax.swing.JLabel lblRemoveOutput;
    private javax.swing.JLabel lblRequestApp;
    private javax.swing.JLabel lblViewDoctorOutput;
    private javax.swing.JLabel lblYourApps;
    private javax.swing.JTabbedPane tabPatientHome;
    private javax.swing.JTextArea txtAreaAppointments;
    private javax.swing.JTextArea txtAreaDoctorReviews;
    private javax.swing.JTextArea txtAreaDoctorWritenReview;
    private javax.swing.JTextArea txtAreaHistory;
    private javax.swing.JTextArea txtAreaPerscription;
    // End of variables declaration//GEN-END:variables
}
