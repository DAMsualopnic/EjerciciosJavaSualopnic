package org.example;

/*
10) Escribir unha aplicación que dado un valor enteiro n, calcule n termos da serie 1,
-2, 4, -8, …
 */

import java.util.Scanner;

public class Main {
    static void main() {
        Scanner in = new Scanner(System.in);

        System.out.print("¿Cuántos terminos de la serie quiere calcular?");
        int terminos = in.nextInt();
        int termino=1;

        for (int i=0; i < terminos; i++){
            System.out.print(termino + " ");
            termino *= -2;
        }


    }
}
