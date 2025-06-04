public class Funcionario extends Pessoa {
    private double salario;

    public Funcionario(String nome, String CPF, String endereco, double salario){
        super(nome, CPF, endereco);
        this.salario = salario;
    }

    public double getSalario(){
        return salario;
    }

    public void setSalario(double salario){
        this.salario = salario;
    }
}