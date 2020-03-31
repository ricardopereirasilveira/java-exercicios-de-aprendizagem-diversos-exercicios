import java.text.DecimalFormat;
import java.text.Format;
import java.util.Scanner;

// Um posto está vendendo combustíveis com a seguinte tabela de descontos:
// Álcool:
// até 20 litros, desconto de 3% por litro
// acima de 20 litros, desconto de 5% por litro
// Gasolina:
// até 20 litros, desconto de 4% por litro
// acima de 20 litros, desconto de 6% por litro Escreva um algoritmo que leia o número de litros vendidos, o tipo de combustível (codificado da seguinte forma: A-álcool, G-gasolina), calcule e imprima o valor a ser pago pelo cliente sabendo-se que o preço do litro da gasolina é R$ 2,50 o preço do litro do álcool é R$ 1,90.

public class wikiJava26 {
    public static void main (String[] args){
        Scanner input = new Scanner (System.in);
        String combustivel;
        int litro;
        float valorPagar, desconto, valorGasolina, valorAlcool;
        DecimalFormat formatador = new DecimalFormat("0.00");
        

        System.out.print("Álcool ou Gasolina? ");
        combustivel = input.next();
        combustivel = combustivel.toLowerCase();
        valorGasolina = (float) 3.80;
        valorAlcool = (float) 2.70;

        System.out.print("Quantidade de litros: ");
        litro = input.nextInt();
        // System.out.println(combustivel);

        if (combustivel.equals("gasolina")){
            // System.out.println(combustivel.toLowerCase());
            if (litro <= 20){
                // System.out.println(litro);
                desconto = (float) 4 / 100 * valorGasolina;
                valorGasolina -= desconto;
                // System.out.println(desconto);
                // System.out.println(litro);
                valorPagar = litro * valorGasolina;
                System.out.printf("Você terá que pagar: R$ %.2f %n", valorPagar);
            }
            else {
                desconto = (float) 6 / 100 * valorGasolina;
                valorGasolina -= desconto;
                valorPagar = litro * valorGasolina;
                System.out.printf("Você terá que pagar: R$ %.2f %n", valorPagar);
            }
        }

        else if (combustivel.equals("álcool") || (combustivel.equals("alcool"))){
            if (litro <= 20){
                desconto = (float) 3 / 100 * valorAlcool;
                valorAlcool -= desconto;
                valorPagar = litro * valorAlcool;
                System.out.printf("Você terá que pagar: R$ %.2f %n", valorPagar);
            }
            else {
                desconto = (float) 5 / 100 * valorAlcool;
                valorAlcool -= desconto;
                valorPagar = litro * valorAlcool;
                System.out.printf("Você terá que pagar: R$ %.2f %n", valorPagar);
            }
        }

        else {
            System.out.println("combustivel invalido");
        }

        input.close();
    }
}