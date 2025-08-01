package academy.devdojo.maratonajava.javacore.ZZEstreams.test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;
import java.util.Arrays;
import java.util.stream.IntStream;
import java.util.stream.Stream;

public class StreamTest09 {
    public static void main(String[] args) {
        // Aqui vamos criar diretamente um Stream. sem utilizar coleção
        IntStream.rangeClosed(1, 50).filter(n -> n % 2 == 0).forEach(n -> System.out.print(n + " "));
        // QUeremos pegar do 1 ao 50, somente os pares e imprimir no console
        System.out.println(" ");

        // Podemos criar um Stream de qualquer coisa com o .of
        // por exemplo um Stream de palavras
        Stream.of("Eleve", "O", "Cosmo", " no seu coração")
                .map(String::toUpperCase)
                .forEach(s -> System.out.print(s + " "));

        System.out.println(" ");

        // Criando a partir de um Array
        int[] num = {1,2,3,4,5};
        Arrays.stream(num)
                .average()
                .ifPresent(System.out::println);

        // Stream com arquivos
        try (Stream<String> lines = Files.lines(Paths.get("file.txt"))) {
            lines.filter(l -> l.contains("Novinha")).forEach(System.out::println);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
