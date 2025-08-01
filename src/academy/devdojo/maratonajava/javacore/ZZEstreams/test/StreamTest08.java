package academy.devdojo.maratonajava.javacore.ZZEstreams.test;

import academy.devdojo.maratonajava.javacore.ZZEstreams.dominio.LightNovel;

import java.util.ArrayList;
import java.util.List;

public class StreamTest08 {
    private static List<LightNovel> lightNovels = new ArrayList<>(List.of(
            new LightNovel("Tensei Shittara", 8.99),
            new LightNovel("Overload", 3.99),
            new LightNovel("Violet Evergarden", 5.99),
            new LightNovel("No Game no life", 2.99),
            new LightNovel("Fullmetal Alchemist", 5.99),
            new LightNovel("Kumo desuga", 1.99),
            new LightNovel("Kumo desuga", 1.99),
            new LightNovel("Monogatari", 4.00)
    ));
    public static void main(String[] args) {
        // Vamos utilizar um reduce no nosso objeto.
        // primeiro vamos filtrar pelos lightNovel com
        // preco acima de 3 e somar-los
        lightNovels.stream()
                .map(LightNovel::getPrice)
                .filter(price -> price > 3)
                .reduce(Double::sum).ifPresent(System.out::println);

        // Temos também o stream para os tipos primitivos DoubleStream
        // utilizando o DoubleStream basicamente estamos dizendo para o java que
        // ele não precisa mais ficar fazendo o wrapp e unwrapper da quele tipo

        double sum = lightNovels.stream().mapToDouble(LightNovel::getPrice)
                .filter(price -> price > 3)
                .sum();


    }
}
