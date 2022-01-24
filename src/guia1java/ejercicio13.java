/*
. Escriba un programa que valide si una nota está entre 0 y 10, sino está entre 0 y 10
la nota se pedirá de nuevo hasta que la nota sea correcta. 
 */
package guia1java;

import java.util.Scanner;

public class ejercicio13 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        int numero;
        do {
            System.out.println("Ingrese un numero entre 0 y 10");
            numero = leer.nextInt();
            if (numero < 0 || numero > 10) {
                System.out.println("Por favor el valor debe estar entre 1 y 10");
            }
        } while (numero < 0 || numero > 10);

    }

}
