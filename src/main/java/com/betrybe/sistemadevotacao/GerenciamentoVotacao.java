package com.betrybe.sistemadevotacao;

import java.util.ArrayList;

/**
 * Gerenciamentovotacao.
 */

public class GerenciamentoVotacao implements GerenciamentoVotacaoInterface {
  private ArrayList<PessoaCandidata> pessoasCandidatas;
  private ArrayList<PessoaEleitora> pessoasEleitoras;
  private ArrayList<String> cpfsComputados;

  /**
   *  Contructor.
   */
public GerenciamentoVotacao() {
  pessoasCandidatas = new ArrayList<>();
  pessoasEleitoras = new ArrayList<>();
  cpfsComputados = new ArrayList<>();
}
  @Override
  public void cadastrarPessoaCandidata(String nome, int numero) {

  }

  @Override
  public void cadastrarPessoaEleitora(String nome, String cpf) {

  }

  @Override
  public void votar(String cpfPessoaEleitora, int numeroPessoaCandidata) {

  }

  @Override
  public void mostrarResultado() {

  }
}
