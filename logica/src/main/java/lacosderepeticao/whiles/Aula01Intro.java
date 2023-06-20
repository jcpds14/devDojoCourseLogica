package lacosderepeticao.whiles;

public class Aula01Intro {
    public static void main(String[] args) {
        int contador = 0;

        while(contador <= 10){
            if(contador > 0){
                System.out.println("Contador " + contador);
            }
            if(contador == 10){
                break;
            }
            contador ++;
        }
        System.out.println(contador);
    }
}