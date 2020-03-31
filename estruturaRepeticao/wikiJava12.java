import java.util.Scanner;

// Desenvolva um gerador de tabuada, capaz de gerar a tabuada de qualquer número inteiro entre 1 a 10. 
// O usuário deve informar de qual numero ele deseja ver a tabuada. A saída deve ser conforme o exemplo abaixo:
// Tabuada de 5:
// 5 X 1 = 5
// 5 X 2 = 10
// ...
// 5 X 10 = 50

public class wikiJava12 {
    public static void main (String[] args){
        Scanner input = new Scanner (System.in);
        int tabuada;
        System.out.print("Qual tabuada deseja saber? ");
        tabuada = input.nextInt();

        for (int i=1; i<11; i++){
            System.out.printf("%d x %d = %d %n", tabuada, i, tabuada * i);
        }

    }
}