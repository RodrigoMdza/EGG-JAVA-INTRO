/*
Realizar un programa que pida dos números enteros positivos por teclado y
muestre por pantalla el siguiente menú:
MENU
1. Sumar
2. Restar
3. Multiplicar
4. Dividir
5. Salir
Elija opción:
El usuario deberá elegir una opción y el programa deberá mostrar el resultado por
pantalla y luego volver al menú. El programa deberá ejecutarse hasta que se elija la
opción 5. Tener en cuenta que, si el usuario selecciona la opción 5, en vez de salir
del programa directamente, se debe mostrar el siguiente mensaje de confirmación:
¿Está seguro que desea salir del programa (S/N)? Si el usuario selecciona el
carácter ‘S’ se sale del programa, caso contrario se vuelve a mostrar el menú.
 */
package guia1java;

import java.util.Scanner;

public class ejercicio15 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");

        int opcionMenu, num1, num2;
        String opcionSalida;

        opcionSalida = "";

        // Entrada de Datos
        System.out.println("Ingrese el primer número: ");
        num1 = leer.nextInt();

        System.out.println("Ingrese el segundo número: ");
        num2 = leer.nextInt();

        opcionMenu = 0; // Inicializamos en 0 para que se ejecute el do/while

        do {
            System.out.println(" MENU ");
            System.out.println("1- Sumar.");
            System.out.println("2- Restar.");
            System.out.println("3- Multiplicar.");
            System.out.println("4- Dividir.");
            System.out.println("5- Salir.");
            System.out.println(" Elija una Opción: ");

            opcionMenu = leer.nextInt();

            // validamos opcion ingresada
            switch (opcionMenu) {
                case 1:
                    System.out.println("La Suma de: " + num1 + " + " + num2 + " = " + (num1 + num2));
                    break;
                case 2:
                    System.out.println("La Resta de: " + num1 + " - " + num2 + " = " + (num1 - num2));
                    break;
                case 3:
                    System.out.println("La Multiplicación de: " + num1 + " * " + num2 + " = " + (num1 * num2));
                    break;
                case 4:
                    System.out.println("La División de: " + num1 + " / " + num2 + " = " + (num1 / num2));
                    break;
                case 5:
                    System.out.println("¿Está seguro que desea salir del programa (S/N)?");
                    opcionSalida = leer.next();

                    opcionSalida = opcionSalida.toUpperCase();
                    // Validamos la opcon
                    if (opcionSalida.equals("S")) {
                        System.out.println("[ PROGRAMA FINALIZADO ]");
                    } else {
                        opcionMenu = 1;
                    }
                    break;
                default:
                    System.out.println("Opcion Incorrecta");
            }
        } while (opcionMenu != 5);
    }

}
