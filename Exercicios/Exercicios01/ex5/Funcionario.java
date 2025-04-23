package Exercicios.Exercicios01.ex5;

public class Funcionario {
    private String codigo;
    private String nome;
    private String cpf;
    private String endereco;
    private String telefone;
    private int idade;
    private float salario;

    public Funcionario(String codigo, String nome, String cpf, String endereco, String telefone, int idade, float salario){
        this.codigo = codigo;
        this.nome = nome;
        this.cpf = cpf;
        this.endereco = endereco;
        this.telefone = telefone;
        this.idade = idade;
        this.salario = salario;
    }

    public String getcodigo(){
        return codigo;
    }

    public String getnome(){
        return nome;
    }

    public String getCpf(){
        return cpf;
    }

    public String getEndereco(){
        return endereco;
    }

    public String getTelefone(){
        return telefone;
    }

    public int getIdade(){
        return idade;
    }

    public float getSalario(){
        return salario;
    }

    public void setCodigo(String codigo){
        this.codigo = codigo;
    }

    public void setNome(String nome){
        this.nome = nome;
    }

    public void setCpf(String cpf){
        this.cpf = cpf;
    }

    public void setEndereco(String endereco){
        this.endereco = endereco;
    }

    public void setTelefone(String telefone){
        this.telefone = telefone;
    }

    public void setIdade(int idade){
        this.idade = idade;
    }

    public void setSalario(float salario){
        this.salario = salario;
    }

    public String toString(){
        return String.format("Código: %s \nNome: %s \nCPF: %s \nEndereço: %s \nTelefone: %s \nIdade: %d \nSalário: R$ %.2f", codigo, nome, cpf, endereco, telefone, idade, salario);
    }

    public float calcularSalarioLiquido(float salario){
        return salario * (11f / 100f);
    }
}
