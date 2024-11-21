package ProjetoFabrica.Controle;

import ProjetoFabrica.Dominio.PessoaFisica;
import ProjetoFabrica.Dominio.PessoaJuridica;

public class ControlaFuncionario {
    public static void main(String[] args) {
        
        PessoaFisica pessoaFisica = new PessoaFisica("Rua A", "(00)111111111", "000.000.000-11", "Gabriel Barbosa");
        System.out.println("Dados do Cliente:");
        pessoaFisica.exibirDados();

        System.out.println();

        PessoaJuridica pessoaJuridica = new PessoaJuridica("Rua B", "(11)111111111", "00.000.000/0000-11", "Empresario(individual)");
        System.out.println("Dados do Cliente:");
        pessoaJuridica.exibirDados();
    }
}
