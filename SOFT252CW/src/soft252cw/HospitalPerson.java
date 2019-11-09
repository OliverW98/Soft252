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
public class HospitalPerson {

    protected String name;
    protected String surname;
    protected String address;
    protected String id;
    protected String password;

    public HospitalPerson(String name, String surname, String address, String id, String password) {
        this.name = name;
        this.surname = surname;
        this.address = address;
        this.id = id;
        this.password = password;
    }

    public HospitalPerson() {
        this("", "", "", "","");
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSurname() {
        return surname;
    }

    public void setSurename(String surname) {
        this.surname = surname;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public String getID() {
        return id;
    }

    public void setID(String id) {
        this.id = id;
    }

}
