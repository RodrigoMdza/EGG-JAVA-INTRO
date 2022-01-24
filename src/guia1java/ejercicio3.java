/*
Escribir un programa que pida tu nombre, lo guarde en una variable y lo muestre
por pantalla.
 */

package guia1java;

import java.util.Scanner;

public class ejercicio3 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Escriba su nombre");
        String nombre = leer.next();
        System.out.println("Su nombre es " + nombre);
    }

}
