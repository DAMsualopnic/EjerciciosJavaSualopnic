package org.example;

import java.util.Scanner;


/* Solicitar unha cualificación na pantalla, tendo en conta que se poden introducir valores no
rango [0, 10]. Informar ao usuario se a cualificación é correcta ou non.*/

public class Main {
    static void main() {
        Scanner teclado = new Scanner(System.in);
        double cualifiacion;

        System.out.print("\n\nDame la nota: ");
        cualifiacion = teclado.nextDouble();


        if (cualifiacion < 0 || cualifiacion > 10)
            System.out.println("\nNota incorrecta");
        else
            if (cualifiacion >= 5)
                System.out.println("\nEstás aprobado");
            else
                System.out.println("\nEstás suspenso");
    }
}
