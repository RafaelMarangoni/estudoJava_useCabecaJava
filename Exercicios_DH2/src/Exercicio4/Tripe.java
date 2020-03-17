package Exercicio4;

public class Tripe {

    boolean dobrar;
    int alturaMaxima;
    int alturaMinima;
    int alturaAtual;

//    boolean alturaMinima;
//    boolean alturaAtual;


    public Tripe(int alturaMaxima, int alturaMinima, int alturaAtual) {
        this.alturaMaxima = alturaMaxima;
        this.alturaMinima = alturaMinima;
        this.alturaAtual = alturaAtual;
    }

    public boolean isDobrar() {
        return dobrar;
    }

    public void setDobrar(boolean dobrar) {
        this.dobrar = dobrar;
    }

    public int getAlturaMaxima() {
        return alturaMaxima;
    }

    public void setAlturaMaxima(int alturaMaxima) {
        this.alturaMaxima = alturaMaxima;
    }

    public int getAlturaMinima() {
        return alturaMinima;
    }

    public void setAlturaMinima(int alturaMinima) {
        this.alturaMinima = alturaMinima;
    }

    //    public boolean isAlturaMaxima() {
//        return alturaMaxima;
//    }
//
//    public void setAlturaMaxima(boolean alturaMaxima) {
//        this.alturaMaxima = alturaMaxima;
//    }

//    public boolean isAlturaMinima() {
//        return alturaMinima;
//    }
//
//    public void setAlturaMinima(boolean alturaMinima) {
//        this.alturaMinima = alturaMinima;
//    }

    public int getAlturaAtual() {
        return alturaAtual;
    }

    public void setAlturaAtual(int alturaAtual) {
        this.alturaAtual = alturaAtual;
    }

    public void definirAltura(Integer novaAltura){
        this.alturaAtual += novaAltura;
    }

    public void dobrar(){
        final boolean setDobrado = true;
        System.out.println("esta dobrado");
    }

    public void desdobrar(){
        final boolean setDobrado = false;
        System.out.println("esta desdrobrado e nao podemos guardar");

    }

    public void guardar(){
        if (isDobrar() && getAlturaAtual() == getAlturaMinima()) {
                System.out.println("esta pronto para ser guardado");
            }else {
                System.out.println("por favor dobrar e diminuir o tripé");
            }

    }

}
