package academy.devdojo.maratonajava.javacore.ZZEstreams.test;

// 1. Ordenar os LightNovel pelo title
// 2. Traga os primeiros 3 light novels com preço menor que 4

import academy.devdojo.maratonajava.javacore.ZZEstreams.dominio.LightNovel;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class StreamTest01 {
    private static List<LightNovel> list = new ArrayList<>(List.of(
            new LightNovel("Tensei Shittara", 8.99),
            new LightNovel("Overload", 3.99),
            new LightNovel("Violet Evergarden", 5.99),
            new LightNovel("No Game no life", 2.99),
            new LightNovel("Fullmetal Alchemist", 5.99),
            new LightNovel("Kumo desuga", 1.99),
            new LightNovel("Monogatari", 4.00)
    ));
    public static void main(String[] args) {
        list.sort(Comparator.comparing(LightNovel::getTitle));
        List<String> titles = new ArrayList<>();

        for (LightNovel lightNovel : list) {
            if (lightNovel.getPrice() <= 4) {
                titles.add(lightNovel.getTitle());
            }
            if (titles.size() >= 3) {
                break;
            }
        }

        System.out.println(list);
        System.out.println(titles);


    }
}
