package br.com.digital.innovation.one.Java.FatorialRecursivo;

import java.util.function.BiPredicate;

public class FunçõesPuras {
    public static void main(String[]args){
        BiPredicate<Integer , Integer> verificarSeEMaior =
                //Nesta lambda estamos passando um valor para saber se ele e superior ao outro valor !
                (parametro, valorComparacao) -> parametro > valorComparacao;
        //Nesta pedido estamo realizando a impressão na tela para saber se 13 e maior que 12
        System.out.println (verificarSeEMaior.test(13,12));
        //Neste alteramos o valor mas com os mesmos comandos para dar a resposta false dizendo que 12 não e maior que 13.
        System.out.println (verificarSeEMaior.test (12,13));

    }
}
