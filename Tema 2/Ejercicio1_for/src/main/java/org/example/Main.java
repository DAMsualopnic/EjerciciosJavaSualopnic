package org.example;



public class Main {
    static void main() {

        int suma = 0; //Sumador de los números del 1 al 100

        /*
        for (int i=1; i <= 100; i++){
            suma = suma + i; // Hay que ponerle valor 0 a suma
        }
        System.out.println("La suma total es: "+suma);
*/
        int cont=1;
        while(cont <=100){
            suma = suma + cont;
            cont++;
        }

    }
}
