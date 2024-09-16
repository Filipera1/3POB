package exercicio2;

import java.util.Scanner;

public class Ex07
{
    public static void main(String[] args)
    {
        Scanner leia = new Scanner(System.in);

        System.out.print("Digite o primeiro numero: ");
        double num1 = leia.nextDouble();

        System.out.print("Digite o segundo numero: ");
        double num2 = leia.nextDouble();

        System.out.print("Digite o terceiro numero: ");
        double num3 = leia.nextDouble();

        if(num1 > num2 && num1 > num3)
        {
            System.out.println("O maior numero e " + num1);
        }
            else if(num2 > num1 && num2 > num3)
            {
                System.out.println("O maior numero e " + num2);
            }
                else
                {
                    System.out.println("O maior numero e " + num3);
                }

        leia.close();
    }
}

/* 7.  Elabore um programa que leia três números diferentes e informe o maior deles. */
