package exercicios_logica;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex010 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.0");
        System.out.println("Informe as três notas do aluno");
        double n1 = sc.nextDouble();
        double n2 = sc.nextDouble();
        double n3 = sc.nextDouble();
        double media = (n1 + n2 + n3) / 3;
        System.out.println("A média das notas é " + df.format(media));
        sc.close();
    }
}
