package Collections;

import java.util.HashMap;
import java.util.Map;

public class HashMaps {

    public static void main(String[] args) {

        /*
        put(key,value) agregar por clave-valor
        get(Object key) devuelve el valor asociado a la clave o null
        containsKey(Object key) verifica si el Map contiene la key
        containsvalue(Object value) comprueba si el Map contiene el value
        remove(Object key) elimina el registro asociado a la key
        keySet() devuelve un conjunto de todas las claves del Map
        values() devuelve una coleccion de todos los valores que contiene el Map
         */
        // clave y valor en el tipado
        Map<Integer, String> employesMap = new HashMap<>();

        employesMap.put(40714259, "Blas");
        employesMap.put(41310585, "Jazmín");

        System.out.println("por value " + employesMap.containsValue("Pedro"));
        System.out.println("por key " + employesMap.containsKey(41310585));

        System.out.println("values " + employesMap.values());
        System.out.println("keys " + employesMap.keySet());

        System.out.println(employesMap.get(40714259));
        
        for (String employe : employesMap.values()) {
            System.out.println("empleado " + employe);
        }
        
        System.out.println(employesMap.remove(40714259)); // retorna el empleado borrado
    }

}
