package br.com.digital.innovation.one.Java.InterfaceFuncional;

public class FuncaoAltaOrdem {
    public static void main(String[]args){
    /**Iniciando uma Lambda, onde estamos informando o valor para ser calculado*/
        Soma soma = (a,b) -> a+ b;
        System.out.println (executarOperacao (soma,5,1));
    }
    /**Estamos fazendo o calculo*/
    public static int executarOperacao(Soma soma, int a, int b){
        return soma.somar (a,b);
    }
    /*
    //Ja este exemplo abaixo e um paradigma funcional
    public int soma(int a ,int b){
        return a + b;
    }

     */
}
/**Estamos colocando 02 parametros int A e int B.*/
interface Soma{
    public int somar(int a,int b);
}
