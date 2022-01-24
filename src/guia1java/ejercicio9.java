/*
Crear un programa que pida una frase y si esa frase es igual a “eureka” el programa
pondrá un mensaje de Correcto, sino mostrará un mensaje de Incorrecto.
 */
package guia1java;

import java.util.Scanner;

public class ejercicio9 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese la cadena");
        String palabra = leer.next();
        String palabra2 = "eureka";
        if (palabra.equalsIgnoreCase(palabra2)) {//las funciones de cadena se usan asi
            System.out.println("Son iguales");
        } else {
            System.out.println("No son iguales");
        }

    }

}
