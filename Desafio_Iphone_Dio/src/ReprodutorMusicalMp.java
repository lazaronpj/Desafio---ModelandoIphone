package Desafio_Iphone_Dio.src;

/**
 * --------------------------------------------------------------------------------
 * Nome do Arquivo: ReprodutorMusicalMp.java
 * Descrição: Interface que define os métodos para um reprodutor musical, 
 * incluindo tocar uma música, pausar a reprodução, selecionar uma música 
 * e acessar músicas favoritas.
 * 
 * @author Lazaro Nogueira
 * @version 1.0
 * @since 31/08/2024
 * --------------------------------------------------------------------------------
 */
public interface ReprodutorMusicalMp {

    /**
     * Toca a música especificada com a duração fornecida.
     * 
     * @param musica O nome da música a ser tocada.
     * @param duracao A duração da música em minutos.
     */
    void tocar(String musica, Double duracao);

    /**
     * Pausa a reprodução da música atual.
     */
    void pausar();

    /**
     * Permite ao usuário selecionar uma música para reprodução.
     */
    void selecionarMusica();

    /**
     * Mostra as músicas favoritas.
     */
    void musicasFavoritas();
}
