package exercicios_logica;

import java.util.Random;

public class Ex021 {
    public static void main(String[] args) {
        Random random = new Random();
        int min = 0;
        int max = 100;
        int numero = random.nextInt(max - min + 1) + min;

        System.out.println(numero);

    }
}
