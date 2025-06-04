package Exercicios.Exercicios05.Helicoptero;

import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Digite a quantidade de helicópteros que a frota possui");
        int tamanhoFrota = in.nextInt();

        Frota frota = new Frota(tamanhoFrota);
        int i = 0;
        int contadorHelicoptero;
        int escolhaHelicoptero;

        while (true) {
            System.out.println("--------------- Menu ---------------");
            System.out.println("0. Sair do programa");
            System.out.println("1. adicionar helicóptero");
            System.out.println("2. ligar helicóptero");
            System.out.println("3. desligar helicóptero");
            System.out.println("4. entrar pessoas no helicóptero");
            System.out.println("5. sair pessoas no helicóptero");
            System.out.println("6. decolar helicóptero");
            System.out.println("7. aterrissar helicóptero");
            System.out.println("8. exibir helicóptero");
            System.out.println("------------------------------------");

            int opcao = in.nextInt();
            
            if (opcao == 0) {
                break;
            }

            switch (opcao) {
                case 1:
                    System.out.printf("\nDigite a capacidade do %dº helicóptero\n", ++i);
                    int capacidadeDoHelicoptero = in.nextInt();
                    in.nextLine();
                    frota.addHelicoptero(new Helicoptero(capacidadeDoHelicoptero));
                    break;
            
                case 2:
                    System.out.println("\nQual desses helicópteros deseja ligar?");
                    contadorHelicoptero = 0;

                    for (int j = 0; j < tamanhoFrota; j++) {
                        System.out.println(++contadorHelicoptero + "º helicóptero - " + frota.exibirHelicoptero(j));
                    }

                    escolhaHelicoptero = in.nextInt();
                    in.nextLine();
                    frota.ligarHelicoptero(escolhaHelicoptero - 1);
                    break;

                case 3:
                    System.out.println("\nQual desses helicópteros deseja desligar?");
                    contadorHelicoptero = 0;

                    for (int j = 0; j < tamanhoFrota; j++) {
                        System.out.println(++contadorHelicoptero + "º helicóptero - " + frota.exibirHelicoptero(j));
                    }

                    escolhaHelicoptero = in.nextInt();
                    in.nextLine();
                    frota.desligarHelicoptero(escolhaHelicoptero - 1);
                    break;

                case 4:
                    System.out.println("\nEscolha um helicóptero para as pessoas entrarem:");
                    contadorHelicoptero = 0;

                    for (int j = 0; j < tamanhoFrota; j++) {
                        System.out.println(++contadorHelicoptero + "º helicóptero - " + frota.exibirHelicoptero(j));
                    }

                    escolhaHelicoptero = in.nextInt();
                    in.nextLine();
                    frota.entrarPessoas(escolhaHelicoptero - 1);
                    break;

                case 5:
                    System.out.println("\nEscolha um helicóptero para as pessoas sairem:");
                    contadorHelicoptero = 0;
                    for (int j = 0; j < tamanhoFrota; j++) {
                        System.out.println(++contadorHelicoptero + "º helicóptero - " + frota.exibirHelicoptero(j));
                    }

                    escolhaHelicoptero = in.nextInt();
                    in.nextLine();
                    frota.sairPessoas(escolhaHelicoptero - 1);
                    break;

                case 6:
                    System.out.println("\nEscolha um helicóptero para decolar:");
                    contadorHelicoptero = 0;
                    for (int j = 0; j < tamanhoFrota; j++) {
                        System.out.println(++contadorHelicoptero + "º helicóptero - " + frota.exibirHelicoptero(j));
                    }

                    escolhaHelicoptero = in.nextInt();
                    in.nextLine();
                    System.out.println("\nDigite a altura que o helicóptero irá atingir:");
                    int altura = in.nextInt();
                    frota.decolarHelicoptero(escolhaHelicoptero - 1, altura);
                    break;

                case 7:
                    System.out.println("\nEscolha um helicóptero para aterrissar:");
                    contadorHelicoptero = 0;
                    for (int j = 0; j < tamanhoFrota; j++) {
                        System.out.println(++contadorHelicoptero + "º helicóptero - " + frota.exibirHelicoptero(j));
                    }

                    escolhaHelicoptero = in.nextInt();
                    in.nextLine();
                    frota.aterrissarHelicoptero(escolhaHelicoptero - 1);
                    break;

                case 8:
                    System.out.println("\nInforme um helicóptero para exibir seu estado:");
                    escolhaHelicoptero = in.nextInt();
                    in.nextLine();
                    System.out.println(frota.exibirHelicoptero(escolhaHelicoptero - 1));
                    break;

                default:
                    System.out.println("Opção inválida!");
                    break;
            }
            
        }

        in.close();
    }
}