import java.util.Scanner;

// Fazer um programa para ler um número inteiro, e depois dizer se este número é negativo ou não.

public class exercicio1 {
    public static void main (String[] args){
        Scanner input = new Scanner (System.in);
        int valor;

        System.out.print("Digite um valor: ");
        valor = input.nextInt();

        if (valor > 0){
            System.out.println("O valor é positivo!");
        }
        else if (valor == 0){
            System.out.println("O valor é neutro!");
        }
        else {
            System.out.println("O valor é negativo!");
        }
        


    }
}