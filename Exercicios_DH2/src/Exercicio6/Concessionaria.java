package Exercicio6;

import java.util.ArrayList;
import java.util.List;

public class Concessionaria {

    public Concessionaria() {
    }

    public void registrarVenda(Veiculo veiculo, Cliente cliente, Venda valor){
        List venda = new ArrayList();
        venda.add(veiculo.marca);
        venda.add(veiculo.modelo);
        venda.add(cliente.nome);
        venda.add(valor.valorVenda);

        System.out.println("O carro " + veiculo.marca + " " + veiculo.modelo + " foi vendo ao cliente " + cliente.nome + " no valor de " + valor.valorVenda );
        System.out.println(venda);
    }
}
