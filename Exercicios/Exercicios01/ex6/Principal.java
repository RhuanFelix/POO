package Exercicios.Exercicios01.ex6;

import java.util.Scanner;

public class Principal {
        public static void main(String[] args){
        Scanner scan = new Scanner(System.in);
        System.out.println("Digite uma data:");
        int dia1 = scan.nextInt();
        System.out.println("Digite um numero que represente um mes:");
        int mes1 = scan.nextInt();
        System.out.println("Digite um ano:");
        int ano1 = scan.nextInt();

        System.out.println("\n");

        System.out.println("Digite uma data:");
        int dia2 = scan.nextInt();
        System.out.println("Digite um numero que represente um mes:");
        int mes2 = scan.nextInt();
        System.out.println("Digite um ano:");
        int ano2 = scan.nextInt();

        Calendario c1 = new Calendario(dia1, mes1, ano1);
        Calendario c2 = new Calendario(dia2, mes2, ano2);

        c1.mostrarData();
        c1.anoBissexto();

        c2.mostrarData();
        c2.anoBissexto();

        scan.close();
    }
}
