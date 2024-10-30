package com.mycompany.exceptions;

public class Exceptions {

    public static void main(String[] args) {
        // es un evento que ocurre durante la ejecucion de un programa que rompe el flujo

        // una exception nos permite continuar y el error corta todo
        /*
        try
        catch
        finally
        throw: lanzar una excepcion cualquiera
        arrojar un error
        throws: determinar que excepciones puede lanzar un método
         */
        int ages[] = {1, 2, 3, 4, 5};

        try {
            System.out.println(ages[6]);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }

        try {
            int result = 100 / 0;
            System.out.println(result);
        } catch (Exception e) {
            System.out.println(e.getMessage());
        }
    }
}
