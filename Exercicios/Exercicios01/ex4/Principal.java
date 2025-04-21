package Exercicios.Exercicios01.ex4;

public class Principal {
    public static void main(String[] args){
        Fitas fita1 = new Fitas("Harry Potter e a Pedra Filosofal", 10);
        Fitas fita2 = new Fitas("O Poderoso Chefão", 15);
        Fitas fita3 = new Fitas("Matrix", 12);

        String resultadoFita1 = fita1.toString();
        String resultadoFita2 = fita2.toString();
        String resultadoFita3 = fita3.toString();

        System.out.println(resultadoFita1);
        fita1.imprimirValorAluguel(3);
        System.out.println("---------------------------------------");

        System.out.println(resultadoFita2);
        fita2.imprimirValorAluguel(2);
        System.out.println("---------------------------------------");

        System.out.println(resultadoFita3);
        fita3.imprimirValorAluguel(2);
    }

}