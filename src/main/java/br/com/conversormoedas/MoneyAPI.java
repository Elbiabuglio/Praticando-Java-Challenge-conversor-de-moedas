package br.com.conversormoedas;


import java.net.URI; // permite representar a referência de um Universal Research Indicator
import java.net.http.HttpClient;
import java.net.http.HttpRequest;
import java.net.http.HttpResponse;

// Pacote JSONObject: permite manipular arquivo JSON.
import org.json.JSONObject;

public class MoneyAPI {
   
    public static String sendRequestAPI(String moedaOriginal, String moedaConversora) {
        

        HttpClient client = HttpClient.newHttpClient();
        

        String URIdaAPI = "https://v6.exchangerate-api.com/v6/e23ee126610edd1c86b31c31/latest/USD" + moedaConversora + "-" + moedaOriginal;
        

        HttpRequest request = HttpRequest.newBuilder().uri( URI.create(URIdaAPI) ).build();    
        

        
        return client.sendAsync(request, HttpResponse.BodyHandlers.ofString()) 
                .thenApply(HttpResponse::body)
                .thenApply(MoneyAPI::JSONParse)
                .join();
    }
    

    public static String JSONParse(String responseBody) {
        JSONObject dados = new JSONObject(responseBody);
        String moedaURL = dados.toString().substring(2, 8);
        
        JSONObject dadosDaMoedaConversora = dados.getJSONObject(moedaURL);
        
        return dadosDaMoedaConversora.getString("ask"); 
    }
}
