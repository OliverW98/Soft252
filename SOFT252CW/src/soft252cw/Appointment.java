/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package soft252cw;

import java.util.Date;

/**
 *
 * @author Oliver
 */
public class Appointment {
    
    private Date date;
    private String doctorName;

    public Appointment(Date date, String doctorName) {
        this.date = date;
        this.doctorName = doctorName;
    }

    public Date getDate() {    
        return date;
    }

    public void setDate(Date date) {
        this.date = date;
    }

    public String getDoctorName() {
        return doctorName;
    }

    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }
    
    
    
    
}
