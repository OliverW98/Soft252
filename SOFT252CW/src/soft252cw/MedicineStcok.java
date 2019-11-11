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
public class MedicineStcok {
    ArrayList<Medicine> medicine = new ArrayList<>();

    public MedicineStcok() {
        
        Medicine med1 = new Medicine("name1",10);
        Medicine med2 = new Medicine("name2",10);
        Medicine med3 = new Medicine("name3",10);
        Medicine med4 = new Medicine("name4",10);
        Medicine med5 = new Medicine("name5",10);
        Medicine med6 = new Medicine("name6",10);
        Medicine med7 = new Medicine("name7",10);
        Medicine med8 = new Medicine("name8",10);
        Medicine med9 = new Medicine("name9",10);
        Medicine med10 = new Medicine("name10",10);
        
        medicine.add(med1);
        medicine.add(med2);
        medicine.add(med3);
        medicine.add(med4);
        medicine.add(med5);
        medicine.add(med6);
        medicine.add(med7);
        medicine.add(med8);
        medicine.add(med9);
        medicine.add(med10);
        
    }
    
    
    
}
