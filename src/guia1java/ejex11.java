/*
Escribir un programa que lea un número entero y devuelva el número de dígitos
que componen ese número. Por ejemplo, si introducimos el número 12345, el
programa deberá devolver 5. Calcular la cantidad de dígitos matemáticamente
utilizando el operador de división. Nota: recordar que las variables de tipo entero
truncan los números o resultados.
 */
package guia1java;

import java.util.Scanner;

public class ejex11 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese el numero");
        int num = leer.nextInt();
        digit(num);
    }

    public static void digit(int num) {
        int digitos;
        double resto;
        digitos = 1;
        resto = num;
        while (resto / 10 >= 1) {
            resto /= 10;
            digitos += 1;
        }
        System.out.println("El num tiene " + digitos + " digitos");
    }
}
