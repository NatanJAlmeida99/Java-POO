package exercicios_logica;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;
import java.util.Scanner;

public class Ex006 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        DecimalFormatSymbols symbols = new DecimalFormatSymbols(Locale.US);
        DecimalFormat df = new DecimalFormat("0.00", symbols);
        double num = sc.nextDouble();
        double reajuste = num * 1.05;
        System.out.println("O valor " + df.format(num) + " com reajuste de 5% fica " + df.format(reajuste));
        sc.close();
    }
}
