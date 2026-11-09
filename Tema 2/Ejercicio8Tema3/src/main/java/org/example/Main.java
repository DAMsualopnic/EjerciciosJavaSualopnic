package org.example;


import java.util.Scanner;

public class Main {

    private static boolean eBaixo(double altura, boolean eHome){
        return (altura <1.6 && eHome)
                ||
                (altura <1.5 && !eHome);
    }

    private static boolean eAlto(double altura, boolean eHome){
        return (altura >1.75 && eHome)
                ||
                (altura >1.65 && eHome);
    }

    private static String clasificaAltura(double altura, boolean eHome){
        String clasificacion;
        if (eBaixo(altura, eHome))
            clasificacion="Baixo/a";
        else
            if (eAlto(altura, eHome))
                clasificacion="Alto/a";
            else
                clasificacion ="Normal";
            return clasificacion;
    }
    public static void main(String [] args){
        Scanner in = new Scanner(System.in);
        double altura;
        String sexo;
        boolean erro;

        System.out.print("Altura");
        altura = in.nextDouble();

        do {
            System.out.print("(H)ome/(M)uller:");
            sexo = in.next().toLowerCase();
            erro = sexo.length() !=1 ||
                    (sexo.charAt(0) !='h' && sexo.charAt(0) != 'm');
            if (erro){
                System.out.println("Entrada errónea");
                System.out.print("(H)ome/(M)uller: ");
            }
        }while (erro);

        System.out.println(clasificaAltura(altura, sexo.charAt(0)=='h'));
        System.out.print("\n\nIndique altura: ");
        altura = in.nextDouble();
    }

}
