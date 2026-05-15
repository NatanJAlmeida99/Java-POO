package exercicios_logica;

import java.util.Scanner;

public class Ex020 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Informe um valor e veja sua tabuada");
        int num = input.nextInt();
        for (int i = 1; i <= 10; i++) {
            System.out.println(num + " X " + i + " = " + (num * i));
        }


        input.close();
    }
}
