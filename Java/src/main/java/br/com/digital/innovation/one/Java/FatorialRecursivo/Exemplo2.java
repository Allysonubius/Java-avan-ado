package br.com.digital.innovation.one.Java.FatorialRecursivo;

import java.util.function.UnaryOperator;

public class Exemplo2 {
    public static void main(String[]args){
        //UnaryOperator = CLASS
        UnaryOperator<Integer> calcularValorVezesTrinta = valor -> valor *3;// estamos aplicando a classe UnaryOperator com o atributo Integer  para calcular o valor
        //Aplicando o valor na memoria para executar na impressão
        int valor = 10;
        //Impressão do paradigma aplicando o valor ao calculo
        System.out.println ("O resultado é:"+ calcularValorVezesTrinta.apply (10));
    }
}
