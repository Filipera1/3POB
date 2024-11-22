package exercicio4;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex01 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        ArrayList<String> nomes = new ArrayList<>();
        ArrayList<Double> alturas = new ArrayList<>();

        for (int i = 1; i <= 50; i++) {
            System.out.print("Digite o nome da pessoa " + i + ": ");
            nomes.add(leia.nextLine());

            System.out.print("Digite a altura da pessoa " + i + ": ");
            alturas.add(leia.nextDouble());
            leia.nextLine(); // Limpar o buffer
        }

        System.out.println("Pessoas com mais de 1,70 metros:");
        for (int i = 0; i < nomes.size(); i++) {
            if (alturas.get(i) > 1.70) {
                System.out.println(nomes.get(i) + " - " + alturas.get(i) + " metros");
            }
        }

        leia.close();
    }
}

/* 1.  Faça um programa utilizando listas que leia o nome e a altura de 50 pessoas e ao final escreva o nome e a altura das pessoas com mais de 1,70 metros. */