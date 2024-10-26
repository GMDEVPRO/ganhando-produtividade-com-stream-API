import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.function.Consumer;

/**
 * Representa uma operaçao que aceita argumento do tipo T e nao retorna nenhum resultados.
 * E utilizado principalemente para realizar açoes,e efeitos colaterais nos elementos do stream sem modificar, ou
 * retornar uma valor.
 * */

public class ConsumerExample {
    public static void main(String[] args) {
        //criar uma lista de numeros inteiros
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5, 6, 8);

        // ussar o consumer com expressao lambda para imprimir numeros pares
        Consumer<Integer> imprimirNumeroPar = numero -> {
            if (numero % 2 == 0) {
                System.out.print(numero);
            }
        };

        // usar o consumer para imprimir pares no stream
        numeros.forEach(n -> {
                if (n % 2 == 0) {
                    System.out.println(n);

            }
        }
        );
    }
}
