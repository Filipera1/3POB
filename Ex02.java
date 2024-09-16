package aula_03.exercicio_02;

import java.util.Scanner;

public class Ex02
{
  public static void main(String[] args) 
  {
    Scanner leia = new Scanner(System.in);

    System.out.print("Digite o ano atual: ");
    int anoAtual = leia.nextInt();

    System.out.print("Digite o ano de nascimento: ");
    int anoNascimento = leia.nextInt();

    int idadeAprox = anoAtual - anoNascimento;

    System.out.print("A idade aproximada e: " + idadeAprox);

    if(idadeAprox < 16)
    {
      System.out.println("Nao pode votar");
    }
    else
    {
      System.out.println("E eleitor");
    }
    
    leia.close();
  }
}

/*2.  Crie um programa para solicitar o ano atual e o ano de nascimento de uma pessoa. 
Calcular sua idade aproximada e informá-la. 
Se sua idade for inferior a 16 anos, escrever a mensagem "Não pode votar"; caso contrário,
emitir a mensagem "É eleitor". */
