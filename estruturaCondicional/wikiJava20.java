import java.util.Scanner;

// Faça um Programa para leitura de três notas parciais de um aluno. O programa deve calcular a média alcançada por aluno e presentar:
// A mensagem "Aprovado", se a média for maior ou igual a 7, com a respectiva média alcançada;
// A mensagem "Reprovado", se a média for menor do que 7, com a respectiva média alcançada;
// A mensagem "Aprovado com Distinção", se a média for igual a 10.

public class wikiJava20 {
    public static void main (String[] args){
        Scanner input = new Scanner(System.in);
        double nota1, nota2, nota3, media;
        String aluno;

        System.out.print("Digite o nome do Aluno: ");
        aluno = input.nextLine();
        // input.nextLine();
        // System.out.println(aluno);

        System.out.print("Digite a primeira nota: ");
        nota1 = input.nextDouble();

        System.out.print("Digite a segunda nota: ");
        nota2 = input.nextDouble();

        System.out.print("Digite a terceira nota: ");
        nota3 = input.nextDouble();

        media = (nota1 + nota2 + nota3) / 3;

        if (media == 10){
            System.out.printf("Parabéns %s, você foi aprovado com nota máxima! %n", aluno);
        }

        else if (media >= 7) {
            System.out.printf("Parabéns %s, você foi aprovado! %n", aluno);
        }

        else {
            System.out.printf("%s, Você foi reprovado! %n", aluno);
        }

        // System.out.println(aluno + " " + nota1);





    }
}