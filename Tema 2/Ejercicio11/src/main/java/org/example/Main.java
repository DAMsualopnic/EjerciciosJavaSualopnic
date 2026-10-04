package org.example;

/*
11) Escribe un programa para determinar se un ano é bisesto. Un ano é bisesto se se cumpren
as seguintes condicións:
a. Un ano é bisesto se é múltiplo de catro (por exemplo, 1984).
b. Os anos que son múltiplos de 100 non son bisestos a non ser que tamén sexan
múltiplos de 400 (o ano 2000 é bisesto, pero o 1800 non).
 */

import java.util.Scanner;

public class Main {
    static void main() {
        Scanner teclado = new Scanner(System.in);
        System.out.println("Tecle un año: ");

        int ano = teclado.nextInt();

        int a,b,c;
        a = ano % 4;
        b = ano % 100;
        c = ano % 400;

        if (a == 0 && (b !=0 || c !=0))
            System.out.println("El año " + ano + " es bisiesto");
        else
            System.out.println("El año " + ano + " no es bisiesto");

    }
}
