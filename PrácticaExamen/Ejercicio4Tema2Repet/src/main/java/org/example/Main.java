package org.example;

// 4) Sumar os números pares entre dous dados polo usuario.

import java.util.Scanner;

public class Main {
    static void main() {
        Scanner in = new Scanner(System.in);

        System.out.print("Dime un número desde: ");
        int desde = in.nextInt();

        System.out.print("Dime un número hasta: ");
        int hasta = in.nextInt();

        int suma=0;

        for (int i=desde; i<=hasta;i++){
            if (i%2==0){
                suma+=i;
            }

        }
        System.out.println(suma);

    }
}
