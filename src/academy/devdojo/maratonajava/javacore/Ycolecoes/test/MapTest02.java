package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Consumidor;
import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Manga;

import java.util.HashMap;
import java.util.Map;

public class MapTest02 {
    public static void main(String[] args) {
        Consumidor consumidor1 = new Consumidor("William Suane");
        Consumidor consumidor2 = new Consumidor("Renan Saravalli");

        Manga manga1 = new Manga(3L, "Berkerk", 31.1);
        Manga manga2 =new Manga(2L,"POkemon",20.3d);
        Manga manga3 =new Manga(5L, "Dragon ball Z", 43.2);
        Manga manga4 =new Manga(4L, "Attack on Titan", 12.3d);
        Manga manga5 =new Manga(1L,"Hellsing Ultimate",19.9);

        // Agora vamos crair o seguinte Map, esse Map vai guardar o Consumidor,
        // e o manga que aquele consumidor comprou
        // no caso o consumidor vai ser a chave e o manga o valor

        // Criando
        Map<Consumidor, Manga> consumidorManga = new HashMap<>();
        consumidorManga.put(consumidor1, manga1);
        consumidorManga.put(consumidor2, manga4);

        for (Map.Entry<Consumidor, Manga> entry : consumidorManga.entrySet()) {
            System.out.println(entry.getKey().getNome() + " - " + entry.getValue().getNome());
        }
    }
}
