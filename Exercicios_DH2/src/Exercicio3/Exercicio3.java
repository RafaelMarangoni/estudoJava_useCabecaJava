package Exercicio3;

public class Exercicio3 {

    public static void main(String[] args) {

        Atleta atleta1 = new Atleta("josivaldo", 250,250);
        Atleta atleta2 = new Atleta("Esteriovaldo", 30,60);

        Prova prova1 = new Prova("easy", atleta1);


        prova1.podeRealizar(atleta1,atleta2, 20, 200);

    }
}
