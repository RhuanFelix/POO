package Exercicios.Exercicios05.Helicoptero;

public class Helicoptero {
    private boolean ligado;
    private int altura;
    private int capacidadeDoHelicoptero;
    private int quantPessoas;

    public Helicoptero(int capacidadeDoHelicoptero){
        this.capacidadeDoHelicoptero = capacidadeDoHelicoptero;
        this.ligado = false;
        this.altura = 0;
        this.quantPessoas = 0;
    }

    public void entrar(){
        if (quantPessoas < capacidadeDoHelicoptero) {
            quantPessoas++;
            System.out.println("Quantidade de pessoas: " + quantPessoas);
        } else {
            System.out.println("O helicóptero já está cheio!");
        }
    }

    public void sair(){
        if (quantPessoas > 0) {
            quantPessoas--;
            System.out.println("Quantidade de pessoas: " + quantPessoas);
        } else {
            System.out.println("Não tem ninguém no Helicóptero!");
        }
    }

    public boolean ligar(){
        if (ligado) {
            System.out.println("O helicóptero já está ligado!");
            return false;
        } else {
            ligado = true;
            return true;
        }
    }

    public boolean desligar(){
        if (!ligado) {
            System.out.println("O helicóptero já está desligado!");
            return false;
        } else if (altura > 0) {
            System.out.println("Não é possível desligar enquanto estiver no ar!");
            return false;
        } else {
            ligado = false;
            return true;
        }
    }

    public void decolar(int altura){
        if (ligado) {
            if (this.altura == 0) {
                this.altura = altura;
                System.out.println("Decolou para altura: " + altura);
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
            altura = 0;
            System.out.println("Aterrissou. Altura atual: " + altura);
        } else if (!ligado) {
            System.out.println("O helicóptero está desligado!");
        } else {
            System.out.println("O helicóptero já está no solo!");
        }
    }

    public boolean getLigado(){
        return ligado;
    }

    public int getAltura(){
        return altura;
    }

    public int getCapacidadeDoHelicoptero(){
        return capacidadeDoHelicoptero;
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

    public void setCapacidadeDoHelicoptero(int capacidadeDoHelicoptero){
        this.capacidadeDoHelicoptero = capacidadeDoHelicoptero;
    }

    public void setQuantPessoas(int quantPessoas){
        this.quantPessoas = quantPessoas;
    }

    public String toString(){
        return String.format("Ligado: %b - Altura: %d - Capacidade: %d - Pessoas: %d", ligado, altura, capacidadeDoHelicoptero, quantPessoas);
    }
}