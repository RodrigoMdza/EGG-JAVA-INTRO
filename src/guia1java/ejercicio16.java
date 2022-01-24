/*
Escriba un programa que lea 20 números. Si el número leído es igual a cero se debe
salir del bucle y mostrar el mensaje "Se capturó el numero cero". El programa
deberá calcular y mostrar el resultado de la suma de los números leídos, pero si el
número es negativo no debe sumarse. Nota: recordar el uso de la sentencia break.
 */
package guia1java;

import java.util.Scanner;

public class ejercicio16 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        int num, i, suma, contador;
        suma = 0;
        for (i = 1; i <= 20; i++) {
            System.out.println("Ingrese el numero");
            num = leer.nextInt();
            if (num < 0) {
                continue;
            } else if (num == 0) {
                System.out.println("Se capturo el numero 0");
                break;
            } else {
                suma = suma + num;
            }
        }
        System.out.println("La suma de los numeros es " + suma);
    }
}
