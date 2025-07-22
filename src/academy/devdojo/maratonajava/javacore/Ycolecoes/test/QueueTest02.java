package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Consumidor;
import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Manga;

import java.util.PriorityQueue;
import java.util.Queue;

public class QueueTest02 {
    public static void main(String[] args) {

        Queue<Manga> mangas = new PriorityQueue<>(new MangaPrecoComparator().reversed());
        mangas.add(new Manga(3L,"Berkerk",9.5, 0));
        mangas.add(new Manga(2L,"POkemon",3.2, 5));
        mangas.add(new Manga(5L, "Dragon ball Z", 2.99, 2));
        mangas.add(new Manga(4L, "Attack on Titan", 12.3d, 0));
        mangas.add(new Manga(1L,"Hellsing Ultimate",19.9, 2));

        // Tem alguns sistemas onde a prioridade é importante,
        // Afinal oque Priority quer dizer
        // ele quer dizer que nós podemos definir a prioridade

        while (!mangas.isEmpty()) {
            System.out.println(mangas.poll());
        }
    }
}
