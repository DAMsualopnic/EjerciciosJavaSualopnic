package org.example;

/*Escribe un programa que pida un número enteiro e comprobe se é distinto de cero. Se é
así, indica se é par ou impar */

import java.util.Scanner;

public class Main {
    static void main() {
        Scanner in = new Scanner(System.in);
        int numero;


        System.out.println("Dígame un número: ");
        numero = in.nextInt();

        while (numero == 0) {
            System.out.println("Este número es 0!!");
            System.out.println("Teclée otro número: ");
            numero = in.nextInt();
        }
        if (numero % 2 == 0 )
            System.out.println("Este número es par");
        else
            System.out.println("Este número es impar");
    }
}
