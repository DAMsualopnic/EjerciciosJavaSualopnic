package org.example;

/*
4) Sumar os números pares entre dous dados polo usuario.
 */

import java.util.Scanner;

public class Main {
    static void main() {
        Scanner in = new Scanner(System.in);

        int desde, hasta;

        System.out.print("Número desde: ");
        desde = in.nextInt();
        System.out.print("Número hasta: ");
        hasta = in.nextInt();

        long suma = 0;

        if (desde % 2 != 0) // Empiezo en el primero par mayor que desde
            desde++;

        for (int i = desde; i <= hasta; i+=2) {
            suma += i;
        }
        System.out.println(suma);
    }
}
