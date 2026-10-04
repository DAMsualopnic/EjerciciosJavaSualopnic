package org.example;

import java.util.Scanner;



public class Main {
    static void main() {
        Scanner teclado = new Scanner(System.in);

        System.out.print("\n\nIndique el número del mes: ");
        int numeroMes = teclado.nextInt();
        String nombreMes = "";

        switch (numeroMes) {
            case 1:
                nombreMes = "Enero";
                break; //Si no ponemos break, ejecuta todos los nombreMes hasta abajo, en este ejercicio no nos sirve
            case 2:
                nombreMes = "Febrero";
                break;
            case 3:
                nombreMes = "Marzo";
                break;
            case 4:
                nombreMes = "Abril";
                break;
            case 5:
                nombreMes = "Mayo";
                break;
            case 6:
                nombreMes = "Junio";
                break;
            case 7:
                nombreMes = "Julio";
                break;
            case 8:
                nombreMes = "Agosto";
                break;
            case 9:
                nombreMes = "Septiembre";
                break;
            case 10:
                nombreMes = "Octubre";
                break;
            case 11:
                nombreMes = "Noviembre";
                break;
            case 12:
                nombreMes = "Diciembre";
                break;
            default:
                System.out.println("\n\nEse mes no existe");
        }

        switch (numeroMes) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println(nombreMes + " tiene 31 días");
                break;
            case 2:
                System.out.println(nombreMes + " tiene 28 días");
                break;
            default:
                System.out.println(nombreMes + " tiene 30 días");


        }

       /*
       switch (numeroMes){
            case 1 -> nombreMes = "Enero";
            case 2 -> nombreMes = "Febrero";

    }

        */
    }
}
