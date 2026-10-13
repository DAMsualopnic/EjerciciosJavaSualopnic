package org.example;

/*
5) Chámase serie harmónica a aquela que suma os inversos multiplicativos dos
enteiros positivos.
Realizar o cálculo anterior sumando tantos termos como indique o usuario.
 */

import java.util.Scanner;

public class Main {
    static void main() {
        Scanner in = new Scanner(System.in);
        int terminos;
        double suma = 0;
        System.out.println("Cuántos términos quieres calcular?");
        terminos = in.nextInt();

        for (int i = 1; i <= terminos; i++)
            suma = suma + (double)1/i; // Ponemos el double para convertirlo momentaneamente a double

        System.out.printf("Suma: %.2f  \n", suma);
    }
}
