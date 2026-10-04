package org.example;

import java.util.Scanner;

/*Escribe un programa que pida un número enteiro e comprobe se é distinto de cero. Se é
así, indica se é par ou impar */

public class Main {
    static void main() {
        Scanner teclado = new Scanner(System.in);
        int numero;

        System.out.print("Dime un número: ");
        numero = teclado.nextInt();

        if (numero == 0 )
            System.out.println("\nSe tecleó un 0");
        else
            if (numero % 2 == 0)
                System.out.println("\nEste número es par");
            else
                System.out.println("\nNúmero es impar");
    }
}
