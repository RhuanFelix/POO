package Exercicios.Exercicios01.ex4;

public class Fitas {
    private String titulo;
    private int precoAluguelPorDia;

    public Fitas(String titulo, int precoAluguelPorDia){
        this.titulo = titulo;
        this.precoAluguelPorDia = precoAluguelPorDia;
    }

    public int getValorAluguel(int numeroDeDiasAlugada){
        return precoAluguelPorDia * numeroDeDiasAlugada;
    }

    public void imprimirValorAluguel(int numeroDeDiasAlugada){
        int valorAluguel = getValorAluguel(numeroDeDiasAlugada);
        System.out.println("O valor final do aluguel é R$" + valorAluguel + ",00.");
    }

    public String toString(){
        return String.format("Titulo: %s\nPreço do aluguel por dia: R$%d,00", titulo, precoAluguelPorDia);
    }
}
