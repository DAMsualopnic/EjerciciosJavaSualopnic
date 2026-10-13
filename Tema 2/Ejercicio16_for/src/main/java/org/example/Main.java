package org.example;


import java.util.Scanner;

public class Main {
    static void main() {
        Scanner in = new Scanner(System.in);

        System.out.print("Introduzca un número entero para calcular sus divisores: ");
        int n = in.nextInt();

        int divisores;

        for (int i =1; i <=n; i++){
            divisores = n%i;
            if (divisores == 0)
                System.out.println(n + " es divisible por "+i);
        }

        /*
           System.out.printf("Los divisores de %d son: \n ", n);
           System.out.println("1");

           for (i = 2; i <= n/2; i++)
                if (eDivisible(n,i)
                System.out.println(i);
           System.out.println(n);

          }
          private static boolean eDivisible(int a, int b){
                return (a%b==0);
          }
         */

    }
}
