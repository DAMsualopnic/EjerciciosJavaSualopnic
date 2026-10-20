package org.example;


import java.util.Scanner;

public class Main {
    static void main() {
        Scanner in = new Scanner(System.in);

        System.out.print("Indique un importe: ");
        int importe = in.nextInt();
        int cantidad;

        while (importe > 0) {

            if (importe >= 200) {
                cantidad = importe / 200;
                System.out.println(cantidad + " billetes de 200€");
                importe -= cantidad * 200;
            } else if (importe >= 100) {
                cantidad = importe / 100;
                System.out.println(cantidad + " billetes de 100€");
                importe -= cantidad * 100;
            } else if (importe >= 50) {
                cantidad = importe / 50;
                System.out.println(cantidad + " billetes de 50€");
                importe -= cantidad * 50;
            } else if (importe >= 20) {
                cantidad = importe / 20;
                System.out.println(cantidad + " billetes de 20€");
                importe -= cantidad * 20;
            } else if (importe >= 10) {
                cantidad = importe / 10;
                System.out.println(cantidad + " billetes de 10€");
                importe -= cantidad * 10;
            } else if (importe >= 5) {
                cantidad = importe / 5;
                System.out.println(cantidad + " billetes de 5€");
                importe -= cantidad * 5;
            } else if (importe >= 2) {
                cantidad = importe / 2;
                System.out.println(cantidad + " monedas de 2€");
                importe -= cantidad * 2;
            } else if (importe >= 1) {
                cantidad = importe / 1;
                System.out.println(cantidad + " monedas de 1€");
                importe -= cantidad * 1;
            }
        }


    }
}
