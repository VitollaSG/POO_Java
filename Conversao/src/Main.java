import java.util.Locale;
import java.util.Scanner;
import calculos.conversao;

public class Main {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        Locale.setDefault(Locale.US);
        conversao conv = new conversao();


        System.out.printf("Qual o preço do dollar? ");
        conv.setDol(sc.nextDouble());

        System.out.println("Quantos dolláres você quer comprar? ");
        conv.setQuant(sc.nextDouble());

        //System.out.println(conv);
        System.out.printf("Para comprar $ %.2f doláres, você pagará R$ %.2f reais", conv.getQuant(), conv.converter());


        sc.close();
    }
}