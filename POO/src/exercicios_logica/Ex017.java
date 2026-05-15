package exercicios_logica;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;
import java.util.Scanner;

public class Ex017 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in).useLocale(Locale.US);
        DecimalFormatSymbols symbols = new DecimalFormatSymbols(Locale.US);
        DecimalFormat df = new DecimalFormat("0.0", symbols);
        System.out.println("Informe a temperatura em Fahrenheit °F para ver ela em Celsius °C");
        double fahrenheit = input.nextDouble();
        double celsius = (5 * (fahrenheit - 32) / 9);
        System.out.println("A temperatura de " + fahrenheit + "°F" + " fica em " + df.format(celsius) + "°C");
    }
}
