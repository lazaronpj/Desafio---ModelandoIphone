package Desafio_Iphone_Dio.src;

/**
 * --------------------------------------------------------------------------------
 * Nome do Arquivo: IphoneLazaro.java
 * Descrição: Criação de um objeto via Programação Orientada a Objetos (POO) chamando 
 * as funções correspondentes e criando uma estrutura de controle condicional "switch case"
 * para facilitar a tomada de decisão sobre qual função você quer utilizar no Iphone.
 * 
 * @author Lazaro Nogueira
 * @version 1.0
 * @since 31/08/2024
 * --------------------------------------------------------------------------------
 */

 import java.util.InputMismatchException;
 import java.util.Scanner;
 
 public class IphoneLazaro {
 
     public static void main(String[] args) {
         Scanner scanner = new Scanner(System.in);
         Iphone iphone = new Iphone();
 
         try {
             System.out.println("\nBem-vindo ao seu Iphone 7, escolha uma das opções abaixo:\n");
             System.out.println("--------------------------------------");
             System.out.println("BEM VINDO AO SEU IPHONE");
             System.out.println("--------------------------------------");
             System.out.println("DIGITE A OPÇÃO DESEJADA:\n");
             System.out.println("[1] Para acessar a FUNÇÃO TELEFONE");
             System.out.println("[2] Para acessar a FUNÇÃO DE INTERNET");
             System.out.println("[3] Para acessar a FUNÇÃO MUSICAL");
             System.out.println("--------------------------------------");
 
             int opcao = scanner.nextInt();
             scanner.nextLine(); // Consome a nova linha deixada pelo nextInt()
 
             switch (opcao) {
                 case 1:
                     // FUNÇÃO TELEFONE
                     try {
                         iphone.ligar("Lucas");
                         iphone.atender();
                         iphone.iniciarCorreioVoz();
                         iphone.recente();
                         iphone.numerosFavoritos();
                     } catch (Exception e) {
                         System.out.println("Erro ao executar função de telefone: " + e.getMessage());
                     }
                     break;
 
                 case 2:
                     // FUNÇÃO NAVEGADOR
                     try {
                         iphone.exibirPagina("https://open.spotify.com/intl-pt");
                         iphone.adicionarNovaAba();
                         iphone.atualizarPagina();
                         iphone.paginasFavoritas();
                     } catch (Exception e) {
                         System.out.println("Erro ao executar função de navegador: " + e.getMessage());
                     }
                     break;
 
                 case 3:
                     // FUNÇÃO MUSICAL
                     try {
                         iphone.tocar("21 Reason", 2.35);
                         iphone.pausar();
                         iphone.selecionarMusica();
                         iphone.musicasFavoritas();
                     } catch (Exception e) {
                         System.out.println("Erro ao executar função musical: " + e.getMessage());
                     }
                     break;
 
                 default:
                     System.out.println("Opção inválida!");
                     break;
             }
 
         } catch (InputMismatchException e) {
             System.out.println("Erro de entrada: " + e.getMessage());
         } catch (Exception e) {
             System.out.println("Erro inesperado: " + e.getMessage());
         } finally {
             scanner.close();
         }
     }
 }
 