package ProjetoFabrica.Dominio;

import ProjetoFabrica.Dominio.Cliente;

public class PessoaJuridica extends Cliente{
    private String cnpj;
    private String razaoSocial;

    public PessoaJuridica(String endereco, String telefone, String cnpj, String razaoSocial){
        super(endereco, telefone);

        this.cnpj = cnpj;
        this.razaoSocial = razaoSocial;
    }

    @Override
    public void exibirDados() {
        System.out.println("Endereço: " + endereco);
        System.out.println("Telefone: " + telefone);
        System.out.println("CNPJ: " + cnpj);
        System.out.println("Razao Social: " + razaoSocial);
    }
}

