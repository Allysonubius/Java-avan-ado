package br.com.digital.innovation.one.Java.FatorialRecursivo;

import java.util.Arrays;

public class Exemplo3 {
    public static void main(String[]args){
        int[ ] valores = {1,2,3,4};
        /**Paradigma funcional utilizado para melhores manutençõe futuramente;*/
        Arrays.stream(valores)
                //Esta selecionando o numero verificando o valor restante ou seja, o modulo e verificando se o valor restante e igual a 0
            .filter(numero -> numero % 2 == 0)
                //apos isso realiza o mesmo processo so que multiplicando o valor
            .map(numero -> numero * 2)
                //apos feito a estrutura acima ele verifica e realiza a impressão da nosso comando
            .forEach (numero -> System.out.println (numero));

        /**Paradigma imperativo dificulta novas implementações futuramente;*/
         for(int i = 0; i <valores.length; i++){
             //acima ele traz um numero inteiro igual a 0 sendo que o valor tem que ser menor que i e incrementando o valor de i
            int valor = 0;
            // Aqui ele traz um valor na memória igual a 0
            if(valores[1] % 2 == 0){
                //if sendo que os metodo valores tendo 1 como modulo de 2 e igual a 0
                valor = valores[1] *2;
                //então sendo que o valor igual a valores que imposto 1 multiplicando com 2
                if (valor!= 0){
                    //verificamos se o valor e diferente de 0 ele realiza a impressão do valor neste comando valor colocado no inicio da nossa memoria.
                    System.out.println (valor);
                }
            }
        }
    }
/* Esta forma e somente um exemplo !!!

   //Estamos criando um metodo aqui chamado calcular()
    //Ja dentro do metodo calcular esta um parametro somar(x)
    public void calcular(somar(x,y)){

    }
    public somar(int x, int y){
        //somando retornando uma soma
        return x+y;
    }*/
}
