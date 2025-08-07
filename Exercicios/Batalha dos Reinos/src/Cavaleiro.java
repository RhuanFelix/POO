public class Cavaleiro extends Peca {

    public Cavaleiro(String nome, String simbolo, Jogador jogadorDono) {
        super(nome, simbolo, jogadorDono);
    }

    @Override
    public boolean podeMoverPara(int novoX, int novoY) {
        if (Jogo.getTabuleiro()[novoX][novoY] == null) {
            
            // movimentos 2x1 na horizontal
            if (getPosicaoX() - 2 == novoX && getPosicaoY() + 1 == novoY) {
                return true;
            } else if (getPosicaoX() - 2 == novoX && getPosicaoY() - 1 == novoY) {
                return true;
            } else if (getPosicaoX() + 2 == novoX && getPosicaoY() + 1 == novoY) {
                return true;
            } else if (getPosicaoX() + 2 == novoX && getPosicaoY() - 1 == novoY) {
                return true;

            // movimentos 2x1 na vertical
            } else if (getPosicaoY() + 2 == novoX && getPosicaoX() + 1 == novoX) {
                return true;
            } else if (getPosicaoY() + 2 == novoX && getPosicaoX() - 1 == novoX) {
                return true;
            } else if (getPosicaoY() - 2 == novoX && getPosicaoX() + 1 == novoX) {
                return true;
            } else if (getPosicaoY() - 2 == novoX && getPosicaoX() - 1 == novoX) {
                return true;
            } else {
                System.out.println("Posição inválida, você não pode mover o cavalo para esta posição");
                return false;
            }
        }

        if (Jogo.getTabuleiro()[novoX][novoY].getJogadorDono().equals(this.getJogadorDono())) {
            return false;
        }

        setPecaOponente(Jogo.getTabuleiro()[novoX][novoY]);
        return true;
    }
}