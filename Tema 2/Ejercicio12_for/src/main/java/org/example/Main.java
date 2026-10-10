package org.example;


/*
12) Solicitar ao usuario un número comprendido entre 1 e 9 e mostrar a súa táboa
de multiplicar.
 */

import java.util.Scanner;

public class Main {
    static void main() {
        Scanner in = new Scanner(System.in);

        System.out.print("Teclée la tabla del número que desee: ");
        int numero = in.nextInt();
        int resultado = 0;

        System.out.print("Tabla del número "+ numero+"\n");
        int tabla=0;
        for (int i=tabla;i>=0 && i <=10;i++){
            resultado = numero*i;
            System.out.println(" "+numero+ " X " + i+" = " + resultado);
        }


    }
}
