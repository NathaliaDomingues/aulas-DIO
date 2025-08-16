package br.com.exerciciosDio;

import java.util.Scanner;

public class imc {
    public static void main(String[] args) {
        //2
        Scanner scanner = new Scanner(System.in);

        System.out.println("Digite seu peso:");
        double peso = scanner.nextDouble();

        System.out.println("Digite sua altura:");
        double altura = scanner.nextDouble();

        double imc = peso / (altura * altura);
        double arredondamento = Math.round(imc * 100) / 100.0; // para arredondar o número em uma casa decimal
        System.out.printf("Seu IMC: %s\n", arredondamento);

        if (imc < 18.5) {
            System.out.println("Abaixo do peso");
        } else if (imc <= 24.9) {
            System.out.println("Peso ideal");
        } else if (imc <= 29.9) {
            System.out.println("Levemente acima do peso");
        } else if (imc <= 34.9) {
            System.out.println("Obesidade grau I");
        } else if (imc <= 39.9) {
            System.out.println("Obesidade grau II (Severa)");
        } else {
            System.out.println("Obesidade grau III (Mórbida)");
        }
    }
}