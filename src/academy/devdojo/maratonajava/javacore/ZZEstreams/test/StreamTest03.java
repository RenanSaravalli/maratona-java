package academy.devdojo.maratonajava.javacore.ZZEstreams.test;

import academy.devdojo.maratonajava.javacore.ZZEstreams.dominio.LightNovel;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Stream;

public class StreamTest03 {
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
        // Vamos ver mais algumas operações que nós temos
        // um exemplo de ação final que podemos realizar é o ForEach
        // Mas nesse caso é recomendável realizar o forEach direto da coleção

        lightNovels.forEach(System.out::println);

        Stream<LightNovel> stream = lightNovels.stream();
        // podemos realizar um count de um stream que vai retornar um long para gente
        long count = stream.filter(ln -> ln.getPrice() <= 4).count();
        // Caso queira contar os elementos distintos
        long count2 = lightNovels.stream().distinct().filter(ln -> ln.getPrice() <= 4).count();

        System.out.println(count);
        System.out.println(count2);

        System.out.println(" ");

        // Quando você abre um stream e trabalha com seus devidos dados
        // e fecha ele você não consegue mais trabalhar com o mesmo Stream
        // para resolver isso podemos puxar o stream direto da fonte de dados

        // Mas normalmente trabalhando com Streams, vamos mesmo trabalhar com operações intermediárias e
        // ao final utilizar uma operação final
    }
}
