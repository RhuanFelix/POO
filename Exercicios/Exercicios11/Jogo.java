package Exercicios.Exercicios11;

import java.util.HashSet;
import java.util.Set;

public class Jogo {
    private ElementoTabuleiro[][] tabuleiro;
    private String[][] tabuleiroString;
    private Set<ElementoTabuleiro> posicoesVisitadas;
    private Set<ElementoTabuleiro> tesouroArmadilha;
    private Set<ElementoTabuleiro> tesouros;
    private Set<ElementoTabuleiro> armadilhas;
    private int linha, coluna;

    public Jogo() {
        tabuleiro = new ElementoTabuleiro[6][6];
        tabuleiroString = new String[6][6];
        posicoesVisitadas = new HashSet<>();
        tesouroArmadilha = new HashSet<>();
        tesouros = new HashSet<>();
        armadilhas = new HashSet<>();
        addArmadilhas();
        addTesouros();
        addVazio();
        preencherTabuleiroString();
        posicoesVisitadas.add(tabuleiro[linha][coluna]);
        tabuleiroString[linha][coluna] = tabuleiro[linha][coluna].simbolo();
    }

    public void addTesouros() {
        int[][] elementosTesouro = {{1, 4}, {2, 5}, {3, 5}};
        for (int[] posicao : elementosTesouro) {
            tabuleiro[posicao[0]][posicao[1]] = new Tesouro();
            tesouroArmadilha.add(tabuleiro[posicao[0]][posicao[1]]);
            tesouros.add(tabuleiro[posicao[0]][posicao[1]]);
        }
    }

    public void addArmadilhas() {
        int[][] elementosArmadilha = {{2, 4}, {5,1}, {3, 1}};
        for (int[] posicao : elementosArmadilha) {
            tabuleiro[posicao[0]][posicao[1]] = new Armadilha();
            tesouroArmadilha.add(tabuleiro[posicao[0]][posicao[1]]);
            armadilhas.add(tabuleiro[posicao[0]][posicao[1]]);
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
                tabuleiroString[i][j] = "x";
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

    public Set<ElementoTabuleiro> getTesouros() {
        return tesouros;
    }

    public void setTesouros(Set<ElementoTabuleiro> tesouros) {
        this.tesouros = tesouros;
    }

    public Set<ElementoTabuleiro> getArmadilhas() {
        return armadilhas;
    }

    public void setArmadilhas(Set<ElementoTabuleiro> armadilhas) {
        this.armadilhas = armadilhas;
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