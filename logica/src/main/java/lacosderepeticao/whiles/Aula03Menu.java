package lacosderepeticao.whiles;

import java.util.Scanner;

public class Aula03Menu {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        int opcao = 0;
        while(opcao != 3){
            System.out.println("1. Calcular Imposto");
            System.out.println("2. Depositar Salário");
            System.out.println("3. Sair");
            System.out.println("Digite a opcao desejada");
            opcao = scan.nextInt();
        }
        System.out.println("Programa Encerrado.");
    }
}