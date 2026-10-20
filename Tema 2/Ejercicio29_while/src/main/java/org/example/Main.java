package org.example;


import java.util.Scanner;

public class Main {
    static void main() {

        Scanner in = new Scanner(System.in);

        System.out.print("Dígame un número desde: ");
        int desde = in.nextInt();

        System.out.print("Dígame un número hasta: ");
        int hasta = in.nextInt();
        int numero=0;

        if (desde > hasta){
            numero=desde;
            desde=hasta;
            hasta=numero;
        }

        for (int i = desde; i <= hasta; i++){

            if (ePrimo(i))
                System.out.println("El número "+i+" es primo");
            else
                System.out.println("El número "+i+" no es primo");
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
