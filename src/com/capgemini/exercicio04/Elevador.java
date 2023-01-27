package com.capgemini.exercicio04;

public class Elevador {

  private int andarAtual = 0;
  private int totalAndares;
  private int capacidade;
  private int pessoasPresentes = 0;

  public Elevador() {}

  public int getAndarAtual() {
    return andarAtual;
  }

  public void setAndarAtual(int andarAtual) {
    this.andarAtual = andarAtual;
  }

  public int getTotalAndares() {
    return totalAndares;
  }

  public void setTotalAndares(int totalAndares) {
    this.totalAndares = totalAndares;
  }

  public int getCapacidade() {
    return capacidade;
  }

  public void setCapacidade(int capacidade) {
    this.capacidade = capacidade;
  }

  public int getPessoasPresentes() {
    return pessoasPresentes;
  }

  public void setPessoasPresentes(int pessoasPresentes) {
    this.pessoasPresentes = pessoasPresentes;
  }

  public void inicializar(int capacidade, int totalAndares) {
    this.capacidade = capacidade;
    this.totalAndares = totalAndares;
  }

  public void entrar(int entrantes) {
    if (podeEntrar(entrantes)) {
      this.pessoasPresentes += entrantes;
    }
  }

  public void sair(int saintes) {
    if (podeSair()) {
      this.pessoasPresentes -= saintes;
    }
  }

  private boolean podeSair() {
    return this.pessoasPresentes > 0;
  }

  public void subir(int quantidadeASubir) {
    if (podeSubir(quantidadeASubir)) {
      this.andarAtual += quantidadeASubir;
    }
  }

  private boolean podeSubir(int quantidadeASubir) {
    return quantidadeASubir <= (this.totalAndares - this.andarAtual);
  }

  public void descer(int quantidadeADescer) {
    if (podeDescer(quantidadeADescer)) {
      this.andarAtual -= quantidadeADescer;
    }
  }

  private boolean podeDescer(int quantidadeADescer) {
    return quantidadeADescer <= this.andarAtual;
  }

  private boolean podeEntrar(int entrantes) {
    return entrantes <= (this.capacidade - pessoasPresentes);
  }
}
