package arrays.bidimensional;

public class Aula01IntroArraysMultidimensionais {
    public static void main(String[] args) {
        int[][] arrayMulti = new int[2][2];
        arrayMulti[0][0] = 22;
        arrayMulti[0][1] = 35;
        arrayMulti[1][0] = 40;
        arrayMulti[1][1] = 52;

        System.out.println(arrayMulti[0][0]);
        System.out.println(arrayMulti[0][1]);
        System.out.println(arrayMulti[1][0]);
        System.out.println(arrayMulti[1][1]);
    }
}