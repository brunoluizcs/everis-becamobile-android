# Avaliação Beca Mobile Android

Criar um aplicativo que realize a listagem de filmes que são tendências da semana. Quando o usuário selecionar um filme o aplicativo deve direciona-lo para uma segunda tela e exibir o título, capa, rating e sinopse. 

A listagem de filmes deve ser consultada na API https://developers.themoviedb.org/3/getting-started/introduction ao se cadastrar você receberá uma chave de acesso que deve ser usada nas requisições. 

- Requisição para listar as tendências https://developers.themoviedb.org/3/trending/get-trending
- Requisição para listar os detalhes https://developers.themoviedb.org/3/movies/get-movie-details

Faça um fork deste projeto e quando finalizar a implementação faça um pull request na descrição informe qual a abordagem que você utilizou para chegar na solução descreva também quais foram os maiores desafios para concluir a avaliação.

As bibliotecas abaixo podem ajuda-lo a lidar com alguns desafios deste projeto.

- Biblioteca para carregamento de imagens https://github.com/square/picasso
- Biblioteca para requisições http https://github.com/square/retrofit

# Review da solução do problema
## 02/05
O primeiro dia do desafio foi o mais tranquilo, olhei e estudei a API necessaria para o projeto, fiz um rascunho em uma folha de papel de como eu queria que fosse o layout e fiz a UI básica.

## 03/05
Segundo dia, fiz a listagem dos filmes na activity principal usando coroutines + retrofit. Eu sabia fazer de outro metodo (Call + enqueue), mas foi muito aprendizado e desafiante saber que podia ser feito de outra forma

## 04/05
Terceiro dia, apresentar os detalhes do filme escolhido usando novamente coroutines + retrofit. Aqui eu tive minha primeira dor de cabeça, como eu disse antes fiz um layout previo e nao queria fugir dele, pois pensando nos futuros desafios e desejos dos futuros clientes no poderia fazer do jeito mais facil(O problema era mostrar os generos dos filmes, mas a API não fornecia, tive que pegar de outra e mudar a logica do codigo).

## 05/05
Quarto dia, implementei a arquitetura MVVM sem muitas dificuldades também e melhorei a UI para ficar mais apresentavel.

## 06/05
Quinto dia, dei a opção do usuario procurar qual filme ele desejava usando uma searchView.

## Futuras implementações
Pretendo usar o room para persistencia de dados, testes unitarios e clean code.





