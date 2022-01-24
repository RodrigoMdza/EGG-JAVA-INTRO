/*
Elaborar un algoritmo en el cuál se ingrese una letra y se detecte si se trata de una
vocal. Caso contrario mostrar un mensaje. Nota: investigar la función equals() de la
clase String.
 */
package guia1java;

import java.util.Scanner;

/**
 *
 * @author acer_
 */
public class ejex32 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        System.out.println("Ingrese una letra");
        char letra = leer.next().charAt(0);
        if (verif(letra)) {
            System.out.println("es vocal");
        } else {
            System.out.println("no es vocal");

        }
    }

    public static boolean verif(char letra) {
        if (letra == 'a' || letra == 'e' || letra == 'i' || letra == 'o' || letra == 'u') {
            return true;
        } else {
            return false;
        }
    }
}
