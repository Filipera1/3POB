package exercicio01;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Ex04 
{
    public static void main(String[] args) 
    {
        Scanner leia = new Scanner (System.in);
        DecimalFormat df = new DecimalFormat("0.00");

        System.out.println("Digite o total de games vendidos hoje: ");
        int quantGames = leia.nextInt();
        System.out.println("Digite o preço unitário de um game: ");
        double precoGames = leia.nextInt();

        System.out.println("Digite o total de calculadoras vendidas hoje: ");
        int quantCalculadoras = leia.nextInt();
        System.out.println("Digite o preço unitário de uma calculadora: ");
        double precoCalculadoras = leia.nextDouble();

        System.out.println("Digite o total de canetas vendidas hoje: ");
        int quantCanetas = leia.nextInt();
        System.out.println("Digite o preço unitário de um caneta: ");
        double precoCanetas = leia.nextDouble();

        double fatGames = quantGames*precoGames;
        double fatCalculadoras = quantCalculadoras*precoCalculadoras;
        double fatCanetas = quantCanetas*precoCanetas;
        double fatTotal = fatGames + fatCalculadoras + fatCanetas;

        System.out.println("Faturamento total: R$" + df.format(fatTotal));
        System.out.println("Faturamento com Games: R$" + df.format(fatGames));
        System.out.println("Faturamento com Calculadoras: R$" + df.format(fatCalculadoras));
        System.out.println("Faturamento com Canetas: R$" + df.format(fatCanetas));

        leia.close();
    }
}

/* 4.  O camelô Zé da banca vende diariamente, games, calculadoras e canetas. Faça um programa para solicitar o total de
games, o total de calculadoras e o  total de canetas vendidas ao término do dia. O programa deve solicitar também o
preço de cada um dos produtos e ao final calcular e informar o total do faturamento com cada produto e o faturamento total. */
