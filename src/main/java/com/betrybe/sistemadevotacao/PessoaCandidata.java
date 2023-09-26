package com.betrybe.sistemadevotacao;

/**
 * PessoaCandidata.
 */
public class PessoaCandidata extends Pessoa {
  int numero;
  int votos;

  /**
   * constructor PessoaCandidata.
   */

  public PessoaCandidata(String nome, int numero) {
    super.nome = nome;
    this.numero = numero;
    this.votos = 0;
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public int getNumero() {
    return numero;
  }

  public void setNumero(int numero) {
    this.numero = numero;
  }

  public  int getVotos() {
    return votos;
  }

  public void setVotos(int votos) {
    this.votos = votos;
  }

  public void receberVoto() {
    votos++;
  }
}
