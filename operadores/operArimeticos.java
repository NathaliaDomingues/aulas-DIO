import java.util.Scanner;

public class operArimeticos {
    public static void main(String[] args) {
        //operadores ariméticos
        var scanner = new Scanner(System.in);
        //1
        var valor1 = 50;
        System.out.println(valor1++); // ++ = + 1
        System.out.println(valor1); // se ++ for antes da variável irá somar na linha anterior(9), mas se for depois somará nesta linha(10)


        //2
        System.out.println("Informe o primeiro número:");
        var valor2 = scanner.nextInt();
        System.out.printf("a potência de %s é %s\n", valor2, Math.pow(valor1, 2));
        //pow: potência
        //sqrt: retorna em DOUBLE


        //3
        var valor3 = 5;
        valor3 += 12;     // valor = valor + 12;
        System.out.println(valor3);


        //4
        var valor4 = 5 + 9 * 10 - 5 / 2;
        System.out.println(valor4);


        //5
        System.out.println("Informe o primeiro número:");
        var valor5 = scanner.nextInt();
        System.out.println("Informe o segundo número:");
        var valor6 = scanner.nextInt();
        System.out.printf("%s x %s = %s\n", valor5, valor6, valor5 * valor6);
    }
}
