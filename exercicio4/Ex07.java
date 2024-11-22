package exercicio4;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex07 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        ArrayList<Integer> numeros = new ArrayList<>();
        ArrayList<Integer> quadrados = new ArrayList<>();

        for (int i = 1; i <= 10; i++) {
            System.out.print("Digite o número " + i + ": ");
            numeros.add(leia.nextInt());
        }

        for (int numero : numeros) {
            quadrados.add(numero * numero);
        }

        System.out.println("Quadrados dos números:");
        System.out.println(quadrados);

        leia.close();
    }
}

/* 7.  Construa um programa que armazene números inteiros em uma lista de 10 posições, calcule o quadrado de cada elemento armazenado nesta lista e armazene o resultado em uma outra lista. 
Ao final os dados da segunda lista devem ser exibidos. */