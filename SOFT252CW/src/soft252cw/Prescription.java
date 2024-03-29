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
public class Prescription {
    
    private Medicine medicine;
    private int quantity;
    private String dosage;
    private boolean handedOut;

    public Prescription(Medicine medicine, int quantity, String dosage, boolean handedOut) {
        this.medicine = medicine;
        this.quantity = quantity;
        this.dosage = dosage;
        this.handedOut = handedOut; 
    }

    public Medicine getMedicine() {
        return medicine;
    }

    public void setMedicine(Medicine medicine) {
        this.medicine = medicine;
    }


    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public String getDosage() {
        return dosage;
    }

    public void setDosage(String dosage) {
        this.dosage = dosage;
    }

    public boolean isHandedOut() {
        return handedOut;
    }

    public void setHandedOut(boolean handedOut) {
        this.handedOut = handedOut;
    }  
}
