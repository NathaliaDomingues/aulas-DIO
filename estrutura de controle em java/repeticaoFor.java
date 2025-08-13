import java.util.Scanner;

public class repeticaoFor {
    public static void main(String[] args) {
        //LISTA
        for (var i = 1;i < args.length;i++){
            System.out.println(i + " - " + args[i]);
        }

        //OU

        for (var arg : args){
            System.out.println(arg);
        }

        //1 a 100
        for (var i = 1;i <= 100;i ++){
            if (i == 100){
                System.out.println("Fim da execução");
                break;
            }
            System.out.println(i);
        }

        //REPETIÇÃO QUESTÃO
        Scanner scanner = new Scanner(System.in);
        for (;;) {
            System.out.println("Digite seu nome:");
            var nome = scanner.next();

            if (nome.equalsIgnoreCase("fim")) break;

            System.out.println(nome);
        }
    }
}
