/*
Realizar un algoritmo que rellene un vector con los 100 primeros números enteros y
los muestre por pantalla en orden ascendente.
 */
package guia1java;

public class ejercicio22 {

    public static void main(String[] args) {
        int[] array = new int[100];
        int contador = 0;
        for (int i = 0; i < 100; i++) {
            array[i] = contador;
            contador += 1;
            System.out.print("[" + i + "] ");
        }

    }

}
