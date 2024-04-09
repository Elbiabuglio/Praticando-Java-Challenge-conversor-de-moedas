
<h1>Praticando Java Challenge Conversor de Moedas </h1> 


## Descrição do projeto 

  Conversor de moedas em tempo real utilizando os pacotes: java.io, java.net, java.util, java.lang.
  Nele faço uma conexão REST com uma api JSON onde as moedas são atualizadas em tempo real.
  Como é um desafio backend, foquei em tentar trazer um melhor recurso para o app, que foi o de atualização em tempo real, 
  até então nunca tinha feito uma requisição HTTP em Java. Tentei aplicar os conceitos de Clean Code, deixando
  o código mais legível e dividindo as responsabilidades em classes específicas.
    
## Classes:
   - Main: starta a aplicação.
   - OrdemDeExecucao: executa a lógica de passos e renderiza os componentes do aplicativo;
   - Conversao: faz a conversão da moeda original para a moeda conversora;
   - MoneyAPI: faz requisição em api de cotações atualizado em tempo real.

   - ListaDeMoedas: cria um Object que contém as moedas disponíveis para conversão.
   - FormatarMoedas: formata o texto das moedas para obter a sigla de projeção do valor, ex: BRL, USD, MXN;
   - InserirMoedaConversora: renderiza input para inserir a moeda conversora, em seguida retorna a moeda conversora escolhida.
   - InserirMoedaOriginal: renderiza input para inserir a moeda original, em seguida retorna a moeda original escolhida.
   - InserirQuantiaOriginal: renderiza input para inserir a quantia original, em seguida retorna a quantia original informada.


## Funcionalidades

:heavy_check_mark: Converter moedas 

:heavy_check_mark: [HTTP Reque](https://v6.exchangerate-api.com/v6/e23ee126610edd1c86b31c31/latest/USD)

## Linguagens, dependencias e pacotes utilizados :books:

- Java;
- Maven;
- SpringBoot;
- java.net; 
- json.JSONObject;
- javax.swing.JOptionPane;



Copyright :copyright: 2024 - Elbia Buglio
