/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soft252cw;

import java.util.logging.Logger;
import javax.swing.JComboBox;
import javax.swing.JLabel;
import javax.swing.JMenu;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTabbedPane;
import javax.swing.JTextArea;

/**
 *
 * @author Oliver
 */
public class PatientHome extends javax.swing.JFrame {

    /**
     * Creates new form PatientHome
     */
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
        jPanel3 = new javax.swing.JPanel();
        cdViewDoctor = new javax.swing.JComboBox<>();
        jLabel4 = new javax.swing.JLabel();
        jScrollPane2 = new javax.swing.JScrollPane();
        txtAreaDoctorReviews = new javax.swing.JTextArea();
        jLabel5 = new javax.swing.JLabel();
        jScrollPane3 = new javax.swing.JScrollPane();
        txtAreaDoctorWritenReview = new javax.swing.JTextArea();
        jLabel6 = new javax.swing.JLabel();
        jLabel7 = new javax.swing.JLabel();
        cdDoctorStarRating = new javax.swing.JComboBox<>();
        btnPostReview = new javax.swing.JButton();
        lblViewDoctorOutput = new javax.swing.JLabel();
        jPanel1 = new javax.swing.JPanel();
        lblYourApps = new javax.swing.JLabel();
        lblRequestApp = new javax.swing.JLabel();
        cbRequestDoctor = new javax.swing.JComboBox<>();
        jScrollPane1 = new javax.swing.JScrollPane();
        txtAreaAppointments = new javax.swing.JTextArea();
        cbDate = new javax.swing.JComboBox<>();
        jLabel1 = new javax.swing.JLabel();
        jLabel2 = new javax.swing.JLabel();
        jLabel3 = new javax.swing.JLabel();
        jComboBox1 = new javax.swing.JComboBox<>();
        jComboBox2 = new javax.swing.JComboBox<>();
        jComboBox3 = new javax.swing.JComboBox<>();

        jMenu1.setText("jMenu1");

        setDefaultCloseOperation(javax.swing.WindowConstants.EXIT_ON_CLOSE);

        javax.swing.GroupLayout jPanel2Layout = new javax.swing.GroupLayout(jPanel2);
        jPanel2.setLayout(jPanel2Layout);
        jPanel2Layout.setHorizontalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 725, Short.MAX_VALUE)
        );
        jPanel2Layout.setVerticalGroup(
            jPanel2Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGap(0, 449, Short.MAX_VALUE)
        );

        tabPatientHome.addTab("View History", jPanel2);

        cdViewDoctor.addItemListener(new java.awt.event.ItemListener() {
            public void itemStateChanged(java.awt.event.ItemEvent evt) {
                cdViewDoctorItemStateChanged(evt);
            }
        });

        jLabel4.setText("Select a Doctor :");

        txtAreaDoctorReviews.setColumns(20);
        txtAreaDoctorReviews.setRows(5);
        jScrollPane2.setViewportView(txtAreaDoctorReviews);

        jLabel5.setText("Doctors Reviews");

        txtAreaDoctorWritenReview.setColumns(20);
        txtAreaDoctorWritenReview.setRows(5);
        jScrollPane3.setViewportView(txtAreaDoctorWritenReview);

        jLabel6.setText("Write a review");

        jLabel7.setText("Star rating :");

        cdDoctorStarRating.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5" }));

        btnPostReview.setText("Post Review");
        btnPostReview.addActionListener(new java.awt.event.ActionListener() {
            public void actionPerformed(java.awt.event.ActionEvent evt) {
                btnPostReviewActionPerformed(evt);
            }
        });

        lblViewDoctorOutput.setText("jLabel8");

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
                        .addComponent(cdViewDoctor, javax.swing.GroupLayout.PREFERRED_SIZE, 100, javax.swing.GroupLayout.PREFERRED_SIZE)))
                .addGap(108, 108, 108)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(btnPostReview)
                        .addGap(35, 35, 35)
                        .addComponent(lblViewDoctorOutput))
                    .addGroup(jPanel3Layout.createSequentialGroup()
                        .addComponent(jLabel7)
                        .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                        .addComponent(cdDoctorStarRating, javax.swing.GroupLayout.PREFERRED_SIZE, 88, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel6)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.PREFERRED_SIZE, 250, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addContainerGap(84, Short.MAX_VALUE))
        );
        jPanel3Layout.setVerticalGroup(
            jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel3Layout.createSequentialGroup()
                .addGap(33, 33, 33)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cdViewDoctor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel4)
                    .addComponent(jLabel7)
                    .addComponent(cdDoctorStarRating, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(67, 67, 67)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel5)
                    .addComponent(jLabel6))
                .addGap(18, 18, 18)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                    .addComponent(jScrollPane3, javax.swing.GroupLayout.DEFAULT_SIZE, 138, Short.MAX_VALUE)
                    .addComponent(jScrollPane2))
                .addGap(37, 37, 37)
                .addGroup(jPanel3Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(btnPostReview)
                    .addComponent(lblViewDoctorOutput))
                .addContainerGap(99, Short.MAX_VALUE))
        );

        tabPatientHome.addTab("View Doctors", jPanel3);

        lblYourApps.setText("Your Appointments");

        lblRequestApp.setText("Request Appointment");

        txtAreaAppointments.setColumns(20);
        txtAreaAppointments.setFont(new java.awt.Font("Monospaced", 0, 10)); // NOI18N
        txtAreaAppointments.setRows(5);
        jScrollPane1.setViewportView(txtAreaAppointments);

        cbDate.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "1", "2", "3", "4", "5", "6", "7", "8", "9", "10", "11", "12", "13", "14", "15", "16", "17", "18", "19", "20", "21", "22", "23", "24", "25", "26", "27", "28", "29", "30", "31" }));

        jLabel1.setText("Doctor :");

        jLabel2.setText("Date :");

        jLabel3.setText("Time :");

        jComboBox1.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "9:00", "9:30", "10:00", "10:30", "11:00", "11:30", "12:00", "12:30", "13:00", "13:30", "14:00", "14:30", "15:00", "15:30", "16:00", "16:30" }));

        jComboBox2.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "January", "February", "March", "April", "May", "June", "July", "August", "September", "October", "November", "December" }));

        jComboBox3.setModel(new javax.swing.DefaultComboBoxModel<>(new String[] { "2019", "2020" }));

        javax.swing.GroupLayout jPanel1Layout = new javax.swing.GroupLayout(jPanel1);
        jPanel1.setLayout(jPanel1Layout);
        jPanel1Layout.setHorizontalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(jPanel1Layout.createSequentialGroup()
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(426, 426, 426)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.TRAILING)
                            .addComponent(jLabel1)
                            .addComponent(jLabel2)
                            .addComponent(jLabel3))
                        .addGap(18, 18, 18)
                        .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                            .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING, false)
                                .addComponent(lblRequestApp, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(cbRequestDoctor, 0, javax.swing.GroupLayout.DEFAULT_SIZE, Short.MAX_VALUE)
                                .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                            .addGroup(jPanel1Layout.createSequentialGroup()
                                .addComponent(cbDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, 77, javax.swing.GroupLayout.PREFERRED_SIZE)
                                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                                .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addContainerGap()
                        .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 385, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addGroup(jPanel1Layout.createSequentialGroup()
                        .addGap(36, 36, 36)
                        .addComponent(lblYourApps)))
                .addContainerGap(59, Short.MAX_VALUE))
        );
        jPanel1Layout.setVerticalGroup(
            jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
            .addGroup(javax.swing.GroupLayout.Alignment.TRAILING, jPanel1Layout.createSequentialGroup()
                .addContainerGap(35, Short.MAX_VALUE)
                .addComponent(lblRequestApp)
                .addGap(18, 18, 18)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(cbRequestDoctor, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                    .addComponent(jLabel1))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.UNRELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.LEADING)
                    .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                        .addComponent(cbDate, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jComboBox2, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE)
                        .addComponent(jComboBox3, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                    .addComponent(jLabel2))
                .addPreferredGap(javax.swing.LayoutStyle.ComponentPlacement.RELATED)
                .addGroup(jPanel1Layout.createParallelGroup(javax.swing.GroupLayout.Alignment.BASELINE)
                    .addComponent(jLabel3)
                    .addComponent(jComboBox1, javax.swing.GroupLayout.PREFERRED_SIZE, javax.swing.GroupLayout.DEFAULT_SIZE, javax.swing.GroupLayout.PREFERRED_SIZE))
                .addGap(13, 13, 13)
                .addComponent(lblYourApps)
                .addGap(18, 18, 18)
                .addComponent(jScrollPane1, javax.swing.GroupLayout.PREFERRED_SIZE, 175, javax.swing.GroupLayout.PREFERRED_SIZE)
                .addGap(85, 85, 85))
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

    public void onLoad(){      
        populateDoctorCBs();
        displayPatientsAppointments();
    }
    
    private void cdViewDoctorItemStateChanged(java.awt.event.ItemEvent evt) {//GEN-FIRST:event_cdViewDoctorItemStateChanged
       txtAreaDoctorReviews.setText("");
        
       String DoctorName = cdViewDoctor.getSelectedItem().toString();
        
        hospital.people.forEach((_item) -> {

            boolean nameTest = DoctorName.equals(_item.getName() + " " + _item.getSurname());

            if (nameTest == true) {
                
                 currentDoctor = (Doctor) _item;
                
                for (int i = 0; i < currentDoctor.getReview().size(); i++) {
                    txtAreaDoctorReviews.append( DoctorName+" was given "+currentDoctor.getReview().get(i).getRating() +"/5 stars : " 
                            + currentDoctor.getReview().get(i).getReview()+"\n");
                }
            }
        });
        

    }//GEN-LAST:event_cdViewDoctorItemStateChanged

    private void btnPostReviewActionPerformed(java.awt.event.ActionEvent evt) {//GEN-FIRST:event_btnPostReviewActionPerformed
        
        int rating = Integer.parseInt(cdDoctorStarRating.getName());
       
        if (txtAreaDoctorWritenReview.getText() != "" && cdDoctorStarRating.getName() != ""){
           Review review = new Review(txtAreaDoctorWritenReview.getText(),rating); 
        }else {
            lblViewDoctorOutput.setText("Please select a rating and write a review");
        }       
    }//GEN-LAST:event_btnPostReviewActionPerformed

    public void populateDoctorCBs(){
        lblViewDoctorOutput.setText("");
         hospital.people.forEach((_item) -> {
             if (_item.getID().substring(0,1).equals("D")){
                 cdViewDoctor.addItem(_item.getName()+" "+_item.getSurname());
                 cbRequestDoctor.addItem(_item.getName()+" "+_item.getSurname());
             }
             });
      currentDoctor =(Doctor) hospital.people.get(2);
      
      
      Doctor doc = (Doctor) hospital.people.get(3);
 
      Review review1 = new Review("is very bad ", 1);
      Review review2 = new Review("is very good ", 5);
      doc.setReview(review1);
      doc.setReview(review2);
    }
    
       
    public void displayPatientsAppointments(){   
        
        Appointment appointment1 = new Appointment("yes", "indeed", "wow");
        Appointment appointment2 = new Appointment("cool", "hhaa", "aahh");
        currentPatient.setAppointment(appointment1);
        currentPatient.setAppointment(appointment2);
        for (int i = 0; i < currentPatient.getAppointment().size(); i++){
           txtAreaAppointments.append("- You have an a appointment wiht "+currentPatient.getAppointment().get(i).getDoctorName()
           + " at "+currentPatient.getAppointment().get(i).getTime() +" on " +currentPatient.getAppointment().get(i).getDate()+"\n");
           
        } 
    }
    
    

    // Variables declaration - do not modify//GEN-BEGIN:variables
    private javax.swing.JButton btnPostReview;
    private javax.swing.JComboBox<String> cbDate;
    private javax.swing.JComboBox<String> cbRequestDoctor;
    private javax.swing.JComboBox<String> cdDoctorStarRating;
    private javax.swing.JComboBox<String> cdViewDoctor;
    private javax.swing.JComboBox<String> jComboBox1;
    private javax.swing.JComboBox<String> jComboBox2;
    private javax.swing.JComboBox<String> jComboBox3;
    private javax.swing.JLabel jLabel1;
    private javax.swing.JLabel jLabel2;
    private javax.swing.JLabel jLabel3;
    private javax.swing.JLabel jLabel4;
    private javax.swing.JLabel jLabel5;
    private javax.swing.JLabel jLabel6;
    private javax.swing.JLabel jLabel7;
    private javax.swing.JMenu jMenu1;
    private javax.swing.JPanel jPanel1;
    private javax.swing.JPanel jPanel2;
    private javax.swing.JPanel jPanel3;
    private javax.swing.JScrollPane jScrollPane1;
    private javax.swing.JScrollPane jScrollPane2;
    private javax.swing.JScrollPane jScrollPane3;
    private javax.swing.JLabel lblRequestApp;
    private javax.swing.JLabel lblViewDoctorOutput;
    private javax.swing.JLabel lblYourApps;
    private javax.swing.JTabbedPane tabPatientHome;
    private javax.swing.JTextArea txtAreaAppointments;
    private javax.swing.JTextArea txtAreaDoctorReviews;
    private javax.swing.JTextArea txtAreaDoctorWritenReview;
    // End of variables declaration//GEN-END:variables
}
