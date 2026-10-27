package org.example;


import java.util.Scanner;

public class Main {
    static void main() {
        Scanner in = new Scanner(System.in);

        System.out.print("Indique cuantos valores de Fibonacci desea calcular: ");
        int n = in.nextInt();

        int suma;
        int n1=0;
        int n2=1;

        for (int i=1;i<=n;i++){
            System.out.print(n1+" ");
            suma=n1+n2;
            n1=n2;
            n2=suma;
        }
    }
}
