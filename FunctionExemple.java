import java.util.Arrays;
import java.util.List;
import java.util.function.Function;
import java.util.stream.Collectors;

/**
 * Representa uma funçao que aceita um argumento do tipo T e retorna um resultado do tipo R.
 * e utilizada para transformar ou mapear os elementos do stream em outras valores ou tipos
*/

public class FunctionExemple {
    public static void main(String[] args) {
        //criar uma lista de numeros inteiros
        List<Integer> numeros = Arrays.asList(1, 2, 3, 4, 5);

        //usar a Function com expressao lambda para dobrar todos os numeros
        Function<Integer, Integer> dobrar = numero -> numero = 2;

        //usar  funcao para dobrar todos os numeros no stream e armazena-los em outro lista
        List<Integer> numeroDobrados = numeros.stream()
                .map(n -> n * 2)
                .toList();

        //imprimir a lista de numeros dobrados
        numeroDobrados.forEach(System.out::println);

    }
}
