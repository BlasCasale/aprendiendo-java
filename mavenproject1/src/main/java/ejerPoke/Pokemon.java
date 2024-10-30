/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package ejerPoke;

/**
 *
 * @author ASUS
 */
public abstract class Pokemon {

    private int pokedex;
    private String name;
    private String sex;
    private double weight;
    private int seasson;

    public Pokemon(int pokedex, String name, double weight, int seasson) {
        this.pokedex = pokedex;
        this.name = name;
        this.weight = weight;
        this.seasson = seasson;
    }

    public Pokemon() {

    }

    public int getPokedex() {
        return pokedex;
    }

    public void setPokedex(int pokedex) {
        this.pokedex = pokedex;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getSex() {
        return sex;
    }

    public void setSex(String sex) {
        this.sex = sex;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

    public int getSeasson() {
        return seasson;
    }

    public void setSeasson(int seasson) {
        this.seasson = seasson;
    }

    public abstract void attackTackle();

    public abstract void attackScratch();

    public abstract void attackNibble();
}
