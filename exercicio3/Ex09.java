package exercicio3;

public class Ex09 {
    public static void main(String[] args) {
        System.out.println("Tabela de Conversão: Farenheit -> Centígrados");
        System.out.println("F\tC");

        for (int F = 100; F <= 150; F++) {
            double C = 5.0 / 9 * (F - 32);
            System.out.printf("%d\t%.2f\n", F, C);
        }
    }
}
