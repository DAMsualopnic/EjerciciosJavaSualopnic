package org.example;


public class Main {
    static void main() {
        Conta conta_1 = new Conta("Nico");
        Conta conta_2 = new Conta("Luis",300);


        conta_1.ingresar(300);
        conta_2.ingresar(400);


        conta_1.retirar(500);
        conta_2.retirar(100);

        System.out.println(conta_1.getNomeConta());
        System.out.println(conta_2.getNomeConta());
        System.out.println(conta_1);
        System.out.println(conta_2);
        conta_1.mostrarInfo();
        conta_2.mostrarInfo();

    }
}
