package academy.devdojo.maratonajava.javacore.ZZClambdas.test;

import java.util.List;
import java.util.function.Consumer;

public class LambdaTest01 {
    public static void main(String[] args) {
        List<String> listNames = List.of("Goku", "Renan", "Luffy", "Sanji");
        List<Integer> integerList = List.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        forEach(listNames, (String s ) -> System.out.println(s));

        // PRintando o dobro dos números da list
        forEach(integerList, i -> System.out.println(i * 2));

        // Printando o número e se ele é par
        forEach(integerList, i -> System.out.println(i + " " + (i % 2 == 0)));

    }

    private static <T> void forEach(List<T> list, Consumer<T> consumer) {
        for (T e : list) {
            consumer.accept(e);
            // vamos implementar o que o métod accept vai fazer através
            // da lambda
        }

    }
}
