package academy.devdojo.maratonajava.javacore.ZZEstreams.test;

import academy.devdojo.maratonajava.javacore.ZZEstreams.dominio.LightNovel;

import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;

public class StreamTest06 {
    private static List<LightNovel> lightNovels = new ArrayList<>(List.of(
            new LightNovel("Tensei Shittara", 8.99),
            new LightNovel("Overload", 3.99),
            new LightNovel("Violet Evergarden", 5.99),
            new LightNovel("No Game no life", 2.99),
            new LightNovel("Fullmetal Alchemist", 5.99),
            new LightNovel("Kumo desuga", 1.99),
            new LightNovel("Kumo desuga", 1.99),
            new LightNovel("Monogatari", 4.00)
    ));
    public static void main(String[] args) {
        // Buscando se existe pelo menos um LightNovel com o preco maior que 8
        System.out.println(lightNovels.stream().anyMatch(ln -> ln.getPrice() > 8));

        // Verificando se todos os lightNovels presentes na lista possuem o preço maior do que 0
        System.out.println(lightNovels.stream().allMatch(ln -> ln.getPrice() > 0));

        // Aqui ele pergunta se nenhum elemento é menor que zero
        System.out.println(lightNovels.stream().noneMatch(ln -> ln.getPrice() < 0));

        // Temos alguns que podem ser utilizados juntamente com os filtro
        lightNovels.stream().filter(ln -> ln.getPrice() > 3)
                .findAny()
                .ifPresent(System.out::println);
        ;
        // no exemplo acima queremos encontrar qualquer um,
        // não nos importamos com ma ordem
        // Apenas queremos encontrar um LightNovel com o preco maior que 3

        // Podemos utilizar o find first para buscar pelo primeiro
        lightNovels.stream()
                .filter(ln -> ln.getPrice() > 3)
                .sorted(Comparator.comparing(LightNovel::getTitle).reversed())
                .findFirst()
                .ifPresent(System.out::println);
        // Utilizamos o Stream. Filtramos pelos elementos com preço maior do que 3
        // ordenamos esses elementos pelo nome (podemos ordenar pelo preço também)
        // buscamos pelo primeiro item
        // caso ele esteja presente, pois o findFirst retorna um Optional
        // imprimimos no console

        lightNovels.stream()
                .filter(ln -> ln.getPrice() > 3)
                .max(Comparator.comparing(LightNovel::getPrice))
                .ifPresent(System.out::println);
        // Aqui diminuimos o código em relação ao anterior
        // só que pegamos o maior valor em relação o preço também podemos pegar o maior em relação ao title

        lightNovels.stream()
                .filter(ln -> ln.getPrice() > 3)
                .max(Comparator.comparing(LightNovel::getTitle))
                .ifPresent(System.out::println);

    }
}
