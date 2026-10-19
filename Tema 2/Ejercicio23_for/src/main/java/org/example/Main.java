package org.example;

import java.util.Scanner;

/*
23) Escribir unha aplicación que multiplique dous números, pero sen utilizar o
operador de multiplicación.
 */
public class Main {
    static void main() {
        Scanner in = new Scanner(System.in);

        System.out.print("Primer número: ");
        int primero = in.nextInt();

        System.out.print("Segundo número: ");
        int segundo = in.nextInt();

        int suma=0;
        int veces = 1;
        int temporal;

        if (segundo > primero){
            temporal = primero;
            primero = segundo;
            segundo = temporal;
        }
        for (int i=veces; i<=segundo;i++){
            suma +=primero;
            System.out.println(suma); //Tengo puesto aquí el sout, para que se vea que se hacen las menores sumas posibles
        }
    }
}
