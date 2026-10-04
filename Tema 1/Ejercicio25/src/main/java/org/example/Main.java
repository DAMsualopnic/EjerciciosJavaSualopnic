package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.

/*
25) Usando operadores aritméticos, escribe as seguintes expresións matemáticas nun
formato que se poida usar nunha aplicación Java:
 */

public class Main {
    static void main() {
        double m=1,n=2,p=3,q=4,a=5,b=6,x=7,y=8;

        System.out.println("1. "+ (m/n*(p+q)));
        System.out.println("2. "+ (m/n+1));
        System.out.println("3. "+ ((m+1)/n));
        System.out.println("4. "+ (m+n/1));

        //Forma 1
        System.out.println("5. "+ (((x+y)*(x+y))*(a-b)));

        /*Forma 2
        double resultado;
        resultado= (x+y)*(x+y)*(a-b);
        System.out.println("5. "+ resultado);
        */

        //Forma 3
         double resultado;
         resultado= (Math.pow(x+y,2))*(a-b); //En Math.pow, el primero es la base y el segundo es a lo que lo quieres elevar

        System.out.println("5. "+ resultado);
    }
}
