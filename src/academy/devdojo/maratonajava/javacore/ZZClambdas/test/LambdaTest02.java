package academy.devdojo.maratonajava.javacore.ZZClambdas.test;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Function;

public class LambdaTest02 {
    public static void main(String[] args) {
        List<String> names = List.of("Meliodas", "Jiraya");

        List<Integer> namesLength = map(names, (String s) -> s.length());
        System.out.println(namesLength);
        List<String> namesUpper = map(names, s -> s.toUpperCase());
        System.out.println(namesUpper);
    }

    private static <T, R> List<R> map(List<T> list, Function<T, R> function) {
        List<R> result = new ArrayList<>();
        for (T e : list) {
            R r = function.apply(e);
            result.add(r);
        }
        return result;
    }
}
