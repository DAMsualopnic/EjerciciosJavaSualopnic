package org.example;

import java.util.Scanner;

//Pide dos operandos y opera con ellos

public class Main {
    static void main() {
        Scanner teclado = new Scanner(System.in);
        double operando1,operando2,resultado;

        System.out.print("Dame un valor para el primer operando: ");
        operando1 = teclado.nextDouble();

        System.out.print("Dame un valor para el segundo operando: ");
        operando2 = teclado.nextDouble();

        //Calcular la suma
        resultado = operando1 + operando2;
        System.out.printf("\nLa suma de %.2f más %.2f es: %.2f", operando1, operando2, resultado);

        //Calcular la resta
        resultado = operando1 - operando2;
        System.out.printf("\nLa resta de %.2f menos %.2f es: %.2f",operando1, operando2, resultado);

        //Calcular la multiplicación
        resultado = operando1 * operando2;
        System.out.printf("\nLa multiplicación de %.2f por %.2f es: %.2f",operando1, operando2, resultado);

        //Calcular la división
        if (operando2 != 0) {
            resultado = operando1 / operando2;
            System.out.printf("\nLa división de %.2f entre %.2f es: %.2f", operando1, operando2, resultado);
        }
        else {
            System.out.println("\nNo se puede dividir por 0");
        }

        System.out.print("\n\nProceso terminado");
    }
}
