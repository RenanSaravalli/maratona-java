package academy.devdojo.maratonajava.javacore.ZZEstreams.test;

import java.util.Arrays;
import java.util.concurrent.ThreadLocalRandom;
import java.util.stream.Stream;

public class StreamTest10 {
    public static void main(String[] args) {
        // Existem duas formas de gerar Streams infinitos

        // 1 Stream.iterate() / 2 Stream.generate()

        // por exemplo iterando pelos números pares
        Stream.iterate(1, n -> n + 2)
                .limit(10)
                .forEach(System.out::println);

        System.out.println(" ");

        // Exemplo de fibonnaci
        // -> 0,1,1,2,3,5,8,13,21,34
        // (0,1) (1,1) (1,2) (2,3) (2,3)...
        Stream.iterate(new int[]{0,1}, n-> new int[]{n[1], n[0]+n[1]})
                .limit(10)
                .forEach(a -> System.out.println(Arrays.toString(a)));

        System.out.println(" ");

        Stream.iterate(new int[]{0,1}, n-> new int[]{n[1], n[0]+n[1]})
                .limit(10)
                .map(a -> a[0])
                .forEach(System.out::println);


        System.out.println("---------------");

        // Gerando números aleatórios do 1 ao 500
        // e utilizando o genarate para percorrer sobre eles
        ThreadLocalRandom random = ThreadLocalRandom.current();
        Stream.generate( () -> random.nextInt(1, 500))
                .limit(90)
                .forEach(System.out::println);
    }
}
