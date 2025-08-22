package br.com.exercicios;

public class Quadrado {
    public static void main(String[] args) {
        //lados do quadrado
        var lado1 = 20;
        var lado2 = 20;

        var area = lado1 * lado2;
        System.out.printf("Área = %scm x %scm = %scm²", lado1, lado2, area);
    }
}
