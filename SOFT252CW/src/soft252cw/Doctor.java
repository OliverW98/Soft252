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
public class Doctor extends HospitalPerson {

    private ArrayList<Review> review;

    public Doctor() {
    }
    
    public Doctor(String name, String surname, String address, String id, String password) {
        super(name, surname, address, id, password);
        review = new ArrayList<>();
    }

    public ArrayList<Review> getReview() {
        return review;
    }

    public void setReview(Review review) {
        this.review.add(review);
    }


    public void viewAppointments() {
    }
    
    public void makeNotes(){
        
    }
    
    public void viewPaitentHistory(){
        
    }
    
    public void createFutureAppointment(){
        
    }
    
    public void prescribeMedicine(Patient patient){
        
        Prescription prescription = new Prescription("coke" , 10 , "all day long");
              
        patient.setPrescription(prescription);
    }
    
    public void createMedicines(){
               
    }

}
