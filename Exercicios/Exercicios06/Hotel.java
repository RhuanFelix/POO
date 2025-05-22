package Exercicios.Exercicios06;

public class Hotel {
    private Quarto[] quartos;
    private int quantidadeQuartos;

    public Hotel(int quantidadeQuartos){
        this.quantidadeQuartos = 0;
        quartos = new Quarto[quantidadeQuartos];
    }

    public void adicionarQuarto(Quarto quarto){
        this.quartos[this.quantidadeQuartos] = quarto;
        this.quantidadeQuartos++;
    }

    public void reservarQuarto(int numero){
        for (int i = 0; i < quartos.length; i++) {
            if (quartos[i] != null && quartos[i].getNumero() == numero) {
                quartos[i].setDisponivel(false);
            }
        }
    }

    public void cancelarReserva(int numero){
        for (int i = 0; i < quartos.length; i++) {
            if (quartos[i] != null && quartos[i].getNumero() == numero) {
                quartos[i].setDisponivel(true);
            }
        }
    }

    public void exibirQuartosDisponiveis(){
        for (int i = 0; i < quartos.length; i++) {
            if (quartos[i] != null && quartos[i].getDisponivel() == true) {
                System.out.println(quartos[i].toString());
            }
        }
    }
}