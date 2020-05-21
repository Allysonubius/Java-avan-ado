package br.com.digital.innovation.one.Java.FatorialRecursivo;

import java.util.function.UnaryOperator;

public class Imutabilidade {
    public static void main(String[]args){
        //Estamos passando um valor a ser alocado na memoria e  que não pode ser alterado.
        int valor =20;
        //Estamos realizando um comando onde estamos pedindo para que o valor seja passado e multiplique por 2 !
        UnaryOperator<Integer> retornaOobro = v -> v *2;
        //Estamos imprimindo e retorna o dobro do valor
        System.out.println (retornaOobro.apply (valor));
        //Esta e a impressão do valor que não pode ser alterado o valor alocado na memoria !
        System.out.println (valor);
    }
}
