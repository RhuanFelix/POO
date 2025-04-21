package Exercicios.Exercicios01.ex6;

public class Calendario {
    private int dia;
    private int mes;
    private int ano;

    public Calendario(int dia, int mes, int ano){
        this.dia = dia;
        this.mes = mes;
        this.ano = ano;
    }

    public String nomeMes(int m){
        String mes = "";
        switch (m) {
            case 1:
                mes = "Janeiro";
                break;
            
            case 2:
                mes = "Fevereiro";
                break;

            case 3:
                mes = "Março";
                break;

            case 4:
                mes = "Abril";
                break;

            case 5:
                mes = "Maio";
                break;

            case 6:
                mes = "Junho";
                break;

            case 7:
                mes = "Julho";
                break;

            case 8:
                mes = "Agosto";
                break;

            case 9:
                mes = "Setembro";
                break;

            case 10:
                mes = "Outubro";
                break;

            case 11:
                mes = "Novembro";
                break;

            case 12:
                mes = "Dezembro";
                break;
        }
        return mes;
    }

    public void mostrarData(){
        System.out.printf("\n%d de %s de %d\n", dia, nomeMes(mes), ano);
    }

    public void anoBissexto(){
        if (ano % 4 == 0) {
            System.out.printf("%d é bissexto!\n", ano);
        } else {
            System.out.printf("%d não é bissexto!\n", ano);
        }
    }
}
