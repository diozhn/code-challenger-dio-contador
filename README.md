# Contador - Desafio Digital Innovation One

Este é um projeto simples desenvolvido como parte do desafio proposto pela plataforma **Digital Innovation One** para a conclusão do módulo. O objetivo deste desafio é criar um programa Java que conte de forma crescente a partir de dois parâmetros fornecidos pelo usuário.

## Requisitos

Para executar este programa, você precisará ter instalado o **Java Development Kit (JDK)** em seu sistema. Certifique-se de que o JDK esteja configurado corretamente nas variáveis de ambiente para que seja possível compilar e executar o código a partir do terminal.

## Como executar

Siga os passos abaixo para executar o programa:

1. Abra um terminal ou prompt de comando.

2. Navegue até o diretório onde o arquivo `Contador.java` está localizado.

3. Compile o código digitando o seguinte comando:

   ```bash
   javac Contador.java
   ```

   Isso irá gerar o arquivo `Contador.class`, que contém o código compilado.

4. Agora, execute o programa digitando o seguinte comando:

   ```bash
   java Contador
   ```

5. O programa solicitará dois números inteiros como entrada. Digite os números e pressione Enter.

6. O programa realizará a contagem a partir do primeiro número (parametroUm) até o segundo número (parametroDois) fornecido. A contagem será exibida no terminal, mostrando todos os números entre os dois parâmetros, excluindo o próprio parametroDois.

## Descrição do Código

O código está escrito em Java e consiste em duas principais funções:

1. **`main(String[] args)`**: A função principal do programa. Ela lê dois números inteiros fornecidos pelo usuário, usando a classe `Scanner` para entrada de dados. Em seguida, chama a função `contar` para realizar a contagem.

2. **`contar(int parametroUm, int parametroDois) throws ParametrosInvalidosException`**: Esta função é responsável por realizar a contagem entre os dois parâmetros fornecidos. Ela verifica se o `parametroUm` é menor que o `parametroDois`. Caso contrário, lança uma exceção `ParametrosInvalidosException` com a mensagem "O segundo parâmetro deve ser maior que o primeiro". A contagem é feita usando um laço de repetição `for`, imprimindo os números no intervalo entre `parametroUm` (inclusive) e `parametroDois` (exclusive).

## Tratamento de Exceções

O programa inclui tratamento de exceções usando a classe `ParametrosInvalidosException`. Esta classe é uma subclasse de `Exception` e é utilizada para sinalizar o erro quando o segundo parâmetro é menor ou igual ao primeiro. Caso essa exceção seja lançada, uma mensagem de erro será exibida no terminal.

## Conclusão

Este desafio da Digital Innovation One propôs criar um programa simples em Java que realiza uma contagem a partir de dois parâmetros fornecidos pelo usuário. Além disso, foi adicionado tratamento de exceções para garantir a integridade dos dados de entrada.

Sinta-se à vontade para testar o programa com diferentes valores de entrada e explorar outras possibilidades para aprimorar o código. Seu aprendizado contínuo é essencial para o crescimento como desenvolvedor.
