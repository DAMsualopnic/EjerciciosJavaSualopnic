package org.example;

import java.util.Scanner;

/*
8) Temos variables a, b, c e d, que conteñen os catro díxitos dun enteiro positivo N.
Queremos redondear N á centena máis próxima e mostrar a saída. Se a centena é 50,
redondeamos cara arriba. Por exemplo, se N=2.362 (a=2, b=3, c=6 e d=2), o resultado
redondeado será 2.400. Se N=2.342, o resultado será 2.300. Se N=2.962, a saída será
3.000. Deseña unha aplicación que realice esta tarefa.
 */

public class Main {
    static void main() {
        Scanner teclado = new Scanner(System.in);

        System.out.print("Teclea un número de 4 cifras: ");
        int n = teclado.nextInt();

        if (n < 10000 && n > 999) {
            System.out.println(n);;

            int miles, centenas, decenas, unidades;
            miles = n /1000;
            centenas = (n / 100) % 10;
            decenas = (n / 10) % 10;
            unidades = n % 10;
            System.out.printf("Miles: %d  Centenas: %d  Decenas: %d  Unidades: %d \n", miles, centenas, decenas, unidades);

            // decenas = decenas * 10 + unidades;
            if (decenas >= 5)
                centenas ++;

            //b = (decenas > 50)? centenas++ : centenas;

            System.out.println(miles * 1000 + centenas * 100);
        }
        else
            System.out.println("El número no tiene 4 cifras");

    }
}
