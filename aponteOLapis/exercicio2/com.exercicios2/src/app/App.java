package app;

import java.util.List;

public class App {
public static void main(String[] args) {

        int umNumeroA = 1;
        double umNumeroB = 2.5;
        int umNumeroC = 3;

        List<Integer> numeros = new ArrayList<Integer>();

        numeros.add(34);
        numeros.add(12);
        numeros.add(8);
        numeros.add(23);

        // ----------- Basico sobre a atribuição de variaveis ----------------------//

        // String umaCadeiaDeTexto = "Testando elementos de uma variavel";

        // System.out.println("Aqui temos o numero inteiro "+ umNumeroA + "\naqui temos o numero double: "+ umNumeroB + "anyaway "+ umaCadeiaDeTexto);

        // double soma = umNumeroA + umNumeroB;

        // System.out.println("a soma dos elementos é: "+ soma);

        // double subtracao = umNumeroA - umNumeroB;

        // System.out.println("a diferenca entra os numeros A e B é: "+ subtracao);

        if(umNumeroA >= umNumeroC){
            System.out.println("o numero A é maior");
        }else{
            System.out.println("O numero C é maior");
        };

        if(umNumeroC %1 == 1   && umNumeroC > 10){
            System.out.println(true);
       }else{
            System.out.println(false);
        }
    }
}