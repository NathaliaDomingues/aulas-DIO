import java.util.Scanner;

public class Operadores {
    public static void main(String[] args) {
        //operadores
        // = : atribuição
        // == : comparar igualdade de dois valores
        // != : diferença
        // < : menor
        // <= : menor ou igual
        // > : maior
        // >= : maior ou igual
        // || : ou

        //true ou false

        //pode dirigir ou não
        var scanner = new Scanner(System.in);
        System.out.println("Quantos anos você tem?");
        var idade = scanner.nextInt();
        System.out.println("Você é emancipado?");
        var eEmancipado = scanner.nextBoolean();
        var resposta = idade >= 18 || eEmancipado && idade >= 16;
        System.out.printf("Você pode dirigir? (%s) \n", resposta);

        //conta
        System.out.printf("Quanto é 2 + 2?");
        var result = scanner.nextInt();

        //há duas maneiras
        var resposta1 = result == 4;
        System.out.printf("O resultado é 4, você acertou? (%s)", resposta1);
        //ou
        System.out.printf("O resultado é 4, você acertou? (%s)", result == 4);
    }
}
