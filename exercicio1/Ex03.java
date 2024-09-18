package exercicio1;

import java.text.DecimalFormat;
import java.util.Scanner;

public class Ex03
{
  public static void main(String[] args) 
  {
    Scanner leia = new Scanner(System.in);
    DecimalFormat df = new DecimalFormat("0.00");

    System.out.print("Digite o codigo da turma: ");
    int codigo = leia.nextInt();

    System.out.print("Digite a quantidade de alunos do sexo masculino: ");
    int quantMasc = leia.nextInt();

    System.out.print("Digite a quantidade de alunos do sexo feminino: ");
    int quantFem = leia.nextInt();

    System.out.print("Digite a quantidade total de alunos aprovados: ");
    int quantAprovados = leia.nextInt();

    int totalAlunos = quantMasc + quantFem;
    int reprovados = totalAlunos - quantAprovados;

    double percentualMasculino = (quantMasc * 100.0) / totalAlunos;
    double percentualFeminino = (quantFem * 100.0) / totalAlunos;
    double percentualReprovados = (reprovados * 100.0) / totalAlunos;

    System.out.println("Codigo da turma: " + codigo);
    System.out.println("Porcentagem de alunos do sexo masculino: " + df.format(percentualMasculino) + "%");
    System.out.println("Porcentagem de alunos do sexo feminino: " + df.format(percentualFeminino) + "%");
    System.out.println("Porcentagem de alunos reprovados: " + df.format(percentualReprovados) + "%");
    System.out.println("Total de alunos na turma: " + totalAlunos);

    leia.close();
  }
}

/* 3.  Faça um programa para solicitar o código, a quantidade de alunos do sexo masculino, 
a quantidade de alunos do sexo feminino e a quantidade de alunos aprovados de uma determinada turma. 
Calcular e informar: a porcentagem de alunos do sexo masculino; a porcentagem de alunos do sexo feminino;
a porcentagem de alunos reprovados; o total de alunos da turma. */
