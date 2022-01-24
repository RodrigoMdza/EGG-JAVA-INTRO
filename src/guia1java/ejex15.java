/*
Diseñe una función que pida el nombre y la edad de N personas e imprima los
datos de las personas ingresadas por teclado e indique si son mayores o menores
de edad. Después de cada persona, el programa debe preguntarle al usuario si
quiere seguir mostrando personas y frenar cuando el usuario ingrese la palabra
“No”.
 */
package guia1java;

import java.util.Scanner;

public class ejex15 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        String respuesta;
        do {
            System.out.println("Ingrese el nombre");
            String nombre = leer.next();
            System.out.println("Ingrese la edad");
            int edad = leer.nextInt();
            if (edad >= 18) {
                System.out.println("Es mayor de edad");
            } else {
                System.out.println("NO es mayor de edad");
            }
            System.out.println("Quiere seguir ingresando (SI o NO)");
            respuesta = leer.next();
        } while (!respuesta.equals("NO"));

    }
}
