package com.betrybe.sistemadevotacao;

import java.util.ArrayList;

/**
 * Gerenciamentovotacao.
 */

public class GerenciamentoVotacao implements GerenciamentoVotacaoInterface {
  private final ArrayList<PessoaCandidata> pessoasCandidatas = new ArrayList<>();
  private final ArrayList<PessoaEleitora> pessoaEleitoras = new ArrayList<>();
  private final ArrayList<String> cpfsComputados = new ArrayList<>();

  /**
   *  Contructor.
   */

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
