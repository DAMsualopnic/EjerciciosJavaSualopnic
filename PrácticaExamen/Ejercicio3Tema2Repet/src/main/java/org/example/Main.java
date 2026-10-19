package org.example;

import java.util.Scanner;

/*
3) Igual que o anterior, pero en lugar de ser cinco números, a aplicación debe
preguntar antes cantos números se van a introducir.
 */
public class Main {
    static void main() {
        Scanner in = new Scanner(System.in);

        System.out.print("Cuántos números desea introducir para calcular su media? ");
        int n = in.nextInt();

        int suma=0;

        for (int i=1; i<=n; i++){
            System.out.print("Número "+i+" :");
            int numeros = in.nextInt();
            suma +=numeros;
        }
        System.out.printf("La media de estos números es: %.2f",(double)suma/n);

    }
}
