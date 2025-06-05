public class ClienteVip extends Cliente {
    private String numeroCartao;

    public ClienteVip(String nome, double valorDaCompra, String numeroCartao){
        super(nome, valorDaCompra);
        this.numeroCartao = numeroCartao;
    }

    public double calcularPagamento(){
        double desconto = getValorDaCompra() * 0.1;
        double pagamento = getValorDaCompra() - desconto;
        return pagamento;
    }

    public String getNumeroCartao(){
        return numeroCartao;
    }

    public void setNumeroCartao(String numeroCartao) {
        this.numeroCartao = numeroCartao;
    }

    public String toString(){
        return super.toString() +  String.format(" - Valor da Compra com desconto: %.2f - Numero do Cartão: %s", calcularPagamento(), getNumeroCartao());
    }

}
