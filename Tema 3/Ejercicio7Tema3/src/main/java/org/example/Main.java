package org.example;

import java.util.Scanner;

/*
7) Usando o método do exercicio anterior, solicite unha data mediante o teclado en
formato dd /mm/ aaaa e indique se é correcta ou non (podemos supoñer que
cumpre co formato).
 */

public class Main {

    static void main() {

        Scanner in = new Scanner(System.in);

        int dia, mes, ano;

        System.out.print("Introduce una fecha (dd/mm/aaaa): ");
        dia = in.nextInt();
        mes = in.nextInt();
        ano = in.nextInt();

        if (mes >= 1 && mes <= 12) {

            if (dia >= 1 && dia <= diasMes(mes, ano)) {
                System.out.println("La fecha es correcta.");
            } else {
                System.out.println("La fecha es incorrecta.");
            }

        } else {
            System.out.println("La fecha es incorrecta.");
        }

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