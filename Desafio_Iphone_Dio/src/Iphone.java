package Desafio_Iphone_Dio.src;

/**
 * --------------------------------------------------------------------------------
 * Nome do Arquivo: Iphone.java
 * Descrição: Implementação de um modelo básico de um telefone, reprodutor de
 * música e navegador para o conceito de um smartphone para ser usado em interface.
 * 
 * @author Lazaro Nogueira
 * @version 1.0
 * @since 31/08/2024
 * --------------------------------------------------------------------------------
 */

 public class Iphone implements AparelhoTelefonicoIp, NavegadorDeInternetNi, ReprodutorMusicalMp {
    
    private Boolean atender = true;

    // TELEFONE
    @Override
    public void ligar(String nome) {
        System.out.println("\nLigando para " + nome + ".\n");
        if (atender) {
            System.out.println("Chamada em andamento!\n");
        } else {
            System.out.println("Telefone ocupado!\n");
        }
        idChamada(5);
    }

    @Override
    public void atender() {
        if (atender) {
            System.out.println("Alô, quem fala?\n");
            System.out.println("Boa noite ");
        }
    }

    @Override
    public void iniciarCorreioVoz() {
        System.out.println("Iniciando o correio de voz!\n");
    }

    @Override
    public void recente() {
        System.out.println("Ligações recentes:\n");
        String[] ligacoesRecentes = { "+55-33333-3333", "+55-22222-2222", "+55-11111-1111" };
        for (String ligacao : ligacoesRecentes) {
            System.out.println(ligacao);
        }
    }

    @Override
    public void numerosFavoritos() {
        System.out.println("\nNúmeros favoritos:\n");
        String[] contatosFavoritos = { "+55-33343-3353", "+55-22122-2212", "+55-11211-1121" };
        for (String contato : contatosFavoritos) {
            System.out.println(contato);
        }
    }

    // REPRODUTOR MUSICAL
    @Override
    public void tocar(String musica, Double duracao) {
        System.out.println("\nTocando: " + musica + ". Duração: " + duracao + " minuto(s).");
        idMusica(4);
    }

    @Override
    public void pausar() {
        System.out.println("Pausado com sucesso.\n");
    }

    @Override
    public void selecionarMusica() {
        System.out.println("Selecione uma música:\n");
        String[] musica = { "Whay out", "Find me", "My Home Blue" };
        for (String m : musica) {
            System.out.println(m);
        }
    }

    @Override
    public void musicasFavoritas() {
        System.out.println("Selecione uma música favorita:\n");
        String[] musicaFavorita = { "Sorry Time", "Sleep House", "Life to life" };
        for (String m : musicaFavorita) {
            System.out.println(m);
        }
    }

    // NAVEGADOR
    @Override
    public void exibirPagina(String url) {
        conectadoInternet(true);
        System.out.println("\nAbrindo página: " + url);
    }

    @Override
    public void adicionarNovaAba() {
        System.out.println("\nAbrindo uma nova aba!");
    }

    @Override
    public void atualizarPagina() {
        conectadoInternet(true);
        System.out.println("\nAtualizando a página.");
    }

    @Override
    public void paginasFavoritas() {
        System.out.println("\nPáginas favoritas:\n");
        String[] paginasFavoritas = { "www.google.com.br", "www.vagalume.com", "www.mercadolivre.com.br" };
        for (String pagina : paginasFavoritas) {
            System.out.println(pagina);
        }
    }

    // MÉTODOS PRIVADOS
    private void idMusica(int id) {
        System.out.println("Id da música: " + id);
    }

    private void idChamada(int id) {
        System.out.println("Id da chamada: " + id);
    }

    private void conectadoInternet(Boolean conexao) {
        if (conexao) {
            System.out.println("Você está conectado à internet.");
            System.out.println("Ativando módulo de segurança!");
        } else {
            System.out.println("Modo offline! Você não está conectado à internet, verifique seu sinal Wi-Fi.");
        }
    }
}
