/*
Recorrer un vector de N enteros contabilizando cuántos números son de 1 dígito,
cuántos de 2 dígitos, etcétera (hasta 5 dígitos)
 */
package guia1java;

public class ejercicio24 {

    public static void main(String[] args) {
        int[] array = new int[6];
        int i, cifras, cont1, cont2, cont3, cont4, cont5;
        cont1 = 0;
        cont2 = 0;
        cont3 = 0;
        cont4 = 0;
        cont5 = 0;
        for (i = 0; i < 5; i++) {
            array[i] = (int) (Math.random() * 100000);
        }
        for (i = 0; i < 5; i++) {
            System.out.print("[" + array[i] + "] ");
            cifras = 0;
            while (array[i] != 0) {
                array[i] = array[i] / 10;
                cifras += 1;

            }
            switch (cifras) {
                case 1:
                    if (cifras == 1) {
                        cont1 += 1;
                    }
                    break;
                case 2:
                    if (cifras == 2) {
                        cont2 += 1;
                    }
                    break;
                case 3:
                    if (cifras == 3) {
                        cont3 += 1;
                    }
                    break;
                case 4:
                    if (cifras == 4) {
                        cont4 += 1;
                    }
                    break;
                case 5:
                    if (cifras == 5) {
                        cont5 += 1;
                    }
                    break;
            }
            System.out.println("Hay con 1 cifra " + cont1 + " numeros");
            System.out.println("Hay con 2 cifra " + cont2 + " numeros");
            System.out.println("Hay con 3 cifra " + cont3 + " numeros");
            System.out.println("Hay con 4 cifra " + cont4 + " numeros");
            System.out.println("Hay con 5 cifra " + cont5 + " numeros");
        }

    }
}
