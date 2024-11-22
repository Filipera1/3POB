package exercicio3;

import java.util.Scanner;
import java.text.DecimalFormat;

public class Ex03 
{
    public static void main(String[] args) 
    {
        Scanner leia = new Scanner(System.in);
        DecimalFormat df = new DecimalFormat("0.00");

        int soma = 0;
    
        for(int i = 1; i <= 10; i++)
        {
            System.out.println("Digite a " + i + "° idade: ");
            int idade = leia.nextInt();
            soma = soma + idade;
        }

        double media = soma/10.0;
    
        System.out.println("Media das idades inseridas: " + df.format(media));
        
        leia.close();
    }
}

/* 3. Faça um programa que leia a idade de 10 pessoas. Ao final escreva a média das idades. */
