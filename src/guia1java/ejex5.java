/*
Una obra social tiene tres clases de socios:
o Los socios tipo ‘A’ abonan una cuota mayor, pero tienen un 50% de
descuento en todos los tipos de tratamientos.
o Los socios tipo ‘B’ abonan una cuota moderada y tienen un 35% de
descuento para los mismos tratamientos que los socios del tipo A.
o Los socios que menos aportan, los de tipo ‘C’, no reciben descuentos sobre
dichos tratamientos.
Solicite una letra (carácter) que representa la clase de un socio, y luego un valor real
que represente el costo del tratamiento (previo al descuento) y determine el importe
en efectivo a pagar por dicho socio.
 */
package guia1java;

import java.util.Scanner;

public class ejex5 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese clase de socio a, b o c");
        char clase = leer.next().charAt(0);
        System.out.println("Ingrese el costo del tratamiento");
        int costo = leer.nextInt();
        valid(clase, costo);
    }

    public static void valid(char clase, int costo) {

        switch (clase) {
            case 'a':
                System.out.println("El costo es " + (costo * 0.50));
                break;
            case 'b':
                System.out.println("El costo es " + (costo * 0.35));
                break;
            case 'c':
                System.out.println("El costo es " + costo);
            default:
                System.out.println("No valido, entre a y c");
                break;
        }
    }
}
