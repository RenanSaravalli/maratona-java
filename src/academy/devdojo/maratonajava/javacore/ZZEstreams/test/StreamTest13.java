package academy.devdojo.maratonajava.javacore.ZZEstreams.test;

import academy.devdojo.maratonajava.javacore.ZZEstreams.dominio.Category;
import academy.devdojo.maratonajava.javacore.ZZEstreams.dominio.LightNovel;
import academy.devdojo.maratonajava.javacore.ZZEstreams.dominio.Promotion;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StreamTest13 {
    private static List<LightNovel> lightNovels = new ArrayList<>(List.of(
            new LightNovel("Tensei Shittara", 8.99, Category.FANTASY),
            new LightNovel("Overload", 3.99, Category.FANTASY),
            new LightNovel("Violet Evergarden", 5.99, Category.DRAMA),
            new LightNovel("No Game no life", 2.99, Category.FANTASY),
            new LightNovel("Fullmetal Alchemist", 5.99, Category.FANTASY),
            new LightNovel("Kumo desuga", 1.99, Category.FANTASY),
            new LightNovel("Monogatari", 4.00, Category.DRAMA)
    ));
    public static void main(String[] args) {
        Map<Promotion, List<LightNovel>> promotionList = lightNovels
                .stream()
                .collect(
                        Collectors.groupingBy(
                        ln ->
                ln.getPrice() < 6 ? Promotion.UNDER_PROMOTION : Promotion.NORMAL_PRICE
        ));
        // Promotion.VALUE = [LightNovel]

        System.out.println(promotionList);
        // Legal acima fizemos um map (chave: valor ) onde a chave é o enum
        // Promotion e seu valor agrupado com os LightNovels que
        // tem o mesmo promotion (valor abaixo de 6)

        // Agora vamos agrupar esses valores pela categoria, ou seja um map de map
        // Map <Category, Map<Promotion, List<LightNovel>>>

        Map<Category, Map<Promotion, List<LightNovel>>> categoryPromotionLightNovel = lightNovels
                .stream()
                .collect(
                        Collectors.groupingBy(
                                LightNovel::getCategory,
                                Collectors.groupingBy(
                                        ln -> ln.getPrice() < 6 ? Promotion.UNDER_PROMOTION : Promotion.NORMAL_PRICE)
                        )
                );
        System.out.println(categoryPromotionLightNovel);

    }
}
