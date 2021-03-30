# Avaliação Beca Mobile Android

Criar um aplicativo que realize a listagem de filmes que são tendências da semana. Quando o usuário selecionar um filme o aplicativo deve direciona-lo para uma segunda tela e exibir o título, capa, rating e sinopse. 

A listagem de filmes deve ser consultada na API https://developers.themoviedb.org/3/getting-started/introduction ao se cadastrar você receberá uma chave de acesso que deve ser usada nas requisições. 

- Requisição para listar as tendências https://developers.themoviedb.org/3/trending/get-trending
- Requisição para listar os detalhes https://developers.themoviedb.org/3/movies/get-movie-details

Faça um fork deste projeto e quando finalizar a implementação faça um pull request na descrição informe qual a abordagem que você utilizou para chegar na solução descreva também quais foram os maiores desafios para concluir a avaliação.

As bibliotecas abaixo podem ajuda-lo a lidar com alguns desafios deste projeto.

- Biblioteca para carregamento de imagens https://github.com/square/picasso
- Biblioteca para requisições http https://github.com/square/retrofit


------------------------------------------------------------------------------

	App foi construido utilizando Retrofit para consumir a informações JSON, onde duas classes foram
criadas para receber os valores da API. A primeira classe, chamada MovieResponse, recebeu as informações mais 
externos: page, total_pages e uma lista de results). A segunda classe, chamada Movie, recebeu as informações
internas do 'results' (id, title, overview, poster_path, backdrop_path, vote_avreage, release_date). Após determinar
quais informações seriam pertinentes ao desenvolvimento do aplicativo, foi criada uma Interface MovieApi onde 
são passados os valores da api_key, o caminho (URL) de onde serão recebidas as informações e o ID da página.
	Com as classes da API prontas, foi criado um Object MoviesRetrofit para fazer o tratamento do JSON, juntando
as chaves do MovieApi para realizar uma conexão com a API.
	Terminada a parte relacionada a API, o próximo passo foi a criação do Layout. O Layout foi dividido em três telas:
-> activity_main - Composto por um RecyclerView para poder diversos itens em lista;
-> activity_movie_details - Ao clicar na imagem mostrada no activity_main o usuário é redirecionado para os detalhes do filme,
que são mostrados aqui;
-> activity_item_movie - Um ImageView simples que alimenta o RecyclerView do activity_main.

	A classe MoviesAdapter é a responsável por alimentar a activity_item_movie com a imagem dos filmes. Também é nela
que a função de click e atualização de paginação foram criadas. 
	Na MainActivity foram chamadas as funções para exibição das informações da API e alimentação dos Layouts. Também foi
criada a função de paginação ao descer a tela (a quantidade de filmes exposta vai aumentando ao rolar a tela para baixo) e	
a função para chamada da classe MovieDetails.

	A classe MovieDetails recebe por Intent as informações extras sobre os filmes. Essa classe foi feita unicamente para popular o
activity_movie_details.

	Além da implementação do retrofit, foram implementandos: 
	
	implementation 'androidx.lifecycle:lifecycle-extensions:2.2.0'
    implementation 'com.github.bumptech.glide:glide:4.10.0'
    kapt 'com.github.bumptech.glide:compiler:4.10.0'
	implementation 'com.google.code.gson:gson:2.8.6'
	
	Glide foi utilizado para carregar as imagens recebidas da API;
	Lifecycle foi utilizado para deixar o app mais leve quanto ao carregamento da paginação (pelo menos eu acho que é pra isso);
	Gson foi utilizado para converter a API(Json) em objetos Java.
	
	Em questão da utilização da API eu tive alguns problemas para acessar informações mais "profudas", como as informações de 
Gênero do filme. A parte da arquitetura tenho 99% de certeza que não fiz certo, mas tentei.
	No geral, o app não foi tão complicado de fazer, pois foi basicamente o visto no bootcamp. A parte mais complicada ainda é a OO
, por diversas vezes eu utilizava métodos que nem lembrava de onde vinham.