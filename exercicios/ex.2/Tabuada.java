package br.com.exerciciosDio;

import java.util.Scanner;

public class Tabuada {
    //1
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite um número para exibir a tabuada: ");
        int numero = scanner.nextInt();

        for (int i = 1; i <= 10; i++) {
            var resultado = numero * i;
            System.out.printf("%s x %s = %s\n", numero, i, resultado);
        }
    }
}
