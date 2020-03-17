package Exercicio2;

import Exercicio2.JogadorDeFutebol;

public class SessaoDeTreinamento {

    private int experiencia;

    public SessaoDeTreinamento() {

    }

    public int getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(int experiencia) {
        this.experiencia = experiencia;
    }

    public void treinarA(JogadorDeFutebol jogador){
        System.out.println("tua experiencia anterior era " + jogador.getExperiencia());
            jogador.correr();
            jogador.fazerGol();
            jogador.correr();
            jogador.setExperiencia(+1);
            System.out.println("nova experiencia " + jogador.getExperiencia());
        
        }
}
