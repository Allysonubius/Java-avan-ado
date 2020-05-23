package java1;

import java.io.IOException;
import java.net.URI;
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ThreadFactory;

public class Http1Exemplo {
/*
    static ExecutorService executor = Executors.newFixedThreadPool (6,(){
        @Override
        public Thread newThread (Runnable runnable){
            Thread th
            return null;
        }
    });


 */
    public static void main(String[]args) throws IOException, InterruptedException{
        connectAndPrintURLJavaOracle();
    }

    private static void connectAkamayHttpClient(){
        //
    }

    private static void connectAndPrintURLJavaOracle()throws IOException, InterruptedException{
        HttpRequest request = HttpRequest.newBuilder()
                .GET().uri(URI.create("https://docs.oracle.com/javase/10/language/"))
                .build ();

        HttpClient httpClient = HttpClient.newHttpClient ();

        HttpResponse<String>response = httpClient.send(request , HttpResponse.BodyHandlers.ofString());

        System.out.println ("Status code: " + response.statusCode());
        System.out.println ("Headers response: "+ response.headers());
        System.out.println (response.body());
    }
}
