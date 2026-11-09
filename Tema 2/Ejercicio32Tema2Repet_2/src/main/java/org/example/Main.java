package org.example;


import java.util.Scanner;

public class Main {
    static void main() {
        Scanner in = new Scanner(System.in);

        System.out.print("Número: ");
        int numero = in.nextInt();

        String binario ="";
        int resto;

        while (numero>0){
            resto = numero%2;
            binario = resto + binario;
            numero /=2;
        }
        System.out.println(binario);
    }
}
