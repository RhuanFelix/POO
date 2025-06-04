public class Pessoa{
    private String nome, CPF, endereco;

    public Pessoa(String nome, String CPF, String endereco){
        super(); // O java já coloca de forma automática, não é obrigatório colocar
        this.nome = nome;
        this.CPF = CPF;
        this.endereco = endereco;
    }

    public String getNome(){
        return nome;
    }
    public String getCPF(){
        return CPF;
    }
    public String getEndereco(){
        return endereco;
    }

    public void setNome(String nome){
        this.nome = nome;
    }
    public void setCPF(String CPF){
        this.CPF = CPF;
    }
    public void setEndereco(String endereco){
        this.endereco = endereco;
    }
}