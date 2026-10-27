package org.example;


import java.util.Scanner;

public class Main {
    static void main() {
        Scanner in = new Scanner(System.in);

        int menu;
        int numero,numero2,suma;

        do {
            System.out.println("************************");
            System.out.println("\tAritmética Yahoo");
            System.out.println("************************");
            System.out.println("Menú de opciones:");
            System.out.println("1. Operación siguiente");
            System.out.println("2. Operación sumar");
            System.out.println("3. Salir");
            System.out.print("Elige una opción: ");
            menu = in.nextInt();
            System.out.println();


            switch (menu){
                case 1 -> {
                    System.out.println("\nOperación siguiente");
                    System.out.println("Introduce un número(-1 para desconocido, 5 para muchos):");
                    numero = in.nextInt();

                    if (numero>=0 && numero<=3){
                        numero++;
                        System.out.println("Resultado: "+numero+"\n\n");
                    } else
                        if (numero == -1)
                            System.out.println("Resultado: Desconocido\n\n");
                        else
                            if (numero==4 || numero==5)
                                System.out.println("Resultado: Muchos\n\n");
                            else
                                System.out.println();
                }
                case 2 -> {
                    System.out.println("\nOperación sumar");
                    System.out.println("Introduce el primer número(-1 para desconocidos,5 para muchos):");
                    numero = in.nextInt();

                    System.out.println("Introduce el segundo número(-1 para desconocidos,5 para muchos):");
                    numero2 = in.nextInt();

                    suma = numero+numero2;
                    if (suma>=0 && suma<=4 && numero >=0 && numero<=4 && numero2 >=0 && numero2<=4){
                        System.out.println("Resultado: "+suma+" \n\n");
                    } else
                        if (suma <= -1 || numero == -1 || numero2 == -1)
                            System.out.println("Resultado: Desconocido\n\n");
                        else
                            if (suma >=5 || numero == 5 || numero2 == 5)
                                System.out.println("Resultado: Muchos\n\n");
                }
                case 3 -> System.out.println("\nSaliendo...");
            }

        } while (menu != 3);
    }
}
