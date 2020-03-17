package ExercicioSantander;

public class ContaCorrente extends Conta{

    public ContaCorrente(String numeroDaConta, float saldo, Clientes titular) {
        super(numeroDaConta, saldo, titular);
    }

    @Override
    public void sacarDinheiro(int valor){
        if(getSaldo() < valor){
            setSaldo(getSaldo()-valor);
            System.out.println("voce esta utilizando o limite do cheque especial, teu saldo atual é :" + getSaldo());
        }
    }

    public void fazerDeposito(int valor){
        setSaldo(+valor);
        System.out.println("seu saldo atual é : " +  getSaldo());
    }

    public void consultarSaldo(int saldo){
        System.out.println(getSaldo());
    }

    public void depositarCheque(float valor, String bancoEmissor, float date){
        setSaldo(getSaldo()+valor);
        System.out.println("valor do banco" + bancoEmissor + "\nfoi depositado com sucesso\n e estara disponivel no dia : " + date);
    }


}
