package com.brc.policiaeladrao;
import java.util.Random;

public class Ladrao extends Jogador{
    protected String veiculoDeFuga;
    protected String complexo;

    public String fugir() {
        Random random = new Random();
        String[] temp = {
            String.format("%s fugiu com seu %s", nome, veiculoDeFuga),
            String.format("%s deu cavalinho de pau com seu %s", nome, veiculoDeFuga),
            String.format("%s DEU A FUGA COM SEU %s", nome, veiculoDeFuga)
        };
        return temp[random.nextInt(temp.length - 1)];
    }
    
    public String sequestrar(Policia policial) {
        Random random = new Random();
        String[] temp = {
            String.format("%s sequestou o %s", nome, policial.nome),
            String.format("%s foi levado para o complexo %s", nome, complexo),
            String.format("%s pegou %s de surpresa", nome, policial.nome)
        };
        return temp[random.nextInt(temp.length - 1)];
    }

    public Ladrao(String nome, String veiculoDeFuga, String complexo) {
        super(nome);
        this.veiculoDeFuga = veiculoDeFuga;
        this.complexo = complexo;
    }
    /*carlim meia noite */
}
