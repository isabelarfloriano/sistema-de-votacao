# Projeto Sistema de Votação! :writing_hand::busts_in_silhouette::bar_chart:

Projeto de desenvolvimento de um sistema de votação eletrônico em Java, com o objetivo de permitir o cadastro de pessoas candidatas, pessoas eleitoras, a realização do processo de votação e a consulta do resultado parcial e final da votação. O projeto é composto por três etapas principais, a saber:
<ol>
  <ul>
    CADASTRO DE PESSOAS CANDIDATAS: nesta etapa, será implementado um menu que possibilita o cadastro de pessoas candidatas. Após cadastrar uma nova pessoa, o sistema oferecerá a opção de cadastrar outra pessoa. Quando não houver mais pessoas candidatas a serem cadastradas, o sistema passará para a próxima etapa.
  </ul>
  <ul>
    CADASTRO DE PESSOAS ELEITORAS: nesta etapa, será implementado um menu que possibilita o cadastro de pessoas eleitoras, similar ao menu do cadastro de pessoas candidatas. Após cadastrar uma nova pessoa, o sistema voltará ao estado inicial do menu para oferecer a oportunidade de cadastrar outra pessoa. Quando não houver mais pessoas eleitoras a serem cadastradas, o sistema passará para a próxima etapa.
  </ul>
  <ul>
    PROCESSO DE VOTAÇÃO: nesta etapa, o sistema iniciará o processo de votação, que será realizado por meio de um menu que oferece as opções de votar, ver resultado parcial e finalizar a votação. Para votar, será necessário informar o identificador da pessoa eleitora e o número da pessoa candidata escolhida. A opção de ver resultado parcial lista todos os nomes das pessoas candidatas e seus respectivos votos absolutos e percentuais, enquanto a opção de finalizar a votação apresenta o resultado final da votação e encerra o programa.
  </ul>
</ol>

<details>
  <summary><strong>Fluxograma</strong></summary><br />
    ![SistemaVotacaoFluxograma](img/sistema_votacao.png)
</details>
<details>
  <summary><strong>Rodando Localmente a Aplicação</strong></summary><br />
  
  <p>Para executar a aplicação e os testes, siga os passos abaixo:</p>
  <ol>
    <li>Clone o projeto.</li>
    <li>Abra o terminal e navegue até a raiz do projeto.</li>
    <li>Instale as dependências com o comando <code>mvn install</code>.</li>
    <li>Importe o projeto para sua IDE</li>
    <li>Para iniciar a interação com menu utilizae <code>Run As Java Application</code></li>
  </ol>
</details>
<details>
  <summary><strong>Demonstração</strong></summary><br />
  
      <p>Este é um exemplo do funcionamento do sistema, apresentando a saída completa do console. O exemplo inclui duas pessoas candidatas, Maria e José, e três pessoas eleitoras, João, Rute e Raquel. Se João e Rute votaram em Maria, e Raquel votou em José, a saída seria a seguinte:</p>
  
````
----------- Bem-vindo ao Sistema de Votação -----------

Cadastrar pessoa candidata?
1 - Sim
2 - Não
Entre com o número correspondente à opção desejada:
1
Entre com o nome da pessoa candidata:
Maria
Entre com o número da pessoa candidata:
1
Cadastrar pessoa candidata?
1 - Sim
2 - Não
Entre com o número correspondente à opção desejada:
1
Entre com o nome da pessoa candidata:
José
Entre com o número da pessoa candidata:
2
Cadastrar pessoa candidata?
1 - Sim
2 - Não
Entre com o número correspondente à opção desejada:
2


----------- Cadastre as pessoas eleitoras -----------

Cadastrar pessoa eleitora?
1 - Sim
2 - Não
Entre com o número correspondente à opção desejada:
1
Entre com o nome da pessoa eleitora:
João
Entre com o cpf da pessoa eleitora:
154.118.560-94
Cadastrar pessoa eleitora?
1 - Sim
2 - Não
Entre com o número correspondente à opção desejada:
1
Entre com o nome da pessoa eleitora:
Rute
Entre com o cpf da pessoa eleitora:
589.292.640-00
Cadastrar pessoa eleitora?
1 - Sim
2 - Não
Entre com o número correspondente à opção desejada:
1
Entre com o nome da pessoa eleitora:
Raquel
Entre com o cpf da pessoa eleitora:
023.476.580-18
Cadastrar pessoa eleitora?
1 - Sim
2 - Não
Entre com o número correspondente à opção desejada:
2


----------- Votação iniciada! -----------

Entre com o número correspondente à opção desejada:
1 - Votar
2 - Resultado Parcial
3 - Finalizar Votação
1
Entre com o cpf da pessoa eleitora:
154.118.560-94
Entre com o número da pessoa candidata:
1
Entre com o número correspondente à opção desejada:
1 - Votar
2 - Resultado Parcial
3 - Finalizar Votação
1
Entre com o cpf da pessoa eleitora:
589.292.640-00
Entre com o número da pessoa candidata:
1
Entre com o número correspondente à opção desejada:
1 - Votar
2 - Resultado Parcial
3 - Finalizar Votação
1
Entre com o cpf da pessoa eleitora:
023.476.580-18
Entre com o número da pessoa candidata:
2
Entre com o número correspondente à opção desejada:
1 - Votar
2 - Resultado Parcial
3 - Finalizar Votação
3
Nome: Maria - 2 votos ( 67.0% )
Nome: José - 1 votos ( 33.0% )
Total de votos: 3
````

</details>
