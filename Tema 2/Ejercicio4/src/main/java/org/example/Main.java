package org.example;

/*
5) Ao facer unha compra nunha tenda, obtemos os seguintes descontos:
a. Se compramos máis de 100 unidades do mesmo artigo, o desconto é do 40 %.
b. Se compramos entre 25 e 100, o desconto é do 20 %.
c. Se compramos entre 10 e 24, o desconto é do 10 %.
d. Non hai desconto por compras inferiores a 10 unidades.

Calcula o prezo final do artigo, tendo en conta que o prezo pode ter decimais.

 */

import java.util.Scanner;

public class Main {
    static void main() {
        int unidades;
        double precio, descuento;

        Scanner teclado = new Scanner(System.in);

        System.out.print("Indica el número de unidades: ");
        unidades = teclado.nextInt();
        System.out.print("Indica el precio del artículo: ");
        precio = teclado.nextDouble();

        if (unidades > 100)
            descuento = 0.6;
        else if (unidades > 25)
            descuento = 0.8;
        else if (unidades > 10)
            descuento = 0.9;
        else descuento = 1;

        System.out.printf("\n\nPrecio sin descuento: %.2f" , precio);
        System.out.printf("\n\nDescuento: %.2f" , (1-descuento)*100);
        System.out.printf("\n\nPrecio unitario con descuento: %.2f" , precio * descuento);
        System.out.printf("\n\nPrecio total con descuento: %.2f" , precio * descuento * unidades);

        System.out.print("Calculo del descuento terminado");
    }
}
