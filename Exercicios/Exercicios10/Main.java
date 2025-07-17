package Exercicios.Exercicios10;

import java.time.LocalDate;
import java.util.List;
import java.util.Scanner;
import java.util.Set;

public class Main {
    private static SistemaEventos sistemaEventos = new SistemaEventos();
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        
        while (true) {
            menu();
            System.out.println("Escolha uma opção:");
            int escolha = scanner.nextInt(); scanner.nextLine();
            if (escolha == 7) {
                scanner.close();
                break;
            } else {
                switch (escolha) {
                    case 1 -> {
                        System.out.println("Digite o nome do evento:");
                        String nomeEvento = scanner.nextLine();
                        System.out.println("Digite a data que será realizado o evento (yyyy-mm-dd)");
                        String data = scanner.nextLine();
                        System.out.println("Digite a capacidade de pessoas que o evento suporta:");
                        int capacidade = scanner.nextInt(); scanner.nextLine();
                        adicionaEvento(new Evento(nomeEvento.toLowerCase(), LocalDate.parse(data), capacidade));
                    }
                    case 2 -> {
                        System.out.println("Digite o nome do participante do evento:");
                        String nomeParticipante = scanner.nextLine();
                        System.out.println("Digite o email do participante");
                        String email = scanner.nextLine();
                        System.out.println("Digite o telefone do participante ((xx) xxxxx-xxxx):");
                        String telefone = scanner.nextLine();
                        System.out.println("Digite o nome do evento:");
                        String nomeEvento = scanner.nextLine();
                        adicionarParticipante(new Participante(nomeParticipante, email, telefone), nomeEvento.toLowerCase());
                    }
                    case 3 -> {
                        System.out.println("Digite o nome do evento que você deseja buscar:");
                        String nomeEvento = scanner.nextLine();
                        Evento evento = buscarEvento(nomeEvento.toLowerCase());

                        if (evento == null) {
                            System.out.println("Este evento não existe");
                        } else {
                            System.out.println(evento);
                        }
                    }
                    case 4 -> {
                        System.out.println("Digite a inicial do participante para buscar todos que iniciam com ela:");
                        String inicialParticipante = scanner.nextLine();
                        System.out.println("Digite o nome do evento que você quer pesquisar os participantes:");
                        String nomeEvento = scanner.nextLine();
                        System.out.println(buscarParticipantesPorInicial(inicialParticipante, nomeEvento.toLowerCase()));
                    }
                    case 5 -> {
                        if (listarEventos() == null) {
                            System.out.println("Não existe eventos cadastrados!");
                        } else {
                            System.out.println(listarEventos());
                        }
                    }
                    case 6 -> {
                        System.out.println("Digite o nome do evento que você quer listar os participantes de forma ordenada!");
                        String nomeEvento = scanner.nextLine();
                        if (listarParticipantesPorNome(nomeEvento.toLowerCase()) == null) {
                            System.out.println("não é possível listar um evento que não existe");
                        } else {
                            System.out.println(listarParticipantesPorNome(nomeEvento.toLowerCase()));
                        }
                    }
                }
            }
        }

    }

    private static void menu() {
        System.out.println("===== Menu =====");
        System.out.println("1 - Adicionar Evento");
        System.out.println("2 - Adicionar Participante");
        System.out.println("3 - Buscar Evento");
        System.out.println("4 - Buscar Participante por inicial");
        System.out.println("5 - Listar Eventos");
        System.out.println("6 - Listar Participantes por nome");
        System.out.println("7 - Sair");
    }

    private static void adicionaEvento(Evento evento) {
        sistemaEventos.adicionaEvento(evento);
    }

    private static boolean adicionarParticipante(Participante participante, String nomeEvento) {
        return buscarEvento(nomeEvento).adicionarParticipante(participante);
    }

    private static Evento buscarEvento(String nome) {
        return sistemaEventos.buscarEvento(nome);
    }

    private static Set<Participante> buscarParticipantesPorInicial(String letra, String nomeEvento) {
        return buscarEvento(nomeEvento).buscarParticipantesPorInicial(letra);
    }

    private static List<Evento> listarEventos() {
        return sistemaEventos.listarEventos();
    }

    private static List<Participante> listarParticipantesPorNome(String nomeEvento) {
        if (buscarEvento(nomeEvento) == null) {
            System.out.println("Este evendo não existe");
            return null;
        } else {
            return buscarEvento(nomeEvento).listarParticipantesPorNome();
        }        
    }
}