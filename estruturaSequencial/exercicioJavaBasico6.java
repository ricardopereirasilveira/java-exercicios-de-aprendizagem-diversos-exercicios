import java.util.Scanner;

public class exercicioJavaBasico6 {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        int valor;

        System.out.print("Digite um valor: ");
        valor = input.nextInt();


        System.out.printf("Você digitou o %d, seu antecessor é o %d e seu sucessor é o %d %n", valor, valor+1, valor-1);

    }
}