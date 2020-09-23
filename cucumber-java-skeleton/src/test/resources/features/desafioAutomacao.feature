#language: pt

Funcionalidade:
  Elabore um projeto de automação em qualquer linguagem que faça o seguinte passo a passo:
    Passo 1: Acessar a página inicial do Google (https://www.google.com/):
    Passo 2: Preencher o campo de pesquisa com o valor “iLAB Quality”:
    Passo 3: Clicar em “Pesquisa Google”:
  Algumas diretrizes para o projeto:
    O projeto deverá utilizar PageObject
    É desejável que a automação gere evidências (screenshots) da execução;
    É desejável que a automação valide, de alguma forma, que a tela de resultados de pesquisa do Google foi exibida devidamente.

  Cenario: Desafio Automacao
    Dado que eu estou na pagina incial do Google
    Quando eu preencho o campo de pesquisa com o valor "iLAB Quality"
    E clico no botao Pesquisa Goggle
    Entao a tela de resultados deve exibir o link "www.ilabquality.com"



