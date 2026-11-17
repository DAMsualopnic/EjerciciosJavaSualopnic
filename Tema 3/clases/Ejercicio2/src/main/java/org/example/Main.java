package org.example;


public class Main {
    static void main() {

        Persoa p = new Persoa("333322276" +
                "J");
        Persoa cliente = new Persoa("333322223J", "Pepe");


        System.out.println("O dni da 1º persoa é: "+ p.getDni());
        System.out.println("O nome da 1º persoa é: "+ p.getNomeCompleto());

        p.setNomeCompleto("Pepe");
        System.out.println("O nome da 1º persoa cambiado é: "+ p.getNomeCompleto());

        System.out.println("O dni da 2º persoa é: "+ cliente.getDni());
        System.out.println("O nome da 2º persoa é: "+ cliente.getNomeCompleto());


    }
}
