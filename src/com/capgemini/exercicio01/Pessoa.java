package com.capgemini.exercicio01;

import java.time.LocalDate;

public class Pessoa {

  private String nome;
  private String dataNascimento;
  private double altura;

  public String getNome() {
    return nome;
  }

  public void setNome(String nome) {
    this.nome = nome;
  }

  public String getDataNascimento() {
    return dataNascimento;
  }

  public void setDataNascimento(String dataNascimento) {
    this.dataNascimento = dataNascimento;
  }

  public double getAltura() {
    return altura;
  }

  public void setAltura(double altura) {
    this.altura = altura;
  }

  public int calcularIdade() {
    return LocalDate.now().compareTo(LocalDate.parse(dataNascimento));
  }

  public void imprimirDados() {
    System.out.printf("Nome: %s %n", this.nome);
    System.out.printf("Data de nascimento: %s %n", this.dataNascimento);
    System.out.printf("Altura: %.2f %n", this.altura);
    System.out.printf("Idade: %d %n", this.calcularIdade());
  }
}
