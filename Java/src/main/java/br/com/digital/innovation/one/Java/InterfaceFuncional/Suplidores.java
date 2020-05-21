package br.com.digital.innovation.one.Java.InterfaceFuncional;

import java.util.function.Supplier;

public class Suplidores {
    public static void main(String[]args){
        //Metodo instancia
        //Suplidores retorna o resutaldo
        Supplier<Pessoa> suppliers = () -> new Pessoa();
        //Impressão do suppliers
        System.out.println (suppliers.get());
    }
}
/**Instancia de pessoa*/
class Pessoa{
    private String nome;
    private String idade;

    public Pessoa() {
        nome = "Allyson";
        idade = "21";
    }
//Implementação do toString
    @Override
    public String toString(){
        return String.format ("Nome: " + nome +", Idade " + idade);
    }
}
