package ExercicioSantander;

public class ContaPoupanca extends Conta {

    private double juros;

    public ContaPoupanca(String numeroDaConta, float saldo, Clientes titular, double juros){
        super(numeroDaConta, saldo, titular);
        this.juros = juros;
    }

    public double getJuros() {
        return juros;
    }

    public void setJuros(double juros) {
        this.juros = juros;
    }

    @Override
    public void sacarDinheiro(int valor){
        if(getSaldo() >= valor){
            System.out.println("saque realizado com sucesso : " + getSaldo());

        }else{
            System.out.println("Impossivel realizar o saque, saldo insulficiente" + getSaldo());
        }
    }

    public void fazerDeposito(int valor){
        setSaldo(+valor);
        System.out.println("seu saldo atual é : " +  getSaldo());
    }

    public void consultarSaldo(int saldo){
        setSaldo(getSaldo()+saldo);
        System.out.println(getSaldo());
    }

    public void rendimentoJuros(double juros){
        System.out.println("seu saldo anterior é :" + getSaldo());
        setSaldo(getSaldo()*juros);
        System.out.println("Sr."+"seu saldo com juros é : " + getSaldo());

    }

    public void sacarJuros(){
        setSaldo(getSaldo() - juros);
        System.out.println("seu saldo da poupança menos o juros é :" + getSaldo());
    }

}
