package exercicios_logica;

import java.util.Scanner;

public class Ex022 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Informe dois valores e veja o quociente e o resto da divisão");
        int a = input.nextInt();
        int b = input.nextInt();

        System.out.println("O quociente é " + (a / b) + " e o resto é " + (a % b));
    }
}
