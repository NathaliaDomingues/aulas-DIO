package br.com.exercicios;

import java.util.Scanner;

public class Ficha {
    public static void main(String[] args) {
        var ano = 2025;
        Scanner scanner = new Scanner(System.in);
        System.out.println("Informe seu nome:");
        var nome = scanner.next();
        System.out.println("Informe seu ano de nascimento:");
        var anoDeNascimento = scanner.nextInt();
        var idade = ano - anoDeNascimento;
        System.out.printf("Olá %s, você tem %s anos \n", nome, idade);
    }
}