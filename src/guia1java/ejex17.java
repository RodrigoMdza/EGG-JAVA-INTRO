/*
Realizar un algoritmo que calcule la suma de todos los elementos de un vector de
tamaño N, con los valores ingresados por el usuario.
 */
package guia1java;

import java.util.Scanner;

public class ejex17 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese la dimension del arreglo");
        int dim = leer.nextInt();
        int[] array = new int[dim];
        llenado(array, dim);
        System.out.println("La suma de los vectores es " + suma(array, dim));
    }

    public static void llenado(int[] array, int dim) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        int i;
        for (i = 0; i < dim; i++) {
            System.out.println("Ingrese los elementos de array");
            array[i] = leer.nextInt();
            System.out.println("[" + array[i] + "] ");
        }
    }

    public static int suma(int[] array, int dim) {
        int i, suma;
        suma = 0;
        for (i = 0; i < dim; i++) {
            suma += array[i];
        }
        return suma;
    }
}
