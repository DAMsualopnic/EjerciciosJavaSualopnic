package org.example;

public class UtilidadesStrings {
    /**
     *
     * @param frase
     * @return
     */
    public static int lonxitude(String frase){

        int resultado;

        if (frase==null)
            resultado=0;
        else
            resultado= frase.length();

        return resultado;
    }

    public static int contar(String frase, char caracter){
        int resultado=0;
        if (frase==null)
            resultado=0;
        else {
            frase = frase.toLowerCase();
            if (caracter >= 'A' && caracter <= 'Z')
                caracter +=32;

            for (int i=0; i<frase.length();i++){
                if (frase.charAt(i)==caracter)
                    resultado++;

            }
        }
        return resultado;
    }


    public static int contarVocales(String texto){
        int contador =0;
        if (texto == null)
            contador =0;
        else {
            texto = texto.toLowerCase();
            for (int i = 0; i <= texto.length(); i++){
                if (texto.charAt(i)=='a' || texto.charAt(i)=='e' || texto.charAt(i)=='i' || texto.charAt(i)=='o' || texto.charAt(i)=='u')
                    contador++;
            }
        }
        return contador;
    }




}
