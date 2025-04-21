package Exercicios.Exercicios01.ex1;

public class Quadrado {
    private int lado;

    public Quadrado(int lado){
        this.lado = lado;
    }

    public int calcularArea(){
        return lado * lado;
    }

    public int calcularPerimetro(){
        return 4 * lado;
    }

    public void imprimir(){
        int area = calcularArea();
        int perimetro = calcularPerimetro();
        System.out.printf("Lado: %d \nÁrea: %d \nPerímetro: %d", lado, area, perimetro);
    }
}
