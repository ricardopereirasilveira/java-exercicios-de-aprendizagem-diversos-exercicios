import java.util.Locale;

public class exercicioFixacao {
    public static void main (final String[] args) {
        String produto1 = "Computer";
        String produto2 = "Office Desk";
        int idade = 30;
        int codigo = 5290;
        char gender = 'F';
        double preco1 = 2100.0;
        double preco2 = 650.50;
        double measure = 53.234567;

        System.out.println("Products:");
        System.out.printf("%s which price is $ %.2f %n", produto1, preco1);
        System.out.printf("%s, which price is %.2f %n%n", produto2, preco2);
        System.out.printf("Record: %d years old, code %d and gender: %s %n%n", idade, codigo, gender);
        System.out.printf("Measue with eight decimal places: %f %n", measure);
        System.out.printf("Rouded ( three decimal places): %.3f %n", measure);
        Locale.setDefault(Locale.US);
        System.out.printf("US decimal point: %.3f %n", measure);

    }
}