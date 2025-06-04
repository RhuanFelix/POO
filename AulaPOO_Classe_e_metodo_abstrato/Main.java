public class Main {
    public static void main(String[] args) {
        Dancarino dancarino = new Dancarino("Maria");
        Comediante comediante = new Comediante("João");
        Magico magico = new Magico("Pedro");

        Palco palco = new Palco();
        
        palco.adicionarParticipante(dancarino);
        palco.adicionarParticipante(comediante);
        palco.adicionarParticipante(magico);

        palco.apresentarShow();
    }
}