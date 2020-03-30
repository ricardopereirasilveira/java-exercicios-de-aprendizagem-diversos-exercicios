import java.util.Locale;

public class expressaoAritimetica {
    public static void main (String[] args) {
        String nome = "Ricardo";
        int idade = 32;
        double peso = 72.34;
        Locale.setDefault(Locale.US);
        System.out.printf("Olá %s, você tem %d de idade e pesa %.2f KGs. Obrogado", nome, idade, peso);

    }
}