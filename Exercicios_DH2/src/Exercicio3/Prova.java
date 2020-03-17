package Exercicio3;

public class Prova {
    private String dificuldade;
    private Atleta energiaNecessaria;

    int contadorAtleta1 = 0;
    int contadorAtleta2 = 0;

    public Prova(String dificuldade, Atleta energiaNecessaria) {
        this.dificuldade = dificuldade;
        this.energiaNecessaria = energiaNecessaria;
    }

    public String getdificuldade() {
        return dificuldade;
    }

    public void setdificuldade(String dificuldade) {
        this.dificuldade = dificuldade;
    }

    public String getDificuldade() {
        return dificuldade;
    }

    public void setDificuldade(String dificuldade) {
        this.dificuldade = dificuldade;
    }

    public void podeRealizar(Atleta atleta1, Atleta atleta2 ,int energiaNecessaria, int nivelDaProva){
        if(atleta1.getNivel() >= nivelDaProva  ) {
            while (atleta1.getEnergia() > energiaNecessaria) {
                atleta1.setEnergia(atleta1.getEnergia() - energiaNecessaria);
                this.contadorAtleta1 += 1;
                System.out.println(atleta1.getNome() + "pode realizar " + contadorAtleta1 + " provas");

            }
        }else{
            System.out.println("atleta nao tem nivel suficiente para esta prova");
        }
        if (atleta2.getNivel() > nivelDaProva) {
            while (atleta2.getEnergia() > energiaNecessaria) {
                atleta2.setEnergia(atleta2.getEnergia() - energiaNecessaria);
                this.contadorAtleta2 += 1;
                System.out.println(atleta2.getNome() + "pode realizar " + contadorAtleta2 + " provas");

            }
        }else{
            System.out.println("atleta " + atleta2.getNome() + " nao tem nivel ");
        }


        if (contadorAtleta1 > contadorAtleta2){
            System.out.println("atleta 1 recebe a medalha de ouro");
        }
        else{
            System.out.println("atleta 2 recebe a medalha de ouro");
        }

    }



}
