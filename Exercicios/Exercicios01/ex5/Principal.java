package Exercicios.Exercicios01.ex5;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args){
        Funcionario fernando = new Funcionario("1234", "Fernando", "123.456.789-10", "Conjunto João Pessoa", "(83)9 9446-1329", 26, 2400);
        String estado = fernando.estadoDoObjeto();
        System.out.println(estado);

        System.out.println("\nDigite o novo salário do seu funcionário:");

        Scanner scan = new Scanner(System.in);

        float novoSalario = scan.nextFloat();
        fernando.setSalario(novoSalario);
        float salarioLiquido = fernando.calcularSalarioLiquido(novoSalario);

        String novoEstado = fernando.estadoDoObjeto();
        System.out.println("\n" + novoEstado);

        System.out.println("\nO salário líquido do funcionário é de R$" + salarioLiquido);
        scan.close();
    }
}
