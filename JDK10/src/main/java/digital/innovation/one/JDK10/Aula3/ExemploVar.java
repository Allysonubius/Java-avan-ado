package digital.innovation.one.JDK10.Aula3;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.net.URL;
import java.util.stream.Collectors;

public class ExemploVar {

    public static void main(String[]args){
        teste  ("Allyson ", "Oliveira");
        printarSoma (4);
    }

   /* public static void main(String[]args)throws IOException {
        var url = new URL ("https://docs.oracle.com/javase/10/language/");
        var urlConnection = url.openConnection ();
        var bufferedReader = new BufferedReader (new InputStreamReader (urlConnection.getInputStream ()));

        System.out.println (bufferedReader.lines().collect (Collectors.joining ()
        ).replaceAll(">","<\n"));
    }

    */
    public static void teste(String nome, String sobrenome){
        var name = String.format(nome,sobrenome);
        System.out.println ("Nome: "+ name + sobrenome);
    }

    public static void printarSoma(int... numeros){
        int soma;
        if(numeros.length > 0){
            soma = 1;
            for(int numero : numeros){
                soma+=numero;
            }
            System.out.println ("A soma é: "+ soma);
        }
    }
}

// Var não pode ser utilizado ao nivel de classe;

// var não pode ser utilizado como parametro;

// var não pode ser utilizada em variaveis utilizadas;
