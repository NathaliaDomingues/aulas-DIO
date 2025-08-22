public class operBitwise {
    public static void main(String[] args) {
        //1 = true
        //0 = false

        var valor1 = -12;
        var binario1 = Integer.toBinaryString(valor1);
        System.out.printf("Primeiro número da operação %s (representação binária %s)\n", valor1, binario1);

        var valor2 = 2;
//        var binario2 = Integer.toBinaryString(valor2);
        System.out.printf("Segundo número da operação %s\n", valor2);
        var resultado = valor1 >>> valor2;
        var binarioresultado = Integer.toBinaryString(resultado);
        System.out.printf("%s >>> %s = %s (representação binária %s)\n", valor1, valor2, resultado, binarioresultado);


//        var resultado = ~valor1;
//        var binarioresultado = Integer.toBinaryString(resultado);
//        System.out.printf("~%s = %s (representação binária %s)\n", valor1, resultado, binarioresultado);
    }
}