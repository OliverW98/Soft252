/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package soft252cw;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;

/**
 *
 * @author Oliver
 */
public class Hospital {

public ArrayList<HospitalPerson> people;


    public Hospital() {
        people = new ArrayList<>();
        /**
         * Patient(String name, String surname, String address, String id, int age, String gender,String password)
         */
        Administrator admin = new Administrator("grace","porter","79 Salisbury Rd, Plymouth PL4 8TB","A2345","password");
        Secretary secretary = new Secretary("oscar","reid","16 Lorrimore Ave, Plymouth PL2 1HZ","S4992","password"); 
        Doctor doctor1 = new Doctor("hilda","owen","19 Baring St, Plymouth PL4 8NF","D0063","password");
        Doctor doctor2 = new Doctor("benjamin","farrell","9 Congreve Gardens, Plymouth PL5 3HG","D5453","password");
        Doctor doctor3 = new Doctor("david","standley","35 Dale Gardens, Plymouth PL4 6PY","D9974","password");
        Patient patient1 = new Patient("ian","smith","19 Effingham Cres, Plymouth PL3 5TN","P5433" ,"qwerty",25,"male");
        Patient patient2 = new Patient("stacy","johnson","3 Baytree Gardens, Plymouth PL2 2QQ","P8253" ,"password",62,"female");
        Patient patient3 = new Patient("charlotte","wood","1 Swale Cl, Plymouth PL3 6NY","P0824","logmein",33,"female");
        Patient patient4 = new Patient("alex","johnson","3 Baytree Gardens, Plymouth PL2 2QQ","P8253" ,"password",62,"female",false ,false);
        Patient patient5 = new Patient("charlotte","webb","1 Swale Cl, Plymouth PL3 6NY","P0824","logmein",33,"female",false,true);
        
        Calendar cal1 = Calendar.getInstance();

        cal1.set(2020, 1, 12, 12, 10,0);

        Appointment appointment1 = new Appointment(cal1.getTime(),"Jimmy falon" , false);
        
        Calendar cal2 = Calendar.getInstance();

        cal2.set(2020, 4, 12, 13, 30,0);

        Appointment appointment2 = new Appointment(cal2.getTime(),"Jimmy hendrix" , false);
        
        Calendar cal3 = Calendar.getInstance();

        cal3.set(2020, 1, 15, 15, 40,0);

        Appointment appointment3 = new Appointment(cal3.getTime(),"Jimmy savil" , false);
        
        patient4.setAppointment(appointment1);
        patient4.setAppointment(appointment2);
        patient5.setAppointment(appointment3);
        
        //Prescription(String medicine, int quantity, String dosage, boolean handedOut)
        
        people.add(admin);
        people.add(secretary);
        people.add(doctor1);
        people.add(doctor2);
        people.add(doctor3);
        people.add(patient1);
        people.add(patient2);
        people.add(patient3);
        people.add(patient4);
        people.add(patient5);
    }


}
