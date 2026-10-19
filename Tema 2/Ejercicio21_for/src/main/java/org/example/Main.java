
package org.example;


import java.util.Scanner;

public class Main {
    static void main() {
        Scanner in = new Scanner(System.in);

        System.out.print("Número de filas: ");
        int filas = in.nextInt();
        int numeros= 1;
        for (int fila = 1; fila<=filas ;fila++){
                for (int col=1 ;col<=fila;col++){
                    System.out.printf("%4d ", numeros++);
                }
            System.out.println("");
        }
    }
}

