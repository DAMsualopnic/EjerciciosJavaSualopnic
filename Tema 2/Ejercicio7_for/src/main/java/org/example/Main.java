package org.example;


import java.util.Scanner;

public class Main {
    static void main() {
        Scanner in = new Scanner(System.in);
        int n;
        double suma = 0,d = 2;

        System.out.print("Cuantos terminos quiere calcular: ");
        n = in.nextInt();

        for (int i=1; i <=n; i++){
            suma += (double)(i/d);
            d = Math.pow(2,i);
        }
        System.out.print("Suma: "+ suma);

    }
}
