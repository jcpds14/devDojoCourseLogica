package arrays.bidimensional;

import java.util.Random;

public class Aula03Ex01 {
    public static void main(String[] args) {
        Random random = new Random();
        int[][] matriz = new int[20][20];
        int resultado = 1;

        for (int i = 0; i < matriz.length; i++) {
            for (int j = 0; j < matriz[i].length; j++) {
                int randomNumber = random.nextInt(101);
                matriz[i][j] = randomNumber;
                if (i == j) {
                    resultado *= matriz[i][j];
                }
            }
        }
        System.out.println("O resultado é " + resultado);
    }
}