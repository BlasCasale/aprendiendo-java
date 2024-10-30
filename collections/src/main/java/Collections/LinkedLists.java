package Collections;

import java.util.LinkedList;
import java.util.List;

public class LinkedLists {

    public static void main(String[] args) {
        List<Persona> list = new LinkedList<Persona>();

        // list.addFirst(list); ?
        // list.addLast(list); ?
        list.add(new Persona("Jaz", 26)); // al final
        list.add(new Persona("Arelis", 0));
        list.add(0, new Persona("Blas", 27)); // asi se agrega al principio

        // solo se pueden recorrer por forEach, no tiene index
        // recorrido forEach
        for (Persona perso : list) {
            System.out.println(perso.getName());
        }

        // eliminacion de registro en linked list
        String name = "Blas";
        for (Persona perso : list) {
            if (perso.getName().equals(name)) {
                list.remove(perso);
                break;
                // con esto se corta iteraciones para que java acomode los punteros
            }
        }

        System.out.println(list.size()); // con esto se el tamaño de la lista

        System.out.println(list.getFirst().getName()); // primero
        System.out.println(list.getLast().getName()); // ult
        
        list.clear(); // limpia toda la lista
        
        list.isEmpty(); // esta vacia (return boolean)
    }
}
