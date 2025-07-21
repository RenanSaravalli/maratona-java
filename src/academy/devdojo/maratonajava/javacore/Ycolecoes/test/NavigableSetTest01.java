package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Manga;
import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Smartphone;

import java.util.Comparator;
import java.util.NavigableSet;
import java.util.Set;
import java.util.TreeSet;

class SmartphoneMarcaComparator implements Comparator<Smartphone> {

    @Override
    public int compare(Smartphone o1, Smartphone o2) {
        return o1.getMarca().compareTo(o2.getMarca());
    }
}

public class NavigableSetTest01 {
    public static void main(String[] args) {
        NavigableSet<Smartphone> set = new TreeSet<>(new SmartphoneMarcaComparator());
        Smartphone smartphone = new Smartphone("123", "Nokia");
        set.add(smartphone);

        NavigableSet<Manga> mangas = new TreeSet<>();
        mangas.add(new Manga(3L,"Berkerk",31.1, 0));
        mangas.add(new Manga(2L,"POkemon",20.3d, 5));
        mangas.add(new Manga(5L, "Dragon ball Z", 43.2, 2));
        mangas.add(new Manga(4L, "Attack on Titan", 12.3d, 0));
        mangas.add(new Manga(1L,"Hellsing Ultimate",19.9, 2));

        for (Manga manga : mangas) {
            System.out.println(manga);
        }
        // TreeSet vai fazer a ordenação da nossa coleção automaticamente
        // baseado no compareTo da classe que estamos passando para o Set
        // Exemplo na classe manga temos um comparateTo, onde estamos comparando os
        // objetos pelo ID, então a nossa coleção vai estar ordenada pelo ID

        // Devemos utilizar o TreeSet quando a classe que estamos criando a coleção
        // implementa Comparable, ou caso não tenhamos comparable, temos que ter certeza absoluta
        // que estamos criando um comparator e temos que lembrar que toda vez que inserirmos um elemento
        // o próprio TreeSet vai reoordenar a coleção baseado no valor ou do compareTo que tivermos implementado
        // na nossa classe, ou um Compare que passamos na criação do TreeSet

    }
}
