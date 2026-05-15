package exercicios_logica;

import java.util.Scanner;

public class Ex013 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite seu nome");
        String nome = sc.nextLine();
        System.out.println("Digite sua idade");
        int idade = sc.nextInt();
        String maiorIdade = (idade >= 18) ? "Maior de idade" : "Menor de idade";
        System.out.println("A pessoa " + nome + " tem " + idade + " anos e é " + maiorIdade);
        sc.close();
    }
}
