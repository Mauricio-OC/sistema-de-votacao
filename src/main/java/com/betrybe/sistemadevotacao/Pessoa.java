package com.betrybe.sistemadevotacao;

public abstract class Pessoa {
  protected String nome;

  public Pessoa() {
    this.nome = "";
  }

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }
}