#language: pt

@userLogin
Funcionalidade: Login
  Como usuário potencial
  Eu quero realizar o meu login no Facebook
  Para que eu possa ver o meu Facebook

  Cenario: Login do Usuário
    Dado o usuário acessa o site
    Quando o usuário digita o "Login"
    E o usuário informa a "Senha"
    E o usuário clica no botão "Entrar"
    Entao o usuário pode ver a página inicial do seu Facebook