/*
Realizar un programa que lea 4 números (comprendidos entre 1 y 20) e imprima el
número ingresado seguido de tantos asteriscos como indique su valor
 */
package guia1java;

import java.util.Scanner;

public class ejercicio20 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        int num = 0;
        String cadena;

        for (int i = 0; i < 4; i++) {
            System.out.println("Ingrese el numero");
            num = leer.nextInt();
            cadena = "";
            for (int j = 0; j < num; j++) {
                cadena += "*";
            }
            System.out.println(num + cadena);
            System.out.println("");
        }
    }

}
