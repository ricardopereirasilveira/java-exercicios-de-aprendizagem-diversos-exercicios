import java.util.Scanner;

// Fazer um programa para ler quatro valores inteiros A, B, C e D. A seguir, calcule e mostre a diferença do produto
// de A e B pelo produto de C e D segundo a fórmula: DIFERENCA = (A * B - C * D).

public class exercicio3 {
    public static void main (String [] args) {
        Scanner input = new Scanner (System.in);
        int valor1, valor2, valor3, valor4, resultado;

        System.out.print("Digite o primeiro valor: ");
        valor1 = input.nextInt();

        System.out.print("Digite o segundo valor: ");
        valor2 = input.nextInt();

        System.out.print("Digite o terceiro valor: ");
        valor3 = input.nextInt();

        System.out.print("Digite o quarto valor: ");
        valor4 = input.nextInt();

        resultado = (valor1 * valor2 - valor3 * valor4);
        System.out.printf("O resultado de (%d * %d - %d * %d) é: %d %n", valor1, valor2, valor3, valor4, resultado);







    }
}