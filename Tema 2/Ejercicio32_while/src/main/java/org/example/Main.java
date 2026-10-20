package org.example;


import java.util.Scanner;

public class Main {
    static void main() {
        Scanner in = new Scanner(System.in);

        String binario="";

        System.out.print("Dígame un número para pasarlo a decimal: ");
        int n = in.nextInt();
        int resto;

        while (n > 0){
            resto = n%2;
            binario += resto;
            n = n/2;
        }
        System.out.println("El número en binario es: " + binario);

    }
}
