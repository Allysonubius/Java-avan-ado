package br.com.digital.innovation.one.Java.FatorialRecursivo;

/**Lambda*/
public class Exemplo6 {
    public static void main(String[]args){
        //Estamos realizando um comando onde passamos uma lambda para executar um valor e explicitando este valor para gerar nosso comando
        FuncaoNome funcaoNome = valor -> valor;
        //Esta sendo executado a impressão e passando o nosso comando da interface em gerar o valor do comando apresentado
        System.out.println (funcaoNome.gerar( "Allyson de Oliveira"));
    }
}
//Intergace para gerar nosso valor final
interface FuncaoNome{
    String gerar (String valor);
}
