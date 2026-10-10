package org.example;

import java.util.Scanner;

/*
5) Ao facer unha compra nunha tenda, obtemos os seguintes descontos:
a. Se compramos máis de 100 unidades do mesmo artigo, o desconto é do 40 %.
b. Se compramos entre 25 e 100, o desconto é do 20 %.
c. Se compramos entre 10 e 24, o desconto é do 10 %.
d. Non hai desconto por compras inferiores a 10 unidades.
Calcula o prezo final do artigo, tendo en conta que o prezo pode ter decimais
 */
public class Main {
    static void main() {
        Scanner in = new Scanner(System.in);
        int unidades;
        double precio;

        System.out.print("Indique el número de unidades compradas: ");
        unidades = in.nextInt();

        System.out.print("Indique el precio del producto: ");
        precio = in.nextDouble();

        while (unidades < 0){
            System.out.print("ERROR!!");
            System.out.print("\nVuelva a introducir las unidades: ");
            unidades = in.nextInt();

            System.out.print("Vuelva a introducir el precio: ");
            precio = in.nextDouble();
        }

        if (unidades > 100) {
            System.out.print("\nSu descuento es del 40%");
            System.out.printf("\nSu descuento sería de: %.2f€", (precio * unidades) * 0.6);
            System.out.printf("\nEl precio le quedaría en: %.2f€", precio - precio * 0.6);
        }
        else
            if (unidades > 25) {
               System.out.print("\nSu descuento es del 20%");
                System.out.printf("\nSu descuento sería de: %.2f€", precio * 0.8);
               System.out.printf("\nEl precio le quedaría en: %.2f€", precio - precio * 0.8);
             }
            else
                 if (unidades > 10) {
                   System.out.print("\nSu descuento es del 10%");
                    System.out.printf("\nSu descuento sería de: %.2f€", precio * 0.9);
                    System.out.printf("\nEl precio le quedaría en: %.2f€", precio - precio * 0.9);
                 }
                 else
                     if (unidades > 0){
                         System.out.print("\nUsted no tiene descuento");
                         System.out.printf("\nEl precio le quedaría en: %.2f€", precio);
                     }
    }
}