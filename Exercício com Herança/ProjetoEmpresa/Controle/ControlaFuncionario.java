package ProjetoEmpresa.Controle;

import ProjetoEmpresa.Dominio.Vendas;
import ProjetoEmpresa.Dominio.Gerente;

public class ControlaFuncionario {
    public static void main(String[] args) {
        // Criando um objeto Gerente
        Gerente gerente = new Gerente("007", "111.111.111-00", "Gabriel Barbosa", 1500.0f, 200.0f);
        System.out.println("Dados do Gerente:");
        gerente.exibirDados();

        System.out.println();

        // Criando um objeto Vendas
        Vendas vendedor = new Vendas("003", "000.000.000-11", "Sheila Nunes", 2000.0f, 250.0f);
        System.out.println("Dados do Vendedor:");
        vendedor.exibirDados();
    }
}
