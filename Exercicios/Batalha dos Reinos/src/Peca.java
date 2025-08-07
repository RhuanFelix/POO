public abstract class Peca {
    private String nome;
    private String simbolo;
    private int posicaoX;
    private int posicaoY;
    private Jogador jogadorDono;
    private Peca pecaOponente;

    public Peca(String nome, String simbolo, Jogador jogadorDono) {
        this.nome = nome;
        this.simbolo = simbolo;
        this.jogadorDono = jogadorDono;
    }

    public abstract boolean podeMoverPara(int novoX, int novoY);

    public void MoverPara(int novoX, int novoY) {
        if (podeMoverPara(novoX, novoY)) {
            Jogo.getTabuleiro()[getPosicaoX()][getPosicaoY()] = null;
            if (pecaOponente != null) {
                jogadorDono.getJogadorOponente().getPecas().remove(pecaOponente);
                pecaOponente = null;
                Jogo.getTabuleiro()[novoX][novoY] = this;
            }
            setPosicaoX(novoX);
            setPosicaoY(novoY);
            Jogo.getTabuleiro()[novoX][novoY] = this;
        } else {
            System.out.printf("Você não pode se movimentar para a posição - Linha: %d, Coluna: %d\n", novoX, novoY);
        }
    }

    public Jogador getJogadorDono() {
        return jogadorDono;
    }

    public void setJogadorDono(Jogador jogadorDono) {
        this.jogadorDono = jogadorDono;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getSimbolo() {
        return simbolo;
    }

    public void setSimbolo(String simbolo) {
        this.simbolo = simbolo;
    }

    public int getPosicaoX() {
        return posicaoX;
    }

    public void setPosicaoX(int posicaoX) {
        this.posicaoX = posicaoX;
    }

    public int getPosicaoY() {
        return posicaoY;
    }

    public void setPosicaoY(int posicaoY) {
        this.posicaoY = posicaoY;
    }

    public Peca getPecaOponente() {
        return pecaOponente;
    }

    public void setPecaOponente(Peca pecaOponente) {
        this.pecaOponente = pecaOponente;
    }

    
}