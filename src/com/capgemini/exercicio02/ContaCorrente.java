package com.capgemini.exercicio02;

public class ContaCorrente {

  private String nomeCorrentista;
  private String conta;
  private double saldo;

  public ContaCorrente(String nomeCorrentista, String conta) {
    this.nomeCorrentista = nomeCorrentista;
    this.conta = conta;
  }

  public ContaCorrente(String nomeCorrentista, String conta, double saldo) {
    this.nomeCorrentista = nomeCorrentista;
    this.conta = conta;
    this.saldo = saldo;
  }

  public String getNomeCorrentista() {
    return nomeCorrentista;
  }

  public void setNomeCorrentista(String nomeCorrentista) {
    this.nomeCorrentista = nomeCorrentista;
  }

  public String getConta() {
    return conta;
  }

  public void setConta(String conta) {
    this.conta = conta;
  }

  public double getSaldo() {
    return saldo;
  }

  public void setSaldo(double saldo) {
    this.saldo = saldo;
  }

  public void alterarNome(String nomeCorrentista) {
    this.nomeCorrentista = nomeCorrentista;
  }

  public void depositar(double valorDeposito) {
    if (valorDeposito > 0) {
      this.saldo += valorDeposito;
      System.out.println("Depósito efetuado!");
    } else{
      System.out.println("Valor inválido para depósito");
    }
  }

  public void sacar(double valorSaque) {
    if (this.saldo > 0 && this.saldo <= valorSaque) {
      this.saldo -= valorSaque;
      System.out.println("Saque efetuado!");
    } else {
      System.out.println("Saldo insuficiente!");
    }
  }

  public void status() {
    System.out.println("Nome correntista = " + nomeCorrentista);
    System.out.println("Conta = " + conta);
    System.out.println("Saldo = " + saldo);
    System.out.println();
  }
}
