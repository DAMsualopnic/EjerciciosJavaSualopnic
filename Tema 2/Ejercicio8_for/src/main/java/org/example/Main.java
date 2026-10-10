package org.example;


import java.util.Scanner;

public class Main {
    static void main() {
        Scanner in = new Scanner(System.in);

        int desde,hasta;
        double F;
        double C,R,K;

        System.out.print("Teclee el valor desde: ");
        desde = in.nextInt();

        System.out.print("Teclee el valor hasta: ");
        hasta = in.nextInt();

        while (desde > hasta){
            System.out.println("ERROR!!");

            System.out.print("Vuelva a teclear el valor desde: ");
            desde = in.nextInt();

            System.out.print("Vuelva a teclear el valor hasta: ");
            hasta = in.nextInt();
        }

        for (int i=desde; i <= hasta; i++){
            F=i;
            C=5*(F-32)/9;
            R= F + 459.67;
            K= C + 273.15;
            System.out.printf("\n\n%d grados Fahrenheit equivalen a: ",i);
            System.out.printf("\n\t%f grados Celsius",C);
            System.out.printf("\n\t%f grados Rankine",R);
            System.out.printf("\n\t%f grados Kelvin",K);
        }
    }
}
