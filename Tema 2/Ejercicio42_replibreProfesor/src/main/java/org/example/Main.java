package org.example;


import java.util.Scanner;

public class Main {
    static void main() {
        Scanner in = new Scanner(System.in);

        String estado ="gracia";
        //La acción puede ser l(eve),
        char accion;

        do {

        System.out.print("Indique que ocurre");
        accion = in.nextLine().charAt(0);


           switch (accion) {
               case 'l':
                   if (estado.equals("gracia"))
                       estado = "leve";
                   break;
               case 'g':
                   estado = "grave";
                   break;
               case 'a':
                   if (estado.equals("leve")) ;
                   estado = "gracia";
                   break;
               case 'm':
                   break;
               default:
                   System.out.println("Opción erronea");
           }
           System.out.println("Alma en estado: " + estado);
       } while (accion != 'm');
       in.close();

       if (estado.equals("grave"))
           System.out.println();
    }
}
