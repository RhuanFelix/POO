package Exercicios.Exercicios03.questao12;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        int[] A = new int[10];
        int soma = 0;

        Scanner in = new Scanner(System.in);

        for (int i = 0; i < A.length; i++) {
            System.out.println("Digite um número:");
            A[i] = in.nextInt();
        }

        for (int i = 0; i < A.length; i++) {
            soma += A[i];
        }

        System.out.printf("A soma de todos os elementos deste vetor é: %d", soma);

        in.close();
    }
}
