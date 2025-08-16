package br.com.exerciciosDio;

import java.util.Scanner;

public class numeroInicial {
    public static void main(String[] args) {
        //4
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número:");
        int numero = scanner.nextInt();

        while(true){
            System.out.println("Informe o número para verificação:");
            int numVerificado = scanner.nextInt();
            if (numVerificado < numero){
                System.out.printf("Informe um número maior que %s \n", numero);
                continue;
            }
            var resultado = numVerificado % numero;
            System.out.printf("%s %% %s = %s\n", numVerificado, numero, resultado);
            if (resultado != 0) break;
        }
    }
}
