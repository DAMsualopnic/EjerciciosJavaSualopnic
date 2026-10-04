package org.example;

import java.util.Scanner;

/*4) Escribe unha aplicación que imprima o valor máis pequeno de catro números enteiros que
se solicitan por teclado. */
public class Main {
    static void main() {
        Scanner teclado = new Scanner(System.in);
        int numero1,numero2,numero3,numero4;

        System.out.print("Escribe el primero número: ");
        numero1 = teclado.nextInt();

        System.out.print("Escribe el segundo número: ");
        numero2 = teclado.nextInt();

        System.out.print("Escribe el tercer número: ");
        numero3 = teclado.nextInt();

        System.out.print("Escribe el cuarto número: ");
        numero4 = teclado.nextInt();

        if (numero1 >= numero2 && numero1 >= numero3 && numero1 >= numero4)
            System.out.println("\nEste es el número más alto: "+ numero1);
        else
            if (numero2 >= numero1 && numero2 >= numero3 && numero2 >= numero4)
                System.out.println("\nEste es el número más alto: "+ numero2);
            else
                if (numero3 >= numero1 && numero3 >= numero2 && numero3 >= numero4)
                    System.out.println("\nEste es el número más alto: "+ numero3);
                else
                    System.out.println("\nEste es el número más alto: "+ numero4);
    }
}
