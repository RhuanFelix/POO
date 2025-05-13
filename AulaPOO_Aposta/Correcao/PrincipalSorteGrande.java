package AulaPOO_Aposta.Correcao;

import java.util.Scanner;

public class PrincipalSorteGrande {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        System.out.println("Quantas apostas você quer fazer?");
        int quantidadeApostas = in.nextInt();
        SorteGrande sorteGrande = new SorteGrande(quantidadeApostas);

        for(int i = 0; i < quantidadeApostas; i++){
            System.out.printf("Digite a quantidade de números da %dª aposta \n", i + 1);
            int qtdeNumeros = in.nextInt();
            int[] aposta = new int[qtdeNumeros];
            for (int j = 0; j < aposta.length; j++) {
                System.out.printf("");
                aposta[j] = in.nextInt();
            }
            sorteGrande.adicionaAposta(aposta);
        }

        in.close();
    }
}
