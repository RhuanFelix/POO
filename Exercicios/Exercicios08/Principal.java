package Exercicios.Exercicios08;

public class Principal {
    public static void main(String[] args) {
        CadastrarForma formaGeometrica = new CadastrarForma();
        formaGeometrica.addForma(new Quadrado());
        formaGeometrica.addForma(new Retangulo());
        formaGeometrica.addForma(new Triangulo());
        formaGeometrica.addForma(new Circulo());
        
        formaGeometrica.listar();
    }
}
