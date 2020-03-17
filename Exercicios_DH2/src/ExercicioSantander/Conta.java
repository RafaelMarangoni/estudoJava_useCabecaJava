package ExercicioSantander;

public abstract class Conta {

    protected String numeroDaConta;
    protected double saldo;
    protected Clientes titular;

    public Conta(String numeroDaConta, float saldo, Clientes titular) {

    }

    public String getNumeroDaConta() {
        return numeroDaConta;
    }

    public void setNumeroDaConta(String numeroDaConta) {
        this.numeroDaConta = numeroDaConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Clientes getTitular() {
        return titular;
    }

    public void setTitular(Clientes titular) {
        this.titular = titular;
    }

    public abstract void sacarDinheiro(int valor);
    public abstract void fazerDeposito(int valor);
    public abstract void consultarSaldo(int saldo);
}
