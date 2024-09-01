
# Projeto Iphone 2007 com UML - Dio


<!--
@author Lazaro Nogueira
@version 1.0
@since 31/08/2024
-->

## Descrição

Este projeto implementa um modelo básico de smartphone utilizando a linguagem Java. O objetivo é criar uma estrutura simplificada que engloba três funcionalidades principais:
- **Telefone**
- **Navegador de Internet**
- **Reprodutor Musical**

Esse modelo serve como uma base para desenvolver uma interface de usuário e pode ser expandido com funcionalidades adicionais conforme necessário.

## Funcionalidades

### 1. Telefone

O módulo de telefone do smartphone inclui as seguintes funções:

- **Ligar**
  - Inicia uma chamada para um número específico.
  - **Método:** `public void ligar(String numero)`
  - **Descrição:** Recebe um número de telefone como argumento e simula a ação de ligar para esse número.

- **Atender**
  - Atende uma chamada recebida.
  - **Método:** `public void atender()`
  - **Descrição:** Simula o atendimento a uma chamada recebida.

- **Iniciar Correio de Voz**
  - Acessa o sistema de correio de voz para ouvir mensagens deixadas.
  - **Método:** `public void iniciarCorreioVoz()`
  - **Descrição:** Simula a ação de acessar e ouvir mensagens no correio de voz.

- **Recente**
  - Exibe a lista de chamadas recentes realizadas ou recebidas.
  - **Método:** `public void recente()`
  - **Descrição:** Mostra uma lista de chamadas recentes.

- **Números Favoritos**
  - Mostra a lista de números que foram marcados como favoritos.
  - **Método:** `public void numerosFavoritos()`
  - **Descrição:** Exibe os números de telefone que o usuário marcou como favoritos.

### 2. Navegador de Internet

O módulo de navegador de internet inclui as seguintes funções:

- **Adicionar Nova Aba**
  - Adiciona uma nova aba para navegação na web.
  - **Método:** `public void adicionarNovaAba()`
  - **Descrição:** Simula a abertura de uma nova aba no navegador.

- **Atualizar Página**
  - Atualiza a página atual exibida na aba ativa.
  - **Método:** `public void atualizarPagina()`
  - **Descrição:** Atualiza o conteúdo da página web que está sendo exibida na aba atual.

- **Páginas Favoritas**
  - Exibe uma lista de páginas da web que foram marcadas como favoritas.
  - **Método:** `public void paginasFavoritas()`
  - **Descrição:** Mostra as páginas web que o usuário marcou como favoritas.

### 3. Reprodutor Musical

O módulo de reprodutor musical inclui as seguintes funções:

- **Tocar**
  - Inicia a reprodução da música selecionada.
  - **Método:** `public void tocar()`
  - **Descrição:** Simula o início da reprodução de uma música.

- **Pausar**
  - Pausa a música que está sendo reproduzida.
  - **Método:** `public void pausar()`
  - **Descrição:** Simula a pausa da música atualmente em reprodução.

- **Selecionar Música**
  - Permite ao usuário escolher uma música específica para reprodução.
  - **Método:** `public void selecionarMusica(String musica)`
  - **Descrição:** Recebe o nome de uma música e simula a seleção dessa música para reprodução.

- **Músicas Favoritas**
  - Exibe uma lista de músicas que foram marcadas como favoritas.
  - **Método:** `public void musicasFavoritas()`
  - **Descrição:** Mostra a lista de músicas que o usuário marcou como favoritas.

### 4. Demonstração do menu principal

[![Menu.jpg](https://i.postimg.cc/qvqKKcMw/Menu.jpg)](https://postimg.cc/JswtVkXH)


