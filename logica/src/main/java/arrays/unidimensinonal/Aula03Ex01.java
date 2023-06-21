package arrays.unidimensinonal;

import java.util.Random;

public class Aula03Ex01 {
    public static void main(String[] args) {
        Random random = new Random();

        double[] vetor1 = new double[9];
        double[] vetor2 = new double[9];
        double[] multi = new double[9];
        for(int i = 0; i < vetor1.length; i++){
            double randomNumber = random.nextDouble(101);
            vetor1[i] = randomNumber;
            randomNumber = random.nextInt(101);
            vetor2[i] = randomNumber;
            multi[i] = vetor1[i] * vetor2[i];
            System.out.printf("%.2f * %.2f = %.2f\n", vetor1[i], vetor2[i], multi[i]);
        }
    }
}