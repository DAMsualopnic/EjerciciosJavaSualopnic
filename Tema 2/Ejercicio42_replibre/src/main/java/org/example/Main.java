package org.example;

import java.util.Scanner;

public class Main {
    static void main() {
        Scanner in = new Scanner(System.in);

        int estado = 0;

        System.out.println("Estado inicial: Graza");
        System.out.print("Indique que ocurre (l, g, a, m): ");
        char accion = in.nextLine().charAt(0);

        while (accion != 'm') {
            if (accion == 'l') {
                if (estado != 2)
                    estado = 1;
            }
            else
            if (accion == 'g')
                estado = 2;
            else
            if (accion == 'a' && estado != 2)
                estado = 0;

            System.out.print("Introduzca otra acción (m para morir): ");
            accion = in.nextLine().charAt(0);
        }

        if (estado == 0)
            System.out.println("Obtiene la salvación");
        else
        if (estado == 1)
            System.out.println("Pasa por el Purgatorio y después obtiene la salvación");
        else
            System.out.println("Condena eterna");
    }
}