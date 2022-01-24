/*
Escriba un programa que averigüe si dos vectores de N enteros son iguales (la
comparación deberá detenerse en cuanto se detecte alguna diferencia entre los
elementos).
 */
package guia1java;

import java.util.Scanner;

public class ejex18 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        int[] array = new int[4];
        int[] array2 = new int[4];
        llenado(array, array2);
        comparacion(array, array2);
    }

    public static void llenado(int[] array, int[] array2) {
        int i;
        for (i = 0; i < 4; i++) {
            array[i] = (int) (Math.random() * 10);
            System.out.print("[" + array[i] + "] ");
            array2[i] = ((int) (Math.random() * 10));
            System.out.print("[" + array2[i] + "] ");
        }
    }

    public static void comparacion(int[] array, int[] array2) {
        int i;
        for (i = 0; i < 4; i++) {
            if (array[i] == array2[i]) {
                continue;
            } else {
            }
            break;
        }
        if (array[i] == array2[i]) {
            System.out.println("Son iguales");
        } else {
        }
        System.out.println("NO son iguales");
    }
}
