package br.com.digital.innovation.one.Java.InterfaceFuncional;

import java.util.function.Function;

public class Funcoes {
    public  static void main(String[] args ){

        //Este comando pede que o contexto apresentado retorne ao contrario !
        Function<String, String> corretorNomeContrario = contexto -> new StringBuilder(contexto).reverse().toString();
        //Aqui estamos retornando um Inteiro
        Function<String,Integer> converterStringInteiro = string -> Integer.valueOf (string);
        //Esta sendo Impresso o nome
        System.out.print ("Nome ao contrário: ");
        System.out.println (corretorNomeContrario.apply ("Allyson"));
        //Esta sendo impresso o valor
        System.out.print ("N°: ");
        System.out.println (converterStringInteiro.apply ("20"));
    }
}
