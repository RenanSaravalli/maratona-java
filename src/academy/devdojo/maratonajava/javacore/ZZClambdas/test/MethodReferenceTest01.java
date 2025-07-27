package academy.devdojo.maratonajava.javacore.ZZClambdas.test;

import academy.devdojo.maratonajava.javacore.ZZClambdas.dominio.Anime;
import academy.devdojo.maratonajava.javacore.ZZClambdas.service.AnimeComparators;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MethodReferenceTest01 {
    public static void main(String[] args) {
        List<Anime> animeList = new ArrayList<>(List.of(new Anime("One Piece", 1143), new Anime("Berserk", 64), new Anime("Naruto", 540)));
        //animeList.sort(animeList, (o1, o2) -> o1.getTitle().compareTo(o2.getTitle()));
        //animeList.sort(animeList, AnimeComparators::animeCompareByTitle);
        System.out.println(animeList);
        animeList.sort(AnimeComparators::animeCompareByEpisodes);
        System.out.println(animeList);
    }
}
