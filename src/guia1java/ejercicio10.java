/*
Realizar un programa que solo permita introducir solo frases o palabras de 8 de
largo. Si el usuario ingresa una frase o palabra de 8 de largo se deberá de imprimir
un mensaje por pantalla que diga “CORRECTO”, en caso contrario, se deberá
imprimir “INCORRECTO”. 
 */
package guia1java;

import java.util.Scanner;

public class ejercicio10 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese una palabra de 8 caracteres");
        String palabra = leer.next();
        if (palabra.length() == 8) {
            System.out.println("CORRECTO");
        } else {
            System.out.println("NO TIENE 8 CARACTERES");
        }

    }

}
