import java.util.Scanner;

// Fazer um programa para ler um número inteiro e dizer se este número é par ou ímpar.

public class exercicio2 {
    public static void main (String [] args){
        Scanner input = new Scanner (System.in);
        int valor;

        System.out.print("Digite um número: ");
        valor = input.nextInt();

        if (valor % 2 == 0){
            System.out.println("Número par.");
        }
        else {
            System.out.println("Número impar.");
        }
    }
}