package exercicios_logica;

import java.util.Scanner;

public class ex003 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe ");
        int a = sc.nextInt();
        int b = sc.nextInt();
        int c;

        if (a == b) {
            c = a + b;
        } else {
            c = a * b;
        }

        System.out.println(c);

        sc.close();
    }
}
