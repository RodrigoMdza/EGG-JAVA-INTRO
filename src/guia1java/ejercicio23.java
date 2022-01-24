/*
Realizar un algoritmo que rellene un vector de tamaño N con valores aleatorios y le
pida al usuario un numero a buscar en el vector. El programa mostrará donde se
encuentra el numero y si se encuentra repetido
 */
package guia1java;

import java.util.Scanner;

public class ejercicio23 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        int[] array = new int[5];
        int i, num, contador;
        for (i = 0; i < 5; i++) {
            array[i] = (int) (Math.random() * 10);
            System.out.print("[" + array[i] + "] ");

        }
        System.out.println("");

        System.out.println("Ingrese el numero a buscar");
        num = leer.nextInt();
        contador = 0;
        for (i = 0; i < 5; i++) {
            if (array[i] == num) {
                contador += 1;
                System.out.println("El num se encuentra en la pos " + (i + 1));
            }
        }
        if (contador > 1) {
            System.out.println("El numero esta " + contador + " veces");
        } else if (contador == 0) {
            System.out.println("El numero no esta en el vector");
        }

    }
}
