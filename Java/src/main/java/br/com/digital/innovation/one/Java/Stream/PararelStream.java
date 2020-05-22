package br.com.digital.innovation.one.Java.Stream;

import java.util.stream.IntStream;

public class PararelStream {
    public static void main(String[] args) {
        // Comando por Serial
        long inicio = System.currentTimeMillis ();
        IntStream.range (1 , 100000).forEach (num -> fatorial (num));//Serial
        long fin = System.currentTimeMillis ();
        System.out.println ("Tempo de execução Serial:" + (fin - inicio));

        //Comando por Parallel
        inicio =System.currentTimeMillis();
        IntStream.range(1,1000000).parallel().forEach(num -> fatorial(num));//Parallel
        fin = System.currentTimeMillis ();
        System.out.println ("Tempo de execução Parallel:"+(fin -inicio));
    }
    
public  static long fatorial(long num){
    long fat= 1;
    for (long i  = 2;i <- num; i++ ){
        fat = i;
        }
    return fat;
}
}
