import java.util.Scanner;

public class ifElseElseIf {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite sua nome:");
        var nome = scanner.next();
        System.out.println("Digite sua idade:");
        int idade = scanner.nextInt();
        System.out.println("Você é emancipado? (sim ou não)");
        var eEmancipado = scanner.next().equalsIgnoreCase("sim");

        if ((idade >= 18) || (idade >= 16 && eEmancipado)) {
            System.out.printf("%s, você pode dirigir.\n", nome, idade);}
        //OUTRA OPÇÃO
//        else if (idade >= 16 && eEmancipado) {
//            System.out.printf("%s, apesar de você ter %s anos, você é emancipado e pode dirigir.\n", nome, idade);}
        else {
            System.out.printf("%s, Você não pode dirigir.\n", nome);
        }

        System.out.println("fim da execução");

    }
}
