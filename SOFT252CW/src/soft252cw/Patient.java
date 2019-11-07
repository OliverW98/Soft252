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
    
    private Integer age = null;
    private String gender = "";
    private String notes = "";
    private String medicine = "";
    private Integer quantity = null;
    private String dosage = "";

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
      
   
    public void requestCreateAccount(){
          
    }
      
    public void rateDoctor(){
        
    }
    
    public void feedbackMessage(){
        
    }
    
    public void viewDoctorRatings(){
        
    }
    
    public void requestAppointment(){
        
    }
    
    public void viewHistory(){
        
    }
    
    public void viewAppointmet(){
        
    }
    
    public void viewPrescription(){
        
    }
    
    public void requestAccountTermination(){
        
    }
}
