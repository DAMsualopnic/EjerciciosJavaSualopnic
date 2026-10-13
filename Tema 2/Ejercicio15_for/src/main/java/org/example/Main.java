package org.example;


import java.util.Scanner;

public class Main {
    static void main() {
        Scanner in = new Scanner(System.in);

        System.out.print("Indique un número para calcular sus potencias: ");
        int n = in.nextInt();

        System.out.print("Indique a potencia desea elevar ese número: ");
        int pot = in.nextInt();

        for (int i=1; i <= pot; i++){
            System.out.println(n+ " ^ "+i+ " = "+Math.pow(n,i));
        }
    }
}

