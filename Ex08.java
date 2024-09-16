package aula_03.exercicio_02;

import java.util.Scanner;

public class Ex08
{
    public static void main(String[] args)
    {
        Scanner leia = new Scanner(System.in);

        System.out.print("Digite o codigo do produto: ");
        int cod = leia.nextInt();

        System.out.print("Digite o quantidade de produtos: ");
        int quant = leia.nextInt();

        System.out.print("Digite o preco unitario: ");
        double preco = leia.nextDouble();

        System.out.print("Digite a forma de pagamento: ");
        int formaPagamento = leia.nextInt();

        switch(formaPagamento)
        {
            case 1: double desconto = 0.1; 
                    break;

            case 2: desconto = 0.02;
                    break;

            case 3: desconto = 0.05;
                    break;

            case 4: desconto = 0.03;
                    break;

            default: System.out.print("Opcao invalida!");
                    break;
        }

        double valorTotal = quant * preco * (1 - desconto);

        System.out.println("Total a pagar: " + valorTotal + " reais");
        System.out.println("Desconto: " + desconto);
        

        leia.close();
    }
}

/* 8.  Faça um programa que leia o código, a quantidade, o preço unitário e a forma de pagamento (1 - Dinheiro, 2 - Cheque, 3 - Cartão débito, 4 - Cartão crédito) de um produto. Pagamentos em dinheiro recebem um desconto de 10%, em cartão de débito 5%, em cartão de crédito 3%  e em cheque 2%. O programa deve informar o valor do desconto e o valor final a pagar. */