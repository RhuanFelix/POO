package Exercicios.Exercicios01.ex2;

public class Retangulo {
    private int comprimento;
    private int largura;

    public Retangulo(int comprimento, int largura){
        this.comprimento = comprimento;
        this.largura = largura;
    }

    public int calcularArea(){
        return comprimento * largura;
    }

    public int calcularPerimetro(){
        return (2 * comprimento) + (2 * largura);
    }

    public void imprimir(){
        int area = calcularArea();
        int perimetro = calcularPerimetro();
        System.out.printf("Comprimento: %d \nLargura: %d\n", comprimento, largura);
        System.out.printf("Área: %d \nPerímetro: %d", area, perimetro);
    }

}