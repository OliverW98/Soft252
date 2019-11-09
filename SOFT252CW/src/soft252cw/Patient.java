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
public class Patient extends HospitalPerson {

    private int age;
    private String gender;
    private String notes;
    private Prescription prescription;

    public Patient() {
    }
    
    public Patient(String name, String surname, String address, String id, int age, String gender,String password) {
        super(name, surname, address, id, password);
        this.age = age;
        this.gender = gender;
    }
 
    public Patient(int age, String gender, String notes, Prescription prescription) {
        this.age = age;
        this.gender = gender;
        this.notes = notes;
        this.prescription = prescription;
    }

    public Patient(int age, String gender, String notes, Prescription prescription, String name, String surname, String address, String id ,String password) {
        super(name, surname, address, id, password);
        this.age = age;
        this.gender = gender;
        this.notes = notes;
        this.prescription = prescription;
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

    public void requestCreateAccount() {

    }

    public void rateDoctor(String review) {

    }

    public void feedbackMessage() {

    }

    public void viewDoctorRatings() {

    }

    public void requestAppointment() {

    }

    public void viewHistory() {

    }

    public void viewAppointmet() {

    }

    public void viewPrescription() {

    }

    public void requestAccountTermination() {

    }

    @Override
    public int hashCode() {
        int hash = 3;
        return hash;
    }

    @Override
    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null) {
            return false;
        }
        if (getClass() != obj.getClass()) {
            return false;
        }
        final Patient other = (Patient) obj;
        if (!this.id.equals(other.id)) {
            return false;
        }
        return true;
    }

    @Override
    public String toString() {
        return "Patient{" + "age=" + age + ", gender=" + gender + ", notes=" + notes + ", prescription=" + prescription + '}';
    }

      
}
