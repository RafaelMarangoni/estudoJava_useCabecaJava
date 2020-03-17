package Exercicio6;

public class mainExercicio6 {
    public static void main(String[] args) {

        Cliente cliente1 = new Cliente("josenildo", "biravan", 988778899);
        Veiculo novoVeiculo = new Veiculo ("mercedes", "gla220", 2018,"preta",2000);
        Venda novaVenda = new Venda (cliente1, novoVeiculo, 120.000f );

        Concessionaria agencia = new Concessionaria();

        agencia.registrarVenda(novoVeiculo, cliente1, novaVenda);



    }
}
