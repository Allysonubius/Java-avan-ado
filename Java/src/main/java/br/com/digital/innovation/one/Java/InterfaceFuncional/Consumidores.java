package br.com.digital.innovation.one.Java.InterfaceFuncional;

import java.util.function.Consumer;

public class Consumidores {
    public static void main(String[]args){
        //Method reference



        //Esta sendo chamando em forma de uma funcação !
        Consumer<String> imprimirUmaFrase = System.out::println;
        //Sintaxe da lambda impressão !
        Consumer<String> imprimirUmaFrase2 = frase -> System.out.println (frase);
        //Este parametro esta dentro da sintaxe acima !
        imprimirUmaFrase.accept ("Hello World !");
    }
}
