package br.com.digital.innovation.one.Java.Iterações;

import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Iterações {
    public static void main(String[]args){
        String[] nomes = {"Allyson","João","Paulo","Ana","Henrique","Suzi"};
        Integer[] numeros = {1,2,3,4,5};
        ImprimirNomesFiltrados(nomes);
    }
    public static void ImprimirNomesFiltrados(String... nomes){
        String nomesParaImprimir = "";
        for(int i =0; i < nomes.length; i++){
            if(nomes[i].equals("Allyson")){
                nomesParaImprimir += "" + nomes[i];
            }
        }
        //Lista completa
        System.out.println (nomes);
        //impressão com For
        System.out.println ("Nome: "+nomesParaImprimir);


        //Com stream
        String nomesParaImprimirFor = Stream.of (nomes)
                .filter(nome -> nome.equals("Allyson"))
                .collect(Collectors.joining());
        //Impressão
        System.out.println ("Nome: " + nomesParaImprimirFor);
    }

    public static void imprimirTodosNomes(String... nomes){
        for(String nome : nomes){
            System.out.println ("Imprimido pelo for "+nomes);
        }
        Stream.of(nomes)
                .forEach ( nome -> System.out.println("Imprimido pelo forEach " + nome));
    }

    public static void imprimirODobroCadaItem(Integer... numeros){
        for(Integer numero : numeros){
            System.out.println (numero * 2);
        }
    }
}
