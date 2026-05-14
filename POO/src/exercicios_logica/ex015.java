package exercicios_logica;

import java.time.LocalDate;
import java.util.Scanner;

public class ex015 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
//        System.out.println("Digite seu ano de nascimento: ");
//        int anoBirth = input.nextInt();
//        System.out.println("Digite seu mês de nascimento: ");
//        int mesBirth = input.nextInt();
//        System.out.println("Digite seu dia de nascimento: ");
//        int diaBirth = input.nextInt();

        LocalDate hoje = LocalDate.now();
        int ano = hoje.getYear();
        int mes = hoje.getMonthValue();
        int dia = hoje.getDayOfMonth();
        
        input.close();
    }
}
