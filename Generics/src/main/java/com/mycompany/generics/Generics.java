package com.mycompany.generics;

public class Generics {

    public static void main(String[] args) {
        /*
        si necesitas una edd generica para solventar un problema, los genericos te ayudan a eso
        
        los genericos en java son una caracteristica que permite definir
        clases, interfaces y metodos con tdd parametrizados
        
        su principal objetivo es proporcionar una manera de manejar objetos de
        diferentes tipos sin perder la seguridad de tipos
        
        la principal ventaja es la eliminacion del casteo explicito
         */

        Box<String> boxS = new Box<>();

        boxS.setContent("Blas");

        Box<Integer> boxI = new Box<>(10);

        int num = boxI.getContent();
    }
}
