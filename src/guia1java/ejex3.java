/*
Elaborar un algoritmo en el cuál se ingrese una letra y se detecte si se trata de una
vocal. Caso contrario mostrar un mensaje. Nota: investigar la función equals() de la
clase String. 
 */
package guia1java;

import java.util.Scanner;

public class ejex3 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        System.out.println("Ingrese una letra");
        Character letra = leer.next().charAt(0);//CONSULTAR PORQUE CHARACTER Y NO CHAR
        if (letra.equals('a') || letra.equals('e') || letra.equals('i') || letra.equals('o') || letra.equals('u')) {
            System.out.println("Es una vocal");
        } else {
            System.out.println("No es una vocal");
        }

    }

}
