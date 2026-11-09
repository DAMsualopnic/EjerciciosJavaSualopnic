package org.example;


import java.util.Scanner;

public class Main {
    static void main() {
        Scanner in = new Scanner(System.in);

        int opcion,suma;

        do {
            System.out.println("*********************");
            System.out.println("\tAritmética Yahoo");
            System.out.println("*********************");
            System.out.println("Menú de opción:");
            System.out.println("1. Operación siguiente");
            System.out.println("2. Operación sumar");
            System.out.println("3. Salir\n");
            System.out.print("Elige una opción: ");
            opcion = in.nextInt();
            System.out.println("");

            switch (opcion){
                case 1 ->{
                    System.out.println("\nOperación siguiente");
                    System.out.println("Introduce un número (-1 para desconocido, 5 para muchos):");
                    int siguiente = in.nextInt();
                    if (siguiente < -1 || siguiente > 5){
                        System.out.println("Números imposibles");
                        System.out.println();
                    }
                    if (siguiente >=0 && siguiente <=3){
                        siguiente++;
                        System.out.println("Resultado: "+siguiente);
                        System.out.println();
                    }else
                        if (siguiente == -1){
                            System.out.println("Resultado: desconocido");
                            System.out.println();
                        }else
                            if (siguiente == 4 || siguiente == 5){
                                System.out.println("Resultado: muchos");
                                System.out.println();
                            }
                }
                case 2 ->{
                    System.out.println("\nOperación sumar");
                    System.out.println("Introduce el primer número (-1 para desconocidos, 5 para muchos): ");
                    int n1 = in.nextInt();
                    System.out.println("Introduce el segundo número (-1 para desconocidos, 5 para muchos): ");
                    int n2 = in.nextInt();
                    suma = n1+n2;
                    if (suma >=0 && suma <=4 && n1 >=0 && n1 <=4 && n2 >=0 && n2 <=4){
                        System.out.println("Resultado: "+suma);
                        System.out.println();
                    }else
                        if (suma <=-1 || n1 <=-1 || n2 <=-1){
                            System.out.println("Resultado: desconocido");
                            System.out.println();
                        } else
                            if (suma >=5 || n1 >=5 || n2 >=5){
                            System.out.println("Resultado: muchos");
                            System.out.println();
                            }
                }
                case 3 ->{
                    System.out.println("Saliendo...");
                }
            }
        }while (opcion!=3);
    }
}
