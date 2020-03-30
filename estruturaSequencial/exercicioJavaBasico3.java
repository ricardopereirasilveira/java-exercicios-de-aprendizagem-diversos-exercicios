import java.util.Scanner;

// informar um saldo e imprimir o saldo com reajuste de 5%

public class exercicioJavaBasico3 {
    public static void main (String [] args){
        Scanner input = new Scanner (System.in);
        Double saldo, valorAcrescido;

        System.out.print("Informe um saldo: ");
        saldo = input.nextDouble();
        valorAcrescido = 5 * saldo / 100;
        saldo = saldo + valorAcrescido;

        System.out.printf("O seu saldo é de: %.2f %n", saldo);


    }
}