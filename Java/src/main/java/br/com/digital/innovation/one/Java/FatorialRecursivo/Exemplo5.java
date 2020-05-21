package br.com.digital.innovation.one.Java.FatorialRecursivo;

public class Exemplo5 {
    public  static void main(String []args) {
        //Estamos declarando um valor para que seja realizado um novo valor !
        Funcao gerarUmaSAida = valor -> valor;
    }
}
//Estamos declarando para que não seja alterado esta interface que foi implantada !
@FunctionalInterface

//Exemplo de interface funcional
interface Funcao{
    String gerar(String valor);
}
