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
public class SOFT252CW {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        
        
        Patient patient1 = new Patient(10);
        Patient patient2 = new Patient(12);
        
        System.out.println(patient1.equals(patient2));
        
        Doctor Doctor1 = new Doctor();
        
        Doctor1.prescribeMedicine(patient1);
    }


    
}
