package Collections;

public class Collections {

    public static void main(String[] args) {
        // las colecciones son similares a arreglos pero son dinámicas
        // en java las colecciones se emplean mediante interfaz "Collection", esto permite implementar una serie de metodos comunes:
        // añadir, eliminar, obtener tamaño de la coleccion

        /*
        Tipos de collections:
        
        1) list
        . conjunto de elementos relacionados que tiene orden (edd lineal)
        . pueden tener FIFO (first in first out) o LIFO (last in first out)
        
        - ArrayLists
        . es una clase que se representa como una matriz dinamica
        . hereda de la clase AbstractList, la cual implementa la interfaz List
        . permite colecciones o elementos duplicados
        . el orden de los registros es el orden en el que fueron insertados
        . permite acceso aleatorio (indice)
        . manipulacion lenta (recorrer todo el arraylist para hacer un cambio)
        . solo se puede eliminar en el final
        . se borra con un index y hace corrimiento de todos los otros elementos
                
        - LinkedLists
        . es una clase
        . representan a una lista doblemente enlazada
        . permite duplicados
        . sigue el concepto de LIFO
        . manipulacion mas rapida
        . puede ser usada no solo como lista, sino como pila o cola
        . permite hacer inserciones o eliminaciones al principio o al final de la coleccion
        . cuando se elimina se reacomodan los punteros
        
        - Stack
        . la pila clasica
        
        2) set
        3) queue
        
        4) map => los maps estan por fuera de las collection
        . una coleccion clave valor (json)
        . no puede tener claves duplicadas
        . permite acceso rapido a los valores a traves de las claves
        . diferentes implementaciones:
        - HashMap
        - TreeMap
        - LinkedHashMap
        - y mas...
         */
    }
}
