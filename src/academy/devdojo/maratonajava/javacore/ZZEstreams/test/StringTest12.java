package academy.devdojo.maratonajava.javacore.ZZEstreams.test;

import academy.devdojo.maratonajava.javacore.ZZEstreams.dominio.Category;
import academy.devdojo.maratonajava.javacore.ZZEstreams.dominio.LightNovel;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.Collectors;

public class StringTest12 {
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
        // Imagine que você possui a seguinte situação:
        // você tem um map onde tu gostaria de agrupar por categoria

        // primeiramente vamos ver como fariamos sem utilizar o Collectors
        Map<Category, List<LightNovel>> categoryLightNovelMap = new HashMap<>();
        List<LightNovel> fantasy = new ArrayList<>();
        List<LightNovel> drama = new ArrayList<>();
        List<LightNovel> romance = new ArrayList<>();

        for (LightNovel lightNovel : lightNovels) {
             switch (lightNovel.getCategory()) {
                 case DRAMA:
                     drama.add(lightNovel);
                     break;
                 case FANTASY:
                     fantasy.add(lightNovel);
                     break;
                 case ROMANCE:
                     romance.add(lightNovel);
                     break;
             }
        }
        categoryLightNovelMap.put(Category.DRAMA, drama);
        categoryLightNovelMap.put(Category.ROMANCE, romance);
        categoryLightNovelMap.put(Category.FANTASY, fantasy);
        System.out.println(categoryLightNovelMap);

        // AGORA VAMOS VER COMO PODEMOS FAZER ISSO UTILIZANDO STREAMS

        Map<Category, List<LightNovel>> collect = lightNovels.stream().collect(Collectors.groupingBy(LightNovel::getCategory));
        System.out.println(collect);
        // Simplificamos para um cacete

    }
}
