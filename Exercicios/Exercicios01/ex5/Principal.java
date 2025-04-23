package Exercicios.Exercicios01.ex5;

import java.util.Scanner;

public class Principal {
    public static void main(String[] args){
        Funcionario f = new Funcionario("1234", "Fernando", "123.456.789-10", "Conjunto João Pessoa", "(83)9 9446-1329", 26, 2400);
        String estado = f.toString();
        System.out.println(estado);

        System.out.println("\nDigite o novo salário do seu funcionário:");

        Scanner scan = new Scanner(System.in);

        float novoSalario = scan.nextFloat();
        f.setSalario(novoSalario);
        float salarioLiquido = f.calcularSalarioLiquido(novoSalario);

        String novoEstado = f.toString();
        System.out.println("\n" + novoEstado);

        System.out.println("\nO salário líquido do funcionário é de R$" + salarioLiquido);
        scan.close();
    }
}
