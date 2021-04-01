# Avaliação Beca Mobile Android

Criar um aplicativo que realize a listagem de filmes que são tendências da semana. Quando o usuário selecionar um filme o aplicativo deve direciona-lo para uma segunda tela e exibir o título, capa, rating e sinopse. 

A listagem de filmes deve ser consultada na API https://developers.themoviedb.org/3/getting-started/introduction ao se cadastrar você receberá uma chave de acesso que deve ser usada nas requisições. 

- Requisição para listar as tendências https://developers.themoviedb.org/3/trending/get-trending
- Requisição para listar os detalhes https://developers.themoviedb.org/3/movies/get-movie-details

Faça um fork deste projeto e quando finalizar a implementação faça um pull request na descrição informe qual a abordagem que você utilizou para chegar na solução descreva também quais foram os maiores desafios para concluir a avaliação.

As bibliotecas abaixo podem ajuda-lo a lidar com alguns desafios deste projeto.

- Biblioteca para carregamento de imagens https://github.com/square/picasso
- Biblioteca para requisições http https://github.com/square/retrofit

# Descrição do projeto

O padrão do projeto foi baseado em MVVM

As classes ApiMoviesDB e MovieRestApiTask fornecem o que é necessário para realização de requisição a Api. A requisição foi feita través do Retrofit com Retrofit Gson para converter os dados da Api.

A biblioteca Picasso foi utilizada para carregar as imagens apresentadas em todas as activities.

A classe MoviesRepository, contem dois métodos principais, ambas utilizam uma instância de MoviesRestApiTask para realizar a requisição e a função enqueue para chamada ser assíncrona. O método getTrendingMovies tem como objetivo retornar um objeto MoviesResult, uma dataclass que contem todos os resultados de filmes retornados pela Api. Já o método getMovieDetails utiliza do id do filme para retornar uma instancia de Movie, um dataclass que parcializa as informações do json retornado pela Api.

As classes presentes no packege viewmodel tem como objetivo puxar as informações do MoviesRepository e retornar a instancia de Movie ou uma lista de Movie já com as informações da Api.

A MainActivity utiliza de uma RecyclerView para exibir os filmes. Através da classe adapter MoviesAdapter são criados os itens a serem exibidos na RecyclerView. Na tela da MainActivity, ao clicar no cardview de um dos filmes, inicia a MovieDetailActivity passando o id do filme em questão como Extra. O MovieDetailActivity passa esse id como parametro para inicializar seu viewmodel, que por sua vez faz a requisição através do MoviesRepository utilizando este id para buscar as informações do filme.

## Dificuldades de implementação

Acredito que uma das maiores dificuldades para mim foi realizar o tratamento de erros (que não tenho certeza se fiz certo). Provavelmente vou ter que estudar mais sobre tratamento de erros e exceções no futuro. Além disso, como não estou acostumado a desenvolver em orientação a objetos, muitas vezes não tenho certeza de onde devo colocar cada método. O modelo MVVM me ajudou a me orientar dentro do código mas ainda assim tive dificuldades nisso. No demais, acredito que esta atividade tenha sido um dos maiores elementos de aprendizado para mim durante esta beca, pois diversos assuntos que ainda estavam muito abstratos em minha mente durante o bootcamp eu consegui compreender melhor durante a resolução do exercicio. 


