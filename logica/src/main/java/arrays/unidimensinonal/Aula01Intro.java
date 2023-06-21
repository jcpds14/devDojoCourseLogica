package arrays.unidimensinonal;

public class Aula01Intro {
    public static void main(String[] args) {
        double[] notas = new double[4];
        notas[0] = 7.7;
        notas[1] = 8.9;
        notas[2] = 6.5;
        notas[3] = 9;

        for (int i = 0; i < notas.length; i++) {
            System.out.println(notas[i]);
        }
    }
}