package org.example;


import java.util.Scanner;

public class Main {
    static void main() {
        Scanner in = new Scanner(System.in);

        System.out.print("\nDame la base: ");
        int base = in.nextInt();

        System.out.print("Dame el exponente: ");
        int expo = in.nextInt();

        System.out.println("El resultado es: "+ potencia(base,expo));
    }

    public static int potencia(int b,int e){
        int resultado = 1;
        for (int i=0;i < e;i++){
            resultado *= b;
        }
        return (resultado);
    }
}
