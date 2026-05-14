package exercicios_logica;

import java.util.Scanner;

public class ex004 {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int a = sc.nextInt();
        System.out.println("O número " + a + " tem como antecessor " + (a - 1) + " e como sucessor " + (a + 1));
        sc.close();
    }
}
