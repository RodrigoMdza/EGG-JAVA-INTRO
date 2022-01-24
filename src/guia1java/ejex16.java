/*
Crea una aplicación que nos pida un número por teclado y con una función se lo
pasamos por parámetro para que nos indique si es o no un número primo, debe
devolver true si es primo, sino false.
Un número primo es aquel solo puede dividirse entre 1 y si mismo. Por ejemplo: 25
no es primo, ya que 25 es divisible entre 5, sin embargo, 17 si es primo.
 */
package guia1java;

import java.util.Scanner;

public class ejex16 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese el numero a verificar");
        int num = leer.nextInt();
        if (primos(num)) {
            System.out.println("El numero es primo");
        } else {
            System.out.println("No es primo");
        }
    }

    public static boolean primos(int num) {
        int i, contador;
        contador = 0;
        for (i = 1; i <= num; i++) {
            if (num % i == 0) {
                contador += 1;
            }
        }
        if (contador == 2) {
            return true;
        } else {
            return false;
        }
    }
}
