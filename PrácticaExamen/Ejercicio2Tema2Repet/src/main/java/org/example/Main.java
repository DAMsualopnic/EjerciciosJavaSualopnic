package org.example;

/*
2) Escribir un programa que acepte cinco números do usuario e calcule a súa media.
 */

import java.util.Scanner;

public class Main {
    static void main() {
        Scanner in = new Scanner(System.in);

        System.out.println("Dígame 5 números para calcular su media: ");
        int a = in.nextInt();
        int b = in.nextInt();
        int c = in.nextInt();
        int d = in.nextInt();
        int e = in.nextInt();

        int suma= a+b+c+d+e;
        double media= suma/4;

        System.out.println("La media de estos números es: "+media);
    }
}
