import java.util.Scanner;

public class repeticaoWhile {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        var nome = "";

        while (!nome.equalsIgnoreCase("fim")){
            System.out.println("Informe o nome:");
            nome = scanner.next();
            System.out.println(nome);
        }

        //OU

//        do {
//            System.out.println("Informe o nome:");
//            nome = scanner.next();
//            System.out.println(nome);
//        } while (!nome.equalsIgnoreCase("fim"));
    }
}
