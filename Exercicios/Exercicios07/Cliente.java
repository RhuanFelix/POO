public abstract class Cliente {
    private String nome;
    private double valorDaCompra;

    public Cliente(String nome, double valorDaCompra){
        this.nome = nome;
        this.valorDaCompra = valorDaCompra;
    }

    public abstract double calcularPagamento();

    public double getValorDaCompra(){
        return valorDaCompra;
    }

    public String getNome(){
        return nome;
    }

    public String toString(){
        return String.format("Nome: %s - Valor total da Compra: %.2f", getNome(), getValorDaCompra());
    }
}