/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soft252cw;

import java.util.ArrayList;

/**
 *
 * @author Oliver
 */
public class Patient extends HospitalPerson {

    private int age;
    private String gender;
    private String notes;
    private Prescription prescription;
    private ArrayList<Appointment> appointment;
    private boolean approved;
    private boolean removeRequest;


    public Patient(String name, String surname, String address, String id, String password, int age, String gender, boolean approved, boolean removeRequest ) {
        super(name, surname, address, id, password);
        this.age = age;
        this.gender = gender;
        this.notes = "";
        this.prescription = null;
        this.appointment = new ArrayList<>();
        this.approved = approved;
        this.removeRequest = removeRequest;
    }

    public Patient(String name, String surname, String address, String id, String password, int age, String gender) {
        this(name, surname, address, id, password, age, gender, true, false);
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getGender() {
        return gender;
    }

    public void setGender(String gender) {
        this.gender = gender;
    }

    public String getNotes() {
        return notes;
    }

    public void setNotes(String notes) {
        this.notes = notes;
    }

    public Prescription getPrescription() {
        return prescription;
    }

    public void setPrescription(Prescription prescription) {
        this.prescription = prescription;
    }

    public ArrayList<Appointment> getAppointment() {
        return appointment;
    }

    public void setAppointment(Appointment appointment) {
        this.appointment.add(appointment);
    }

    public boolean isApproved() {
        return approved;
    }

    public void setApproved(boolean approved) {
        this.approved = approved;
    }

    public boolean isRemoveRequest() {
        return removeRequest;
    }

    public void setRemoveRequest(boolean removeRequest) {
        this.removeRequest = removeRequest;
    }
}
