package com.brc.policiaeladrao;
import java.security.SecureRandom;

public abstract class Jogador {
    protected String nome;
    protected double vidaAtual = 100;
    
    public String atirar(Jogador jogador) {
        SecureRandom random = new SecureRandom();
        String[] temp = {
            String.format("%s atirou", nome),
            String.format("%s METEU BALA", nome),
            String.format("%s truvou %s de tiro", nome, jogador.nome),
            String.format("%s sentou o aço em %s", nome, jogador.nome),
            String.format("%s DESTROÇOU %s COM TIROS", nome, jogador.nome),
            String.format("%s DESFERIU UMA SARAIVADA DE BALAS EM %s", nome, jogador.nome),
            String.format("%s ESGANOU %s COM UMA RAJADA DE TIROS", nome, jogador.nome),
            String.format("%s ANIQUILOU %s COM DISPAROS PRECISOS", nome, jogador.nome)
        };
        if (jogador.vidaAtual > 15) {
            jogador.vidaAtual -= 17;
        }
        else {
            jogador.vidaAtual = 0;
        }
        return temp[random.nextInt(temp.length - 1)];
    }

    public String arregar() {
        SecureRandom random = new SecureRandom();
        String[] temp = {
            String.format("%s ARREGOU!!!", nome),
            String.format("%s desistiu da luta...", nome),
            String.format("%s A R R E G O U!", nome),
            String.format("%s D E S I S T I U!", nome),
            String.format("%s não aguentou a pressao", nome)
        };
        return temp[random.nextInt(temp.length - 1)];
    }

    public Jogador(String nome) {
        this.nome = nome;
        this.vidaAtual = 100;
    }
}
