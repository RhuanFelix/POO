package AulaPOO;

public class Principal {
    public static void main(String[] args){
        // Pessoa p = new Pessoa("João", 18); //p aponta para o endereço de memória que Pessoa foi criado
        // p.falar();
        
        Carro c = new Carro("Ford", "ka", 2024);

        c.acelerar(4);

        c.parar();

        // System.out.println(c.getVelocidade());
    }
}
