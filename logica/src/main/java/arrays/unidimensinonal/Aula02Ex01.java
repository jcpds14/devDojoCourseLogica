package arrays.unidimensinonal;

import java.util.Scanner;

public class Aula02Ex01 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        double[] notas = new double[4];
        double somaDasMedias = 0;
        for (int i = 0; i < notas.length; i++) {
            System.out.printf("Digite sua nota da %dº unidade\n", (i+1));
            notas[i] = scan.nextDouble();
            somaDasMedias = somaDasMedias + notas[i];
        }
        double media = somaDasMedias / notas.length;
        System.out.println("A soma das suas notas é " + somaDasMedias);
        System.out.printf("Sua média é %.2s", media);
    }
}