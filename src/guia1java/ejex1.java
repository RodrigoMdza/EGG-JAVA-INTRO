/*
Dado un tiempo en minutos, calcular su equivalente en días y horas. 
 */
package guia1java;

import java.util.Scanner;

public class ejex1 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese la cantidad de minutos");
        int mins = leer.nextInt();
        horas(mins);
        System.out.println("La cantidad de dias es " + dias(mins));
    }

    public static void horas(int mins) {
        int horas;
        horas = mins / 60;
        System.out.println(mins + " minutos son " + horas + " horas");
    }

    public static double dias(int mins) {
        double dias;
        dias = (mins / 1440);
        return dias;
    }
}
