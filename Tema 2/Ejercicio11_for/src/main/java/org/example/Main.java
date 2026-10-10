package org.example;

import java.util.Scanner;

/*
Solicitar números al usuario hasta que se introduzca el 0, en ese momento pararlo
y decir cuál es el mayor, el menor y la media.
 */
public class Main {
    static void main() {
        Scanner in = new Scanner(System.in);

        int mayor,menor,suma,veces;
        suma = 0;
        veces = 0;

        System.out.print("Dame un número (0 para terminar):");
        int numeros = in.nextInt();

        mayor = numeros;
        menor = numeros;

        while (numeros != 0){
            veces++;
            suma += numeros;

            if (numeros > mayor)
                mayor = numeros;

            if (numeros < menor)
                menor = numeros;

            System.out.print("Dame un número (0 para terminar):");
            numeros = in.nextInt();
        }
        System.out.println("Media: "+ (double)suma/(double) veces);
        System.out.println("Mayor: "+ mayor);
        System.out.println("Menor: "+ menor);


    }
}
