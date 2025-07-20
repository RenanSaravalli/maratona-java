package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Manga;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class MangaSortTest01 {
    public static void main(String[] args) {
        List<Manga> mangas = new ArrayList<>();
        mangas.add(new Manga(3L,"Berkerk",31.1));
        mangas.add(new Manga(2L,"POkemon",20.3d));
        mangas.add(new Manga(5L, "Dragon ball Z", 43.2));
        mangas.add(new Manga(4L, "Attack on Titan", 12.3d));
        mangas.add(new Manga(1L,"Hellsing Ultimate",19.9));

        // Agora para ordenar temos que dizer para o java como ele deve ordenar a lista
        // Principalmente se tratando de objetos customizados que nos criamos
        for (Manga manga : mangas) {
            System.out.println(manga);
        }

        System.out.println("----------------------");

        Collections.sort(mangas);

        for (Manga manga : mangas) {
            System.out.println(manga);
        }


    }
}
