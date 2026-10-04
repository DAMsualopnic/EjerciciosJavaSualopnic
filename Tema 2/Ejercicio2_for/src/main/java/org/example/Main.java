package org.example;

/*
2) Escribir un programa que acepte cinco números do usuario e calcule a súa media.
 */

import java.util.Scanner;

public class Main {
    static void main() {
        final int N = 5;
        Scanner in = new Scanner(System.in);

        double media = 0;

        for (int i = 0; i < N; i++) {
            System.out.print("Dame el número: "+ (i+1) + ":");
            media += in.nextByte();
        }
        media /= (double)N;
        System.out.println("La media es: "+ media);
    }
}
