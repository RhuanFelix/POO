package Exercicios.Exercicios03.questao3;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        int[] A = new int[15];
        Scanner in = new Scanner(System.in);
        for (int i = 0; i < A.length; i++) {
            System.out.println("Digite um número:");
            A[i] = in.nextInt();
        }
        int[] B = new int[A.length];
        for (int i = 0; i < A.length; i++) {
            B[i] = A[i] * A[i];
        }
        System.out.println("Resultado:");
        for (int i = 0; i < B.length; i++) {
            System.out.println(B[i]);
        }
        in.close();
    }
}
