/*
 Escribir un programa que pida dos números enteros por teclado y calcule la 
sumade los dos. El programa deberá después mostrar el resultado de la suma.
 */

package guia1java;

import java.util.Scanner;

public class ejercicio2 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Escribir el primer numero a sumar");
        int num1 = leer.nextInt();
        System.out.println("Escribir el segundo numero");
        int num2 = leer.nextInt();
        int suma = num1 + num2;
        System.out.println("La suma de los numeros es " + suma);
    }

}
