package exercicio4;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        ArrayList<Integer> numeros = new ArrayList<>();

        for (int i = 1; i <= 10; i++) {
            System.out.print("Digite o número " + i + ": ");
            numeros.add(leia.nextInt());
        }

        int positivos = 0, negativos = 0, nulos = 0;
        for (int numero : numeros) {
            if (numero > 0) {
                positivos++;
            } else if (numero < 0) {
                negativos++;
            } else {
                nulos++;
            }
        }

        System.out.println("Números positivos: " + positivos);
        System.out.println("Números negativos: " + negativos);
        System.out.println("Números nulos: " + nulos);

        leia.close();
    }
}

/* 6.  Elabore um programa utilizando listas para armazenar 10 números e ao final escreva a quantidade de números negativos, positivos e nulos. */
