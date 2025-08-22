package br.com.exerciciosDio;

import java.util.Scanner;

public class parImpar {
    //3
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite o primeiro número:");
        int n1 = scanner.nextInt();

        System.out.println("Digite um segundo número:");
        int n2 = scanner.nextInt();

        if (n1 > n2) {
            System.out.println("Digite um número maior que o anterior");
        }

        System.out.println("Quer que exiba o número ímpar ou o par?");
        var escolha = scanner.next();

        System.out.printf("Os números %s no intervalo de %s á %s:", escolha, n2, n1);

        for (var i = n2; i >= n1; i--) {
            if(escolha.equalsIgnoreCase("par") && i % 2 == 0) {
                System.out.println(i + " ");
            } else if (escolha.equalsIgnoreCase("impar") && i % 2 != 0) {
                System.out.println(i + " ");
            }
        }
    }
}
