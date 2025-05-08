package Exercicios.Exercicios03.questao9;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        int[] A = new int[10];
        int[] B = new int[10];
        double[] C = new double[10];

        Scanner in = new Scanner(System.in);

        System.out.println("Valores do vetor de A:");

        for (int i = 0; i < A.length; i++) {
            System.out.println("Digite um número:");
            A[i] = in.nextInt();
        }

        System.out.println("Valores do vetor de B:");

        for (int i = 0; i < B.length; i++) {
            System.out.println("Digite um número:");
            B[i] = in.nextInt();
        }

        System.out.println("Resultado:");

        for (int i = 0; i < C.length; i++) {
            C[i] = (double)A[i] / B[i];
            System.out.println(C[i]);
        }

        in.close();
    }
}
