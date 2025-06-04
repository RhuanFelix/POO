package Exercicios.Exercicios05.Helicoptero;

public class Frota {

    private Helicoptero[] helicoptero;
    private int quantidadeMaximaHelicoptero;
    private int quantHelicoptero = 0;

    public Frota(int quantidadeMaximaHelicoptero){
        this.quantidadeMaximaHelicoptero = quantidadeMaximaHelicoptero;
        this.helicoptero = new Helicoptero[quantidadeMaximaHelicoptero];
    }

    public void addHelicoptero(Helicoptero helicoptero){
        if (quantHelicoptero < quantidadeMaximaHelicoptero) {
            this.helicoptero[quantHelicoptero] = helicoptero;
            quantHelicoptero++;
        } else {
            System.out.println("A frota já está cheia!");
        }
    }

    private boolean indiceValido(int n) {
        return n >= 0 && n < quantHelicoptero && helicoptero[n] != null;
    }

    public boolean ligarHelicoptero(int n){
        if (indiceValido(n)) {
            return helicoptero[n].ligar();
        }
        System.out.println("Helicóptero inexistente!");
        return false;
    }

    public boolean desligarHelicoptero(int n){
        if (indiceValido(n)) {
            return helicoptero[n].desligar();
        }
        System.out.println("Helicóptero inexistente!");
        return false;
    }

    public void entrarPessoas(int n){
        if (indiceValido(n)) {
            helicoptero[n].entrar();
        } else {
            System.out.println("Helicóptero inexistente!");
        }
    }

    public void sairPessoas(int n){
        if (indiceValido(n)) {
            if (!helicoptero[n].getLigado()) {
                helicoptero[n].sair();
            } else {
                System.out.println("O helicóptero ainda está ligado, ninguém pode sair!");
            }
        } else {
            System.out.println("Helicóptero inexistente!");
        }
    }

    public void decolarHelicoptero(int n, int altura){
        if (indiceValido(n)) {
            helicoptero[n].decolar(altura);
        } else {
            System.out.println("Helicóptero inexistente!");
        }
    }

    public void aterrissarHelicoptero(int n){
        if (indiceValido(n)) {
            helicoptero[n].aterrissar();
        } else {
            System.out.println("Helicóptero inexistente!");
        }
    }

    public String exibirHelicoptero(int n){
        if (indiceValido(n)) {
            return helicoptero[n].toString();
        }
        return "Helicóptero inexistente!";
    }
}