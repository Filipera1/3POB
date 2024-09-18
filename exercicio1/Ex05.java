package exercicio01;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Ex05 
{
  public static void main(String[] args) 
  {
    Scanner leia = new Scanner(System.in);
    DecimalFormat df = new DecimalFormat("0.00");

    System.out.print("Digite o numero de vitorias do time: ");
    int vitorias = leia.nextInt();
    System.out.print("Digite o numero de derrotas do time: ");
    int derrotas = leia.nextInt();
    System.out.print("Digite o numero de empates do time: ");
    int empates = leia.nextInt();
    
    int jogos = vitorias + derrotas + empates;
    int pontosGanhos = (vitorias*3) + empates;
    int pontosPerdidos = (empates*2) + (derrotas*3);
    double aproveitamento = (pontosGanhos)/(jogos*3.0) * 100;
    
    System.out.println("Partidas jogadas: " + jogos);
    System.out.println("Pontos ganhos: " + pontosGanhos);
    System.out.println("Pontos perdidos: " + pontosPerdidos);
    System.out.println("Percentual de aproveitamento: " + df.format(aproveitamento) + "%");
    
    leia.close();
  }

}