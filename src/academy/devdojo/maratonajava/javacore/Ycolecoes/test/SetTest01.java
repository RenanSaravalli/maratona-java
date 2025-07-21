package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Manga;

import java.util.HashSet;
import java.util.Set;

public class SetTest01 {
    public static void main(String[] args) {
        Set<Manga> mangas = new HashSet<>();
        mangas.add(new Manga(3L,"Berkerk",31.1, 0));
        mangas.add(new Manga(2L,"POkemon",20.3d, 5));
        mangas.add(new Manga(5L, "Dragon ball Z", 43.2, 2));
        mangas.add(new Manga(4L, "Attack on Titan", 12.3d, 0));
        mangas.add(new Manga(1L,"Hellsing Ultimate",19.9, 2));

        for (Manga manga : mangas) {
            System.out.println(manga);
        }

    }
}
