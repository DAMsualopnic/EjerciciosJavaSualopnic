package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
/*23) Supondo que ingresamos 5.000 € nun banco que nos paga un 6 % de xuros anuais,
calcula canto diñeiro teremos despois dun ano.*/
public class Main {
    static void main() {
        double importe=5000;

        importe=importe * 1.06; //Podríamos haces también -> importe = importe + importe * 0.06 (es lo mismo)

        System.out.println("El valor del importe es: "+importe);
    }
}
