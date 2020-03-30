import java.util.Scanner;

// Faça um Programa que peça dois números e imprima o maior deles.

public class wikiJava1 {
    public static void main (String [] args){
            Scanner input = new Scanner (System.in);
            int numero1, numero2;

            System.out.print("Digite o primeiro valor: ");
            numero1 = input.nextInt();

            System.out.print("Digite o segundo valor: ");
            numero2 = input.nextInt();

            if ( numero1 > numero2){
                System.out.printf("O número %d é maior que o número %d", numero1, numero2);
            }
            else {
                System.out.printf("O número %d é maior que o número %d", numero2, numero1);
            }

    }
}