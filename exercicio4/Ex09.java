package exercicio4;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex09 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        ArrayList<Integer> listaA = new ArrayList<>();
        ArrayList<Integer> listaB = new ArrayList<>();
        ArrayList<Integer> listaC = new ArrayList<>();

        System.out.println("Digite os números para a lista A:");
        for (int i = 1; i <= 10; i++) {
            System.out.print("Elemento " + i + ": ");
            listaA.add(leia.nextInt());
        }

        System.out.println("Digite os números para a lista B:");
        for (int i = 1; i <= 10; i++) {
            System.out.print("Elemento " + i + ": ");
            listaB.add(leia.nextInt());
        }

        for (int i = 0; i < 10; i++) {
            listaC.add(listaA.get(i) + listaB.get(i));
        }

        System.out.println("Lista C (soma dos elementos de A e B):");
        System.out.println(listaC);

        leia.close();
    }
}


/* 9.  Elabore um programa que contenha três listas de 10 posições A, B e C. O objetivo do programa é armazenar números nas listas A e B e fazer com que a lista C receba a soma dos elementos correspondentes de A e B. Ao final o programa deve exibir no vídeo o conteúdo da lista C. */