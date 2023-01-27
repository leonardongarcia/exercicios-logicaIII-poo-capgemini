package com.capgemini.exercicio05;

public class Aluno {

  private String nome;
  private String matricula;
  private double[] notas = new double[3];
  private int notaParaSerAprovado;

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getMatricula() {
    return matricula;
  }

  public void setMatricula(String matricula) {
    this.matricula = matricula;
  }

  public double[] getNotas() {
    return notas;
  }

  public void setNotas(double[] notas) {
    this.notas = notas;
  }

  public int getNotaParaSerAprovado() {
    return notaParaSerAprovado;
  }

  public void setNotaParaSerAprovado(int notaParaSerAprovado) {
    this.notaParaSerAprovado = notaParaSerAprovado;
  }

  public double calcularMedia() {
    return ((notas[0] * 2.5) + (notas[1] * 2.5) + (notas[2] * 2)) / 3;
  }

  public double calcularNotaParaPassar() {
    double notaAtual = calcularMedia() * 3;
    return notaParaSerAprovado - notaAtual;
  }
}
