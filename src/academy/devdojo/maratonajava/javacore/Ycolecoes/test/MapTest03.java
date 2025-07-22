package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Consumidor;
import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Manga;

import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class MapTest03 {
    public static void main(String[] args) {
        Consumidor consumidor1 = new Consumidor("William Suane");
        Consumidor consumidor2 = new Consumidor("Renan Saravalli");

        Manga manga1 = new Manga(3L, "Berkerk", 31.1);
        Manga manga2 =new Manga(2L,"POkemon",20.3d);
        Manga manga3 =new Manga(5L, "Dragon ball Z", 43.2);
        Manga manga4 =new Manga(4L, "Attack on Titan", 12.3d);
        Manga manga5 =new Manga(1L,"Hellsing Ultimate",19.9);

       // Agora queremos associar um consumidor para vários mangas
        // 1 consumidor pode ter muitos mangas

        List<Manga> listMangaConsumidor1 = List.of(manga1,manga2,manga3);
        List<Manga> listMangaConsumidor2 = List.of(manga4,manga5);
        // Criando
        Map<Consumidor, List<Manga>> consumidorMangaMap = new HashMap<>();

        consumidorMangaMap.put(consumidor1,listMangaConsumidor1);
        consumidorMangaMap.put(consumidor2,listMangaConsumidor2);

        for (Map.Entry<Consumidor, List<Manga>> entry : consumidorMangaMap.entrySet()) {
            System.out.println("---"+ entry.getKey().getNome());
            for (Manga manga : entry.getValue()) {
                System.out.println("-----"+ manga.getNome());
            }
        }



    }
}
