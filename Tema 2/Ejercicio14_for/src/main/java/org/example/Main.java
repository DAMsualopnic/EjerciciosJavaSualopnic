package org.example;


import java.util.Scanner;

public class Main {
    static void main() {
        Scanner in = new Scanner(System.in);

        System.out.print("Dame un número n: ");
        int n = in.nextInt();
        double suma = 0;
        long producto;

        for (int i=1;i <= n; i++){
            producto = 1;
            for (int j=n;j >=1; j--){
                producto *=j;
            }
            suma +=1.0/i + producto;

        }
        System.out.println(suma);

    }
}
