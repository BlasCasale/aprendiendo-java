package com.mycompany.enums;

import com.mycompany.enums.enums.Color;

public class Enums {

    public static void main(String[] args) {
        /*
        es una palabra clave utilizada para definir un tipo de dato especial
        que representa un conjunto fijo de constantes
         */

        Color color = Color.RED;

        System.out.println("color " + color);

        for (Color col : Color.values()) {
            System.out.println(col);
        }

        /*
        name() retorna string con el nombre de la const
        ordinal() retorna un int con el index
        values() devuelve un array que contiene los elem
        valueOf(String name) se utiliza para obtener la constante del enum cuyo nombre coincice con el name
         */
        System.out.println("name: " + color.name());
        System.out.println("index " + color.ordinal());

        Color newCol = Color.valueOf("WHITE");

        System.out.println("valueOf " + newCol);

        newCol = Color.valueOf("VIOLET");

        System.out.println("valueOf " + newCol);

    }
}
