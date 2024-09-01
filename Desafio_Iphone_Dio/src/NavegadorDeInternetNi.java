package Desafio_Iphone_Dio.src;

/**
 * --------------------------------------------------------------------------------
 * Nome do Arquivo: NavegadorNaInternet.java
 * Descrição: Interface que define os métodos para navegação na internet,
 * incluindo exibir páginas, adicionar novas abas, atualizar páginas e 
 * acessar páginas favoritas.
 * 
 * @author Lazaro Nogueira
 * @version 1.0
 * @since 31/08/2024
 * --------------------------------------------------------------------------------
 */
public interface NavegadorDeInternetNi {

    /**
     * Exibe a página na web correspondente à URL fornecida.
     * 
     * @param url A URL da página a ser exibida.
     */
    void exibirPagina(String url);

    /**
     * Adiciona uma nova aba no navegador.
     */
    void adicionarNovaAba();

    /**
     * Atualiza a página web atualmente exibida.
     */
    void atualizarPagina();

    /**
     * Mostra as páginas web favoritas.
     */
    void paginasFavoritas();
}
