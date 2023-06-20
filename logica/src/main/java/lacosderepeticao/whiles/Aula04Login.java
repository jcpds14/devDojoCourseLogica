package lacosderepeticao.whiles;

import java.util.Scanner;

public class Aula04Login {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        String username = "jcpds";
        String password = "123jC123";

        while(true){
            System.out.println("Digite seu nome de usuário");
            String usernameScan = scan.nextLine();
            System.out.println("Digite sua senha");
            String passwordScan = scan.nextLine();

            if (usernameScan.equals(username) && passwordScan.equals(password)){
                System.out.println("ACESSO CONCEDIDO");
                break;
            }
                System.out.println("ACESSO NEGADO");

        }
        System.out.println("Programa encerrado");
    }
}