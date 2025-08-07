public class Arqueiro extends Peca {

    public Arqueiro(String nome, String simbolo, Jogador jogadorDono) {
        super(nome, simbolo, jogadorDono);
    }

    @Override
    public boolean podeMoverPara(int novoX, int novoY) {
        if (Jogo.getTabuleiro()[novoX][novoY] == null) {
            for (int i = 1; i <= 3; i++) {
                // diagonal superior esquerda
                if (getPosicaoX() - i == novoX && getPosicaoY() + i == novoY) {
                    return true;

                // diagonal superior direita
                } else if (getPosicaoX() + i == novoX && getPosicaoY() + i == novoY) {
                    return true;

                // diagonal inferior esquerda
                } else if (getPosicaoX() - i == novoX && getPosicaoY() - i == novoY) {
                    return true;

                //diagonal inferior direita
                } else if (getPosicaoX() + i == novoX && getPosicaoY() - i == novoY) {
                    return true;
                }
            }

            System.out.println("Posição inválida, você não pode mover o arqueiro para esta posição");
            return false;
        }

        if (Jogo.getTabuleiro()[novoX][novoY].getJogadorDono().equals(this.getJogadorDono())) {
            return false;
        }

        setPecaOponente(Jogo.getTabuleiro()[novoX][novoY]);
        return true;
    }
    
}