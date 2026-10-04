package org.example;


import java.util.Scanner;

public class Main {
    static void main() {
        Scanner in = new Scanner(System.in);
        int numeroDeVeces, sum=0, i, nota;

        System.out.println("De cuántos números quieres calcular la media? ");
        numeroDeVeces = in.nextInt(); //Buscar porqué se pone así

        while (numeroDeVeces > 0){

            sum=0;
            for (i = 0; i < numeroDeVeces; i++){
                System.out.printf("Dame el número %d: ", i+1);
                nota = in.nextInt();
                sum = sum + nota;
            }
            System.out.println((double)sum/numeroDeVeces);

            System.out.print("De cuántos números quieres calcular la media? ");
            numeroDeVeces = in.nextInt();

        }
    }
}
