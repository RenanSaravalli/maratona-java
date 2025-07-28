package academy.devdojo.maratonajava.javacore.ZZDoptional.test;

import java.util.List;
import java.util.Optional;

public class OptionalTest01 {
    public static void main(String[] args) {
        Optional<String> o1 = Optional.of("Renan seu cabeça oca de idoso");
        // Caso você não saiba se o objeto é null ou não
        Optional<String> o2 = Optional.ofNullable(null);
        System.out.println(o1);
        System.out.println(o2);
        // Optional.empty
        // Criando um Optional Completamente vazio:
        Optional<Object> o3 = Optional.empty();
        System.out.println(o3);

        System.out.println(" ");

        Optional<String> namedOptional = findNamed("Renan");
        System.out.println(namedOptional);
        // Aqui ele retornou Optional.empty
        // Mas podemos tratar esse valor como se fosse um if else do optional
        String empty = namedOptional.orElse("EMPTY");
        System.out.println(empty);
        namedOptional.ifPresent(s -> System.out.println(s.toUpperCase()));
    }

    // O intuito da oracle foi de trazer o métod para gente dessa maneira

    private static Optional<String> findNamed(String name) {
        List<String> names = List.of("Renan", "Bruno");
        int i = names.indexOf(name);
        if (i != -1) {
            return Optional.of(names.get(i));
        }
        return Optional.empty();
    }
}
