package com.capgemini.exercicio03;

/*
3. Crie uma classe para representar uma BombaCombustivel. A classe BombaCombustivel deve conter os seguintes atributos:
  tipo de combustível, valor por litro e quantidade de combustível. Além desses atributos a classes deve conter os seguintes métodos.
  a. abastecerPorValor; //método onde é informado o valor a ser abastecido e mostra a quantidade de litros que foi colocada no veículo
  b. abastecerPorLitro; // método onde é informado a quantidade em litros de combustível e mostra o valor a ser pago pelo cliente.
  c. alterarValor; //altera o valor do litro do combustível.
  d. alterarCombustivel; //altera o tipo do combustível.
  e. alterarQuantidadeCombustivel; //altera a quantidade de combustível restante na bomba.

  Crie uma classe que contenha um método main para testar sua classe BombaCombustível
*/

public class Main {

  public static void main(String[] args) {
    BombaCombustivel bomba = new BombaCombustivel("Alcool", 5.00, 100);

    System.out.println(bomba.abastecerPorValor(100) + " litros");
    System.out.println(bomba.getQuantidadeCombustível() + " litros");

    System.out.println(bomba.getTipoCombustível());
    bomba.alterarCombustivel("Gasolina");
    System.out.println(bomba.getTipoCombustível());

    bomba.alterarValor(4.00);
    System.out.println(bomba.abastecerPorValor(100));
    System.out.println(bomba.getQuantidadeCombustível() + " litros");

    System.out.println(bomba.abastecerPorLitro(40));
    System.out.println(bomba.getQuantidadeCombustível() + " litros");

//    bomba.alterarQuantidadeCombustivel(2);

    bomba.abastecerPorLitro(1);
    System.out.println(bomba.getQuantidadeCombustível() + " litros");

    bomba.abastecerPorLitro(14);
    System.out.println(bomba.getQuantidadeCombustível() + " litros");
    bomba.abastecerPorLitro(1);
  }
}
