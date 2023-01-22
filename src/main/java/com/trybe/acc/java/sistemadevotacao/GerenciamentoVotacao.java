package com.trybe.acc.java.sistemadevotacao;

import java.util.ArrayList;

/**
 * essa classe é responsável por gerenciar a votação e o cadastro de pessoas candidatas e pessoas
 * eleitoras.
 *
 */
public class GerenciamentoVotacao {
  private static ArrayList<PessoaCandidata> pessoasCandidatas = new ArrayList<PessoaCandidata>();
  private static ArrayList<PessoaEleitora> pessoasEleitoras = new ArrayList<PessoaEleitora>();
  private static ArrayList<String> cpfComputado = new ArrayList<String>();
  private int totalVotos;

  public void cadastrarPessoaCandidata(String nome, int numero) {
    for (int i = 0; i < pessoasCandidatas.size(); i++) {
      if (pessoasCandidatas.get(i).getNumero() == numero) {
        System.out.println("Número pessoa candidata já utilizado!");
      } else {
        pessoasCandidatas.add(new PessoaCandidata(nome,numero));
      }      
  }

  public void cadastrarPessoaEleitora(String nome, String cpf) {
      for (int i = 0; i < pessoasEleitoras.size(); i++) {
        if (pessoasEleitoras.get(i).getCpf() == cpf) {
          System.out.println("Pessoa eleitora já cadastrada!");
        } else {
          pessoasEleitoras.add(new PessoaEleitora(nome,cpf));
        }      
  }

  public void votar(String cpfPessoaEleitora, int numeroPessoaCandidata) {
    if (cpfComputado.contains(cpfPessoaEleitora)) {
      System.out.println("Pessoa eleitora já votou!");
    } else {
      for (int i = 0; i < pessoasCandidatas.size(); i++) {
        if (pessoasCandidatas.get(i).getCpf() == numeroPessoaCandidata) {
          pessoasCandidatas.get(i).receberVoto();
          cpfComputado.add(cpfPessoaEleitora);
          totalVotos += 1;
        }
      }
    }
  }

  public void mostrarResultado() {
     if (totalVotos == 0) {
        System.out.println("É preciso ter pelo menos um voto para mostrar o resultado.")
     } else {     
       for (int i = 0; i < pessoasCandidatas.size(); i++) {
         if(pessoasCandidatas.get(i).getVotos() > 0) {
           System.out.println("Nome: " + pessoasCandidatas.get(i).getNome() + " - ");
           System.out.println(pessoasCandidatas.get(i).getVotos() + " votos ( ");
           System.out.println(calcularPorcentagemVotos(i) + " )\n");
         }
       }
       System.out.println("Total de votos: " + totalVotos);
     }
  }
  
  private double calcularPorcentagemVotos(int indiceDoCandidato) {
    return Math.round((pessoasCandidatas.get(indiceDoCandidato).getVotos()
        / totalVotos) * 100);
  }
}
