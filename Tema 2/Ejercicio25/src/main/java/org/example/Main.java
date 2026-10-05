package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
/*
25) Dado o seguinte algoritmo, indicar cantas veces se executa a acción e con que
valor termina a variable contador.
contador = 0
mentras contador < 10
contador = contador + 1
se contador = 10
Acción
Fin se
Fin mentras

 */
public class Main {
    static void main() {
        byte contador = 0;
        while (contador<10){
            contador ++;
            if (contador==10)
                System.out.println("Hice la acción");
        }
        System.out.println("El contador vale: "+ contador);
    }
}
