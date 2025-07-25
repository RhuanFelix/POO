package Exercicios.Exercicios11;

public class Jogador {
    Jogo jogo;
    private int movimentos, pontos;


    public Jogador() {
        jogo = new Jogo();
        movimentos = 0;
        pontos = 0;
    }

    public void posicao(String posicao) {
        switch (posicao) {
            case "w" -> {
                jogo.setLinha(jogo.getLinha() - 1);
                if (!verificarPosicao(jogo.getLinha(), jogo.getColuna())) {
                    jogo.setLinha(jogo.getLinha() + 1);
                }

            }

            case "s" -> {
                jogo.setLinha(jogo.getLinha() + 1);
                if (!verificarPosicao(jogo.getLinha(), jogo.getColuna())) {
                    jogo.setLinha(jogo.getLinha() - 1);
                }
            }

            case "a" -> {
                jogo.setColuna(jogo.getColuna() - 1);
                if (!verificarPosicao(jogo.getLinha(), jogo.getColuna())) {
                    jogo.setColuna(jogo.getColuna() + 1);
                }
            }

            case "d" -> {
                jogo.setColuna(jogo.getColuna() + 1);
                if (!verificarPosicao(jogo.getLinha(), jogo.getColuna())) {
                    jogo.setColuna(jogo.getColuna() - 1);
                }
            }
        }
    }

    private boolean verificarPosicao(int linha, int coluna) {
            if (linha < 0) {
                System.out.println("Posição inválida, tente novamente!");
                return false;
            } else if (coluna < 0) {;
                System.out.println("Posição inválida, tente novamente!");
                return false;
            } else if (linha > 5) {
                System.out.println("Posição inválida, tente novamente!");
                return false;
            } else if (coluna > 5) {
                System.out.println("Posição inválida, tente novamente!");
                return false;
            } else if (posicaoVisitada(linha, coluna)) {
                System.out.println("Você já visitou esta posição!");
                return false;
            } else {

                ElementoTabuleiro elementoTabuleiro = jogo.getTabuleiro()[linha][coluna];
                boolean elementoVazio = false;

                for (ElementoTabuleiro tesouroOuArmadilha : jogo.getTesouroArmadilha()) {
                    if (elementoTabuleiro == tesouroOuArmadilha) {
                        jogo.getTabuleiroString()[linha][coluna] = elementoTabuleiro.simbolo();
                        pontos += elementoTabuleiro.interagir();
                        elementoVazio = false;
                    } else {
                        elementoVazio = true;
                    }
                }

                if (elementoVazio) {
                    jogo.getTabuleiroString()[linha][coluna] = elementoTabuleiro.simbolo();
                }

                ++movimentos;
                jogo.getPosicoesVisitadas().add(elementoTabuleiro);

                return true;
            }
        }

    public boolean posicaoVisitada(int linha, int coluna) {
        for (ElementoTabuleiro elemento : jogo.getPosicoesVisitadas()) {
            if (elemento == jogo.getTabuleiro()[linha][coluna]) {
                return true;
            }
        }
        return false;
    }

    public int getMovimentos() {
        return movimentos;
    }

    public void setMovimentos(int movimentos) {
        this.movimentos = movimentos;
    }

    public int getPontos() {
        return pontos;
    }

    public void setPontos(int pontos) {
        this.pontos = pontos;
    }

    public Jogo getJogo() {
        return jogo;
    }

    public void setJogo(Jogo jogo) {
        this.jogo = jogo;
    }
}