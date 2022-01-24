/*
Crear una función rellene un vector con números aleatorios, pasándole un arreglo
por parámetro. Después haremos otra función o procedimiento que imprima el
vector.
 */
package guia1java;

import java.util.Scanner;

public class ejex19 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        int[] array = new int[5];
        llenado(array);
        mostrar(array);
    }

    public static int[] llenado(int[] array) {
        int i;
        for (i = 0; i < 5; i++) {
            array[i] = ((int) (Math.random() * 10));
        }
        return array;
    }

    public static void mostrar(int[] array) {
        int i;
        for (i = 0; i < 5; i++) {
            System.out.print("[" + array[i] + "] ");
        }
    }
}
