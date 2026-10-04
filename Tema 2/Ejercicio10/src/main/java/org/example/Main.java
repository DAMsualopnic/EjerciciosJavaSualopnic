package org.example;

import java.util.Scanner;

/*
10) A data da Pascua corresponde ao primeiro domingo despois da primeira lúa chea despois
do equinoccio de primavera e calcúlase mediante as seguintes expresións:
a = ano % 19
b = ano % 4
c = ano % 7
d = (19 * a + 24) % 30
e = (2 * b + 4 * c + 6 * d + 5) % 7
f = (22 + d + e)
 */
public class Main {
    static void main() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Teclee un año: ");
        int ano = teclado.nextInt();

        int a,b,c,d,e,f;

        a = ano % 19;
        b = ano % 4;
        c = ano % 7;
        d = (19 * a + 24) % 30;
        e = (2 * b + 4 * c + 6 * d + 5) % 7;
        f = (22 + d + e);

        if (f > 31)
            System.out.printf("Domingo de Semana Santa: %d de Abril", f-31);
        else
            System.out.printf("Domingo de Semana Santa: %d de Marzo", f);


    }
}
