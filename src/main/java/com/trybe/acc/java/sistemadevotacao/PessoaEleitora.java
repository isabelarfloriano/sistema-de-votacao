package com.trybe.acc.java.sistemadevotacao;

/**
 * classe herda da classe Pessoa.
 */
public class PessoaEleitora extends Pessoa {
  private String cpf;

  public PessoaEleitora(String nome, String cpf) {
    this.cpf = cpf;
    super.nome = nome;
  }

  public String getCpf() {
    return cpf;
  }

  public void setCpf(String cpf) {
    this.cpf = cpf;
  }

}
