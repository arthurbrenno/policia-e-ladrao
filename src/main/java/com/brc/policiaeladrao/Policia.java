package com.brc.policiaeladrao;
import java.security.SecureRandom;
public class Policia extends Jogador {
    private boolean algema;
    protected String radio;

    public String prender(Ladrao ladrao) {
        SecureRandom random = new SecureRandom();
        if (!algema) {
            String[] temp = {
                String.format("%s esqueceu suas algemas no Zebu Carnes!", nome),
                String.format("%s ESTÁ SEM ALGEMAS!!!!!", nome),
                String.format("%s perdeu suas algemas!", nome),
                String.format("%s esqueceu as algemas na PADARIA!", nome),
                String.format("As algemas do %s SUMIRAM!", nome),
                String.format("%s esqueceu as algemas no LIAE", nome),
                String.format("%s deu DROP TABLE algemas!", nome)
            };
            return temp[random.nextInt(temp.length - 1)];
        }
        String[] temp = {
            String.format("%s prendeu %s", nome, ladrao.nome),
            String.format("%s levou %s pro xilindró", nome, ladrao.nome),
            String.format("%s foi ver o sol nascer quadrado...", ladrao.nome)
        };
        return temp[random.nextInt(temp.length - 1)];
    }

    public String chamarReforcos() {
        SecureRandom random = new SecureRandom();
        String[] temp = {
            String.format("%s CHAMOU REFORÇOS com seu radio %s", nome, radio),
            String.format("%s SOLICITOU AUXILIO DA TROPA!", nome),
            String.format("%s não está aguentando a pressao!", nome),
        };
        return temp[random.nextInt(temp.length - 1)];
    }

    public Policia(String nome, boolean algema, String radio) {
        super(nome);
        this.algema = algema;
        this.radio = radio;
    }
    /*CHECK*/
    
}