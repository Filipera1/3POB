package exercicio2;

import java.util.Scanner;

public class Ex08
{
    public static void main(String[] args)
    {
        Scanner leia = new Scanner(System.in);

        System.out.print("Digite o comprimento do lado x: ");
        double x = leia.nextDouble();

        System.out.print("Digite o comprimento do lado y: ");
        double y = leia.nextDouble();

        System.out.print("Digite o comprimento do lado z: ");
        double z = leia.nextDouble();

        if((x + z > y) && (x + y > z) && (y + z > x))
        {
            if((x == z) && (y == z))
            {
                System.out.println("Essa medidas formam um triangulo equilatero!");
            }
            else
            {
                if((x == y) || (x == z) || (y == z))
                {
                    System.out.println("Essa medidas formam um triangulo isosceles!");
                }
                else 
                {
                    System.out.println("Essa medidas formam um triangulo escaleno!");
                }
            }
        }
        else
        {
            System.out.println("Essa medidas nao formam um triangulo!");
        }
        

        leia.close();
    }
}

/* 9. Dado três valores X,Y,Z, verificar se eles podem ser o comprimento dos lados de um triângulo e, se forem, 
verificar se é um triângulo, equilátero, isósceles ou escaleno. Se eles não formarem um triângulo, escreverem uma mensagem. 
Obs: O comprimento de cada lado de um triângulo é menor do que a soma dos comprimentos dos outros dois lados; chama-se 
triângulo equilátero ao triângulo que tem os comprimentos dos três lados iguais; chama-se triângulo isósceles ao triângulo 
que tem os comprimentos de dois lados iguais. Portanto, todo triângulo equilátero é também isósceles; chama-se triângulo escaleno 
ao triângulo que tem os comprimentos dos três lados diferentes.*/
