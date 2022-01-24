/*
Declarar cuatro variables de tipo entero A, B, C y D y asignarle un valor diferente a
cada una. A continuación, realizar las instrucciones necesarias para que: B tome el
valor de C, C tome el valor de A, A tome el valor de D y D tome el valor de B.
Mostrar los valores iniciales y los valores finales de cada variable. Utilizar sólo una
variable auxiliar
 */
package guia1java;

import java.util.Scanner;

public class ejex2 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        int A = 22;
        int B = 12;
        int C = 87;
        int D = 125;
        System.out.println("A es " + A + " B es " + B + " C es " + C + " D es " + D);
        cambio(A, B, C, D);
    }

    public static void cambio(int A, int B, int C, int D) {
        int aux;
        aux = B;
        B = C;
        C = A;
        A = D;
        D = aux;
        System.out.println();
    }
}
