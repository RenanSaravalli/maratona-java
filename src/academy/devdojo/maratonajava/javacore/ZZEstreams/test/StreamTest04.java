package academy.devdojo.maratonajava.javacore.ZZEstreams.test;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

public class StreamTest04 {
    public static void main(String[] args) {
        List<List<String>> devDojo = new ArrayList<>();
        List<String> graphicDesigners = List.of("Wildnei Suane", "Catarina Santos", "Sandy Carolina");
        List<String> developers = List.of("William", "David", "Harisson");
        List<String> students = List.of("Édipo", "Gustavo Lima", "Gustavo Mendes", "Guilherme");
        devDojo.add(graphicDesigners);
        devDojo.add(developers);
        devDojo.add(students);

        // Perceba que nesse caso tenho uma coleção aninhada né
        // Temos uma coleção de coleção de Strings. Para esse caso é recomendável o uso do FlatMap
        //for (List<String> people : devDojo) {
            //for (String person : people) {
            //    System.out.println(person);
          //  }
        //}

        devDojo.stream().flatMap(Collection::stream).forEach(System.out::println);
        // então basicamente o flatMap vai mais para dentro
        // ele achata retirando os valores aninhados que temos la dentro

    }
}
