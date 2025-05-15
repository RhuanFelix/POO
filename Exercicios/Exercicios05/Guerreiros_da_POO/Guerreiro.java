package Exercicios.Exercicios05.Guerreiros_da_POO;

import java.util.Random;

public class Guerreiro {
    private int codigo;
    private String nome;
    private int energia;

    public Guerreiro(int codigo, String nome){
        this.codigo = codigo;
        this.nome = nome;
        this.energia = 5;
    }

    public int getEnergia(){
        return energia;
    }

    public void incremento(){
        if (energia < 5) {
            energia++;
        } else {
            System.out.printf("A energia do guerreiro %s já está cheia!\n", nome);
        }
    }

    public int decremento(){
        if (energia == 0) {
            return 0;
        } else {
            energia--;
            return energia;
        }
    }

    public void alimentar(){
        incremento();
    }

    public int atacar(){
        Random random = new Random();
        return random.nextInt(2);
    }

    public void lutarIterativo(Guerreiro oponente){
        do {
            int ataqueGuerreiro1 = atacar();
            int ataqueoponente = oponente.atacar();

            if (ataqueGuerreiro1 == 1) {
                oponente.decremento();
            } else if (ataqueoponente == 1) {
                decremento();
            }
        } while (getEnergia() != 0 && oponente.getEnergia() != 0);

        if (oponente.getEnergia() == 0) {
            System.out.printf("O guerreiro %s está sem energia!\n", oponente.nome);
            System.out.printf("O guerreiro %s ganhou\n", this.nome);
        } else {
            System.out.printf("O guerreiro %s está sem energia!\n", this.nome);
            System.out.printf("O guerreiro %s ganhou\n", oponente.nome);
        }
    }

    public void lutarRecursivo(Guerreiro oponente){
        int ataqueGuerreiro1 = atacar();
        int ataqueoponente = oponente.atacar();

        if (ataqueGuerreiro1 == 1) {
            oponente.decremento();
        } else if (ataqueoponente == 1) {
            decremento();
        }

        if (getEnergia() != 0 && oponente.getEnergia() != 0) {
            lutarRecursivo(oponente);
        }

        if (oponente.getEnergia() == 0) {
            System.out.printf("O guerreiro %s está sem energia!\n", oponente.nome);
            System.out.printf("O guerreiro %s ganhou\n", this.nome);
        } else {
            System.out.printf("O guerreiro %s está sem energia!\n", this.nome);
            System.out.printf("O guerreiro %s ganhou\n", oponente.nome);
        }
    }

    public String toString(){
        return String.format("Código: %d - Nome: %s - Energia: %d",  codigo, nome, energia);
    }
}