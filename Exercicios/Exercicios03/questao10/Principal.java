package Exercicios.Exercicios03.questao10;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        int[] A = new int[10];
        int[] B = new int[A.length];

        Scanner in = new Scanner(System.in);

        for (int i = 0; i < A.length; i++) {
            System.out.println("Digite um número:");
            A[i] = in.nextInt();
        }

        System.out.println("Resultado:");

        for (int i = 0; i < B.length; i++) {
            B[i] = A[i] % 2;
            System.out.println(B[i]);
        }

        in.close();

    }
}
