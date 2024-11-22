package exercicio3;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Ex01
{
  public static void main(String[] args) 
  {
    Scanner leia = new Scanner(System.in);
    DecimalFormat df = new DecimalFormat("0.00");
    double soma = 0.0;

    for(int i = 1; i <= 10; i++)
    {
      System.out.println("Digite o preco do " + i + "° produto: ");
      double preco = leia.nextDouble();
      soma = soma + preco;
    }

    System.out.println("Somatorio do preço dos produtos: R$" + df.format(soma));
    
    leia.close();
  }
}

/*1. Faça um programa que leia o preço de 10 produtos. Ao final escreva o somatório dos preços. */
