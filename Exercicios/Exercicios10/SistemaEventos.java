package Exercicios.Exercicios10;

import java.util.HashMap;
import java.util.LinkedList;
import java.util.List;
import java.util.Map;

public class SistemaEventos {
    private Map<String, Evento> eventos;

    public SistemaEventos() {
        eventos = new HashMap<>();
    }

    public void adicionaEvento(Evento evento) {
        eventos.put(evento.getNome(), evento);
    }

    public Evento buscarEvento(String nome) {
        return eventos.get(nome);
    }

    public List<Evento> listarEventos() {
        List<Evento> eventosListados = new LinkedList<>();
        for (String key : eventos.keySet()) {
            eventosListados.add(eventos.get(key));
        }
        return eventosListados;
    }
}
