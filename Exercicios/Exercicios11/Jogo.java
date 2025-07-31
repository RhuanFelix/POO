package Exercicios.Exercicios11;

import java.util.HashSet;
import java.util.Random;
import java.util.Set;

public class Jogo {
    private ElementoTabuleiro[][] tabuleiro;
    private String[][] tabuleiroString;
    private Set<ElementoTabuleiro> posicoesVisitadas;
    private Set<ElementoTabuleiro> tesouroArmadilha;
    private Random random;
    private int linha, coluna;

    public Jogo() {
        tabuleiro = new ElementoTabuleiro[6][6];
        tabuleiroString = new String[6][6];
        posicoesVisitadas = new HashSet<>();
        tesouroArmadilha = new HashSet<>();
        random = new Random();
        addArmadilhas();
        addTesouros();
        addVazio();
        preencherTabuleiroString();
        posicoesVisitadas.add(tabuleiro[linha][coluna]);
        tabuleiroString[linha][coluna] = tabuleiro[linha][coluna].simbolo();
    }

    public void addTesouros() {
        int contador = 1;
        while (contador <= 3) {
            int linhaTemp = random.nextInt(6);
            int colunaTemp = random.nextInt(6);

            if (tabuleiro[linhaTemp][colunaTemp] == null) {
                tabuleiro[linhaTemp][colunaTemp] = new Tesouro();
                tesouroArmadilha.add(tabuleiro[linhaTemp][colunaTemp]);
                ++contador;
            }
        }
    }

    public void addArmadilhas() {
        int contador = 1;
        while (contador <= 3) {
            int linhaTemp = random.nextInt(6);
            int colunaTemp = random.nextInt(6);

            if (tabuleiro[linhaTemp][colunaTemp] == null) {
                tabuleiro[linhaTemp][colunaTemp] = new Armadilha();
                tesouroArmadilha.add(tabuleiro[linhaTemp][colunaTemp]);
                ++contador;
            }
        }
    }

    public void addVazio() {
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                if (tabuleiro[i][j] == null) {
                    tabuleiro[i][j] = new Vazio();
                }
            }
        }
    }

    private void preencherTabuleiroString() {
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                tabuleiroString[i][j] = "🟥";
            }
        }
    }

    public void exibirTabuleiro() {
        for (int i = 0; i < 6; i++) {
            for (int j = 0; j < 6; j++) {
                System.out.print(tabuleiroString[i][j] + " ");
                if (j == 5) {
                    System.out.println();
                }
            }
        }
    }

    public String[][] getTabuleiroString() {
        return tabuleiroString;
    }

    public void setTabuleiroString(String[][] tabuleiroString) {
        this.tabuleiroString = tabuleiroString;
    }

    public Set<ElementoTabuleiro> getTesouroArmadilha() {
        return tesouroArmadilha;
    }

    public void setTesouroArmadilha(Set<ElementoTabuleiro> tesouroArmadilha) {
        this.tesouroArmadilha = tesouroArmadilha;
    }

    public ElementoTabuleiro[][] getTabuleiro() {
        return tabuleiro;
    }

    public void setTabuleiro(ElementoTabuleiro[][] tabuleiro) {
        this.tabuleiro = tabuleiro;
    }

    public Set<ElementoTabuleiro> getPosicoesVisitadas() {
        return posicoesVisitadas;
    }

    public void setPosicoesVisitadas(Set<ElementoTabuleiro> posicoesVisitadas) {
        this.posicoesVisitadas = posicoesVisitadas;
    }

    public int getLinha() {
        return linha;
    }

    public void setLinha(int linha) {
        this.linha = linha;
    }

    public int getColuna() {
        return coluna;
    }

    public void setColuna(int coluna) {
        this.coluna = coluna;
    }
}