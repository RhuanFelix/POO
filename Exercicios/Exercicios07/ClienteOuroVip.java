public class ClienteOuroVip extends ClienteVip{
    private String endereco;

    public ClienteOuroVip(String nome, double valorDaCompra, String numeroCartao, String endereco){
        super(nome, valorDaCompra, numeroCartao);
        this.endereco = endereco;
    }

    public double calcularPagamento(){
        double desconto = getValorDaCompra() * 0.15;
        double pagamento = getValorDaCompra() - desconto;
        return pagamento;
    }

    public String getEndereco(){
        return endereco;
    }

    public void setEndereco(String endereco){
        this.endereco = endereco;
    }

    public String toString(){
        return super.toString() + String.format(" - Endereço:%s ", getEndereco());
    }
}
