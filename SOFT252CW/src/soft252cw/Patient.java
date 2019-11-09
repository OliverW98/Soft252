/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soft252cw;

import java.util.Objects;

/**
 *
 * @author Oliver
 */
public class Patient extends HospitalPerson {

    private int age;
    private String gender;
    private String notes;
    private String medicine;
    private int quantity;
    private String dosage;

 
    public Patient(int age, String gender, String notes, String medicine, int quantity, String dosage) {
        this.age = age;
        this.gender = gender;
        this.notes = notes;
        this.medicine = medicine;
        this.quantity = quantity;
        this.dosage = dosage;
    }

    public Patient(int age) {
        this(age, "", "", "", 0, "");
    }
    
    public Patient() {
        this(0, "", "", "", 0, "");
    }

    public Integer getAge() {
        return age;
    }

    public void setAge(Integer age) {
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

    public String getMedicine() {
        return medicine;
    }

    public void setMedicine(String medicine) {
        this.medicine = medicine;
    }

    public Integer getQuantity() {
        return quantity;
    }

    public void setQuantity(Integer quantity) {
        this.quantity = quantity;
    }

    public String getDosage() {
        return dosage;
    }

    public void setDosage(String dosage) {
        this.dosage = dosage;
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
        return "Patient{" + "age=" + age + ", gender=" + gender + ", notes=" + notes + ", medicine=" + medicine + ", quantity=" + quantity + ", dosage=" + dosage + '}';
    }
      
}
