package Exercicio4;

public class Exercicio4 {
    public static void main(String[] args) {


        Tripe novoTripe = new Tripe(3,1,2);

        novoTripe.setDobrar(true);
        System.out.println(novoTripe.isDobrar());
        System.out.println(novoTripe.getAlturaAtual());
        novoTripe.setAlturaAtual(1);
        System.out.println(novoTripe.getAlturaAtual());
        novoTripe.dobrar();

        novoTripe.guardar();
        System.out.println(novoTripe.isDobrar());
    }
}
