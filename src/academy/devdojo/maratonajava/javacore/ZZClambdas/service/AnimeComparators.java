package academy.devdojo.maratonajava.javacore.ZZClambdas.service;

import academy.devdojo.maratonajava.javacore.ZZClambdas.dominio.Anime;

public class AnimeComparators {
    public static int animeCompareByTitle(Anime a1, Anime a2 ) {
        return a1.getTitle().compareTo(a2.getTitle());
    }

    public static int animeCompareByEpisodes(Anime a1, Anime a2 ) {
        return Integer.compare(a1.getEpisodes(), a2.getEpisodes());
    }

    // Reference com métod não static

    public int animeCompareByEpisodesNonStatic(Anime a1, Anime a2 ) {
        return Integer.compare(a1.getEpisodes(), a2.getEpisodes());
    }
}
