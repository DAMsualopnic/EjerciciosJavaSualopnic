package org.example;


import java.util.Scanner;

/*
27) Un número primo é un número enteiro que non ten máis divisores que el mesmo
e a unidade. Por exemplo, 5 é primo xa que só ten como divisores o 1 e o 5. 24
non é primo porque ten diferentes divisores ademais de 1 e 24.
Escribir un programa que determine se un número enteiro proporcionado polo
usuario é primo ou non.
Indique o número de divisións que se fixeron para conseguir o resultado.

 */
public class Main {
    static void main() {
        Scanner in = new Scanner(System.in);
        System.out.print("Dígame un número: ");
        int n = in.nextInt();
        int divisiones=0;
        int resto=0, i=2;
        boolean si = true;

        while (si && i < n){
            resto = n % i;
            if (resto ==0){
                si = false;
            }
            i++;
            divisiones++;
        }
        if (resto ==0) {
            System.out.println("El número " + n + " no es primo");
            System.out.println("Número de divisiones: "+divisiones);
        }
        else {
            System.out.println("El número " + n + " es primo");
            System.out.println("Número de divisiones: "+divisiones);
        }



    }
}

/*
        for (int i=2; i<n;i++){
            resto=n%i;
            divisiones++;
            if (resto==0){
                System.out.println("El número "+n+" no es primo");
                System.out.println("Número de divisiones: "+ divisiones);
            }
        }
 */
