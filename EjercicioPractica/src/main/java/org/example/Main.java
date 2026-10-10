package org.example;


import java.util.Scanner;

public class Main {
    static void main() {
        Scanner in = new Scanner(System.in);


        System.out.print("Introduzca una cualificación: ");
        double cualificacion = in.nextDouble();

        while (cualificacion < 0 || cualificacion > 10) {
            System.out.println("Esta nota no es posible!!");


            System.out.print("Vuelva a escribir una cualificación:");
            cualificacion = in.nextDouble();
        }


            if (cualificacion >= 5)
                System.out.println("Usted está aprobado");
            else
                System.out.println("Usted está suspenso");
    }
}
