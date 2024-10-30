package com.mycompany.relations;

import java.util.LinkedList;
import java.util.List;

public class Relations {

    public static void main(String[] args) {
        List<Owner> ownerList = new LinkedList<>();

        ownerList.add(new Owner(40714259, "Blas Casale"));
        ownerList.add(new Owner(41310585, "Jazmin Aranda"));
        Car car = new Car(10, "Mustang", "Ford", ownerList);
    }
}
