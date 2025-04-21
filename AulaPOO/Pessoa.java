package AulaPOO;

public class Pessoa {
    //atributos
    private String nome;
    private int idade;

    //Construtor
    public Pessoa(String nome, int idade){
        this.nome = nome;
        this.idade = idade;
    }

    //Métodos
    public void falar(){
        System.out.println("Olá mundo! Eu sou: " + nome + " e tenho: " + idade + " anos");
        // System.out.printf("Olá mundo! Eu sou %s e tenho %d anos", nome, idade);
        System.out.println("Obrigado por ter falado comigo");
    }
}
