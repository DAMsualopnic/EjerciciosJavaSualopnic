package org.example;


import java.util.Scanner;

public class Main {
    static void main() {
        Scanner in = new Scanner(System.in);
        System.out.print("Indique el día que nació: ");
        int dia = in.nextInt();
        while (dia <1 || dia > 31){
            System.out.print("ERROR!! Ese día no es válido.\nVuelve a darme otro día: ");
            dia = in.nextInt();
        }
        System.out.print("Indique el mes en el que nació: ");
        int mes = in.nextInt();
        while (mes < 1 || dia > 12){
            System.out.print("ERROR!! Ese mes no es válido.\nVuelve a darme otro mes: ");
            mes = in.nextInt();
        }
        System.out.print("Indique el año en el que nació: ");
        int ano = in.nextInt();
        while (ano < 1600 || ano > 2026){
            System.out.print("ERROR!! Ese año no es válido.\nVuelve a darme otro año: ");
            ano = in.nextInt();
        }

        int a,b,c,d,e,f;
        double g,h,i,diaSemana;
        a = (12 - mes) / 10; // División enteira
        b= ano - a;
        c = mes + (12 * a);
        d = b / 100;
        e = d / 4;
        f = 2 - d + e;
        g = Math.floor(365.25 * b);
        h = Math.floor(30.6001 * (c + 1));
        i = f + g + h + dia + 5;
        diaSemana = i % 7;

        int dia_semana = (int) diaSemana; //Igualamos el double diaSemana a otro valor entero, ya que switch solo trabaja con número enteros

        switch (dia_semana){
            case 0 -> System.out.println("Usted nació un Sábado");
            case 1 -> System.out.println("Usted nació un Domingo");
            case 2 -> System.out.println("Usted nació un Lunes");
            case 3 -> System.out.println("Usted nació un Martes");
            case 4 -> System.out.println("Usted nació un Miércoles");
            case 5 -> System.out.println("Usted nació un Jueves");
            case 6 -> System.out.println("Usted nació un Viernes");
        }


        // 0 – sábado, 1 – domingo, 2 – luns, 3 – martes, 4 – mércores, 5 – xoves, 6 - venres

    }
}
