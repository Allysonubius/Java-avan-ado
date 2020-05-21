package br.com.digital.innovation.one.Java.FatorialRecursivo.Fatorial;

public class TailCall {
    /**Exemplo de tail call*/
    public static void main(String[]args){
        System.out.println (fatorialA(5));
    }
    public static double fatorialA(double valor){
        return fatorialTailCall(valor,1);
    }
    public static double fatorialTailCall(double valor, double numero){
        if(valor == 0){
            return  numero;
        }
        return fatorialTailCall (valor - 1, numero * valor);
    }
}
/*Tail Call*/
/**5 * 4 * 3 * 2 * 1*/
/* sendo 5 x 4 = 20 x 3 = 60 x 2 = 120 x 1 = 120 o resultado final !*/


/**Caso aconteça de se colocar um valor fatorial maior que limite, acaba se excedendo a apresentar o seguinte ERRO como:
 *
 *  java.lang.StackOverflowError por ainda não haver suporte para este metodo.
 * */