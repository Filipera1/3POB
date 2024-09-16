package aula_03.exercicio_02;

import java.util.Scanner;

public class Ex06
{
    public static void main(String[] args)
    {
        Scanner leia = new Scanner(System.in);

        System.out.print("Digite o valor do salario minimo atual: ");
        double salarioMinimo = leia.nextDouble();

        System.out.print("Digite o nome do funcionario: ");
        String nome = leia.nextLine();

        System.out.print("Digite o valor do salario do funcionario: ");
        double salarioBruto = leia.nextDouble();

        double desconto;

        if(salarioBruto < salarioMinimo)
        {
          desconto = salarioBruto * 0.02;
        }
          else if(salarioBruto > salarioMinimo)
          {
            desconto = salarioBruto * 0.08;
          }
            else
            {
              desconto = salarioBruto * 0.05;
            }

        double salarioLiquido = salarioBruto - desconto;

        System.out.println("O salario liquido do funcionario " + nome + " e " + salarioLiquido + ", e o desconto foi de " + desconto);

        leia.close();
    }
}

/* 6.  Crie um programa para ler o valor do salário mínimo, o nome e o salário bruto de um empregado. Se o seu salário for menor que um salário mínimo descontar 2%; se for igual, descontar 5%, e se for superior, descontar 8%. 
Informar o valor do desconto e o salário líquido. */