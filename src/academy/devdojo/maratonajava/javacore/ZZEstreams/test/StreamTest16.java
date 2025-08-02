package academy.devdojo.maratonajava.javacore.ZZEstreams.test;

import academy.devdojo.maratonajava.javacore.ZZEstreams.dominio.Category;
import academy.devdojo.maratonajava.javacore.ZZEstreams.dominio.LightNovel;
import academy.devdojo.maratonajava.javacore.ZZEstreams.dominio.Promotion;

import java.util.*;
import java.util.stream.Collectors;
import java.util.stream.LongStream;
import java.util.stream.Stream;

import static academy.devdojo.maratonajava.javacore.ZZEstreams.dominio.Promotion.NORMAL_PRICE;
import static academy.devdojo.maratonajava.javacore.ZZEstreams.dominio.Promotion.UNDER_PROMOTION;

public class StreamTest16 {
    private static List<LightNovel> lightNovels = new ArrayList<>(List.of(
            new LightNovel("Tensei Shittara", 8.99, Category.FANTASY),
            new LightNovel("Overload", 3.99, Category.FANTASY),
            new LightNovel("Violet Evergarden", 5.99, Category.DRAMA),
            new LightNovel("No Game no life", 2.99, Category.FANTASY),
            new LightNovel("Fullmetal Alchemist", 5.99, Category.FANTASY),
            new LightNovel("Kumo desuga", 1.99, Category.ROMANCE),
            new LightNovel("Monogatari", 4.00, Category.DRAMA)
    ));
    public static void main(String[] args) {
        // Stream Parallel
        // Vamos ver quantas Threads o parallel vai utilizar
        System.out.println(Runtime.getRuntime().availableProcessors());
        // 8

        // Vamos imaginar que temos um número
        // bem grande e queremos somar
        // vamos fazer de diferentes formas
        long num = 10_000_000;

        sumFor(num);                        // 7ms
        sumStreamIterate(num);              // 152ms
        sumParallelStreamIterate(num);      // 552ms
        sumLongStreamIterate(num);          // 22ms
        sumParallelLongStreamIterate(num);  // 19ms


    }

    private static void sumFor(long num) {
        System.out.println("SumFor");
        long result = 0;
        long initTime = System.currentTimeMillis();
        for (long i = 0; i <= num; i++) {
            result += i;
        }
        long end = System.currentTimeMillis();
        System.out.println(result + " - " + (end - initTime) + "ms");
    }

    private static void sumStreamIterate(long num) {
        System.out.println("Sum StreamIterate");
        long initTime = System.currentTimeMillis();
        long result = Stream.iterate(1L, i-> i + 1L).limit(num).reduce(0L, Long::sum);
        long end = System.currentTimeMillis();
        System.out.println(result + " - " + (end - initTime) + "ms");
    }

    private static void sumParallelStreamIterate(long num) {
        System.out.println("Sum Stream Parallel Iterate");
        long initTime = System.currentTimeMillis();
        // Para dizer que é um parallel, basta adicionar
        // parallel (em qualquer lugar do Stream)
        long result = Stream.iterate(1L, i-> i + 1L).parallel().limit(num).reduce(0L, Long::sum);
        long end = System.currentTimeMillis();
        System.out.println(result + " - " + (end - initTime) + "ms");
    }
    // Basicamente ele vai realizar essa execução em múltiplas
    // threads. MAS como funciona essa porra
    // pense que tu tem uma lista
    // [1,2,3,4,5,6,7,8,9,0]
    // quando tu tem uma thread só ele percorre a lista
    // passando um elemento por vez...
    // mas quando estamos trabalhando com o parallel
    // você possui múltiplas threads no exemplo 8
    // vc pode dizer o seguinte...
    // o trabalhador 1 vai fazer a soma do
    // 1-5
    // o trabalhador 2 vai fazer a soma do
    // 6-0
    // Na verdade não sabemos como isso vai funcionar
    // vai depender do escalonador vai agendar isso
    // mas basicamente temos vários trabalhadores
    // trabalhando no mesmo bloco de informações

    // o métod acima demorou 552ms
    // Demorou mais tempo. pq ?
    // da forma que estamos trabalhando a baixo não
    // é ideal para trabalhar de forma paralela, pois
    // estamos iterando de 1 por 1 e assim fica
    // difícil para as threads saberem trabalharem nela,
    // por não saberem o tamanho
    // Mas então qual seria a melhor forma de se trabalhar

    // para trabalhar com parallel geralmente temos que ter
    // algo já predefinido um range por exemplo

    private static void sumLongStreamIterate(long num) {
        System.out.println("Sum LongStream");
        long initTime = System.currentTimeMillis();
        long result = LongStream.rangeClosed(1L, num).reduce(0L, Long::sum);
        // Perceba que acima não estamos fazendo de forma paralela e sim normal
        long end = System.currentTimeMillis();
        System.out.println(result + " - " + (end - initTime) + "ms");
    } // Perceba que o valor aqui já caiu

    // mas oque acontece se adicionarmos um parallel
    private static void sumParallelLongStreamIterate(long num) {
        System.out.println("Sum ParallelLongStream");
        long initTime = System.currentTimeMillis();
        long result = LongStream.rangeClosed(1L, num).parallel().reduce(0L, Long::sum);
        // Perceba que acima não estamos fazendo de forma paralela e sim normal
        long end = System.currentTimeMillis();
        System.out.println(result + " - " + (end - initTime) + "ms");
    } // Aqui a performance vai melhor mais um pouco.
    // mas o for normal continua sendo o mais rápido
}
