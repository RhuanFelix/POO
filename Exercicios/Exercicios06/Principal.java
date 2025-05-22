package Exercicios.Exercicios06;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);

        System.out.println("Este hotel tem quantos quartos?");
        int quantidadeQuartos = in.nextInt();
        in.nextLine();

        Hotel hotel = new Hotel(quantidadeQuartos);

        while (true) {
            System.out.println("1. Adicionar quarto no hotel");
            System.out.println("2. Reservar quarto");
            System.out.println("3. Cancelar reserva");
            System.out.println("4. Exibir quartos disponíveis");
            System.out.println("5. Sair do programa");

            System.out.println("Digite uma opção:");
            int opcao = in.nextInt();
            in.nextLine();

            if (opcao == 5) {
                break;
            }

            switch (opcao) {
                case 1:
                    System.out.println("Informe o número do quarto que você quer adicionar ao hotel:");
                    int numero = in.nextInt();
                    in.nextLine();

                    System.out.println("Informe o tipo de quarto (simples / duplo / suíte):");
                    String tipoQuarto = in.nextLine();

                    hotel.adicionarQuarto(new Quarto(numero, tipoQuarto));
                    break;
            
                case 2:
                    System.out.println("Informe o número do quarto para fazer a reserva:");
                    int reservarQuarto = in.nextInt();
                    in.nextLine();

                    hotel.reservarQuarto(reservarQuarto);
                    break;
            
                case 3:
                    System.out.println("Informe o número do quarto para cancelar a reserva:");
                    int cancelarReserva = in.nextInt();
                    in.nextLine();

                    hotel.cancelarReserva(cancelarReserva);
                    break;
            
                case 4:
                    hotel.exibirQuartosDisponiveis();
                    break;
            
                default:
                    System.out.println("Opção inválida!");
                    break;
            }
        }

        in.close();
    }
}