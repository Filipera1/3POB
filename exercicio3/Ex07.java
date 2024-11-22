package exercicio3;

import java.util.Scanner;

public class Ex07 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int maior = Integer.MIN_VALUE;
        String continuar;

        do {
            System.out.print("Digite um número inteiro: ");
            int numero = leia.nextInt();

            if (numero > maior) {
                maior = numero;
            }

            System.out.print("Deseja continuar? (s/n): ");
            continuar = leia.next();
        } while (continuar.equalsIgnoreCase("s"));

        System.out.println("O maior número digitado foi: " + maior);

        leia.close();
    }
}
