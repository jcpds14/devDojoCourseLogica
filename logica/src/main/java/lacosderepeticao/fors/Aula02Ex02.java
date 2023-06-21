package lacosderepeticao.fors;

import java.util.Scanner;

public class Aula02Ex02 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int tabuada;
        int fimTabuada = 10;

        System.out.println("Digite um número de 1-10 para fazer o cálculo");
        tabuada = scan.nextInt();
        for (int i = 1; i <= fimTabuada; i++) {
            int multi = tabuada * i;

            System.out.println(tabuada + " * " + i + " = " + multi);
        }
    }
}