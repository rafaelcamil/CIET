# language: pt

  Funcionalidade: Busca no Banco de Questões

  Cenário: Busca por questão inexistente
    Dado que navego para a página de busca do banco de questões "Question"
    E digito "Science: Computers" no campo de busca
    Quando clico no botão de buscar
    Então visualizo uma mensagem de erro com o texto "No questions found."

    Cenario: Busca por questão existente
      Dado que navego para a página de busca do banco de questões "Category"
      E digito "Science: Computers" no campo de busca
      Quando clico no botão de buscar
      Então listagem de questões deve ter 25 itens
      E exibe controle de paginação.

