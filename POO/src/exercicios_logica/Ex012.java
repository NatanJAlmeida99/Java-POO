package exercicios_logica;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;
import java.util.Scanner;

public class Ex012 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        DecimalFormatSymbols symbols = new DecimalFormatSymbols(Locale.US);
        DecimalFormat df = new DecimalFormat("0.00", symbols);
        System.out.println("Informe o valor do produto");
        double price = sc.nextDouble();
        System.out.println("Condições de pagamento: \n1 - À vista ou PIX, recebe 15% de desconto" +
                "\n2 - À vista no cartão de crédito, recebe 10%\n3 - Parcelado no cartão em duas vezes" +
                "preço normal do produto sem juros\n4 - Parcelado no cartão em três vezes ou mais," +
                "preço normal do produto mais juros de 10%");
        System.out.println("Informe sua opção");
        int op = sc.nextInt();

        switch (op) {
            case 1:
                System.out.println("O valor a pagar fica " + df.format(price * 0.85));
                break;
            case 2:
                System.out.println("O valor a pagar fica " + df.format(price * 0.90));
                break;
            case 3:
                System.out.println("O valor a pagar fica " + df.format(price));
                break;
            case 4:
                System.out.println("O valor a pagar fica " + df.format(price * 1.10));
                break;
            default:
                System.out.println("Opção invalida");
                break;

        }
        sc.close();
    }
}
