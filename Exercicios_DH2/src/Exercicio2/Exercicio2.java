package Exercicio2;

public class Exercicio2 {
    public static void main(String[] args) {

        JogadorDeFutebol jogador1 = new JogadorDeFutebol("Oadriane",10.5,50);
        JogadorDeFutebol jogador2 = new JogadorDeFutebol("gabriel",5,60);

        jogador1.fazerGol();
        SessaoDeTreinamento treinamento1 = new SessaoDeTreinamento();

        treinamento1.treinarA(jogador1);




    }
}
