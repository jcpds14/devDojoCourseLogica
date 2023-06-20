public class CalculadoraDiferencaIdade {
    public static void main(String[] args) {
        int idade1 = 25;
        int idade2 = 37;
        int diferencaIdade = idade1 - idade2;
        int diferencaIdadePositivo = Math.abs(diferencaIdade);

        System.out.println("A diferença de idades é de: " + diferencaIdadePositivo + " anos");
    }
}
