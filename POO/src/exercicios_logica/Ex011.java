package exercicios_logica;

import java.util.Scanner;

public class Ex011 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Informe o nome do aluno ");
        String nome = sc.next();
        System.out.println("Informe as 4 notas do aluno");
        double n1 = sc.nextDouble();
        double n2 = sc.nextDouble();
        double n3 = sc.nextDouble();
        double n4 = sc.nextDouble();
        double media = (n1 + n2+ n3 + n4) / 4;
        String situacao = media >= 7 ? "Aprovado" : "Reprovado";

        System.out.println("O aluno " + nome + " está " + situacao);
    }
}
