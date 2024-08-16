
import java.util.Scanner;

public class array {

    public static void main(String[] args) {
        int vector[] = new int[4];

        // vector[0] = 15;
        // vector[1] = 21;
        // vector[2] = 22;
        // vector[3] = 3;
        Scanner teclado = new Scanner(System.in);

        for (int i = 0; i < vector.length; i++) {
            System.out.println("---");
            System.out.println("Ingrese un numero: ");
            vector[i] = teclado.nextInt();
        }

        for (int i = 0; i < vector.length; i++) {
            System.out.println("-----");
            System.out.println("Valor: " + vector[i]);
        }
    }
}
