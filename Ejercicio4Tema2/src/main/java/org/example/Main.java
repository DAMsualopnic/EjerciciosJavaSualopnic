package org.example;

/*4) Escribe unha aplicación que imprima o valor máis pequeno de catro números enteiros que
se solicitan por teclado. */

import java.util.Scanner;

public class Main {
    static void main() {
        Scanner in = new Scanner(System.in);
        int a,b,c,d;

        System.out.print("Digame el primer número: ");
        a = in.nextInt();

        System.out.print("Dígame el segundo número: ");
        b = in.nextInt();

        System.out.print("Digame el tercer número: ");
        c = in.nextInt();

        System.out.print("Dígame el cuarto número: ");
        d = in.nextInt();

        if (a <= b && a <= c && a <= d)
            System.out.printf("\n%d es el número más pequeño.", a);
        else
            if (b <= a && b <= c && b <= d)
                System.out.printf("\n%d es el número más pequeño.", b);
            else
                if (c <= a && c <= b && c <= d)
                    System.out.printf("\n%d es el número más pequeño.", c);
                else
                    System.out.printf("\n%d es el número más pequeño.", d);

    }
}
