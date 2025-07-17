package Exercicios.Exercicios10;

import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashSet;
import java.util.List;
import java.util.Set;

public class Evento {

    private String nome;
    private LocalDate data;
    Set<Participante> listaParticipantes = new HashSet<>();
    private int capacidadeMinima;

    public Evento(String nome, LocalDate data, int capacidadeMinima) {
        this.nome = nome;
        this.data = data;
        this.capacidadeMinima = capacidadeMinima;
    }

    public boolean adicionarParticipante(Participante p) {
        return listaParticipantes.add(p);
    }

    // analisar melhor!
    public List<Participante> listarParticipantesPorNome() {
        List<Participante> listaParticipantesPorNome = new ArrayList<>();
        listaParticipantesPorNome.addAll(listaParticipantes);
        Collections.sort(listaParticipantesPorNome);
        return listaParticipantesPorNome;
    }

    public Set<Participante> buscarParticipantesPorInicial(String letra) {
        Set<Participante> buscaParticipantes = new HashSet<>();
        for (Participante participante : listaParticipantes) {
            if (participante.getNome().startsWith(String.valueOf(letra))) {
                buscaParticipantes.add(participante);
            }
        }
        return buscaParticipantes;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public LocalDate getData() {
        return data;
    }

    public void setData(LocalDate data) {
        this.data = data;
    }

    public int getCapacidadeMinima() {
        return capacidadeMinima;
    }

    public void setCapacidadeMinima(int capacidadeMinima) {
        this.capacidadeMinima = capacidadeMinima;
    }

    @Override
    public String toString() {
        return "Evento [nome=" + nome + ", data=" + data + ", capacidadeMinima=" + capacidadeMinima + "]";
    }
}
