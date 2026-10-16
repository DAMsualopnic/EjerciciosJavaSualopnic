package org.example;


import java.util.Scanner;

public class Main {
    static void main() {

        Scanner in = new Scanner(System.in);

        int temporal,cont;

        System.out.print("Dígame el número desde: ");
        int desde = in.nextInt();

        System.out.print("Dígame el número hasta: ");
        int hasta = in.nextInt();



        // Ordenarlos
        if (desde > hasta){
            temporal = desde;
            desde = hasta;
            hasta = temporal;
        }

        if (desde %2 == 0)
            desde++;

        cont =0;
        for (int i = desde;i <= hasta && cont < 10; i+=2){
                System.out.println(i+ " ^ 3 = "+ Math.pow(i,3));
                cont++;
        }
    }


}
