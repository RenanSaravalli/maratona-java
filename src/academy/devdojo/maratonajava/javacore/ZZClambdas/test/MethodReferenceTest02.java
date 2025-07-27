package academy.devdojo.maratonajava.javacore.ZZClambdas.test;

import academy.devdojo.maratonajava.javacore.ZZClambdas.dominio.Anime;
import academy.devdojo.maratonajava.javacore.ZZClambdas.service.AnimeComparators;

import java.util.ArrayList;
import java.util.List;

// Reference to an instance method of a particular object
public class MethodReferenceTest02 {
    public static void main(String[] args) {
        // Vamos instanciar o objeto para utilizar o métod
        AnimeComparators animeComparators = new AnimeComparators();
        List<Anime> animeList = new ArrayList<>(List.of(new Anime("One Piece", 1143), new Anime("Berserk", 64), new Anime("Naruto", 540)));
        animeList.sort(animeComparators::animeCompareByEpisodesNonStatic);
        //animeList.sort((a1, a2) -> animeComparators.animeCompareByEpisodesNonStatic(a1, a2));
        System.out.println(animeList);

    }
}
