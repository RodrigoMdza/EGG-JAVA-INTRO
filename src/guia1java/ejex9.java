/*
Simular la división usando solamente restas. Dados dos números enteros mayores
que uno, realizar un algoritmo que calcule el cociente y el residuo usando sólo
restas. Método: Restar el dividendo del divisor hasta obtener un resultado menor
que el divisor, este resultado es el residuo, y el número de restas realizadas es el
cociente. Por ejemplo: 50 / 13:
50 – 13 = 37 una resta realizada
37 – 13 = 24 dos restas realizadas
24 – 13 = 11 tres restas realizadas
dado que 11 es menor que 13, entonces: el residuo es 11 y el cociente es 3.
 */
package guia1java;

import java.util.Scanner;


public class ejex9 {

   
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        int dividendo,divisor,resto,coeciente;
        System.out.println("Ingrese el 1er numero");
        dividendo=leer.nextInt();
        System.out.println("Ingrese el segundo");
        divisor=leer.nextInt();
        coeciente=0;
        resto=dividendo;
        while (resto>divisor){
            resto -=divisor;
            coeciente +=1;
        }
        System.out.println("El residuo es "+resto+" el coeciente es "+coeciente);
    }

}
