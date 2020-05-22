package Digital.Innovation.One.Core;
//Esta sendo importado do modulo Interno
import digital.innovation.one.utils.interna.Calculadora;
public class Runner {
    public static void main(String[]args){
    Calculadora calculadora = new Calculadora ();
    System.out.println ("Multiplicação: 2 * 4 = " + calculadora.multi (2,4));
    System.out.println ("Soma: 2 + 4 = " + calculadora.sum(2,4));
    System.out.println ("Divisão: 2 / 4 = " + calculadora.div (2,4));
    System.out.println ("Subtração: 2 - 4 = " + calculadora.sub ( 2,4));
    }
}
