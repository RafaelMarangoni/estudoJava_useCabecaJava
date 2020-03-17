package ExercicioInterface;

public class Soma implements OperacaoMatematica{


    @Override
    public void calcula(int a, int b) {
        int resultado = a + b;
        System.out.println(resultado);
    }
}
