package org.example;


import java.util.Scanner;

public class Main {
    static void main() {
        int opcion;
        do {
            opcion = menu();
            switch (opcion) {
                case 1 -> {
                    System.out.println("Cuadrado\n");
                    System.out.println("Hola");
                }
                case 2 -> System.out.println("Rectángulo\n");
                case 3 -> System.out.println("Triángulo\n");
                case 4 -> System.out.println("Círculo\n");
                case 0 -> System.out.println("Saliendo del menú");
                default -> System.out.println("Este número es inválido\n");
            }
        }while (opcion!=0);
    }

    public static int menu(){
        Scanner in = new Scanner(System.in);

        System.out.println("\tMenú");
        System.out.println("***************\n");
        System.out.println("1. Cuadrado.");
        System.out.println("2. Rectángulo.");
        System.out.println("3. Triángulo.");
        System.out.println("4. Círculo.");
        System.out.println("0. Salir.\n");

        System.out.print("Escoga una opción: ");
        int op = in.nextInt();

        return  op;
    }
}
