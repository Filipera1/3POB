package aula_03.exercicio_02;

import java.util.Scanner;

public class Ex03
{
  public static void main(String[] args)
  {
    Scanner leia = new Scanner(System.in);

    System.out.print("Digite o nome do aluno: "); 
    String nome = leia.nextLine();

    System.out.print("Digite a nota da primeira prova: "); 
    double nota1 = leia.nextDouble();

    System.out.print("Digite a nota da segunda prova: "); 
    double nota2 = leia.nextDouble();

    double media = (nota1 + nota2)/2;

    if(media < 7)
    {
      System.out.println("Reprovado");
    }
    else
    {
      System.out.println("Aprovado");
    }
    
    leia.close();
  }
}

/*3.  Faça um programa para solicitar o nome e as duas notas de um aluno. 
Calcular sua média e informá-la. Se ela for inferior a 7, escrever "Reprovado”; 
caso contrário escrever "Aprovado". */
