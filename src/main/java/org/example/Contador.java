package org.example;

import java.util.Scanner;

public class Contador {
  public static void main(String[] args) {
    Scanner terminal = new Scanner(System.in);
    int parametroUm = terminal.nextInt();
    int parametroDois = terminal.nextInt();
    try {
      contar(parametroUm, parametroDois);
    } catch (ParametrosInvalidosException exception) {
      System.out.println(exception);
    }
  }

  static void contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException {
    if (parametroUm >= parametroDois) {
      throw  new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
    }

    int contagem = parametroDois - parametroUm;

    for (int contador = 0; contador < contagem; contador++){
      System.out.println(contador);
    }
  }
}
