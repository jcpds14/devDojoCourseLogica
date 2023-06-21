package lacosderepeticao.fors;

public class Aula02Ex03 {
    public static void main(String[] args) {
        for (int i = 1; i <= 10; i++) {
            for (int j = 1; j <= 10; j++) {
                int tabuada = i * j;

                System.out.println(i + " * " + j + " = " + tabuada);
                if(j==10){
                    System.out.println("----------------------");
                }
            }
        }
    }
}