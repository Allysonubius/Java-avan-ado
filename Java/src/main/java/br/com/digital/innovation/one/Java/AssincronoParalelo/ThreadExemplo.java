package br.com.digital.innovation.one.Java.AssincronoParalelo;

import java.util.concurrent.ThreadPoolExecutor;

public class ThreadExemplo {
    public static void main(String[]args){
    BarraDeCarregamento barraDeCarregamento= new BarraDeCarregamento ();
    barraDeCarregamento.toString ();
    System.out.println ();
    }
}

class GerarPDF implements  Runnable{
    @Override
    public void run(){
        System.out.println ("Gerar PDF");
    }
}

class BarraDeCarregamento implements Runnable{
    @Override
    public void run(){
        System.out.println ("Loading ... ");
    }
}


