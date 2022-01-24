/*
Realice un programa que calcule y visualice el valor máximo, el valor mínimo y el
promedio de n números (n>0). El valor de n se solicitará al principio del programa y
los números serán introducidos por el usuario. Realice dos versiones del programa,
una usando el bucle “while” y otra con el bucle “do - while”.
 */
package guia1java;

import java.util.Scanner;

public class ejex7 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese la cantidad de numeros");
        int num = leer.nextInt();
        mientras(num);
        repetir(num);
    }

    public static void mientras(int num) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        int contador, max, min, suma;
        max = 0;
        min = 99999;
        contador = 0;
        suma = 0;
        while (contador < num) {
            System.out.println("Ingrese los valores");
            int numero = leer.nextInt();
            contador += 1;
            suma += numero;
            if (numero > max) {
                max = numero;
            }
            if (numero < min) {
                min = numero;
            }
        }
        System.out.println("El promedio es " + (suma / contador));
        System.out.println("El maximo es " + max + " y el minimo es " + min);
    }

    public static void repetir(int num) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        int contador, max, min, suma;
        max = 0;
        min = 99999;
        contador = 0;
        suma = 0;
        do {
            System.out.println("Ingrese los valores");
            int numero = leer.nextInt();
            contador += 1;
            suma += numero;
            if (numero > max) {
                max = numero;
            }
            if (numero < min) {
                min = numero;
            }
        } while (contador < num);
        System.out.println("El promedio es " + (suma / contador));
        System.out.println("El maximo es " + max + " y el minimo es " + min);
    }
}
