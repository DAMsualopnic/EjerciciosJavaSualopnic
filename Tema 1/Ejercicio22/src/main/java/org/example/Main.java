package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.


//22) Crea un proxecto que calcule a área e o perímetro dun cadrado de 0,5 cm de lado.
public class Main {
    static void main() {
        double lado=2;
        double perimetro;
        double area;

        perimetro= lado*4;
        area=lado*lado;

        System.out.println("El perimetro del cuadrado es: "+ perimetro);
        System.out.println("El área del cuadrado es: "+ area);
    }
}
