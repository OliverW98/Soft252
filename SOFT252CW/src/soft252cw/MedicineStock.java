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
        Medicine med1 = new Medicine("HappyPills",100);
        Medicine med2 = new Medicine("HeadAcheAway",100);
        Medicine med3 = new Medicine("Moorfenn",100);
        Medicine med4 = new Medicine("Caferate",100);
        Medicine med5 = new Medicine("Nitrorudin",100);
        Medicine med6 = new Medicine("Chlornase",100);
        Medicine med7 = new Medicine("Trangen",100);
        Medicine med8 = new Medicine("Prefen",100);
        Medicine med9 = new Medicine("Ultrinate",100);
        Medicine med10 = new Medicine("Oxyconovate",100);
        
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
    
