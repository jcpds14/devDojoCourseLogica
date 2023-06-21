package lacosderepeticao.fors;

public class Aula02Ex01 {
    public static void main(String[] args) {
        long inicio = 15;
        long fim = 200;

        for (long i = inicio; i <= fim; i++) {
            long quadrado = i * i;

           System.out.println("O quadrado de " + i + " é " + quadrado);
        }
    }
}