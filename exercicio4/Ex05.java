package exercicio4;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Scanner;

public class Ex05 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        ArrayList<Integer> numeros = new ArrayList<>();

        for (int i = 1; i <= 10; i++) {
            System.out.print("Digite o número " + i + ": ");
            numeros.add(leia.nextInt());
        }

        ArrayList<Integer> crescente = new ArrayList<>(numeros);
        ArrayList<Integer> decrescente = new ArrayList<>(numeros);

        Collections.sort(crescente);
        Collections.sort(decrescente, Collections.reverseOrder());

        System.out.println("Ordem crescente: " + crescente);
        System.out.println("Ordem decrescente: " + decrescente);

        leia.close();
    }
}

/* 5.  Faça um programa utilizando listas que leia 10 números inteiros e ao final escreva estes números na ordem crescente e na ordem decrescente. */
