package lacosderepeticao.whiles;

import java.util.Scanner;

public class Aula05DoWhile {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int desejaContinuar = 1;

        do{
            System.out.println("Player 1, digite um número de 1 - 10");
            int n1 = scan.nextInt();
            System.out.println("Player 2, digite um número de 1 - 10");
            int n2 = scan.nextInt();
            System.out.println("Acertou? " + (n1 == n2));
            System.out.println("Deseja continuar?");
            System.out.println("1. Sim");
            System.out.println("2. Não");
            desejaContinuar = scan.nextInt();
        }while(desejaContinuar == 1);
    }
}