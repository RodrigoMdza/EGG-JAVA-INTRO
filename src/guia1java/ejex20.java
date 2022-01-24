/*
Los profesores del curso de programación de Egg necesitan llevar un registro de
las notas adquiridas por sus 10 alumnos para luego obtener una cantidad de
aprobados y desaprobados. Durante el periodo de cursado cada alumno obtiene 4
notas, 2 por trabajos prácticos evaluativos y 2 por parciales. Las ponderaciones de
cada nota son:
Primer trabajo práctico evaluativo 10%
Segundo trabajo práctico evaluativo 15%
Primer Integrador 25%
Segundo integrador 50%
Una vez cargadas las notas, se calcula el promedio y se guarda en el arreglo. Al final
del programa los profesores necesitan obtener por pantalla la cantidad de
aprobados y desaprobados, teniendo en cuenta que solo aprueban los alumnos
con promedio mayor o igual al 7 de sus notas del curso.
 */
package guia1java;

import java.util.Scanner;

public class ejex20 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        int i, contapro, contdesa;
        double[] array = new double[10];
        double prac1, prac2, integ1, integ2, prom;
        prac1 = 0;
        prac2 = 0;
        integ1 = 0;
        integ2 = 0;
        contapro = 0;
        contdesa = 0;
        for (i = 0; i < 10; i++) {
            System.out.println("Ingrese las notas");
            prac1 = leer.nextDouble();
            prac2 = leer.nextDouble();
            integ1 = leer.nextDouble();
            integ2 = leer.nextDouble();
            prom = ((prac1 * 0.10) + (prac2 * 0.15) + (integ1 * 0.25) + (integ2 * 0.50));
            array[i] = prom;
            System.out.println("[" + array[i] + "]");
            if (prom > 7) {
                contapro += 1;
            } else {
                contdesa += 1;
            }
        }
        System.out.println("Hay aprobados " + contapro + " y desaprobados " + contdesa);
    }

}
