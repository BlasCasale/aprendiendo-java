package matrices;

import java.util.Scanner;

public class matrices {

    public static void main(String[] args) {
        // primero van las filas y despues las columnas
        int matriz[][] = new int[3][3];

        // matriz[0][0] = 1;
        // matriz[0][1] = 2;
        // matriz[0][2] = 3;
        // matriz[1][0] = 4;
        // matriz[1][1] = 5;
        // matriz[1][2] = 6;
        // matriz[2][0] = 7;
        // matriz[2][1] = 8;
        // matriz[2][2] = 9;
        Scanner teclado = new Scanner(System.in);

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("---");
                System.out.println("Ingrese un numero: ");
                matriz[i][j] = teclado.nextInt();
            }
        }

        for (int i = 0; i < 3; i++) {
            for (int j = 0; j < 3; j++) {
                System.out.println("----");
                System.out.println("En la fila " + i + " y en la columna " + j + " el valor es " + matriz[i][j]);
            }
        }
    }

}
