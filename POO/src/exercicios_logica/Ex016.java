package exercicios_logica;

import java.util.Scanner;

public class Ex016 {
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Informe o tamanho dos lados do triângulo");
        double a = input.nextDouble();
        double b = input.nextDouble();
        double c = input.nextDouble();

        if (a == b && b == c && a == c) {
            System.out.println("Seu triângulo possui todos os lados igauis ele é EQUILÁTERO");
        } else if (a != b && a != c && b != c) {
            System.out.println("Seu triângulo possui todos os lados diferentes ele é ESCALENO");
        } else {
            System.out.println("Seu triângulo possui dois lados igauis ele é ISÓSCELES");
        }
    }
}
