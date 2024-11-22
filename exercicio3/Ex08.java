package exercicio3;

import java.util.Scanner;

public class Ex08 {
    public static void main(String[] args) {
        Scanner leia = new Scanner(System.in);
        String nomeMaisAlto = "";
        double alturaMaisAlta = 0, somaAlturas = 0;

        for (int i = 1; i <= 10; i++) {
            System.out.print("Digite o nome da pessoa " + i + ": ");
            String nome = leia.next();
            System.out.print("Digite a altura da pessoa " + i + ": ");
            double altura = leia.nextDouble();

            somaAlturas += altura;

            if (altura > alturaMaisAlta) {
                alturaMaisAlta = altura;
                nomeMaisAlto = nome;
            }
        }

        double alturaMedia = somaAlturas / 10;
        System.out.printf("Altura média do grupo: %.2f\n", alturaMedia);
        System.out.println("Pessoa mais alta: " + nomeMaisAlto + " com " + alturaMaisAlta + " metros.");

        leia.close();
    }
}
