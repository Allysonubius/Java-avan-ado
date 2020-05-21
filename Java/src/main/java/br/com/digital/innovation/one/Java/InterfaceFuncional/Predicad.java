package br.com.digital.innovation.one.Java.InterfaceFuncional;

import java.util.function.Predicate;

public class Predicad {
    public static void main(String []args){
        //Neste comando esta sendo pedido se o valor esta vazio retorne true se contér algo será falso
        Predicate<String> vazio = valor -> valor.isEmpty();
        //Impressão quando não contem alguma coisa sendo true pelo comando isEmpty !"
        System.out.println ("Há alguma coisa ?");
        System.out.println (vazio.test(""));
        //Impressão quando contém algo a mostrar sendo false
        System.out.println ("Há alguma coisa ?");
        System.out.println (vazio.test("Allyson"));
    }
}
