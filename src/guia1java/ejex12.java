/*
Crear un programa que dibuje una escalera de números, donde cada línea de
números comience en uno y termine en el número de la línea. Solicitar la altura de
la escalera al usuario al comenzar. Ejemplo: si se ingresa el número 3:
1
12
123

 */
package guia1java;

import java.util.Scanner;

public class ejex12 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese el numero");
        int num = leer.nextInt();
        escalera(num);
    }

    public static void escalera(int num) {
        int i, j;
        for (i = 1; i <= num; i++) {
            for (j = 1; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println("");
        }
    }
}
