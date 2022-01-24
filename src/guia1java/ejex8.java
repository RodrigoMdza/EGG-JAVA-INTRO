/*
Escriba un programa que lea números enteros. Si el número es múltiplo de cinco
debe detener la lectura y mostrar la cantidad de números leídos, la cantidad de
números pares y la cantidad de números impares. Al igual que en el ejercicio
anterior los números negativos no deben sumarse. Nota: recordar el uso de la
sentencia break
 */
package guia1java;

import java.util.Scanner;


public class ejex8 {

   
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        int contador, pares, impares, num;
        contador = 0;
        pares = 0;
        impares = 0;
        do {
            System.out.println("Ingrese solo numeros enteros");
            num = leer.nextInt();
            contador += 1;
            if (num % 2 == 0) {
                pares += 1;
            } else {
                impares += 1;
            }
        } while (num % 5 != 0);
        System.out.println("cant n leidos "+contador+" pares "+pares+" impares "+impares);
    }
}
