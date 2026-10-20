package org.example;


import java.util.Scanner;

public class Main {
    static void main() {

        Scanner in = new Scanner(System.in);
        System.out.print("Dígame un número: ");
        int numero = in.nextInt();

        if (ePrimo(numero))
            System.out.println("El número "+numero+ " es primo");
        else
            System.out.println("El número "+numero+" no es primo");
    }


    public static boolean ePrimo(int n) {
        boolean ePrimo = true;
        int divisor = 2;

        while (divisor<=Math.sqrt(n) && ePrimo){
            if (n%divisor==0)
                ePrimo=false;
            divisor++;
        }
        return ePrimo;
    }
}