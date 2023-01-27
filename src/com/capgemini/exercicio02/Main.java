package com.capgemini.exercicio02;

/*
2. Crie uma classe para implementar uma ContaCorrente. A classe deve possuir os seguintes atributos: número da conta,
  nome do correntista e saldo. Os métodos são os seguintes: alterarNome, depósito e saque; No construtor, saldo é opcional,
  com valor default zero e os demais atributos são obrigatórios.
*/

import com.capgemini.exercicio01.Pessoa;

public class Main {

  public static void main(String[] args) {
    ContaCorrente conta = new ContaCorrente("Leonardo", "005124", 1000.00);

    conta.status();

    conta.depositar(1000.00);
    conta.alterarNome("Maria");
    conta.sacar(2000.00);

    conta.status();
  }
}
