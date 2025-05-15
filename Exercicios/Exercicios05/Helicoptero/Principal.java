package Exercicios.Exercicios05.Helicoptero;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Digite a capacidade máxima do primeiro helicóptero:");
        int capacidade1 = in.nextInt();
        Helicoptero helicoptero1 = new Helicoptero(capacidade1);

        System.out.println("Digite a capacidade máxima do segundo helicóptero:");
        int capacidade2 = in.nextInt();
        Helicoptero helicoptero2 = new Helicoptero(capacidade2);

        System.out.println("Helicóptero 1 - " + helicoptero1.toString());
        System.out.println("Helicóptero 2 - " + helicoptero2.toString());

        System.out.println("Passageiros do Helicóptero 1 entrando:");
        for (int i = 0; i < capacidade1; i++) {
            helicoptero1.entrar();
        }

        System.out.println("Passageiros do Helicóptero 2 entrando:");
        for (int i = 0; i < capacidade2; i++) {
            helicoptero2.entrar();
        }

        helicoptero1.ligar();
        helicoptero2.ligar();

        helicoptero1.decolar(75);
        helicoptero2.decolar(55);

        System.out.println("Helicóptero 1 - " + helicoptero1.toString());
        System.out.println("Helicóptero 2 - " + helicoptero2.toString());

        helicoptero1.aterrissar();
        helicoptero2.aterrissar();

        helicoptero1.setLigado(false);
        helicoptero2.setLigado(false);

        System.out.println("Passageiros do Helicóptero 1 saindo:");
        for (int i = 0; i < capacidade1; i++) {
            helicoptero1.sair();
        }

        System.out.println("Passageiros do Helicóptero 2 saindo:");
        for (int i = 0; i < capacidade2; i++) {
            helicoptero2.sair();
        }

        System.out.println("Estado do helicóptero 1:");
        System.out.println(helicoptero1.toString()); 
        System.out.println("Estado do helicóptero 2:");
        System.out.println(helicoptero2.toString());;

        in.close();
    }
}