package Exercicios.Exercicios10;

import java.time.LocalDate;

public class Teste {
    public static void main(String[] args) {
        SistemaEventos sistemaEventos = new SistemaEventos();


        sistemaEventos.adicionaEvento(new Evento("Sao Joao", LocalDate.of(2025, 6, 24), 70));
        sistemaEventos.adicionaEvento(new Evento("Natal", LocalDate.parse("2025-12-25"), 30));
        sistemaEventos.adicionaEvento(new Evento("Caminhos do frio", LocalDate.parse("2025-08-20"), 50));

        sistemaEventos.buscarEvento("Natal").adicionarParticipante(new Participante("Thiago", "thiago@email.com", "991524339"));
        sistemaEventos.buscarEvento("Natal").adicionarParticipante(new Participante("Jean", "jean@email.com", "993523569"));
        sistemaEventos.buscarEvento("Natal").adicionarParticipante(new Participante("Jean Paulo", "jeanpaulo@email.com", "993523569"));
        sistemaEventos.buscarEvento("Natal").adicionarParticipante(new Participante("Jose", "jose@email.com", "998463466"));
        sistemaEventos.buscarEvento("Natal").adicionarParticipante(new Participante("Jacqueline", "jacqueline@email.com", "997253647"));
        sistemaEventos.buscarEvento("Natal").adicionarParticipante(new Participante("Amélia", "amelia@email.com", "993758469"));
        sistemaEventos.buscarEvento("Natal").adicionarParticipante(new Participante("Raiane", "raiane@email.com", "996829274"));

        sistemaEventos.buscarEvento("Sao Joao").adicionarParticipante(new Participante("Thiago", "thiago@email.com", "991524339"));
        sistemaEventos.buscarEvento("Sao Joao").adicionarParticipante(new Participante("Jean", "jean@email.com", "993523569"));
        System.out.println();
        System.out.println(sistemaEventos.listarEventos());

        System.out.println();

        System.out.println(sistemaEventos.buscarEvento("Natal").listarParticipantesPorNome());

        System.out.println();

        System.out.println(sistemaEventos.buscarEvento("Natal").buscarParticipantesPorInicial("A"));
    }
}
