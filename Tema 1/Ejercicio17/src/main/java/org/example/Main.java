package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

/*
17) Da seguinte definición de variables
int n = 10, p = 4, q = 2;
double z;
Cales serán os valores de z e q despois de realizar as seguintes operacións
secuencialmente?
a) z = n / p;
b) z = ( double ) n/p;
c) z = ( double ) (n/p);
d) z += n;
e) q *= z;
f) z += 2;
 */
public class Main {
    static void main() {
        int n=10, p=4,q=2;
        double z;
        System.out.println(z=n /p);
        System.out.println(z=(double) n/p);
        System.out.println(z=(double) (n/p));
        System.out.println(z+=n); /* z = z + n (Son lo mismo)
        (Si no hicieramos ninuna operación antes daría un error al no tener un valor asignadoa Z) */
        System.out.println(q*=n); // q = q * n (Son lo mismo)
        System.out.println(z+=2); // z = z + 2 (Son lo mismo)
    }
}
