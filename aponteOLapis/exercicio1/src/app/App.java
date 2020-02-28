package app;



import java.io.File;
import java.io.FileNotFoundException;
import java.nio.channels.ReadableByteChannel;




public class App {
    public static void main(final String[] args) throws Exception {

        String name = "Fido";
        int size = 27;

        // criamos uma nova variavel do tipo Dog, porem da erro devido a classe ainda nao ter sido criada;
        //Estamos em teste devido a problemas com o plugin do vsCode;
        // Dog mydog = 

        //convertendo String em um inteiro;
        
        final String num = "8";

        final int z = Integer.parseInt("num");


        try {

           readTheFile("myFile.txt");

        }catch(final FileNotFoundException ex){

            System.out.println("File note Found");
            
        }
        
    }
}