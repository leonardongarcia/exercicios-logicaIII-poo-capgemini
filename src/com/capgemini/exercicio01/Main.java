package com.capgemini.exercicio01;

/*
1. Crie uma classe para representar uma Pessoa com os atributos privados de nome, data de nascimento e altura. Crie
        os métodos públicos necessários para getters e setters e também um método para imprimir todos dados de uma pessoa.
        Crie um método para calcular a idade da pessoa.
*/

public class Main {

  public static void main(String[] args) {
    Pessoa pessoa = new Pessoa();

    pessoa.setNome("Maria José");
    pessoa.setDataNascimento("1985-03-28");
    pessoa.setAltura(1.72);

    pessoa.imprimirDados();
  }
}
