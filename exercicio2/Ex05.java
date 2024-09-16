package exercicio2;

import java.util.Scanner;

public class Ex05
{
    public static void main(String[] args)
    {
        Scanner leia = new Scanner(System.in);

        System.out.print("Digite o primeiro numero: ");
        int num1 = leia.nextInt();

        System.out.print("Digite o segundo numero: ");
        int num2 = leia.nextInt();

        if(num1 > num2)
        {
            System.out.println("O numero " + num1 + " e maior que " + num2 + "!");
        }
            else if(num2 > num1)
            {
                System.out.println("O numero " + num2 + " e maior que " + num1 + "!");
            }
                else
                {
                    System.out.println("Os numeros " + num1 + " e " + num2 + " sao iguais!");
                }
        
        leia.close();
    }
}

/*5.Faça um programa que leia dois números e mostre qual o maior dos dois. 
    O programa deve informar caso sejam iguais. */
