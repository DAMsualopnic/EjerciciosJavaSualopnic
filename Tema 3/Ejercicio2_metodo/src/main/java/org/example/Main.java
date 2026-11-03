package org.example;

/*
2) Escribe un método que pida a lonxitude dos tres lados dun triángulo e indique se é
equilátero (tres lados iguais), isósceles (dous lados iguais) ou escaleno (os tres
lados distintos).
Pode ocorrer que as lonxitudes dos lados non formen un triángulo, polo que o
método debería detectalo. Para este propósito empregará o teorema da
desigualdade do triángulo, que afirma que a suma de dous lados do triángulo debe
ser sempre maior que a do terceiro. Se esta condición se cumpre para as tres
combinacións posibles, entón os lados facilitados forman un triángulo.
Se chamamos aos lados a, b e c , debe cumprirse que
a + b > c
a + c > b
b + c > a
 */

public class Main {
    private static boolean eTriangulo(int a, int b,int c){
        return a + b > c &&
                a + c > b &&
                b + c > a;
    }

    private static  boolean eEquilatero(int a, int b, int c){
        return a == b && b == c;
    }

    private  static boolean eIsosceles(int a, int b, int c){
        return a == b && a ==c || b == a && b == c || c == a && c == b;
    }

    private static boolean eEscaleno(int a, int b, int c){
        return a != b && a !=c && b !=c;
    }



    }
    public static boolean eTriangulo (int a, int b, int c){


    }


static void main(String[]args) {
    Scanner in = new Scanner(System.in);
    System.out.print("Introduce los tres lados del triángulo: ");
    int a, b, c;

    a = in.nextInt();
    b = in.nextInt();
    c = in.nextInt();

    if (!eTriangulo(a,b,c))
        System.out.println("Los lados indicados no forman un triángulo");
    else if (eEquilatero)
}
