# encoding: UTF-8
# language: pt

Funcionalidade: Busca no Banco de Dados

  Esquema do Cenário: Busca por questão inexistente
    Dado que navego para a página de busca do banco de dados
    E seleciono a opção <option>
    E digito "Pesquisa@Teste@" no campo de busca
    Quando clico no botão de buscar
    Então visualizo uma mensagem de erro com o texto <message>

    Exemplos:
      |option|message|
      |"Question"|"No questions found."|
      |"User"    |"No User Found!"|
      |"Category"|"No questions found."|

  Esquema do Cenário: Busca por categorias
    Dado que navego para a página de busca do banco de dados
    E seleciono a opção <option>
    E digito <pesquisa> no campo de busca
    Quando clico no botão de buscar
    Então listagem deve retornar resultados.

    Exemplos:
    |option|pesquisa|
    |"Question"|"What does RAID stand for?"|
    |"Question"|""|
    |"Category"|"Animals"                  |
    |"Category"|""|
    |"User"    |"stoneagedays"             |
#   |"User"    |""|


  Cenario: Verifica quantidade de resultados por página
    Dado que navego para a página de busca do banco de dados
    E seleciono a opção "Category"
    E digito "Science: Computers" no campo de busca
    Quando clico no botão de buscar
    Então listagem de questões deve ter 25 itens
    E exibe controle de paginação.

  Cenario: Verifica botão avançar página
    Dado que navego para a página de busca do banco de dados
    Quando clico no botão de avançar do controle de paginação
    Então avança para a página "2"

  Cenario: Verifica botão avançar página
    Dado que navego para a página de busca do banco de dados
    Quando clico no nome do usuário
    Então abre página do perfil do usuário

