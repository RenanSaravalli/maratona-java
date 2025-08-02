package academy.devdojo.maratonajava.javacore.ZZEstreams.test;

import academy.devdojo.maratonajava.javacore.ZZEstreams.dominio.Category;
import academy.devdojo.maratonajava.javacore.ZZEstreams.dominio.LightNovel;
import academy.devdojo.maratonajava.javacore.ZZEstreams.dominio.Promotion;

import java.util.*;
import java.util.stream.Collectors;

import static academy.devdojo.maratonajava.javacore.ZZEstreams.dominio.Promotion.NORMAL_PRICE;
import static academy.devdojo.maratonajava.javacore.ZZEstreams.dominio.Promotion.UNDER_PROMOTION;

public class StreamTest15 {
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
        // Imagine que você gostaria de realizar
        // um agrupamento pelas categorias e
        // gostaria de ter as estatísticas relacionada a preco
        // (Dentro da categoria Fantasy, qual é o maior preco
        // menor preco, preco médio )

        Map<Category, DoubleSummaryStatistics> groupLightNovelsStatics = lightNovels
                .stream()
                .collect(Collectors.groupingBy(
                        LightNovel::getCategory,
                        Collectors.summarizingDouble(LightNovel::getPrice)
                ));
        System.out.println(groupLightNovelsStatics);
        System.out.println(" ");

        // Agora vamos agrupar por categoria e
        // vamos mostrar quantos temos de acordo com o valor.
        // quantos temos do Enum.Promotion.UNDER_PROMOTION
        // ou NORMAL_PRICE

        // Map<Category, List<Promotion>>
        Map<Category, List<Promotion>> groupLightNovelsCategoryAndPromotion = lightNovels
                .stream()
                .collect(
                        Collectors.groupingBy(
                                LightNovel::getCategory,
                                Collectors.mapping(StreamTest15::getPromotion, Collectors.toList())
                        )
                );

        System.out.println(groupLightNovelsCategoryAndPromotion);
        System.out.println(" ");
        // Com o toList temos valores duplicados


        // para não ter valores duplicados podemos utilizar Set
        // Map<Category, Set<Promotion>>
        Map<Category, Set<Promotion>> groupLightNovelsCategoryAndPromotionSet = lightNovels
                .stream()
                .collect(
                        Collectors.groupingBy(
                                LightNovel::getCategory,
                                Collectors.mapping(StreamTest15::getPromotion, Collectors.toSet())
                        )
                );
        System.out.println(groupLightNovelsCategoryAndPromotionSet);
        System.out.println(" ");

        // Caso tu queira ao invés do Set
        // um LinkedHashSet

        Map<Category, LinkedHashSet<Promotion>> groupLightNovelsCategoryAndPromotionLinkedHashSet = lightNovels
                .stream()
                .collect(
                        Collectors.groupingBy(
                                LightNovel::getCategory,
                                Collectors.mapping(StreamTest15::getPromotion,
                                        Collectors.toCollection(LinkedHashSet::new))
                        )
                );
        System.out.println(groupLightNovelsCategoryAndPromotionLinkedHashSet);

    }
    private static Promotion getPromotion(LightNovel lightNovel) {
        return lightNovel.getPrice() < 6 ? UNDER_PROMOTION : NORMAL_PRICE;
    }
}
