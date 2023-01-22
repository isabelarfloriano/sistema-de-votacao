package com.trybe.acc.java.sistemadevotacao;

import java.util.Scanner;

/**
 * classe principal.
 *
 */
public class Principal {
  private static Scanner scan;
  private static GerenciamentoVotacao gerenciador;

  /**
   * Constroi o scanner e o gerenciador e dá inicio ao fluxo de menus interativos.
   */
  public static void main(String[] args) {
    scan = new Scanner(System.in);
    gerenciador = new GerenciamentoVotacao();

    MenuCadastroPessoaCandidata(args);
  }

  /**
   * Primeiro menu.
   */
  public static void MenuCadastroPessoaCandidata(String[] args) {
    short escolha;
    do {
      System.out.println("Cadastrar pessoa candidata?\n" + "1 - Sim\n" + "2 - Não");
      escolha = scan.nextShort();
      if (escolha == 1) {
        CadastroPessoaCandidata();
      } else if (escolha == 2) {
        MenuCadastroPessoaEleitora(args);
      }
    } while (escolha != 2);
    scan.close();
  }

  /**
   * dados nova pessoa candidata.
   */
  public static void CadastroPessoaCandidata() {
    System.out.println("Entre com o nome da pessoa candidata:");
    String nome = scan.next();
    System.out.println("Entre com o número da pessoa candidata:");
    short numero = scan.nextShort();
  }

  /**
   * segundo menu.
   */
  public static void MenuCadastroPessoaEleitora(String[] args) {
    short escolha;
    do {
      System.out.println("Cadastrar pessoa eleitora?\n" + "1 - Sim\n" + "2 - Não");
      escolha = scan.nextShort();
      if (escolha == 1) {
        CadastroPessoaEleitora();
      } else if (escolha == 2) {
        MenuVotacao(args);
      }
    } while (escolha != 2);
    scan.close();
  }


  /**
   * dados nova pessoa eleitora.
   */
  public static void CadastroPessoaEleitora() {
    System.out.println("Entre com o número correspondente à opção desejada:");
    short numero = scan.nextShort();
    System.out.println("Entre com o nome da pessoa eleitora:");
    String nome = scan.next();
    System.out.println("Entre com o cpf da pessoa eleitora:");
    long cpf = scan.nextLong();
    // SetPessoaCandidata(numero, nome, cpf);
    MenuCadastroPessoaEleitora(null);
  }

  /**
   * terceiro menu.
   */
  public static void MenuVotacao(String[] args) {
    short escolha;
    do {
      System.out.println("Cadastrar pessoa eleitora?\n" + "1 - Votar\n" + "2 - Resultado Parcial\n"
          + "3 - Finalizar Votação");
      escolha = scan.nextShort();
      if (escolha == 1) {
        System.out.println("Entre com o cpf da pessoa eleitora:");
        long cpf = scan.nextLong();
        System.out.println("Entre com o número da pessoa candidata:");
        short candidato = scan.nextShort();
        // computar voto
      } else if (escolha == 2) {
        // trazer resultado parcial
        MenuVotacao();
      } else if (escolha == 3) {
        // trazer resultado final
      }
    } while (escolha != 3);
    scan.close();
  }
}
