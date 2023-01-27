package com.capgemini.exercicio06;

public class Invoice {

  private String numeroItem;
  private String descricao;
  private int quantidade;
  private double preco;

  public Invoice(String numeroItem, String descricao, int quantidade, double preco) {
    this.numeroItem = numeroItem;
    this.descricao = descricao;
    if (quantidade > 0) {
      this.quantidade = quantidade;
    }
    if (preco > 0) {
      this.preco = preco;
    }
  }

  public String getNumeroItem() {
    return numeroItem;
  }

  public void setNumeroItem(String numeroItem) {
    this.numeroItem = numeroItem;
  }

  public String getDescricao() {
    return descricao;
  }

  public void setDescricao(String descricao) {
    this.descricao = descricao;
  }

  public int getQuantidade() {
    return quantidade;
  }

  public void setQuantidade(int quantidade) {
    this.quantidade = quantidade;
  }

  public double getPreco() {
    return preco;
  }

  public void setPreco(double preco) {
    this.preco = preco;
  }

  public double getInvoiceAmount() {
    return quantidade * preco;
  }
}
