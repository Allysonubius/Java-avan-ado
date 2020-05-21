package br.com.digital.innovation.one.Java.FatorialRecursivo.Fatorial;

public class Recursivo {
    public static void main(String[] args) {

        /**Exemplo de Fatorial Recursivo */
        System.out.println (fatorial (5));//Esta sendo executado o print com valor fatorial selecionado
    }

    public static int fatorial(int value) {
        if (value == 1) {
            return value;
        } else {
            //O fatorial neste momento multiplica o valor resutante de 5 - 1 = 4
            return value * fatorial ((value - 1));
        }
    }
}
//Valor fatorial de 5 * 4 * 3 * 2 * 1 =120
//Estamos multiplicando todos os valores antecessores do valor N° 5.
