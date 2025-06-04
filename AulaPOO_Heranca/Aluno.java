public class Aluno extends Pessoa {
    private int nota;

    public Aluno(String nome, String CPF, String endereco, int nota){
        super(nome, CPF, endereco);
        this.nota = nota;
    }

    public int getNota(){
        return nota;
    }

    public void setNota(int nota){
        this.nota = nota;
    }
}