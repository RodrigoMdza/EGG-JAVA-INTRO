/*
Escriba un programa en el cual se ingrese un valor límite positivo, y a continuación
solicite números al usuario hasta que la suma de los números introducidos supere
el límite inicial. 
 */
package guia1java;

import java.util.Scanner;

public class ejercicio14 {

    public static void main(String[] args) {
        Scanner leer = new Scanner(System.in).useDelimiter("\n");
        int limite;
        int num;
        int suma;
        System.out.println("Ingrese el limite");
        limite = leer.nextInt();
        suma = 0;
        while (suma < limite) {
            System.out.println("Ingrese numeros a sumar");
            num = leer.nextInt();
            suma = suma + num;
        }

    }

}
