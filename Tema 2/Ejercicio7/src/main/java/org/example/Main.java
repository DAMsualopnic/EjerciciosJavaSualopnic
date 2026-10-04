package org.example;

import java.util.Scanner;

/*
) Escribe un programa que lea unha hora e os minutos como dous enteiros separados por un
espazo en formato de 24 horas e os mostre en notación de 12 horas. Por exemplo, dada a
seguinte entrada, m´strasde como debería responder a aplicación:
8 0 ->08:00 AM
10 25 ->10:25 AM
12 00 -> 12:00 PM
20 45 -> 8:45 PM
 */
public class Main {
    static void main() {
        int horas, minutos;

        Scanner teclado = new Scanner(System.in);

        System.out.print("Horas y minutos (separados): ");
        horas = teclado.nextInt();
        minutos = teclado.nextInt();

        if (horas > 23 || horas < 0 || minutos > 59 || minutos < 0)
            System.out.println("Esa hora no vale");
        else
            if (horas >= 12){
                if (horas > 12)
                    horas -= 12; // horas = horas - 12
                System.out.printf("%02d:%02d PM %n", horas, minutos);
            }
            else {
                if (horas == 0)
                    horas += 12;
                System.out.printf("%02d:%02d AM %n", horas, minutos);

            }
    }
}
