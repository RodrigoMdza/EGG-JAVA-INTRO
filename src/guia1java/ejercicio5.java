/*
Dada una cantidad de grados centígrados se debe mostrar su equivalente en
grados Fahrenheit. 
 */
package guia1java;

import java.util.Scanner;

public class ejercicio5 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese los grados centigrados");
        int centigrados = leer.nextInt();
        System.out.println("La temperatura es Far es: " + 32 + 9 * centigrados / 5);

    }

}
