/*
Realice un programa para que el usuario adivine el resultado de una multiplicación
entre dos números generados aleatoriamente entre 0 y 10. El programa debe
indicar al usuario si su respuesta es o no correcta. En caso que la respuesta sea
incorrecta se debe permitir al usuario ingresar su respuesta nuevamente. 
 */
package guia1java;

import java.util.Scanner;

public class ejex10 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        int multip, intento;
        int num1 = (int) (Math.random() * 9) + 1;
        int num2 = (int) (Math.random() * 9) + 1;
        multip = num1 * num2;
        System.out.println(multip);
        do {
            System.out.println("Realice un intento");
            intento = leer.nextInt();
        } while (intento != multip);
    }

}
