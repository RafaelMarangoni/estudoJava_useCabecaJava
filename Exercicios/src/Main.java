import java.util.ArrayList;
import java.util.List;

public class Main {



    public static void main(String[] args) {
        int contador = 0;

// soma do vetor

//        List<Integer> numeros = new ArrayList();
//        numeros.add(1);
//        numeros.add(3);
//        numeros.add(4);
//        numeros.add(5);
//
//
//        for(int i=0; i < numeros.size() ; i++){
//            contador+= numeros[i];
//        }
//        System.out.println(contador);
//
//        int[] vetor = {1,2,3,4,5};
//        for(int i=0; i < vetor.length ; i++){
//            contador = contador + vetor[i];
//        }
//        System.out.println(contador);

//        soma de numeros pares

//        int[] somaDePares = {1,2,3,4,5,1,4,5,7,8,6,3,4,3};
//
//
//        for(int i=0; i < somaDePares.length ; i++) {
//            if (somaDePares[i] % 2 == 0) {
//                contador = contador + somaDePares[i];
//            }
//        }
//        System.out.println(contador);

        Cliente cliente1 = new Cliente("Maria", "das Dores");
        Cliente cliente2 = new Cliente("joao", "pé de feijao");

        Conta contaPremium = new Conta(1231, 1500.05, cliente1);
        Conta contaBasica = new Conta(3214,1000, cliente2);

        contaPremium.deposito(500);
        contaPremium.saque(2500);




  }
}
