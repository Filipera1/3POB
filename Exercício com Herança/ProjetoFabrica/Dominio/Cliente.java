package ProjetoFabrica.Dominio;

public class Cliente {
    protected String endereco;
    protected String telefone;

    public Cliente(String endereco, String telefone){
        this.endereco = endereco;
        this.telefone = telefone;
    }

    public String getEndereco() {
        return endereco;
    }

    public String getTelefone() {
        return telefone;
    }

    public void setEndereco(String endereco) {
        this.endereco = endereco;
    }

    public void setTelefone(String telefone) {
        this.telefone = telefone;
    }
    
}
