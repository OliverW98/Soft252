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
        new LogIn().setVisible(true);
        Hospital hospital = new Hospital();
        
        Patient patient1 = new Patient();
        Doctor Doctor1 = new Doctor();
             
        Doctor1.prescribeMedicine(patient1);
        
        System.out.println(hospital.people.get(6).getID().substring(0,1));
        
        hospital.people.forEach((_item) -> {
            if(_item.getID().substring(0, 1).equals("P")){
             System.out.println(_item.getName());   
            }          
        });  
        
    }


    
}
