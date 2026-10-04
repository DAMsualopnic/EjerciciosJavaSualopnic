package org.example;

/*
26) Ler números enteiros por teclado ata que se introduza o cero. Indicar cantos son
negativos
 */

import java.util.Scanner;

public class Main {
    static void main() {
        int num; //numero que dan por teclado
        int negativos = 0; //Cuenta el número de negativos
        Scanner in = new Scanner(System.in);
        System.out.print("Introduce un número: ");
        num = in.nextInt();

        while (num != 0) {
            if (num < 0 ) {
                negativos++;
            }
            System.out.print("Introduce otro número (0 para terminar): ");
            num = in.nextInt();
        }

        System.out.println("Total de negativos: "+ negativos);

    }
}
