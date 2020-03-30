import java.util.Scanner;

// Faça um Programa que verifique se uma letra digitada é vogal ou consoante.

public class wikiJava4 {
    public static void main (String[] args){
        Scanner input = new Scanner (System.in);
        char caracterer;

        System.out.print("Digite uma letra: ");
        caracterer = input.next().charAt(0);

        if (caracterer == 'a' || caracterer == 'A'){
            System.out.println("É vogal");
        }
        else if (caracterer == 'e' || caracterer == 'E'){
            System.out.println("É vogal");
        }
        else if (caracterer == 'i' || caracterer == 'I'){
            System.out.println("É vogal");
        }
        else if (caracterer == 'o' || caracterer == 'O'){
            System.out.println("É vogal");
        }
        else if (caracterer == 'u' || caracterer == 'U'){
            System.out.println("É vogal");
        }
        else {
            System.out.println("É consoante");
        }
    }
}