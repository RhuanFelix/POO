package AulaPOO_Aposta.Correcao;

public class SorteGrande {
    private int[][] apostas;
    private int indice;

    public SorteGrande(int quantidadeApostas){
        indice = 0;
        apostas = new int[quantidadeApostas][];
    }

    public void adicionaAposta(int[] aposta){
        // aposta são as colunas
        apostas[indice++] = aposta;
    }

    public void imprimirApostas(){
        for(int linha = 0; linha < apostas.length; linha++){
            for(int coluna = 0; coluna < apostas[linha].length; coluna++){
                System.out.printf("%d ", apostas[linha][coluna]);
            }
            System.out.println();
        }
    }

    public void imprimirResumido(){
        for(int[] coluna : apostas){
            for(int numero : coluna){
                System.out.printf("%d ", numero);
            }
            System.out.println();
        }
    }
}
