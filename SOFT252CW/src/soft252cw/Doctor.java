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
public class Doctor extends HospitalPerson {



    public Doctor() {
    }
    
    public Doctor(String name, String surname, String address, String id, String password) {
        super(name, surname, address, id, password);
    }

    /**
     * review and rating. 5 stars?
     */

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
