public class Conta{

    private int numeroDaConta;
    private double saldo;
    private Cliente titular;


    public Conta(int numeroDaConta, double saldo, Cliente titular) {
        this.numeroDaConta = numeroDaConta;
        this.saldo = saldo;
        this.titular = titular;
    }

    public int getNumeroDaConta() {
        return numeroDaConta;
    }

    public void setNumeroDaConta(int numeroDaConta) {
        this.numeroDaConta = numeroDaConta;
    }

    public double getSaldo() {
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }

    public Cliente getTitular() {
        return titular;
    }

    public void setTitular(Cliente titular) {
        this.titular = titular;
    }

    public void deposito(int deposito){
        saldo += deposito;
        System.out.println("seu saldo atual é " + this.saldo );
    }

    public void saque (int saque){
        if(this.saldo <= 0 || saque > this.saldo){
            System.out.println("saldo indisponivel");
        }else{
            this.saldo = this.saldo-saque;
            System.out.println("seu saldo atual é :" + this.saldo);
        }
    }
}

