package Exercicios.Exercicios04;

public class Mercado {
    private Produto[] produtos;
    private int qtdeProdutos;

    public Mercado(int qtdeProdutos){
        this.qtdeProdutos = 0;
        this.produtos = new Produto[qtdeProdutos];
    }

    public boolean addProduto(Produto produto){
        if (this.qtdeProdutos < produtos.length) {
            this.produtos[this.qtdeProdutos] = produto;
            this.qtdeProdutos++;
            return true;
        } else {
            return false;
        }
    }

    public String pesquisar(String p){
        if(this.qtdeProdutos == 0){
            return "O vetor está vazio!";
        }

        for (int i = 0; i < produtos.length; i++) {
            if (produtos[i].getNome().equals(p)) {
                return produtos[i].getNome() + " - " + produtos[i].getValor();
            }
        } 

        return "Produto não encontrado!";
    }

    public String excluirProduto(String p){
        if (this.qtdeProdutos == 0) {
            return "O vetor está vazio!";
        } else {

            for (int i = 0; i < produtos.length; i++) {
                if (produtos[i] != null && produtos[i].getNome().equals(p)) {
                    String resultado = "Produto excluído: " + produtos[i].getNome();
                    produtos[i] = null;
                    return resultado;
                }
            }
        }


        return "Produto não encontrado!";
    }

    public void exibirProdutos(){
        for (int i = 0; i < produtos.length; i++) {
            if (produtos[i] != null) {
                System.out.println(produtos[i].getNome() + " - " + produtos[i].getValor());
            }
        }
    }
}
