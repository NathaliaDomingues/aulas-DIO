import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        var scanner = new Scanner(System.in);
        System.out.println("Digite seu nome:");
        var nome = scanner.next();
        System.out.println("Digite sua idade:");
        var idade = scanner.nextInt();
        System.out.printf("Olá %s sua idade é %s\n", nome, idade);
    }
}