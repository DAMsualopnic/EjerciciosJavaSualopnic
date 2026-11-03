package org.example;

/*
4) Facer un programa que determine se unha letra é unha vogal, consoante, número
ou símbolo (facer un método para comprobar cada un). En main pedirase una frase
e dirase de que tipo é cada un dos caracteres que a componen.
 */

public class Main {



    public static boolean eConsonante(char caracter){
        boolean resultado;
        if (caracter >='A'  && caracter <='Z')
            resultado = true;
            else
                resultado = false;

        return resultado;

    }

    public static boolean eVocal(char caracter){
        boolean resultado;
        if (caracter == 'a' || caracter =='e' || caracter =='i' || caracter =='o' || caracter =='u')
        resultado = true;
        else resultado = false;

        return resultado;
    }



    static void main() {
    }
}

