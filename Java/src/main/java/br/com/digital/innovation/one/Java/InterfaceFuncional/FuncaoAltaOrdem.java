package br.com.digital.innovation.one.Java.InterfaceFuncional;

public class FuncaoAltaOrdem {
    public static void main(String[]args){
    /**Iniciando uma Lambda, onde estamos informando o valor para ser calculado*/
    //Abaixo são cada implementação para apresentar no System.out.println
        Soma soma = (a,b) -> a+ b;
        Soma multi = (a,b) -> a * b;
        Soma subt = (a,b) -> a - b;
        Soma divi = (a,b) -> a / b;

        //Aqui estaremos executando a implementação nos apresentado o resultado final
        System.out.print ("Adição :");
        System.out.println (executarOperacao (soma,5,2));
        System.out.print ("Multiplicação :");
        System.out.println (executarOperacao (multi,5,2));
        System.out.print ("Subtração :");
        System.out.println (executarOperacao (subt,5,2));
        System.out.print ("Divisão :");
        System.out.println (executarOperacao (divi,5,2));
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

@FunctionalInterface
//Recebe quando e de fato um modo abstrato

/**Estamos colocando 02 parametros int A e int B.*/
//Inserimos o metodo Soma  na interface
interface Soma{
    public int somar(int a,int b);
}

/**Explicação sobre Função de Alta Ordem
 * */


/*Por parametro ela recebe outra função ou que ela retorna outra função
* */