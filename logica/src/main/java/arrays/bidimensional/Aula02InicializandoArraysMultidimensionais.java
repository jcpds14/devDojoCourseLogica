package arrays.bidimensional;

import java.util.Random;

public class Aula02InicializandoArraysMultidimensionais {
    public static void main(String[] args) {
        Random random = new Random();
        int randomNumber = random.nextInt();
        int[][] arrayMulti = new int[2][2];

        for (int i = 0; i < arrayMulti.length; i++) {
            for (int j = 0; j < arrayMulti[i].length; j++) {
                arrayMulti[i][j] = randomNumber;
                System.out.println("O valor na posição [" + i + "][" + j + "] é " + arrayMulti[i][j]);
            }
        }
    }
}