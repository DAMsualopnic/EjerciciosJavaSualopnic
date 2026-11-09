package org.example;

import java.util.Scanner;


/*
6) Escribe un método que reciba o mes e o ano en formato numérico e devolva o
número de días que ten o mes tendo en conta os anos bisestos.
 */

public class Main {

    static void main() {

        Scanner in = new Scanner(System.in);

        int mes, ano;

        System.out.print("Introduce el mes: ");
        mes = in.nextInt();

        System.out.print("Introduce el año: ");
        ano = in.nextInt();

        System.out.println("El mes tiene " + diasMes(mes, ano) + " días.");

    }

    static int diasMes(int mes, int ano) {

        switch (mes) {

            case 1, 3, 5, 7, 8, 10, 12:
                return 31;

            case 4, 6, 9, 11:
                return 30;

            case 2:
                if (ano % 400 == 0 || (ano % 4 == 0 && ano % 100 != 0)) {
                    return 29;
                } else {
                    return 28;
                }

            default:
                return -1;
        }
    }
}