import java.util.Locale;
import java.util.Scanner;

// Fazer um programa que leia o número de um funcionário, seu número de horas trabalhadas, o valor que recebe por
// hora e calcula o salário desse funcionário. A seguir, mostre o número e o salário do funcionário, com duas casas
// decimais.

public class exercicio4 {
    public static void main (String [] args) {
        Scanner input = new Scanner (System.in);
        Locale.setDefault(Locale.US);
        int numeroFuncionario;
        Double valorHora, horaTrabalhada, salario;

        System.out.print("Digite o número do funcionário: ");
        numeroFuncionario = input.nextInt();

        System.out.print("Digite a quantidade de horas trabalhadas: ");
        horaTrabalhada = input.nextDouble();

        System.out.print("Digite o valor por hora: ");
        valorHora = input.nextDouble();

        salario = valorHora * horaTrabalhada;

        System.out.printf("Número: %d %n", numeroFuncionario);
        System.out.printf("Salário: U$ %.2f %n", salario);

    }
}