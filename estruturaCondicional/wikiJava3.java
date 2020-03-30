import java.util.Scanner;

// Faça um Programa que verifique se uma letra digitada é "F" ou "M". Conforme a letra escrever: F - Feminino, M - Masculino, Sexo Inválido.

public class wikiJava3 {
    public static void main (String[] args){
        Scanner input = new Scanner (System.in);
        char sexo;

        System.out.print("Digite o sexo: ");
        sexo = input.next().charAt(0);

        if (sexo == 'F' || sexo == 'f'){
            System.out.println("o sexo é feminino!");
        }
        else if (sexo == 'M' || sexo == 'm') {
            System.out.println("O sexo é masculino!");
        }
        else {
            System.out.println("O sexo é invalido!");
        }

    }
}