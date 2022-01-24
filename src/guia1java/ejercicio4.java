/*
Escribir un programa que pida una frase y la muestre toda en mayúsculas y
después toda en minúsculas.
 */
package guia1java;

import java.util.Scanner;

public class ejercicio4 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Escriba una frase");
        String frase = leer.next();
        System.out.println("La frase en mayusculas es " + frase.toUpperCase());
        System.out.println("La frase en minusculas es " + frase.toLowerCase());

    }

}
