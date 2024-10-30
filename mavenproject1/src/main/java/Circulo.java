/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */

/**
 *
 * @author ASUS
 */
public class Circulo implements Figura, Dibujable, Rotable {

    private double radio;

    public Circulo() {

    }

    public Circulo(double radio) {
        this.radio = radio;
    }

    @Override
    public double calcularArea() {
        return Math.PI * (radio * radio);
    }

    @Override
    public void rotar() {
        System.out.println("Rotando");
    }

    @Override
    public void dibujar() {
        System.out.println("Dibujando");
    }
}
