package exercicio2;

import java.util.Scanner;

public class Ex01
{
  public static void main(String[] args) 
  {
    Scanner leia = new Scanner(System.in);

    System.out.print("Digite o nome: ");
    String nome = leia.nextLine();

    System.out.print("Digite a idade: ");
    int idade = leia.nextInt();

    if(idade < 18)
    {
      System.out.println("É menor");
    }
    
    leia.close();
  }
}

/*1.  Faça um programa para solicitar o nome e a idade de uma pessoa. 
Se sua idade for menor que 18 anos, escrever a mensagem: "É menor". */
