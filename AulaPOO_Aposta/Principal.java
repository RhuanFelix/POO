package AulaPOO_Aposta;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Digite quantas apostas você quer fazer:");

        int quantApostas = in.nextInt();

        int[][] aposta = new int[quantApostas][];

        for (int i = 0; i < quantApostas; i++) {
            System.out.println("Digite quantos números você quer apostar nesta rodada:");
            int quantNumeros = in.nextInt();
            aposta[i] = new int[quantNumeros];

            for(int j = 0; j < aposta[i].length; j++){
                System.out.printf("Digite o %dº número:", j);
                aposta[i][j] = in.nextInt();
            }
        }

        System.out.println("Sua aposta:");

        for (int i = 0; i < aposta.length; i++) {
            for (int j = 0; j < aposta[i].length; j++) {
                System.out.println(aposta[i][j]);
            }
            System.out.println();
        }

        in.close();
    }
}