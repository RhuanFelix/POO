import java.util.Random;
import java.util.Scanner;

public class Jogo {
    private static Peca[][] tabuleiro;
    private String[][] tabuleiroString;
    private Jogador[] jogadores; 
    private Random random;
    private Scanner scanner;
    private int contador = 1;

    public Jogo() {
        tabuleiro = new Peca[8][8];
        tabuleiroString = new String[8][8];
        jogadores = new Jogador[2];
        random = new Random();
        scanner = new Scanner(System.in);
    }

    public void inicializarJogo() {
        adicionandoJogadores();
        System.out.println("========== Início do Jogo ==========");
        preencherTabuleiroString();
        System.out.println("====================================");
        while (true) {
            escolherPosicao(0);
            System.out.println("========== Jogo atualizado ==========");
            preencherTabuleiroString();
            System.out.println("=====================================");
            escolherPosicao(1);
            System.out.println("========== Jogo atualizado ==========");
            preencherTabuleiroString();
            System.out.println("=====================================");
            if (jogadores[0].getPecas().size() == 0) {
                System.out.println("Parabéns " + jogadores[0].getNome() + ", você ganhou o jogo!");
                break;
            } else if (jogadores[1].getPecas().size() == 0) {
                System.out.println("Parabéns " + jogadores[1].getNome() + ", você ganhou o jogo!");
                break;
            }
        }
    }

    private void escolherPosicao(int numJogador) {
        System.out.printf("%s, de acordo com a tabela, escolha a posição (linha, coluna) e a peça que deseja movimentar:\n", jogadores[numJogador].getNome());
        System.out.print("Linha: ");
        int linha = scanner.nextInt(); scanner.nextLine();
        System.out.print("Coluna: ");
        int coluna = scanner.nextInt(); scanner.nextLine();
        System.out.println("Agora escolha a peça que deseja movimentar para a posição desejada:");
        exibirPecasJogador(numJogador);
        int escolha = scanner.nextInt(); scanner.nextLine();

        switch (escolha) {
            case 1, 2, 3 -> jogadores[numJogador].getPecas().get(escolha - 1).MoverPara(linha, coluna);
            default -> System.out.println("Escolha inválida!");
        }
    }

    private void adicionandoJogadores() {
        int contadorJogador = 1;
        for (int i = 0; i < 2; i++) {
            System.out.printf("Jogador %d, digite seu nome: ", contadorJogador++);
            String jogador = scanner.nextLine();
            System.out.printf("%s, insira o nome do seu guerreiro: ", jogador);
            String guerreiro = scanner.nextLine();
            System.out.printf("%s, insira o nome do seu arqueiro: ", jogador);
            String arqueiro = scanner.nextLine();
            System.out.printf("%s, insira o nome do seu cavaleiro: ", jogador);
            String cavaleiro = scanner.nextLine();
            jogadores[i] = addJogador(new Jogador(jogador), guerreiro, arqueiro, cavaleiro);
        }

        jogadores[0].setJogadorOponente(jogadores[1]);
        jogadores[1].setJogadorOponente(jogadores[0]);
    }

    private Jogador addJogador(Jogador jogador, String nomeGuerreiro, String nomeArqueiro, String nomeCavaleiro) {
        Peca guerreiro = jogador.addPeca(new Guerreiro(nomeGuerreiro, "G", jogador));
        adicionarPecaAoTabuleiro(guerreiro);
        Peca arqueiro = jogador.addPeca(new Arqueiro(nomeArqueiro, "A", jogador));
        adicionarPecaAoTabuleiro(arqueiro);
        Peca cavaleiro = jogador.addPeca(new Cavaleiro(nomeCavaleiro, "C", jogador));
        adicionarPecaAoTabuleiro(cavaleiro);
        ++contador;
        return jogador;
    }

    private void preencherTabuleiroString() {
        for (int i = 0; i < 8; i++) {
            for (int j = 0; j < 8; j++) {
                if (tabuleiro[i][j] == null) {
                    // ⬜
                    tabuleiroString[i][j] = "X";
                } else {
                    tabuleiroString[i][j] = tabuleiro[i][j].getSimbolo();
                }
            }
        }
        exibirTabuleiro();
    }

    private void exibirTabuleiro() {
        System.out.println("  0 1 2 3 4 5 6 7");
        for (int i = 0; i < 8; i++) {
            System.out.print(i + " ");
            for (int j = 0; j < 8; j++) {
                System.out.print(tabuleiroString[i][j] + " ");
                if (j == 7) {
                    System.out.println();
                }
            }
        }
    }

    private void adicionarPecaAoTabuleiro(Peca peca) {
        while (true) {
            int linha = random.nextInt(8);
            int coluna;

            if (contador == 1) {
                coluna = 7;
                if (tabuleiro[linha][coluna] == null) {
                    tabuleiro[linha][coluna] = peca;
                    tabuleiro[linha][coluna].setPosicaoX(linha);
                    tabuleiro[linha][coluna].setPosicaoY(coluna);
                    break;
                }
            } else {
                coluna = 0;
                if (tabuleiro[linha][coluna] == null) {
                    tabuleiro[linha][coluna] = peca;
                    tabuleiro[linha][coluna].setPosicaoX(linha);
                    tabuleiro[linha][coluna].setPosicaoY(coluna);
                    break;
                }
            }
        }
    }

    private void exibirPecasJogador(int n) {
        int contadorPecaJogador = 1;
        for (Peca peca : jogadores[n].getPecas()) {
            System.out.println(contadorPecaJogador++ + " " + peca.getNome());
        }

    }

    public static Peca[][] getTabuleiro() {
        return tabuleiro;
    }
}