package org.example;

/*
1) Escribir un método que pase un número binario a decimal. Comprobar en main
que o número dado é realmente binario
 */

import java.util.Scanner;

public class Main {
    static void main() {
        

    }
        private static void Scanner sc=new Scanner(System.in);

        public static void main(String[]args){
            boolean eBinario;
            int binario,decimal;

            do {
                System.out.print("Introduce un número binario: ");
                binario = sc.nextInt();
            } while (!comprobarBinario(binario));
            decimal = calcularDecimal(binario);
            System.out.printf("%nBinario: %d, Decimal: %d",binario,decimal);
        }






    public static int calcularDecimal (int binario){
        int decimal=0, exponente=0;
        int digito;

        while (binario > 0){
            digito = binario/10;
            decimal = decimal + digito * (int)Math.pow(2,exponente);
            binario=binario/10;
            exponente ++;

        }
        return decimal;
    }

    public static boolean comprobarBinario (int num){
            int digito;
            boolean eBinario = true;
            while (num>0){
                digito = num%10;
                if (digito!=0 && digito!=1){
                    eBinario=false;
                }
                num /=10;
            }
            return eBinario;
    }
}
