package com.mycompany.conversions;

public class Conversions {

    public static void main(String[] args) {

        // tipos de datos primitivos
        double heigth = 1.77;

        // casteo a int
        int numInt = (int) heigth;

        // casteo a long
        long numLong = (long) heigth;

        String quantity = "15";
        String price = "150.27";

        int priceInt = Integer.parseInt(price);
        double priceDouble = Double.parseDouble(price);
        
        int age = 27;
        
        String ageStr = String.valueOf(age);
        String heigthStr = String.valueOf(heigth);
    }
}
