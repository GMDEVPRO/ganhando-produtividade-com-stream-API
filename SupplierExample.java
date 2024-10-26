import java.util.List;
import java.util.function.Supplier;
import java.util.stream.Collectors;
import java.util.stream.Stream;

/**
 * Representa uma operaçao que nao aceita nenhum argumento e retorna um resultado do tipo T,
 * E comunente usada para criar ou fornecer novos objetos de um determinado tipo.
 * */

public class SupplierExample {

        public static void main(String[] args) {
            //usar o supplier com expressao lamda para fornecer uma saudaçao personalizada
            Supplier<String> saudacao = () -> "ola, seja bem-vindo(a)!";

            // usar a Supplier para obter uma lista com 5 saudacao

            List<String> listaSaudacao = Stream.generate(() -> "ola, seja bem-vindo(a)!")
                    .limit(  3)
                    .toList();

            //Imprimir as saudacao geradas
            listaSaudacao.forEach(System.out::println);


        }
    }

