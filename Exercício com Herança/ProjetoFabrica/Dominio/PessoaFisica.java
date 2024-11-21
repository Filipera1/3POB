package ProjetoFabrica.Dominio;

import ProjetoFabrica.Dominio.Cliente;

public class PessoaFisica extends Cliente{
    private String cpf;
    private String nome;

    public PessoaFisica(String endereco, String telefone, String cpf, String nome){
        super(endereco, telefone);

        this.cpf = cpf;
        this.nome = nome;
    }

    @Override
    public void exibirDados() {
        System.out.println("Endereço: " + endereco);
        System.out.println("Telefone: " + telefone);
        System.out.println("CPF: " + cpf);
        System.out.println("Nome: " + nome);
    }
}
