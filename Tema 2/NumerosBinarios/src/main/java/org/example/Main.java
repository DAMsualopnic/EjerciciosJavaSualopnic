package org.example;


import java.util.Scanner;

public class Main {
    static void main() {
        Scanner in = new Scanner(System.in);
        System.out.println("Cuántos bits tienes? ");
        int bits = in.nextInt();

        while (bits != 0) {
            System.out.println("El número de bits que puedes representar con " + bits + " bits es: " + Math.pow(2, bits));

            System.out.println("Cuántos bits tienes? (0 para terminar): ");
            bits = in.nextInt();
        }
        if (bits == 0)
            System.out.println("Proceso terminado");
    }
}
