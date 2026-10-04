package org.example;

import java.util.Scanner;

/*
14) Un determinado fabricante de pezas de automóbiles descubriu defectos nalgúns dos seus
produtos, concretamente aqueles con números de serie dentro dos intervalos de 14.681 a
15.681, 70.001 a 79.999 e 88.888 a 111.111. A empresa notificou á división de relacións
co consumidor e gustaríalle usar un programa que poida ler o número de serie e
determinar se é defectuoso.

 */
public class Main {
    static void main() {
        Scanner in = new Scanner(System.in);

        System.out.print("Indique el número de serie: ");
        int numeroSerie = in.nextInt();

        if (numeroSerie >= 14681 && numeroSerie <= 15681 || numeroSerie >= 70001 && numeroSerie <= 79999 || numeroSerie >= 88888 && numeroSerie <= 111111)
            System.out.printf("La pieza con el número de serie %d es defectuosa", numeroSerie);
        else
            System.out.printf("La pieza con el número de serie %d está en buen estado", numeroSerie);

        }

    }
