public class operBitwise {
    public static void main(String[] args) {
        var valor1 = 6;
        var binario1 = Integer.toBinaryString(valor1);
        System.out.printf("Primeiro número da operação %s (representação binária %s)\n", valor1, binario1);

        var valor2 = 5;
        var binario2 = Integer.toBinaryString(valor2);
        System.out.printf("Segundo número da operação %s (representação binária %s)\n", valor2, binario2);
        var resultado = valor1 | valor2;
        var binarioresultado = Integer.toBinaryString(resultado);
        System.out.printf("%s | %s = %s (representação binária %s)\n", valor1, valor2, resultado, binarioresultado);
    }
}