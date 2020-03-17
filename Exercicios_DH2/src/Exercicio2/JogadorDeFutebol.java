package Exercicio2;

public class JogadorDeFutebol {

    private String nome;
    private double energia;
    private int alegria;
    private int gols;
    private int experiencia;

    public JogadorDeFutebol(String nome, double energia, int alegria) {
        this.nome = nome;
        this.energia = energia;
        this.alegria = alegria;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public double getEnergia() {
        return energia;
    }

    public void setEnergia(double energia) {
        this.energia = energia;
    }

    public int getAlegria() {
        return alegria;
    }

    public void setAlegria(int alegria) {
        this.alegria = alegria;
    }

    public int getGols() {
        return gols;
    }

    public void setGols(int gols) {
        this.gols = gols;
    }

    public int getExperiencia() {
        return experiencia;
    }

    public void setExperiencia(int experiencia) {
        this.experiencia = experiencia;
    }

    public void fazerGol(){
            this.energia-= 5;
        System.out.println("energia atual: " + this.energia);
            this.alegria+= 10;
        System.out.println("alegria :" + this.alegria);
            this.experiencia += 1;
        System.out.println("exeperiencia: " + this.experiencia);
            this.gols++;
        System.out.println("GOOOOOOOOOOOOOOOOOOOOOOOOOOOOOOLLLLLLLL!!!!!!!");
        System.out.println("quantidade de gols marcados : " + this.gols);
    }

    public void correr(){
        this.energia-=10;
        System.out.println("Estou cansado professor");
    }


}
