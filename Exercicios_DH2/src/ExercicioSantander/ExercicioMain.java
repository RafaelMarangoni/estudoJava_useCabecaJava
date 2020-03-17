package ExercicioSantander;

public class ExercicioMain {
    public static void main(String[] args) {

        Clientes cliente1 = new Clientes(1234,"biraja",9876667,987778);
        ContaPoupanca contapoupanca = new ContaPoupanca("1234",2000,cliente1,0.1);
        ContaCorrente cc = new ContaCorrente("1234",3000,cliente1);

        cc.fazerDeposito(100);
        cc.sacarDinheiro(150);
        contapoupanca.consultarSaldo(200);
        contapoupanca.rendimentoJuros(0.1);


    }
}
