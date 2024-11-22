package exercicio3;

import java.util.Scanner;

public class Ex06 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        int totalPessoas = 0, menoresDe18 = 0;
        String continuar;

        do {
            System.out.print("Digite a idade da pessoa: ");
            int idade = leia.nextInt();

            totalPessoas++;
            if (idade < 18) {
                menoresDe18++;
            }

            System.out.print("Deseja continuar? (s/n): ");
            continuar = leia.next();
        } while (continuar.equalsIgnoreCase("s"));

        double percentualMenores = (menoresDe18 / (double) totalPessoas) * 100;
        double percentualMaiores = 100 - percentualMenores;

        System.out.println("Total de pessoas cadastradas: " + totalPessoas);
        System.out.printf("Porcentagem de menores de 18 anos: %.2f%%\n", percentualMenores);
        System.out.printf("Porcentagem de 18 anos ou mais: %.2f%%\n", percentualMaiores);

        leia.close();
    }
}

/* 6.  Elabore um programa que leia a idade de diversas pessoas e ao final informe: o total de pessoas cadastradas, a
porcentagem de pessoas com idade inferior a 18 anos, a porcentagem de pessoas com idade igual ou superior a 18 anos. */
