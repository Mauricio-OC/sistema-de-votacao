package com.betrybe.sistemadevotacao;


/**
 * Pessoa.
 */
public abstract class Pessoa {
  String nome;

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }
}