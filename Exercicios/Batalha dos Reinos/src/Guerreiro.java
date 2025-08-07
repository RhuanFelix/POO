public class Guerreiro extends Peca {

    public Guerreiro(String nome, String simbolo, Jogador jogadorDono) {
        super(nome, simbolo, jogadorDono);
    }

    @Override
    public boolean podeMoverPara(int novoX, int novoY) {
        if (Jogo.getTabuleiro()[novoX][novoY] == null) {
            for (int i = 1; i <= 3; i++) {
                // se mover para a esquerda
                if (getPosicaoX() == novoX && getPosicaoY() - i == novoY) {
                    return true;

                //se mover para a direita
                } else if (getPosicaoX() == novoX && getPosicaoY() + i == novoY) {
                    return true;

                // se mover para baixo
                } else if (getPosicaoX() + i == novoX && getPosicaoY() == novoY) {
                    return true;

                // se mover para cima
                } else  if (getPosicaoX() - i == novoX && getPosicaoY() == novoY) {
                    return true;
                }
            }

            System.out.println("Posição inválida, você não pode mover o guerreiro para esta posição");
            return false;
        }

        if (Jogo.getTabuleiro()[novoX][novoY].getJogadorDono().equals(this.getJogadorDono())) { // quando coloco uma posição inválida dá erro aqui
            return false;
        }

        setPecaOponente(Jogo.getTabuleiro()[novoX][novoY]);
        return true;
    }
}