package org.example;

/*
6) Calcula o salario neto que recibirá un traballador, tendo en conta que as deducións deben
restarse do salario bruto. Estas dependerán do número de fillos, segundo a seguinte táboa:
Número de fillos % de retención
2 ou menos 20
Entre 3 e 5 15
Entre 6 e 7 10
Entre 8 e 9 5
10 ou máis 0

 */

import java.util.Scanner;

public class Main {
    static void main() {
        int hijos;
        double salario, retencion;

        Scanner teclado = new Scanner(System.in);

        System.out.print("\nIndique el salario bruto: ");
        salario = teclado.nextDouble();

        System.out.print("\nIndique el número de hijos: ");
        hijos = teclado.nextInt();

        if (hijos < 0 )
            System.out.println("\nEste número no está disponible");

        if (hijos <= 2 && hijos >= 0)
            retencion = 0.2;
        else
            if (hijos >= 3 && hijos <= 5)
                retencion = 0.15;
            else
                if (hijos >= 6 && hijos <= 7)
                    retencion = 0.1;
                else
                    if (hijos >= 8 && hijos <= 9)
                        retencion = 0.05;
                    else retencion = 0;

        System.out.printf("\nEl salario según el número de hijos será: %.2f€ " , salario - (salario*retencion));

        System.out.print("\n\nCalculo de salario terminado");
    }
}
