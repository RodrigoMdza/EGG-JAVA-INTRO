/*
Leer la altura de N personas y determinar el promedio de estaturas que se
encuentran por debajo de 1.60 mts. y el promedio de estaturas en general.
 */
package guia1java;

import java.util.Scanner;

public class ejex6 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese la cantidad de personas");
        int num = leer.nextInt();
        altura(num);
    }

    public static void altura(int num) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        int i, contador, contador2;
        double altura, altura2, promedio, suma, suma2;
        contador = 0;
        contador2 = 0;
        altura2 = 0;
        promedio = 0;
        suma = 0;
        suma2 = 0;
        for (i = 0; i < num; i++) {
            System.out.println("Ingrese la altura");
            altura = leer.nextInt();
            contador += 1;
            suma = suma + altura;
            if (altura < 1.60) {
                suma2 = suma2 + altura;
                contador2 += 1;
            }
            promedio = (suma / contador);
            System.out.println("El promedio de altura general es " + promedio);
            System.out.println("El promedio de altura menor a 1.60 es " + (suma2 / contador2));
        }

    }
}
