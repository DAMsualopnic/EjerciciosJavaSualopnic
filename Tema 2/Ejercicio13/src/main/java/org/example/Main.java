package org.example;

/*
13) Unha empresa de alugueiro de vehículos sen condutor quere ter un programa para emitir
facturas aos seus clientes, tendo en conta as seguintes consideracións:
a. Cantidade fixa de 30 € se non se supera a distancia a 300 km.
b. Distancia percorrida superior a 300 km.
    1. Se a distancia é superior a 300 km e inferior ou igual a 1.000 km.
    30 € + quilometraxe a unha tarifa de 0,20 €/km.

    2. Se a distancia for superior a 1.000 km.
    30 € + quilometraxe a unha tarifa de 0,20 €/km. Para distancias
    entre 300 e 1.000 km. E 0,15 €/km para distancias superiores a
    1.000 km.
 */

import java.util.Scanner;

public class Main {
    static void main() {
        Scanner teclado = new Scanner(System.in);

        System.out.println("Indique el número de km recorridos: ");
        int km = teclado.nextInt();
        int precio;
        precio = 30;

        if (km < 0)
            System.out.println("Este valor no es posible");
        else
            if (km < 300) // No serían obligatorios los primeros if, no hay km negativos, y los primeros 300km son fijos.
                System.out.printf("La cantidad que debe pagar es de: %d€", precio);
            else
                if (km > 300 && km <= 1000)
                    System.out.printf("La cantidad que debe pagar es de: %.2f€", precio + (km - 300) * 0.2);
                else
                    if (km > 1000)
                        System.out.printf("La cantidad que debe pagar es de: %.2f€", precio + (700 * 0.2) + (km - 1000)* 0.15);
    }
}
