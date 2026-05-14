package exercicios_logica;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;
import java.util.Scanner;

public class ex005 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in).useLocale(Locale.US);
        DecimalFormatSymbols symbols = new DecimalFormatSymbols(Locale.US);
        DecimalFormat df = new DecimalFormat("0.00", symbols);

        System.out.println("Informe o seu salário: ");
        double salaryUser = sc.nextDouble();
        double salary = 1293.20;
        double qtd = salaryUser / salary;

        System.out.println("Um salário de " + df.format(salaryUser) + " são " + df.format(qtd) + " salarios mininos");
        sc.close();
    }
}
