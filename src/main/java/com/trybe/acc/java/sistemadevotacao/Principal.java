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

    menuCadastroPessoaCandidata();
  }

  /**
   * Primeiro menu.
   */
  public static void menuCadastroPessoaCandidata() {
    short escolha;
    do {
      System.out.println("Cadastrar pessoa candidata?\n" + "1 - Sim\n" + "2 - Não");
      escolha = scan.nextShort();
      if (escolha == 1) {
        cadastroPessoaCandidata();
      } else if (escolha == 2) {
        menuCadastroPessoaEleitora();
      }
    } while (escolha != 2);
    scan.close();
  }

  /**
   * dados nova pessoa candidata.
   */
  public static void cadastroPessoaCandidata() {
    System.out.println("Entre com o nome da pessoa candidata:");
    String nome = scan.next();
    System.out.println("Entre com o número da pessoa candidata:");
    int numero = scan.nextInt();
    gerenciador.cadastrarPessoaCandidata(nome, numero);
  }

  /**
   * segundo menu.
   */
  public static void menuCadastroPessoaEleitora() {
    short escolha;
    do {
      System.out.println("Cadastrar pessoa eleitora?\n" + "1 - Sim\n" + "2 - Não");
      System.out.println("Entre com o número correspondente à opção desejada:");
      escolha = scan.nextShort();
      if (escolha == 1) {
        cadastroPessoaEleitora();
      } else if (escolha == 2) {
        menuVotacao();
      }
    } while (escolha != 2);
    scan.close();
  }

  /**
   * dados nova pessoa eleitora.
   */
  public static void cadastroPessoaEleitora() {
    System.out.println("Entre com o nome da pessoa eleitora:");
    String nome = scan.next();
    System.out.println("Entre com o cpf da pessoa eleitora:");
    String cpf = scan.next();
    gerenciador.cadastrarPessoaEleitora(nome, cpf);
  }

  /**
   * terceiro menu.
   */
  public static void menuVotacao() {
    short escolha;
    do {
      System.out.println("Cadastrar pessoa eleitora?\n" + "1 - Votar\n" + "2 - Resultado Parcial\n"
          + "3 - Finalizar Votação");
      escolha = scan.nextShort();
      if (escolha == 1) {
        System.out.println("Entre com o cpf da pessoa eleitora:");
        String cpf = scan.next();
        System.out.println("Entre com o número da pessoa candidata:");
        int numero = scan.nextInt();
        gerenciador.votar(cpf, numero);
      } else if (escolha == 2) {
        gerenciador.mostrarResultado();
      } else if (escolha == 3) {
        gerenciador.mostrarResultado();
      }
    } while (escolha != 3);
    scan.close();
  }
}
