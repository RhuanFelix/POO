package Exercicios.Exercicios08;

public class CadastrarForma {
    FormaGeometrica[] formas;
    int i;

    public CadastrarForma(){
        formas = new FormaGeometrica[4];
        i = 0;
    }

    public void addForma(FormaGeometrica formaGeometrica){
        if (i < formas.length) {
            formas[i] = formaGeometrica;
            i++;
        } else {
            System.out.println("Não é possível adicionar mais formas geométricas!");
        }
    }

    public void listar(){
        for (int i = 0; i < formas.length; i++) {
            if (formas[i] != null) {
                formas[i].desenhar();
            }
        }
    }
}