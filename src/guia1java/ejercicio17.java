/*
Realizar un programa que simule el funcionamiento de un dispositivo RS232, este
tipo de dispositivo lee cadenas enviadas por el usuario. Las cadenas deben llegar
con un formato fijo: tienen que ser de un máximo de 5 caracteres de largo, el primer
carácter tiene que ser X y el último tiene que ser una O.
Las secuencias leídas que respeten el formato se consideran correctas, la
secuencia especial “&&&&&” marca el final de los envíos (llamémosla FDE), y toda
secuencia distinta de FDE, que no respete el formato se considera incorrecta.
Al finalizar el proceso, se imprime un informe indicando la cantidad de lecturas
correctas e incorrectas recibidas. 
 */
package guia1java;

import java.util.Scanner;

public class ejercicio17 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        String palabra, letra1, letra2;
        int contador1, contador2;
        contador1 = 0;
        contador2 = 0;
        do {
            System.out.println("Ingrese la palabra a verificar");
            palabra = leer.next();
            letra1 = palabra.substring(0, 1);
            letra2 = palabra.substring(4, 5);
            System.out.println("La letra1 es " + letra1 + " la letra 2 es " + letra2);
            if (palabra.length() == 5 && letra1.equals("X") && letra2.equals("O")) {
                System.out.println("CORRECTO");
                contador1 = contador1 + 1;
            } else {
                System.out.println("INCORRECTO");
                contador2 = contador2 + 1;
            }
        } while (!palabra.equals("&&&&&"));
        System.out.println("Hay " + contador1 + " CORRECTAS y " + contador2 + " INCORRECTAS");
    }
}
