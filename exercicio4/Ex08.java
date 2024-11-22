package exercicio4;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex08 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        ArrayList<Integer> numeros = new ArrayList<>();

        for (int i = 1; i <= 9; i++) {
            System.out.print("Digite o número " + i + ": ");
            numeros.add(leia.nextInt());
        }

        int maior = Integer.MIN_VALUE;
        int contador = 0;
        ArrayList<Integer> posicoes = new ArrayList<>();

        for (int i = 0; i < numeros.size(); i++) {
            if (numeros.get(i) > maior) {
                maior = numeros.get(i);
                contador = 1;
                posicoes.clear();
                posicoes.add(i);
            } else if (numeros.get(i) == maior) {
                contador++;
                posicoes.add(i);
            }
        }

        System.out.println("Maior número: " + maior);
        System.out.println("Ocorrências: " + contador);
        System.out.print("Posições: ");
        for (int posicao : posicoes) {
            System.out.print(posicao + " ");
        }

        leia.close();
    }
}

/* 8.  Faça um programa utilizando listas que leia 9 números inteiros. 
Ao final o programa deve informar o maior número, a quantidade de vezes que ele ocorre e em quais posições da lista. */
