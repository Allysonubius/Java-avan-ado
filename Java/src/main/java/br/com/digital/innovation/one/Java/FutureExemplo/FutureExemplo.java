package br.com.digital.innovation.one.Java.FutureExemplo;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

/*import static jdk.nashorn.internal.objects.NativeArray.reduce;

public class FutureExemplo {
    private static final ExecutorService threadPool = Executors.newFixedThreadPool (3);

    public static void main(String[]args){
        Casa casa = new Casa (new Quarto());
        casa.obterAtividadeCasa().forEach(atividade -> threadPool.execute(() -> atividade.realizar()));
    }
}
class Casa {
    private List<Comodo>comodo;

    Casa(Comodo... comodos){
        this.comodo = Arrays.asList (comodos);
    }
    List<Atividade> obterAfazeresCasa(){
        return this.comodo.stream().map(comodos::obterAfazeresComodos);
        .reduce(new ArrayList<Atividade> (),(pivo,atividades)->{
            pivo.addAll(atividades);
            return pivo;
            )};
    }
}
interface Atividade{
    void realizar();
}
abstract class Comodo{
    abstract List<Atividade> obterAfazeresComodos(){
        return Arrays.asList (
                this::getArrumarACasa,
                this::varrerOQuarto,
                this::arrumarGuardaRoupa
        );
    }
    private void arrumarGuardaRoupa(){
        System.out.println ("Arrumar o guarda roupa: ");
    }
    private void varrerOQuarto(){
        System.out.println ("Arrumar o quarto: ");
    }
    private void getArrumarACasa("Arrumar a casa: "){
        System.out.println ();
    }
}

 */