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
public class MedicineStock {
    ArrayList<Medicine> medicine; 

    public MedicineStock() {
        medicine = new ArrayList<>();
        Medicine med1 = new Medicine("name1",100);
        Medicine med2 = new Medicine("name2",100);
        Medicine med3 = new Medicine("name3",100);
        Medicine med4 = new Medicine("name4",100);
        Medicine med5 = new Medicine("name5",80);
        Medicine med6 = new Medicine("name6",100);
        Medicine med7 = new Medicine("name7",100);
        Medicine med8 = new Medicine("name8",10);
        Medicine med9 = new Medicine("name9",100);
        Medicine med10 = new Medicine("name10",100);
        
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
    
