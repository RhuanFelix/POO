package Exercicios.Exercicios05.Helicoptero;

public class Helicoptero {
    private boolean ligado;
    private int altura;
    private int CapacidadeDoHelicoptero;
    private int quantPessoas;

    public Helicoptero(int CapacidadeDoHelicoptero){
        this.CapacidadeDoHelicoptero = CapacidadeDoHelicoptero;
        this.ligado = false;
        this.altura = 0;
        this.quantPessoas = 0;
    }

    public void entrar(){
        if (quantPessoas <= CapacidadeDoHelicoptero) {
            this.quantPessoas++;
            System.out.println(quantPessoas);
        } else {
            System.out.println("O helicóptero já está cheio!");
        }
    }

    public void sair(){
        if (quantPessoas > 0) {
            System.out.println(quantPessoas);
            quantPessoas--;
        } else {
            System.out.println("Não tem ninguém no Helicóptero!");
        }
    }

    public boolean ligar(){
        if (ligado) {
            System.out.println("O helicóptero já está ligado");
            return false;
        } else {
            ligado = true;
            return ligado;
        }
    }

    public void decolar(int altura){
        if (ligado) {
            if (this.altura == 0) {
                this.altura = altura;
            } else {
                System.out.println("O helicóptero já decolou!");
            }
        } else {
            System.out.println("O helicóptero está desligado!");
        }
    }

    public void aterrissar(){
        if (ligado && altura > 0) {
            System.out.println("Altura atual: " + altura);
            for (int i = altura; i > 0; i--) {
                altura--;
            }
            System.out.println("Altura depois de aterrissar: " + altura);
        }
    }

    public boolean getLigado(){
        return ligado;
    }

    public int getAltura(){
        return altura;
    }

    public int getCapacidadeDoHelicoptero(){
        return CapacidadeDoHelicoptero;
    }

    public int getQuantPessoas(){
        return quantPessoas;
    }

    public void setLigado(boolean ligado){
        this.ligado = ligado;
    }

    public void setAltura(int altura){
        this.altura = altura;
    }

    public void setCapacidadeDoHelicoptero(int CapacidadeDoHelicoptero){
        this.CapacidadeDoHelicoptero = CapacidadeDoHelicoptero;
    }

    public void setQuantPessoas(int quantPessoas){
        this.quantPessoas = quantPessoas;
    }

    public String toString(){
        return String.format("Ligado: %b - Altura: %d - Capacidade do Helicóptero: %d - Quantidade de Pessoas: %d", ligado, altura, CapacidadeDoHelicoptero, quantPessoas);
    }
}