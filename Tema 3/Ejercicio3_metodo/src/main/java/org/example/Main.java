package org.example;

import java.util.Scanner;


public class Main {

    public static int eInvertido (int num){
        int invert = 0;

        while (num > 0){
            int resto = num % 10;

            invert = invert * 10 + resto;

            num /= 10;
        }
        return invert;

    }

    static void main() {
        Scanner in = new Scanner(System.in);

        System.out.print("Introduzca un número: ");
        int numero = in.nextInt();

        System.out.println("El número invertido es: " + eInvertido(numero));
    }
}

