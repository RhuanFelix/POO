package Exercicios.Exercicios03.questao11;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        int[] A = new int[10];
        int quantPares = 0;

        Scanner in = new Scanner(System.in);

        for (int i = 0; i < A.length; i++) {
            System.out.println("Digite um número:");
            A[i] = in.nextInt();
        }

        for (int i = 0; i < A.length; i++) {
            if(A[i] % 2 == 0){
                quantPares++;
            }
        }

        System.out.printf("Neste vetor, há %d números pares", quantPares);

        in.close();
    }
}
