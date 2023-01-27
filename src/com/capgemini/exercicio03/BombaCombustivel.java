package com.capgemini.exercicio03;

public class BombaCombustivel {

  private String tipoCombustível;
  private double valorPorLitro;
  private double quantidadeCombustível;

  public BombaCombustivel() {}

  public BombaCombustivel(
      String tipoCombustível, double valorPorLitro, double quantidadeCombustível) {
    this.tipoCombustível = tipoCombustível;
    this.valorPorLitro = valorPorLitro;
    this.quantidadeCombustível = quantidadeCombustível;
  }

  public String getTipoCombustível() {
    return tipoCombustível;
  }

  public void setTipoCombustível(String tipoCombustível) {
    this.tipoCombustível = tipoCombustível;
  }

  public double getValorPorLitro() {
    return valorPorLitro;
  }

  public void setValorPorLitro(double valorPorLitro) {
    this.valorPorLitro = valorPorLitro;
  }

  public double getQuantidadeCombustível() {
    return quantidadeCombustível;
  }

  public void setQuantidadeCombustível(double quantidadeCombustível) {
    this.quantidadeCombustível = quantidadeCombustível;
  }

  public double abastecerPorValor(double valorAAbastecer) {
    if (podeAbastecer(valorAAbastecer, valorPorLitro)) {
      double totalAbastecido = valorAAbastecer / valorPorLitro;
      this.quantidadeCombustível -= totalAbastecido;
      return totalAbastecido;
    }
    throw new RuntimeException("Quantidade de combustível insuficiente");
  }

  public double abastecerPorLitro(double totalLitros) {
    double valorAAbastecer = totalLitros * valorPorLitro;
    if (podeAbastecer(valorAAbastecer, valorPorLitro)) {
      this.quantidadeCombustível -= totalLitros;
      return totalLitros * valorPorLitro;
    }
    throw new RuntimeException("Quantidade de combustível insuficiente");
  }

  public void alterarValor(double valorPorLitro) {
    this.valorPorLitro = valorPorLitro;
  }

  public void alterarCombustivel(String tipoCombustível) {
    this.tipoCombustível = tipoCombustível;
  }

  public void alterarQuantidadeCombustivel(double quantidadeCombustível) {
    this.quantidadeCombustível = quantidadeCombustível;
  }

  private boolean podeAbastecer(double valorAAbastecer, double valorPorLitro) {
    double quantidadeAbastecimento = valorAAbastecer / valorPorLitro;
    return this.quantidadeCombustível >= quantidadeAbastecimento;
  }
}

