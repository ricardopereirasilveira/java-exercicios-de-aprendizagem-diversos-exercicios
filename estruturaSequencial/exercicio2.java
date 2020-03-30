import java.util.Scanner;
import java.lang.Math;

// Faça um programa para ler o valor do raio de um círculo, e depois mostrar o valor da área deste círculo com quatro
// casas decimais conforme exemplos.
// Fórmula da área: area = π . raio2
// Considere o valor de π = 3.14159

public class exercicio2 {
    public static void main (String [] args){
        Scanner input = new Scanner (System.in);

        Double pi, raio, resultado;

        pi = 3.14159;
        System.out.print("Digite o valor do Raio ( com virgula ): ");
        
        raio = input.nextDouble();
        resultado = (pi * Math.pow(raio, 2));

        System.out.printf("O resultado do raio de %f é: ", raio);
        System.out.println(resultado);




    }
}