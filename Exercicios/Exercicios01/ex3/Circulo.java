package Exercicios.Exercicios01.ex3;

public class Circulo {
    private int raio;
    private float pi = 3.141516f;

    public Circulo(int raio){
        this.raio = raio;
    }

    public float calcularArea(){
        return pi * raio * raio;
    }

    public float calcularPerimetro(){
        return 2 * pi * raio;
    }

    public void imprimir(){
        float area = calcularArea();
        float perimetro = calcularPerimetro();
        System.out.printf("Raio: %d \nPi: %f\n", raio, pi);
        System.out.printf("Área: %f \nPerímetro: %f", area, perimetro);
    }
}
