/*
Realizar un programa que rellene una matriz de tamaño NxM con valores aleatorios
y muestre la suma de sus elementos
 */
package guia1java;

import java.util.Scanner;

public class ejex21 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        int[][] matriz = new int[5][5];
        llenado(matriz);
        System.out.println("La suma es " + suma(matriz));
    }

    public static int[][] llenado(int[][] matriz) {
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                matriz[i][j] = (int) (Math.random() * 10);
            }
        }
        return matriz;
    }

    public static int suma(int[][] matriz) {
        int suma = 0;
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 5; j++) {
                suma += matriz[i][j];
            }
        }
        return suma;
    }
}
