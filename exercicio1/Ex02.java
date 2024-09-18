package exercicio01;

import java.util.Scanner;

public class Ex02
{
  public static void main(String[] args) 
  {
    Scanner leia = new Scanner(System.in);

    System.out.print("Digite a temperatura em graus Farenheit: ");
    double tempFarenheit = leia.nextDouble();

    double tempCelsius = (tempFarenheit - 32) * (5/9);

    System.out.println("A temperatura de " + tempFarenheit + " graus Farenheit e igual a " + tempCelsius + "graus Celsius");

    leia.close();
  }
}

/* 2. Faça um programa que dado o valor da temperatura em graus FARENHEIT, calcular e escrever o valor da temperatura em graus CELSIUS. 
Fórmula: C = 5/9 * (F - 32) */