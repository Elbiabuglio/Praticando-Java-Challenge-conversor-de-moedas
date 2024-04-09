package br.com.conversormoedas;

import static br.com.conversormoedas.FormatarMoedas.formatarMoedas;
import java.io.IOException;
import java.text.DecimalFormat;

public class Conversao {


    public static String converter(String quantiaOriginal, Object moedaOriginal, Object moedaConversora)
            throws IOException {

        // Divide a quantia original, pelo valor da moedaConversora vinda da API, resultando no valorConvertido.
        double valorConvertido = Double.valueOf(quantiaOriginal) / Double.valueOf(getValorMoedaConversoraAPI(moedaOriginal, moedaConversora));

        return new DecimalFormat("#.###").format(valorConvertido);
    }

    // Define o tipo de moeda e faz requisição para a API.
    public static String getValorMoedaConversoraAPI(Object moedaOriginal, Object moedaConversora) {
        String moedaOriginalSTRING = formatarMoedas(moedaOriginal);
        String moedaConversoraSTRING = formatarMoedas(moedaConversora);

        // Recebe as moedas, ex: USD-BRL e faz requisição para a moneyAPI
        String valorMoedaConversoraAPI = MoneyAPI.sendRequestAPI(moedaOriginalSTRING, moedaConversoraSTRING);

        return valorMoedaConversoraAPI.toString();
    }
}
