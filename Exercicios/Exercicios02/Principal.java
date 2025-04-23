package Exercicios.Exercicios02;

public class Principal {
    public static void main(String[] args){
        Televisor televisao = new Televisor(0, 0, false);

        ControleRemoto controle = new ControleRemoto(televisao);

        System.out.println("Ações da tv:");

        televisao.ligar();
        televisao.trocarCanal(7);
        for (int i = 0; i < 10; i++) {
            televisao.aumentarVolume();
        }
        System.out.println(televisao.toString());

        System.out.println("Ações do controle:");
        for (int i = 0; i < 3; i++) {
            controle.diminuirVolume();
        }
        controle.trocarCanal(11);
        controle.desligar();
        System.out.println(controle.toString());
    }
}
