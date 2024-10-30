package Collections;

import java.util.Stack;

public class Stacks {

    public static void main(String[] args) {
        // la pila usa LIFO
        Stack<Integer> stack = new Stack<Integer>();

        System.out.println(stack);
        System.out.println(stack.isEmpty());

        // agregar
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);
        stack.push(1);
        stack.push(2);
        stack.push(3);
        stack.push(4);
        stack.push(5);

        // recorrido
        for (Integer plate : stack) {
            System.out.println("each " + plate);
        }

        System.out.println("completa " + stack);
        System.out.println(stack.isEmpty());

        int value = stack.pop(); // clasico pop

        System.out.println("borre " + value);

        System.out.println("pos " + stack.search(3)); // si esta devuelve positivo sino -1
        System.out.println("ultimo " + stack.peek()); // el ultimo agregado
    }

}
