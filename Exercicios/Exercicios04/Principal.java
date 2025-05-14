package Exercicios.Exercicios04;

import java.util.Scanner;

public class Principal {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Digite quantos produtos você quer inserir no vetor:");
        int quantidadeProdutos = in.nextInt();

        in.nextLine(); // Consome a quebra de linha residual

        Mercado mercado = new Mercado(quantidadeProdutos);

        for (int i = 0; i < quantidadeProdutos; i++) {
            System.out.println("Digite o nome do produto:");
            String nome = in.nextLine();
            System.out.println("Digite o valor deste produto:");
            double valor = in.nextDouble();

            in.nextLine(); // Consome a quebra de linha residual

            mercado.addProduto(new Produto(nome, valor));
        }

        mercado.exibirProdutos();

        while (true) {
            System.out.println("Você deseja pesquisar algum produto do vetor [s/n]?");
            String opcao = in.nextLine();

            if (opcao.equals("s")) {
                System.out.println("Digite o produto que deseja pesquisar no vetor:");
                String produto = in.nextLine();

                System.out.println("Produto: " + mercado.pesquisar(produto));
            } else {
                break;
            }
        }

        while (true) {
            System.out.println("Você deseja excluir algum produto do vetor [s/n]?");
            String opcao = in.nextLine();

            if (opcao.equals("s")) {
                System.out.println("Digite um produto que você queira retirar do vetor:");
                String excluirProduto = in.nextLine();
                String resultado = mercado.excluirProduto(excluirProduto);
                System.out.println(resultado);
                if (resultado.equals("Produto não encontrado!")){
                    System.out.println();
                } else {
                    System.out.println("Vetor atual:");
                    mercado.exibirProdutos();
                }
            } else {
                break;
            }
        }
        
        in.close();
    }
}
