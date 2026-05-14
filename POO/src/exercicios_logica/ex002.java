package exercicios_logica;

import java.util.Scanner;

public class ex002 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe um número");
        int a = sc.nextInt();
        String isPar = (a % 2 == 0) ? "par" : "impar";
        String sinal;

        if (a > 0) {
            sinal = "positivo";
        } else {
            sinal = "negativo";
        }
        System.out.println("O número " + a + " é " + isPar + " e é " + sinal);

        sc.close();
    }
}
