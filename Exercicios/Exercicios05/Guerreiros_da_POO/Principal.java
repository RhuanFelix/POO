package Exercicios.Exercicios05.Guerreiros_da_POO;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Digite o nome do primeiro guerreiro:");
        String nome1 = in.nextLine();
        System.out.println("Digite o nome do segundo guerreiro:");
        String nome2 = in.nextLine();

        System.out.println("Digite um código para o primeiro guerreiro:");
        int codigo1 = in.nextInt();
        System.out.println("Digite um código para o segundo guerreiro:");
        int codigo2 = in.nextInt();

        Guerreiro guerreiro = new Guerreiro(codigo1, nome1);
        Guerreiro oponente = new Guerreiro(codigo2, nome2);

        System.out.println("Resultado iterativo:");

        guerreiro.lutarIterativo(oponente);

        if (guerreiro.getEnergia() > 0) {
            guerreiro.alimentar();
            System.out.println("Vencedor: " + guerreiro.toString());
            System.out.println("Perdedor: " + oponente.toString());
        } else {
            oponente.alimentar();
            System.out.println("Vencedor: " + oponente.toString());
            System.out.println("Perdedor: " + guerreiro.toString());
        }

        System.out.println("Resultado recursivo:");

        guerreiro.lutarRecursivo(oponente);

        if (guerreiro.getEnergia() > 0) {
            guerreiro.alimentar();
            System.out.println("Vencedor: " + guerreiro.toString());
            System.out.println("Perdedor: " + oponente.toString());
        } else {
            oponente.alimentar();
            System.out.println("Vencedor: " + oponente.toString());
            System.out.println("Perdedor: " + guerreiro.toString());
        }

        in.close();
    }
}