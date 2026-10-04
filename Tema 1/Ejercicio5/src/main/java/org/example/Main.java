package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    static void main() {

        // Declaro las variables
       int a,b,t;
        //Le damos valores a las variables
       a=5;
       b=25;
       t=a;

        System.out.printf("El valor de a es: %d y el valor de b es: %d", a,b);

       //Intercambiamos valores
        a=b;
        b=t;

        System.out.printf("\nEl valor de a es: %d y el valor de b es: %d", a,b);

    }
}
