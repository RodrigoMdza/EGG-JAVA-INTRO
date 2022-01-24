/*
Se dispone de un conjunto de N familias, cada una de las cuales tiene una M
cantidad de hijos. Escriba un programa que pida la cantidad de familias y para
cada familia la cantidad de hijos para averiguar la media de edad de los hijos de
todas las familias.
 */
package guia1java;

import java.util.Scanner;

public class ejex13 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("La media es " + media());
    }

    public static double media() {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        int contador, suma;
        contador = 0;
        suma = 0;
        System.out.println("Ingrese la cantidad de familias");
        double familias = leer.nextDouble();
        do {
            System.out.println("Ingrese la cantidad de hijos");
            double hijos = leer.nextDouble();
            contador += 1;
            suma += hijos;
        } while (contador < familias);
        return (suma / contador);
    }
}
