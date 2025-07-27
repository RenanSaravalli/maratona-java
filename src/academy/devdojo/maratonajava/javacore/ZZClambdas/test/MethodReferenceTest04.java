package academy.devdojo.maratonajava.javacore.ZZClambdas.test;

import academy.devdojo.maratonajava.javacore.ZZClambdas.dominio.Anime;
import academy.devdojo.maratonajava.javacore.ZZClambdas.service.AnimeComparators;

import java.util.ArrayList;
import java.util.List;
import java.util.function.BiFunction;
import java.util.function.Supplier;

public class MethodReferenceTest04 {
    public static void main(String[] args) {
        Supplier<AnimeComparators> newAnimeComparatorsSupplier = AnimeComparators::new;
        // Atenção não é na linha acima que o objeto é criado
        // Para criar o objeto fazemos da seguinte forma
        AnimeComparators animeComparators = newAnimeComparatorsSupplier.get();
        List<Anime> animeList = new ArrayList<>(List.of(new Anime("One Piece", 1143), new Anime("Berserk", 64), new Anime("Naruto", 540)));
        animeList.sort(animeComparators::animeCompareByEpisodesNonStatic);
        System.out.println(animeList);

        BiFunction<String, Integer, Anime> animeBiFunction = (title, episodes) -> new Anime(title, episodes);
        BiFunction<String, Integer, Anime> animeBiFunction2 = Anime::new;
        System.out.println(animeBiFunction2.apply("Super 11", 111));

    }
}
