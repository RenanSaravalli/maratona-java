package academy.devdojo.maratonajava.javacore.ZZDoptional.test;

import academy.devdojo.maratonajava.javacore.ZZDoptional.dominio.Manga;
import academy.devdojo.maratonajava.javacore.ZZDoptional.repositorio.MangaRepository;

import java.util.Optional;

public class OptionalTest02 {
    public static void main(String[] args) {
        // Vamos buscar pelo Title do manga e caso ele exista queremos alterar
        Optional<Manga> mangaByTitle = MangaRepository.findByTitle("Boku no Hero");

        mangaByTitle.ifPresent(m -> m.setTitle("Boku no Hero 2"));
        System.out.println(mangaByTitle);

        // Agora vamos buscar um manga pelo Id, e caso ele não exista vamos retornar uma exceção
        Optional<Manga> mangaById = MangaRepository.findById(2);
        mangaById.orElseThrow(IllegalArgumentException::new);
        System.out.println(mangaById);

        Manga newManga = MangaRepository.findByTitle("Berserk").orElse(new Manga(3, "Berserk", 65));
        System.out.println(newManga);

        // Podemos utilizar de outra maneira com uma lambda
        Manga newManga2 = MangaRepository.findByTitle("Naruto").orElseGet(() -> new Manga(4, "Naruto", 544));
        System.out.println(newManga2);

    }
}
