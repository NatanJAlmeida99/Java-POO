package exercicios_logica;

import java.util.Scanner;

public class Ex014 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe o valor de A:");
        int a = sc.nextInt();
        System.out.println("Informe o valor de B:");
        int b = sc.nextInt();
        System.out.println("Valores originais: A = " + a + ", B = " + b);
        int aux = a;
        a = b;
        b = aux;
        System.out.println("Valores trocados: A = " + a + ", B = " + b);

        sc.close();
    }
}