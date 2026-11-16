package org.example;


public class Main {
    static void main() {

        Persoa p = new Persoa("333322223J");
        Persoa cliente = new Persoa("333322223J", "Pepe");

        System.out.println("O dni da 1º persoa é: "+ p.getDni());
        System.out.println("O dni da 1º persoa é: "+ cliente.getDni());
    }
}
