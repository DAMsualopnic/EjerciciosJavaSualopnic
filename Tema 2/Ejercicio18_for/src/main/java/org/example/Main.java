package org.example;


import java.util.Scanner;

public class Main {
    static void main() {

        Scanner in = new Scanner(System.in);

        System.out.print("Dígame el número desde: ");
        int desde = in.nextInt();

        System.out.print("Dígame el número hasta: ");
        int hasta = in.nextInt();

        for (int i = desde;i <= hasta; i++){
            if (i%2 != 0){
                System.out.println(i+ " ^ 3 = "+ Math.pow(i,3));
            }
        }
    }
}
