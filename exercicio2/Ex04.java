package aula_03.exercicio_02;

import java.util.Scanner;

public class Ex04
{
    public static void main(String[] args)
    {
        Scanner leia = new Scanner(System.in);

        System.out.print("Digite o nome do empregado: ");
        String nome = leia.nextLine();

        System.out.print("Digite o sexo do empregado: ");
        String sexo = leia.nextLine();

        sexo.toUpperCase();

        System.out.print("Digite o salario bruto do empregado: ");
        double salarioBruto = leia.nextDouble();

        double desconto;

        if(sexo == "MASCULINO" || sexo == "M")
        {
            desconto = salarioBruto * (0.05);
        }
        else
        {
            desconto = salarioBruto * (0.03);
        }

        double salarioLiquido = salarioBruto - desconto;

        System.out.println("Valor do desconto: " + desconto);
        System.out.println("Salario liquido: " + salarioLiquido);

        leia.close();

    }
}

/*4.  Elabore um programa para solicitar o nome, o sexo e o salário bruto de um empregado. 
Se o seu sexo for masculino, descontar 5% de seu salário; caso contrário, descontar 3%. 
Informar o valor do desconto e o salário líquido. */
