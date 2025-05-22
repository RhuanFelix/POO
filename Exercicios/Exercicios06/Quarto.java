package Exercicios.Exercicios06;

public class Quarto {
    private int numero;
    private String tipo;
    private boolean disponivel;

    public Quarto(int numero, String tipo){
        this.numero = numero;
        this.tipo = tipo;
        this.disponivel = true;
    }

    public boolean getDisponivel(){
        return disponivel;
    }

    public int getNumero(){
        return numero;
    }

    public void setDisponivel(boolean disponivel){
        this.disponivel = disponivel;
    }

    public String toString(){
        return String.format("Numero: %s - Tipo: %s - Disponível: %b", numero, tipo, disponivel);
    }
}