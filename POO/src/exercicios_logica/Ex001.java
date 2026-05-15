package exercicios_logica;

import java.util.Scanner;

public class Ex001 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe três números: ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c = sc.nextInt();

        int soma = a + b;

        if (soma < c) {
            System.out.printf("A soma entre " + a + " " + b + " é igual a " + soma + " que é menor que " + c);
        }

        sc.close();
    }
}
