package Desafio_Iphone_Dio.src;

/**
 * --------------------------------------------------------------------------------
 * Nome do Arquivo: AparelhoTelefonicoIp.java
 * Descrição: Interface que define os métodos para um aparelho telefônico, 
 * incluindo ligar para um número, atender uma chamada, iniciar o correio de voz,
 * listar ligações recentes e acessar números favoritos.
 * 
 * @author Lazaro Nogueira
 * @version 1.0
 * @since 31/08/2024
 * --------------------------------------------------------------------------------
 */
public interface AparelhoTelefonicoIp {

    /**
     * Liga para o número especificado.
     * 
     * @param nome O nome do contato ou número para ligar.
     */
    void ligar(String nome);

    /**
     * Atende uma chamada recebida.
     */
    void atender();

    /**
     * Inicia o correio de voz.
     */
    void iniciarCorreioVoz();

    /**
     * Exibe a lista de ligações recentes.
     */
    void recente();

    /**
     * Exibe a lista de números favoritos.
     */
    void numerosFavoritos();
}
