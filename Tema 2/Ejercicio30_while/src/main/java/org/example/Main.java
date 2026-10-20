package org.example;


import java.util.Scanner;

public class Main {
    static void main() {
        Scanner in = new Scanner(System.in);

        System.out.println("Cuántos números primos quieres calcular?");
        int n = in.nextInt();
        int numeros=0;
        int contador =0;

        while (contador < n){
            if (ePrimo(numeros)) {
                contador++;
                System.out.println(numeros + " es Primo ("+contador+")");
                }
            numeros++;
        }
    }


    public static boolean ePrimo(int n) {
        boolean ePrimo = true;
        int divisor = 2;

        while (divisor <= Math.sqrt(n) && ePrimo) {
            if (n % divisor == 0)
                ePrimo = false;
            divisor++;
        }
        return ePrimo;
    }
}
