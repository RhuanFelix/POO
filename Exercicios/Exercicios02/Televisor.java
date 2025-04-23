package Exercicios.Exercicios02;

public class Televisor {
    private int canal;
    private int volume;
    private boolean ligado;

    public Televisor(int canal, int volume, boolean ligado){
        this.canal = canal;
        this.volume = volume;
        this.ligado = ligado;
    }

    public boolean ligar(){
        this.ligado = true;
        return this.ligado;
    }

    public boolean desligar(){
        this.ligado = false;
        return this.ligado;
    }

    public int aumentarVolume(){
        return volume++;
    }

    public int diminuirVolume(){
        return volume--;
    }

    public void trocarCanal(int canal){
        this.canal = canal;
    }

    public String toString(){
        return String.format("Canal: %d, volume: %d, ligado: %b", canal, volume, ligado);
    }
}
