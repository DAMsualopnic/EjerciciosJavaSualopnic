package org.example;


import java.util.Scanner;

public class Main {
    static void main() {
        Scanner in = new Scanner(System.in);
        int terminos;
        int n= 0, d = 2;
        double suma = 0;
        System.out.print("Cuántos términos quiere calcular?");
        terminos = in.nextInt();

        for (int i =0 ; i < terminos; i++) {
            suma += (double) n/d;
            n += 5;
            d *= 3;

        }
        System.out.printf("Suma: %.4f \n", suma);
    }
}
