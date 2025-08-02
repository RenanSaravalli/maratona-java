package academy.devdojo.maratonajava.javacore.ZZEstreams.test;

import academy.devdojo.maratonajava.javacore.ZZEstreams.dominio.Category;
import academy.devdojo.maratonajava.javacore.ZZEstreams.dominio.LightNovel;

import java.util.*;
import java.util.function.BinaryOperator;
import java.util.function.Function;
import java.util.stream.Collectors;

public class StreamTest14 {
    private static List<LightNovel> lightNovels = new ArrayList<>(List.of(
            new LightNovel("Tensei Shittara", 8.99, Category.FANTASY),
            new LightNovel("Overload", 3.99, Category.FANTASY),
            new LightNovel("Violet Evergarden", 5.99, Category.DRAMA),
            new LightNovel("No Game no life", 2.99, Category.FANTASY),
            new LightNovel("Fullmetal Alchemist", 5.99, Category.FANTASY),
            new LightNovel("Kumo desuga", 1.99, Category.ROMANCE),
            new LightNovel("Monogatari", 4.00, Category.DRAMA)
    ));
    public static void main(String[] args) {
        // vamos misturar um pouco os Collectors, digamos que queremos
        // contar a quantidade de LightNovels que temos por categoria
        // Depois queremos agrupar por categoria e o maior preco

        Map<Category, Long> groupCategoryAndCount = lightNovels
                .stream()
                .collect(
                        Collectors.groupingBy(
                                LightNovel::getCategory,
                                Collectors.counting()
                        )
                );
        System.out.println(groupCategoryAndCount);
        // {ROMANCE=1, FANTASY=4, DRAMA=2}

        System.out.println(" ");

        Map<Category, Optional<LightNovel>> categoryAndMaxOptional = lightNovels
                .stream()
                .collect(
                        Collectors.groupingBy(
                                LightNovel::getCategory,
                                Collectors.maxBy(Comparator.comparing(LightNovel::getPrice))
                        ));
        System.out.println(categoryAndMaxOptional);
        System.out.println(" ");

        // no caso acima temos um problema que o maxBy retorna um Optional
        // vamos ver a baixo como mudar esse cara

        // Quando você está coletando, você tem que coletar e então
        // remover do Optional -> collectingAndThen
        Map<Category, LightNovel> groupLightNovelsCategoryMaxPrice = lightNovels
                .stream()
                .collect(
                        Collectors.groupingBy(
                                LightNovel::getCategory,
                                Collectors.collectingAndThen(
                                        Collectors.maxBy(Comparator.comparing(LightNovel::getPrice)),
                                        Optional::get
                                )
                        )
                );
        // Perceba que agora não temos mais o Optional,
        // Retiramos ele com o collectingAndThen

        System.out.println(groupLightNovelsCategoryMaxPrice);

        Map<Category, LightNovel> groupLightNovelsCategoryMaxPrice2 = lightNovels
                .stream()
                .collect(
                        Collectors.toMap(
                                LightNovel::getCategory,
                                Function.identity(),
                                BinaryOperator.maxBy(
                                        Comparator.comparing(LightNovel::getPrice)
                                )
                        )
                );

    }
}
