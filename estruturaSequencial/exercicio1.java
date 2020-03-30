import java.util.Scanner;

// Faça um programa para ler dois valores inteiros, e depois mostrar na tela a soma desses números com uma
// mensagem explicativa, conforme exemplos.


public class exercicio1 {
    public static void main (String [] args) {

        int valor1, valor2, soma;

        Scanner input = new Scanner (System.in);

        System.out.print("Digite um valor: ");
        valor1 = input.nextInt();
        System.out.print("Digite outro valor: ");
        valor2 = input.nextInt();

        soma = valor1 + valor2;
        System.out.printf("O resultado de %d + %d é: %d %n", valor1, valor2, soma);

    }
}