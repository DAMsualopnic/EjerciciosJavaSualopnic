package org.example;

import java.util.Scanner;

/*
9) Escribir un programa que calcule o factorial dun número sabendo que o factorial
de 0 e de 1 é 1. Para números n superiores a 1, o factorial de n é n * (n-1)!.
 */
public class Main {
    static void main() {
        Scanner in = new Scanner(System.in);

        int n;
        System.out.print("Dime un número para hacer su factorial: ");
        n = in.nextInt();

        long factorial = 1;
        for (int i=n; i > 1; i--){
            factorial *= i;
        }
        System.out.print("El factorial de "+ n + " es: "+ factorial);

    }
}
