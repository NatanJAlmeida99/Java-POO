package exercicios_logica;

import java.time.LocalDate;
import java.time.Period;
import java.util.Scanner;

public class Ex015 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("Digite o dia de nascimento (ex: 15): ");
        int dayBirth = input.nextInt();
        System.out.println("Digite o mês de nascimento (ex: 5)");
        int mounthBirth = input.nextInt();
        System.out.println("Digite o ano de nascimento (ex: 2010)");
        int yearBirth = input.nextInt();

        LocalDate dateBirth = LocalDate.of(yearBirth, mounthBirth, dayBirth);
        LocalDate today = LocalDate.now();

        Period periodo = Period.between(dateBirth, today);

        System.out.println(periodo.getYears() + " anos " + periodo.getMonths() + " meses e " + periodo.getDays() + " dias de vida;");


        input.close();
    }
}
