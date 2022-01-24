/*
Crea una aplicación que le pida dos números al usuario y este pueda elegir entre
sumar, restar, multiplicar y dividir. La aplicación debe tener una función para cada
operación matemática y deben devolver sus resultados para imprimirlos en el main. 
 */
package guia1java;

import java.util.Scanner;

public class ejex14 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese dos valores");
        double num = leer.nextInt();
        double num2 = leer.nextInt();
        System.out.println("La suma es " + suma(num, num2));
        System.out.println("La resta es " + resta(num, num2));
        System.out.println("La multiplicacion es " + multip(num, num2));
        System.out.println("La division es " + div(num, num2));
    }

    public static double suma(double num, double num2) {
        return (num + num2);
    }

    public static double resta(double num, double num2) {
        return (num - num2);
    }

    public static double multip(double num, double num2) {
        return (num * num2);
    }

    public static double div(double num, double num2) {
        return (num / num2);
    }
}
