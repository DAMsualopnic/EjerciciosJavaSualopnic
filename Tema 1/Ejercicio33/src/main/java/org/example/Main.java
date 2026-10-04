package org.example;

//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
/*
33) Un estudante quere saber cal será a súa nota final en Programación sabendo que está
composta polas seguintes porcentaxes:
a) 55 % da media das súas tres avaliacións parciais.
b) 30% da nota final do exame.
c) 15 % da nota final do proxecto.
 */

public class Main {
    static void main() {
        double nota1 = 10,nota2 = 7.5, nota3 = 4;
        double examenFinal = 4.99;
        double trabajoFinal= 10;
        double notaFinal, media;

        media = (nota1+nota2+nota3)/3;
        notaFinal= media*0.55 + examenFinal*0.33 + trabajoFinal*0.15;

        System.out.printf("Media de las tres evaluaciones: %.3f", notaFinal);
    }
}
