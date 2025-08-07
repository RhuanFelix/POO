import java.util.ArrayList;
import java.util.List;

public class Jogador {
    private List<Peca> pecas;
    private String nome;
    private Jogador jogadorOponente;

    public Jogador() {}

    public Jogador(String nome) {
        this.nome = nome;
        pecas = new ArrayList<>();
    }

    public Peca addPeca(Peca peca) {
        pecas.add(peca);
        return peca;
    }

    public void removerPeca(Peca peca) {
        pecas.remove(peca);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public List<Peca> getPecas() {
        return pecas;
    }

    public Jogador getJogadorOponente() {
        return jogadorOponente;
    }

    public void setJogadorOponente(Jogador jogadorOponente) {
        this.jogadorOponente = jogadorOponente;
    }
}