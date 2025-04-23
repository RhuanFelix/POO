package Exercicios.Exercicios02;

public class ControleRemoto {
    private Televisor tv;

    public ControleRemoto(Televisor tv){
        this.tv = tv;
    }

    public boolean ligar(){
        return tv.ligar();
    }

    public boolean desligar(){
        return tv.desligar();
    }

    public int aumentarVolume(){
        return tv.aumentarVolume();
    }

    public int diminuirVolume(){
        return tv.diminuirVolume();
    }

    public void trocarCanal(int outroCanal){
        tv.trocarCanal(outroCanal);
    }

    public String toString(){
        return tv.toString();
    }
}
