package com.mycompany.relations;

public class Owner {

    private int dni;
    private String fullName;

    public Owner(int dni, String fullName) {
        this.dni = dni;
        this.fullName = fullName;
    }

    public int getDni() {
        return dni;
    }

    public void setDni(int dni) {
        this.dni = dni;
    }

    public String getFullName() {
        return fullName;
    }

    public void setFullName(String fullName) {
        this.fullName = fullName;
    }

}
