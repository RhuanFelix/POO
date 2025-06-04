public class Professor extends Funcionario {
    private String disciplina;

    public Professor(String nome, String CPF, String endereco, double salario, String disciplina){
        super(nome, CPF, endereco, salario);
        this.disciplina = disciplina;
    }

    public String getDisciplina(){
        return disciplina;
    }

    public void setDisciplina(String disciplina){
        this.disciplina = disciplina;
    }
}