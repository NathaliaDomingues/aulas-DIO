package br.com.exercicios;

import java.util.Scanner;

public class diferencaIdade {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um nome:");
        var nome1 = scanner.next();
        System.out.println("Digite uma idade:");
        int idade1 = scanner.nextInt();
        System.out.println("Digite outro nome:");
        var nome2 = scanner.next();
        System.out.println("Digite outra idade:");
        int idade2 = scanner.nextInt();

        var diferenca = idade1 - idade2;
        System.out.printf("A diferença de idade é %s ano(s)", diferenca);

    }
}
