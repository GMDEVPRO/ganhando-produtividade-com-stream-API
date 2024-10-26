import java.util.Arrays;
import java.util.List;
import java.util.function.BinaryOperator;

/**
 * Representa uma opraçao que combina argumentos do tipo T e retorna um resultado do mesmo tipo T .
 * E usada para realizar operaçoes de reduçao em pares de elementos, como somar numeros ou combinar objetos.
 * */

public class BinaryOperatorExample {
   public static void main(String[] args) {
       // criar uma lista do numeros inteiros
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);

        // usar o BinaryOperador com expressao lamda para somar dois numeros inteiros
        BinaryOperator<Integer> somar = (num1, num2) -> num1 + num2;

        // usar o BinaryOperator com expressao lamda para somar todos o numeros no stream
        int resultado = numeros.stream()
                .reduce(0, Integer::sum);

        // imprimir o resultado da soma
        System.out.println("A soma dos numeros e: " + resultado);
    }
}


