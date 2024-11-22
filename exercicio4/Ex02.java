package exercicio4;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex02 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        ArrayList<Integer> matriculas = new ArrayList<>();
        ArrayList<Double> salariosBrutos = new ArrayList<>();

        for (int i = 1; i <= 100; i++) {
            System.out.print("Digite a matrícula do empregado " + i + ": ");
            matriculas.add(leia.nextInt());

            System.out.print("Digite o salário bruto do empregado " + i + ": ");
            salariosBrutos.add(leia.nextDouble());
        }

        System.out.println("Relatório dos empregados:");
        for (int i = 0; i < matriculas.size(); i++) {
            double desconto = salariosBrutos.get(i) * 0.11;
            double salarioLiquido = salariosBrutos.get(i) - desconto;

            System.out.printf("Matrícula: %d | Salário Bruto: %.2f | Desconto: %.2f | Salário Líquido: %.2f\n",
                              matriculas.get(i), salariosBrutos.get(i), desconto, salarioLiquido);
        }

        leia.close();
    }
}

/* 2.  Elabore um programa usando listas que leia a matrícula e o salário bruto de 100 empregados. 
Os dados devem ser armazenados em listas. 
O programa deve descontar 11% do salário bruto de cada empregado e ao final escrever: a matrícula, o salário bruto, o desconto e o salário líquido de cada empregado. */