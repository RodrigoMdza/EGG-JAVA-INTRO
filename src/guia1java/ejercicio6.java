/*
Escribir un programa que lea un número entero por teclado y muestre por pantalla
el doble, el triple y la raíz cuadrada de ese número. 
 */
package guia1java;

import java.util.Scanner;

public class ejercicio6 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingresar el numero");
        int num = leer.nextInt();
        int num2 = num * 2;
        int num3 = num * 3;
        double num4 = Math.sqrt(num);//recibe un num entero y devuelve un double

        System.out.println("El doble es: " + num2 + " EL triple es " + num3 + " La raiz cuadrada es " + num4);

    }

}
