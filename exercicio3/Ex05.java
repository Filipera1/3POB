package exercicio3;

import java.util.Scanner;

public class Ex05
{
    public static void main(String[] args) 
    {
        Scanner leia = new Scanner(System.in);

        int quantTotal = 0;
        String resposta = "";
        int quantHomens = 0;
        int quantMulheres = 0;
    
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

/* 5.  Crie um programa que leia a altura de um número indeterminado de pessoas. 
Ao final o programa deve informar o total de pessoas cadastradas, a quantidade de pessoas com altura inferior a 1,60 metros; 
a quantidade de pessoas com altura entre 1,60 metros e 1,80 metros e a quantidade de pessoas com altura superior a 1,80 metros.*/
