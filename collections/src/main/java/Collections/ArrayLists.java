package Collections;

import java.util.ArrayList;
import java.util.List;

public class ArrayLists {

    public static void main(String[] args) {

        List<Persona> list = new ArrayList<Persona>();

        list.add(new Persona("Blas", 27));
        list.add(new Persona("Jaz", 26));
        list.add(new Persona("Arelis", 0));

        list.remove(0); // se borra por indice asi

        // recorrer por index
        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i).getName());
        }

        // recorrido forEach
        for (Persona perso : list) {
            System.out.println(perso.getName());
        }

        System.out.println(list.size()); // con esto se el tamaño de la lista
        
        list.clear(); // limpia toda la lista
        
        list.isEmpty(); // esta vacia (return boolean)
    }
}
