package exercicio1;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Ex01
{
  public static void main(String[] args) 
  {
    Scanner leia = new Scanner(System.in);
    DecimalFormat df = new DecimalFormat("0.00");

    System.out.print("Digite a matricula do primeiro funcionario: ");
    int matricula1 = leia.nextInt();
    System.out.print("Digite o salario do primeiro funcionario: ");
    double salario1 = leia.nextDouble();

    System.out.print("Digite o a matricula do segundo funcionario: ");
    int matricula2 = leia.nextInt();
    System.out.print("Digite o salario do segundo funcionario: ");
    double salario2 = leia.nextDouble();

    double desconto = salario1*0.05; 

    double acrescimo = salario2*0.09; 

    salario1 = salario1 *(1 - desconto);

    salario2 = salario2 *(1 + acrescimo);

    System.out.println("O salario do funcionario de matricula " + matricula1 + "e de: " + df.format(salario1) + "; o desconto foi de: " + df.format(desconto) + "reais");

    System.out.println("O salario do funcionario de matricula " + matricula2 + "e de: " + df.format(salario2) + "; o acrescimo foi de: " + df.format(acrescimo) + "reais");

    leia.close();
  }
}

/* 1.  Crie um programa para ler a matrícula e o salário de dois empregados. 
Descontar 5% no salário do primeiro e acrescentar 9% no salário do segundo. 
Informar: o valor do desconto do primeiro; o valor do acréscimo do segundo; 
o salário final do primeiro; o salário final do segundo. */
