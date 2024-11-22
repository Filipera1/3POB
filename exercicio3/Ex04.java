package exercicio3;

import java.util.Scanner;

public class Ex04 
{
    public static void main(String[] args) 
    {
        Scanner leia = new Scanner(System.in);

        int quantHomens = 0;
        int quantMulheres = 0;
        int quantTotal = 0;
        String resposta = "";
    
        do
        {
            System.out.println("Digite o sexo da pessoa a ser cadastrada: ");
            String sexo = leia.nextLine().toLowerCase();

            if(sexo.equals("masculino") || sexo.equals("m"))
            {
                quantHomens++;
            }
            else if(sexo.equals("feminino") || sexo.equals("f"))
            {
                quantMulheres++;
            }
            else
            {
                System.out.println("Sexo inválido. Tente novamente.");
                continue;
            }

            System.out.println("Deseja continuar? (s = sim / n = nao): ");
            resposta = leia.next().toLowerCase();

        } while(resposta.equals("s"));

        quantTotal = quantHomens + quantMulheres;

        System.out.println("Total de pessoas cadastradas: " + quantTotal);
        System.out.println("Total de mulheres cadastradas: " + quantMulheres);
        System.out.println("Total de homens cadastrados: " + quantHomens);

        leia.close();
    }
}


/* 4.  Elabore um programa que leia o sexo de um número indeterminado de pessoas. 
Ao final escreva a quantidade de pessoas cadastradas e o total de pessoas  de cada sexo. */
