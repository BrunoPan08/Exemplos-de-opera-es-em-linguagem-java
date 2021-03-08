package digital.innovation.Optional;

import java.util.Optional;

public class ExemploDeOptional {
    public static void main(String[] args) {

        Optional<String> optionalString = Optional.of("valor presente");

        System.out.println("valor optional que esta presente");
        optionalString.ifPresentOrElse(System.out::println, () -> System.out.println("nao esta presente"));

        Optional<String> optionalNull = Optional.ofNullable(null);

        System.out.println("valor optional nao esta presente");
        optionalNull.ifPresentOrElse(System.out::println, () -> System.out.println("null = nao esta presente"));

        Optional<String> emptyOption = Optional.empty();

        System.out.println("valor optional que nao esta presente");
        emptyOption.ifPresentOrElse(System.out::println, () -> System.out.println("empty = nao esta presente"));

        Optional<String> optionalNullErro =  Optional.of(null);

        System.out.println("valor optional que lanca erro NullPointException");
        optionalNullErro.ifPresentOrElse(System.out::println, () -> System.out.println("erro =nao esta presente"));
    }
}
