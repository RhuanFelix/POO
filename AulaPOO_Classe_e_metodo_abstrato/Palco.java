public class Palco {
    private Participante[] participantes;
    private int index;

    public Palco(){
        participantes = new Participante[10];
    }

    public void adicionarParticipante(Participante p){
        if(index < participantes.length){
            participantes[index] = p;
            index++;
        }
    }

    public void apresentarShow(){
        for(int i = 0; i < participantes.length; i++){
            if(participantes[i] != null){
                participantes[i].seViraNosTrinta();
            }
        }
    }
}