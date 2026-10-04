package org.example;


import java.util.Scanner;

public class Main {
    static void main() {
        final int fijo = 30;
        final  int intervalo1 = 300, intervalo2 = 10000;
        final double importe1 = 0.2, importe2 = 0.15;

        Scanner in = new Scanner(System.in);
        System.out.print("Indique los kilómetros recorridos: ");
        int km = in.nextInt();
        double importe = fijo;

        if (km > intervalo1 && km <= intervalo2)
            importe += (km-intervalo1) * importe1;

        else if (km > intervalo2)
            importe += (intervalo2-intervalo1)* importe1 + (km - intervalo2)* importe2;

        System.out.println("Importe: "+ importe + "€");
    }
}
