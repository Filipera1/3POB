package exercicio4;

import java.util.ArrayList;
import java.util.Scanner;

public class Ex03 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        ArrayList<Integer> codigos = new ArrayList<>();
        ArrayList<String> nomes = new ArrayList<>();
        ArrayList<String> telefones = new ArrayList<>();

        for (int i = 1; i <= 100; i++) {
            System.out.print("Digite o código da pessoa " + i + ": ");
            codigos.add(leia.nextInt());
            leia.nextLine(); // Limpar buffer

            System.out.print("Digite o nome da pessoa " + i + ": ");
            nomes.add(leia.nextLine());

            System.out.print("Digite o telefone da pessoa " + i + ": ");
            telefones.add(leia.nextLine());
        }

        String continuar;
        do {
            System.out.print("Digite o código para consulta: ");
            int codigo = leia.nextInt();

            int index = codigos.indexOf(codigo);
            if (index != -1) {
                System.out.println("Nome: " + nomes.get(index));
                System.out.println("Telefone: " + telefones.get(index));
            } else {
                System.out.println("Código não encontrado.");
            }

            System.out.print("Deseja fazer outra consulta? (s/n): ");
            continuar = leia.next();
        } while (continuar.equalsIgnoreCase("s"));

        leia.close();
    }
}

/* 3.  Faça um programa usando listas que armazene o código, o nome e o telefone de 100 pessoas. O programa deve permitir que o usuário faça uma consulta dos dados de uma pessoa a partir de seu código. Esta consulta pode ser repetida se o usuário desejar, caso contrário, o programa deve ser encerrado. */

