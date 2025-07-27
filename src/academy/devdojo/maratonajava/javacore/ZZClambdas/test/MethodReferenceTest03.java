package academy.devdojo.maratonajava.javacore.ZZClambdas.test;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiPredicate;
import java.util.function.Function;

public class MethodReferenceTest03 {
    public static void main(String[] args) {
        List<String> names = new ArrayList<>(List.of("Goku", "Kuririn", "Vegeta", "Majin Boo"));
        names.sort(String::compareTo);
        System.out.println(names);

        Function<String, Integer> stringParseInt = Integer::parseInt;
        Integer applyInteger = stringParseInt.apply("10");
        System.out.println(applyInteger);

        // Da mesma forma que existe o Predicate, Existe o
        // Bipredicate, o qual podemos checar dois argumentos

        BiPredicate<List<String>, String> containsNamed = List::contains;
        System.out.println(containsNamed.test(names, "Goku"));
    }
}
