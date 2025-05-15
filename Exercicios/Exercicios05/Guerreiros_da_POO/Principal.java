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

        Guerreiro guerreiro1 = new Guerreiro(codigo1, nome1);
        Guerreiro guerreiro2 = new Guerreiro(codigo2, nome2);

        System.out.println("Resultado iterativo:");

        guerreiro1.lutarIterativo(guerreiro2);

        if (guerreiro1.getEnergia() > 0) {
            guerreiro1.alimentar();
            System.out.println("Vencedor: " + guerreiro1.toString());
            System.out.println("Perdedor: " + guerreiro2.toString());
        } else {
            guerreiro2.alimentar();
            System.out.println("Vencedor: " + guerreiro2.toString());
            System.out.println("Perdedor: " + guerreiro1.toString());
        }

        System.out.println("Resultado recursivo:");

        guerreiro1.lutarRecursivo(guerreiro2);

        if (guerreiro1.getEnergia() > 0) {
            guerreiro1.alimentar();
            System.out.println("Vencedor: " + guerreiro1.toString());
            System.out.println("Perdedor: " + guerreiro2.toString());
        } else {
            guerreiro2.alimentar();
            System.out.println("Vencedor: " + guerreiro2.toString());
            System.out.println("Perdedor: " + guerreiro1.toString());
        }

        in.close();
    }
}