package academy.devdojo.maratonajava.javacore.ZZEstreams.test;

import academy.devdojo.maratonajava.javacore.ZZEstreams.dominio.LightNovel;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class StreamTest02 {
    private static List<LightNovel> lightNovels = new ArrayList<>(List.of(
            new LightNovel("Tensei Shittara", 8.99),
            new LightNovel("Overload", 3.99),
            new LightNovel("Violet Evergarden", 5.99),
            new LightNovel("No Game no life", 2.99),
            new LightNovel("Fullmetal Alchemist", 5.99),
            new LightNovel("Kumo desuga", 1.99),
            new LightNovel("Monogatari", 4.00)
    ));

    public static void main(String[] args) {
        // A maioria das coleções possuem um métod chamado Stream
        // Para inicializarmos um Stream fazemos da seguinte forma:
        //Stream<LightNovel> stream = lightNovels.stream();
        // Agora vamos trabalhar com a sequência de elementos acima
        // e vamos ter as operações dentro do stream para trabalhar com essas operações
        // stream possuem 2 tipos de operações podendo ser intermediárias ou finais
        // ação intermediária retorna o próprio Stream (podemos encadear ações-Streams)

        // Basicamente agora vamos realizar as ações intermediárias que retornam um novo Stream
        // perceba que o código vai ficar bem declarativo, e ao final vamos colocar uma ação final que vai permitir 
        // passar esses elementos do stream para uma coleção

        List<String> titles = lightNovels.stream().sorted(Comparator.comparing(LightNovel::getTitle))
                .filter(ln -> ln.getPrice() <= 4)
                .limit(3)
                .map(LightNovel::getTitle)
                .collect(Collectors.toList());

        System.out.println(titles );
    }
}
