import java.util.Scanner;

public class switchCase {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Digite um número de 1 até 7:");
        var opcao = scanner.nextInt();

        // var message = swicth (opcao){
        // case 1, 7 -> "aaaaaaaaaaa":
        //...
        // };
        //system.out.prntiln(message);

        //OU

        switch (opcao){
            //PRIMEIRA OPÇÃO
            case 1, 7 -> System.out.println("Fim de semana \\o/");
            case 2 -> System.out.println("Segunda");
            case 3 -> System.out.println("Terça");
            case 4 -> System.out.println("Quarta");
            case 5 -> System.out.println("Quinta");
            case 6 -> System.out.println("Sexta");
            //case 7 -> System.out.println("Sábado");
            default -> System.out.println("Opção inválida");


            //SEGUNDA OPÇÃO
//            case 1:
//            case 7:
//                System.out.println("Fim de semana");
//                break;
//            case 2:
//                System.out.println("Segunda");
//                break;
//            case 3:
//                System.out.println("Terça");
//                break;
//            case 4:
//                System.out.println("Quarta");
//                break;
//            case 5:
//                System.out.println("Quinta");
//                break;
//            case 6:
//                System.out.println("Sexta");
//                break;
//            default:
//                System.out.println("Opção inválida");
        }
    }
}
