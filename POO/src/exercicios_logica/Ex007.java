package exercicios_logica;

import java.util.Scanner;

public class Ex007 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        System.out.println("Informe o primeiro valor (true/false):");
        boolean v1 = sc.nextBoolean();

        System.out.println("Informe o segundo valor (true/false):");
        boolean v2 = sc.nextBoolean();

        if (v1 && v2) {
            System.out.println("Ambos são VERDADEIROS.");
        } else if (!v1 && !v2) {
            System.out.println("Ambos são FALSOS.");
        } else {
            System.out.println("Os valores são mistos (um verdadeiro e outro falso).");
        }

        sc.close();
    }
}