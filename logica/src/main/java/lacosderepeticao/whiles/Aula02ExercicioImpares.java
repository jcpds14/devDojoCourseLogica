package lacosderepeticao.whiles;

import java.util.Scanner;

public class Aula02ExercicioImpares {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite o valor desejado");
        int valorFinal = scan.nextInt();
        int i = 0;

        long tempoInicial = System.currentTimeMillis();
        while(i <= valorFinal){
            if(i % 2 != 0){
                System.out.println("i = " + i);
            }
            i = i + 1;
        }
        long tempoFinal = System.currentTimeMillis();

        long tempoTotal = tempoFinal - tempoInicial;

        System.out.println("Tempo de execução: " + tempoTotal + " ms");
    }
}