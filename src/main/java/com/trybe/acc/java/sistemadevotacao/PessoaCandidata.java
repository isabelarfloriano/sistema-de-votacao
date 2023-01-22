package com.trybe.acc.java.sistemadevotacao;

/**
 * classe herda da classe Pessoa.
 *
 */
public class PessoaCandidata extends Pessoa {
  private int numero;
  private int votos;

  /**
   * metodo construtor.
   */
  public PessoaCandidata(String nome, int numero) {
    this.numero = numero;
    super.nome = nome;
    this.votos = 0;
  }

  public int getNumero() {
    return numero;
  }

  public void setNumero(int numero) {
    this.numero = numero;
  }

  public int getVotos() {
    return votos;
  }

  public void setVotos(int votos) {
    this.votos = votos;
  }

  public void receberVoto() {
    this.votos = this.votos + 1;
  }

}
