package com.betrybe.sistemadevotacao;

/**
 * Interface de Gerenciamento de Votação.
 */
public interface GerenciamentoVotacaoInterface {

  void cadastrarPessoaCandidata(String nome, int numero);

  void cadastrarPessoaEleitora(String nome, String cpf);

  void votar(String cpfPessoaEleitora, int numeroPessoaCandidata);

  void mostrarResultado();
}
