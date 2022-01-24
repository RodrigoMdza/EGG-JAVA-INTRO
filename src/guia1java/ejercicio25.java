/*
Realizar un programa que rellene un matriz de 4 x 4 de valores aleatorios y
muestre traspuesta. 
 */
package guia1java;

import java.util.Scanner;

public class ejercicio25 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        int[][] matriz = new int[4][4];
        int i, j;
        for (i = 0; i < 4; i++) {
            for (j = 0; j < 4; j++) {
                matriz[i][j] = (int) (Math.random() * 10);
                System.out.print("[" + matriz[i][j] + "] ");
            }
            System.out.println("");
        }
        System.out.println("");
        for (i = 0; i < 4; i++) {
            for (j = 0; j < 4; j++) {
                System.out.print("[" + matriz[j][i] + "] ");
            }
            System.out.println("");
        }
    }
}
