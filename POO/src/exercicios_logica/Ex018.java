package exercicios_logica;

import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.Locale;

public class Ex018 {
    public static void main(String[] args) {
        DecimalFormatSymbols symbols = new DecimalFormatSymbols(Locale.US);
        DecimalFormat df = new DecimalFormat("0.00", symbols);

        double alturaFrancisco = 1.50;
        double alturaSara = 1.10;
        int anos = 0;

        while (alturaSara <= alturaFrancisco) {
            alturaFrancisco += 0.02;
            alturaSara += 0.03;
            anos++;
        }

        System.out.println("Sara alcançou ou passou Francisco em " + anos + " anos.");
        System.out.println("Altura final de Francisco: " + df.format(alturaFrancisco));
        System.out.println("Altura final de Sara: " + df.format(alturaSara));
    }
}
