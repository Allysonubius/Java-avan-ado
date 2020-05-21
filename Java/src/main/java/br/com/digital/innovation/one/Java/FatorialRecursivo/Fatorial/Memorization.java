package br.com.digital.innovation.one.Java.FatorialRecursivo.Fatorial;

import org.springframework.context.expression.MapAccessor;

import java.util.HashMap;
import java.util.Map;
/**EXEMPLO DE METODO MEMORIZATION*/
public class Memorization {
    //Foi instanciado o MAP estatico !
    static Map<Integer, Integer> Mapa_Fatorial = new HashMap<> ();
    public static void main(String[]args){
        long I = System.nanoTime ();
        System.out.println (Memorization(15));
        long F = System.nanoTime ();
        System.out.println ("Fatorial 1" + (F - I));

        I = System.nanoTime();
        System.out.println (Memorization(15));
        F = System.nanoTime ();
        System.out.println ("Fatorial 2" +(F - I));
    }
    public static Integer Memorization(Integer value){
        if(value == 1){
            return value;
        }else{
            if (Mapa_Fatorial.containsKey (value)){
                return Mapa_Fatorial.get (value);
            }else{
                Integer resultado = value * Memorization (value -1);
                Mapa_Fatorial.put (value,resultado);
                return resultado;
            }
        }
    }
}
