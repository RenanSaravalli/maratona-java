package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Manga;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ListSortTest01 {
    public static void main(String[] args) {
        List<String> mangas = new ArrayList<>();
        mangas.add("Hellsing Ultimate");
        mangas.add("POkemon");
        mangas.add("Berkerk");
        mangas.add("Attack on Titan");
        mangas.add("Dragon ball Z");
        // Vamos aprender a dar um SOrt em nosso array do jeito antigo
        Collections.sort(mangas);


        for (String manga : mangas) {
            System.out.println(manga);
        }

        new Manga(null, null, 12.2d);
    }
}
