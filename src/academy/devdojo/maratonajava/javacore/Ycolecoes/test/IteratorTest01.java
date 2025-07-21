package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Manga;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class IteratorTest01 {
    public static void main(String[] args) {
        List<Manga> mangas = new ArrayList<>();
        mangas.add(new Manga(3L,"Berkerk",31.1, 0));
        mangas.add(new Manga(2L,"POkemon",20.3d, 5));
        mangas.add(new Manga(5L, "Dragon ball Z", 43.2, 2));
        mangas.add(new Manga(4L, "Attack on Titan", 12.3d, 0));
        mangas.add(new Manga(1L,"Hellsing Ultimate",19.9, 2));

        // Não utilize o for para fazer uma remoção de uma List use o Iterator

        Iterator<Manga> mangaIterator = mangas.iterator();
        // Iterator é uma classe que checa antes de fazer alguma ação
        // Para utilizar o iterator, usamos jutamente com o while e verificamos se há algum próximo
        while (mangaIterator.hasNext()) {
            // Enquanto existir, eu quero que você peque o próximo
            Manga manga = mangaIterator.next();
            if (manga.getQuantidade() == 0) {
                mangaIterator.remove();
                // mangaIterator agora é o responsável por cuidar da nossa lista
            }
        }

        System.out.println(mangas);

        // Então era assim que tinhamos que remover antes do java 8. Olhe que buceta
        // ai veio o java 8 implementando a programação funcional

        // Mais pra frente do curso vamos ver com mais calma como que funciona a programação
        // funcional dentro do java, mas vamos dar nosso primeiro passo agora

        // primeiro precissamos de uma variável de referência
        // que pode ser qualquer nome, mas é fundamental que tenha lógica no nome

        // estamos dizendo olhe quero que utilize manga como variável de referência
        // e a lógica vai vir depois da seta
        mangas.removeIf(manga -> manga.getQuantidade() == 0);
        // estamos dizendo: navega por todos os mangas e remove se você achar manga.getQuantidade() = 0
        // (um manga com quantidade de 0)

        System.out.println(mangas);


    }
}
