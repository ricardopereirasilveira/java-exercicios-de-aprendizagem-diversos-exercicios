import java.util.Scanner;

// Faça um programa que peça uma nota, entre zero e dez. Mostre uma mensagem caso o valor seja inválido e continue pedindo até que o usuário informe um valor válido.


public class wikiJava1 {
    public static void main (String[] args){
        Scanner input = new Scanner (System.in);
        int numero;
        System.out.print("Digite um número: ");
        numero = input.nextInt();

        while (true){
            if (numero < 0 || numero > 10){
                System.out.print("Digite outro número: ");
                numero = input.nextInt();
            }
            else{
                System.out.println("Obrigado por digitar a nota!");
                break;
            }
        }

    }
}