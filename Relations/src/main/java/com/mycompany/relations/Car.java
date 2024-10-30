package com.mycompany.relations;

import java.util.List;

public class Car {

    private int id;
    private String name;
    private String brand;
    // la relacion de 1 a N se hace del a muchos
    private List<Owner> listOwners;
    // private Owner owner; 1 a 1

    public Car(int id, String name, String brand, List<Owner> listOwners) {
        this.id = id;
        this.name = name;
        this.brand = brand;
        this.listOwners = listOwners;
    }

    public int getId() {
        return id;
    }

    public void setId(int id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public List<Owner> getListOwners() {
        return listOwners;
    }

    public void setListOwners(List<Owner> listOwners) {
        this.listOwners = listOwners;
    }

}
