package exercicio4;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex04 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        ArrayList<String> nomes = new ArrayList<>();
        ArrayList<Double> notas = new ArrayList<>();

        for (int i = 1; i <= 10; i++) {
            System.out.print("Digite o nome do aluno " + i + ": ");
            nomes.add(leia.nextLine());

            System.out.print("Digite a nota do aluno " + i + ": ");
            notas.add(leia.nextDouble());
            leia.nextLine(); // Limpar buffer
        }

        double soma = 0;
        for (double nota : notas) {
            soma += nota;
        }
        double media = soma / notas.size();

        System.out.printf("Nota média da turma: %.2f\n", media);
        System.out.println("Alunos com notas acima da média:");
        for (int i = 0; i < nomes.size(); i++) {
            if (notas.get(i) > media) {
                System.out.println(nomes.get(i) + " - " + notas.get(i));
            }
        }

        leia.close();
    }
}

/* 4.  Construa um programa usando listas que leia o nome e a nota de 10 alunos e ao final escreva: a nota média da turma; o nome e a nota dos alunos com resultados superiores a nota média da turma. */