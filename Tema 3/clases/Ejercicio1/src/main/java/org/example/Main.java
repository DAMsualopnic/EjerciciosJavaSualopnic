package org.example;



public class Main {
    static void main() {
        String texto="Programando en Java";
        char letra='P';

        System.out.println("O texto é: " +texto);
        System.out.println("Lonxitude: "+ UtilidadesStrings.lonxitude(texto));
        System.out.println("A letra "+ letra+ " aparece "+ UtilidadesStrings.contar(texto,letra)+ " veces");
        System.out.println("En total hai "+ UtilidadesStrings.contarVocales(texto)+" vogais");
    }
}
