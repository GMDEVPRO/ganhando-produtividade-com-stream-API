import java.util.Arrays;
import java.util.List;
import java.util.function.Predicate;

/**
 * Representa uma funçao que aceita um argumento do tipo T e retorno um valor booleano(verdadeiro ou falso)
 * e comumente usada para filtrar as elementos do stream com base em alguma condiçao.
 * */

public class PredicateExample {
    public static void main(String[] args) {
        //criar uma lista de palavras
        List<String> palavras = Arrays.asList("java", "kotlin", "python", "javascript", "c", "go", "ruby");

        //criar um predicate que verifica se a palavra tem mais de 5 carateres
        Predicate<String> maisDeCincoCaracteres = palavra -> palavra.length() > 5;

        // usar o stream para filtrar as palavras com mais de carateres e, em seguida,
        // imprimir cada palavra que passou no filtros
        palavras.stream()
                .filter(p ->p.length() < 5
                )
                .forEach(System.out::println);
    }
}
