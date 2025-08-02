package academy.devdojo.maratonajava.javacore.ZZEstreams.test;

import academy.devdojo.maratonajava.javacore.ZZEstreams.dominio.LightNovel;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.DoubleSummaryStatistics;
import java.util.List;
import java.util.stream.Collectors;

public class StreamTest11 {
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
        // isso é apenas um exemplo antes do collect e depois utilizando o collect
        System.out.println(lightNovels.stream().count());
        System.out.println(lightNovels.stream().collect(Collectors.counting()));

        System.out.println(" ");

        // agora com o max
        lightNovels.stream().max(Comparator.comparing(LightNovel::getPrice)).ifPresent(System.out::println);
        //MEsma coisa com Collectors
         lightNovels.stream()
                 .collect(Collectors.maxBy(Comparator.comparing(LightNovel::getPrice)))
                 .ifPresent(System.out::println);

         // Agora somando
        System.out.println(lightNovels.stream().mapToDouble(LightNovel::getPrice).sum());
        // com collectors
        System.out.println(lightNovels.stream().collect(Collectors.summingDouble(LightNovel::getPrice)));

        // Agora avarege
        System.out.println(lightNovels.stream().mapToDouble(LightNovel::getPrice).average());
        // com collectors
        System.out.println(lightNovels.stream().collect(Collectors.averagingDouble(LightNovel::getPrice)));

        // Verdadeiro poder
        // dentro do collectors temos o seguinte cara summarizing
        DoubleSummaryStatistics collect = lightNovels.stream().collect(Collectors.summarizingDouble(LightNovel::getPrice));
        System.out.println(collect);
        // DoubleSummaryStatistics{count=7, sum=33,940000, min=1,990000, average=4,848571, max=8,990000}
        // perceba que tudo que fizemos acima ele já trouxe tudo agrupado aqui pra gente

        // para trabalhar com Strings podemos utilizar o joining, que pode basicamente juntar nossos valores
        // podemos adicionar nele um delimitador
        String collect1 = lightNovels.stream().map(LightNovel::getTitle).collect(Collectors.joining(", "));
        System.out.println(collect1);
        //Tensei Shittara, Overload, Violet Evergarden, No Game no life, Fullmetal Alchemist, Kumo desuga, Monogatari
    }
}
