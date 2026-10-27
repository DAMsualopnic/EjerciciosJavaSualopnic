package org.example;

/*
40) Aceptar números por teclado ata que se introduza o cero e indicar a súa
separación media. Suponse que o primeiro número da secuencia é cero e que o
usuario non necesita escribilo. Por exemplo, se o usuario teclea 4 8 10, dado que
a separación entre 4 e 8 é de catro cifras e a separación entre 8 e 10 é dúas,
indicarase que a separación media é de 3. Admitiranse secuencias como a
seguinte: 4 8 -10 15.
 */

import java.util.Scanner;

public class Main {
    static void main() {
        Scanner in = new Scanner(System.in);

        System.out.print("Número: ");
        int n = in.nextInt();

        int temporal=0,suma = 0,cont=0;

        while (n !=0){
            suma += Math.abs(n-temporal);
            temporal=n;
            System.out.print("Número: ");
            n = in.nextInt();
            cont++;
        }
        System.out.println("Separación media: "+ (double)suma/cont);

    }
}
