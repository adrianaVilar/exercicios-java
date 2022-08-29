# Processo Seletivo - Ninja Academy
### Estágio em Desenvolvimento de Software


#### Sobre o projeto:
O projeto foi desenvolvido para submeter a inscrição no processo de seleção para estágio em desenvolvimento de software, com foco em Java (back end).
Foi utilizada a IDE IntelliJ e a linguagem Java 8 para desenvolver uma calculadora que retorna a moda de um array de números inteiros. No caso de um
array bimodal (quando há mais de uma moda), retorna o menor valor da moda.

Por exemplo,

```java
 // Para o array abaixo, é esperado o retorno 0
 int[] flavors = {1, 1, 1, 2, 2, 2, 0, 0, 0};
 
```

#### Como utilizar:
Atualmente o array de entrada está fixo na classe Main, portanto, para utilizar o método é preciso modificar o array.

```java
public class Main {

    public static void main(String[] args) {

        // Modifique este array
        int[] flavors = {1, 1, 1, 2, 2, 2, 0, 0, 0};

        System.out.println("O código do sabor é: " + Calculator.getFrequency(flavors));

    }
}
```
