package Exercicios.Exercicios11;

import java.util.Scanner;

public class Main {
    private static Jogador jogador;
    private static int contadorTesouros = 0;
    public static void main(String[] args) {
        jogador = new Jogador();
        Scanner scanner = new Scanner(System.in);
        Jogo jogo = jogador.getJogo();

        while (true) {
            System.out.println("================================");
            jogo.exibirTabuleiro();

            System.out.println("Digite a letra para ir na direção correspondente (w - cima, s - baixo, a - esquerda, d - direita):");
            String escolha = scanner.nextLine();
            escolha.toLowerCase();

            if (escolha.equals("w") || escolha.equals("s") || escolha.equals("a") || escolha.equals("d")) {
                jogador.posicao(escolha);

                if (jogador.getMovimentos() == 10) {
                    jogo.exibirTabuleiro();
                    informacoes();
                    System.out.println("Você atingiu o valor máximo de movimentos!");
                    break;

                } else if (jogo.getTabuleiro()[jogo.getLinha()][jogo.getColuna()] instanceof Tesouro) {
                    ++contadorTesouros;

                    if (contadorTesouros == 3) {
                        jogo.exibirTabuleiro();
                        informacoes();
                        System.out.println("Parabéns, você encontrou todos os tesouros!");
                        break;
                    }
                } 

                informacoes();

            } else {
                System.out.println("Opção inválida!");
            }
        }

        scanner.close();
    }

    private static void informacoes() {
        System.out.println("Posição atual [Linha,Coluna]: [" + jogador.getJogo().getLinha() + "," + jogador.getJogo().getColuna() + "]");
        System.out.println("Movimentos: " + jogador.getMovimentos());
        System.out.println("Pontuação: " + jogador.getPontos());
        System.out.println("Contador de tesouros: " + contadorTesouros);
    }
}