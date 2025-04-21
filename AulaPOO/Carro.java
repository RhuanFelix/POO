package AulaPOO;

public class Carro {
    // Atributos:
    private String fabricante;
    private String modelo;
    private int ano;
    private int velocidade;

    //Construtor:
    public Carro(String fabricante, String modelo, int ano){
        this.fabricante = fabricante;
        this.modelo = modelo;
        this.ano = ano;
        velocidade = 0; //inicia com o carro parado
    }

    //método que acessa a velocidade:
    public int getVelocidade(){
        return velocidade;
    }

    public void acelerar(int vezes){
        System.out.println("Acelerando:");
        for (int i = 0; i < vezes; i++) {
            velocidade += 10;
            exibirDados();
        }
    }

    public void frear(){
        velocidade -= 10;
    }

    public void parar(){
        if(velocidade != 0){
            System.out.println("-----------------------");
            System.out.println("Parando:");
            while(velocidade != 0){
                frear();
                exibirDados();
            }
        } else{
            System.out.println("O carro já está parado!");
        }
    }

    public void pararBruscamente(){
        if (velocidade == 0) {
            System.out.println("O carro já está parado!");
        } else{
            int temp = velocidade;
            velocidade = 0;
            System.out.println("-----------------------");
            if (temp >= 70) {
                System.out.printf("Parando bruscamente nesta velocidade de %d km/h você poderia ter causado um acidente ou ter morrido, cuidado na próxima vez!\n", temp);
            } else {
                System.out.printf("Você parou bruscamente estando a uma velocidade de %d km/h", temp);
            }
        }
    }

    public void exibirDados(){
        System.out.printf("%s %s %d %d\n", fabricante, modelo, ano, velocidade);
    }    
}
