/*
Implementar un programa que dado dos números enteros determine cuál es el
mayor y lo muestre por pantalla.
 */
package guia1java;

import java.util.Scanner;

public class ejercicio7 {

   
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese el primer numero a evaluar");
        int num = leer.nextInt();
        System.out.println("Ingrese el segundo");
        int num2 = leer.nextInt();
        int maxim = Math.max(num, num2);
        //RESULTADO CON IF
        if (num>num2){
        System.out.println("Es mayor" +num);
        } else { 
            System.out.println("Es mayor " +num2);
        }
        //RESULTADO CON MATH.MAX
        System.out.println("El numero mayor es " + maxim);
    }

}
