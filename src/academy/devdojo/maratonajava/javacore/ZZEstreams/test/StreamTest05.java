package academy.devdojo.maratonajava.javacore.ZZEstreams.test;

import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamTest05 {
    public static void main(String[] args) {
         // Vamos partir para o seguinte exemplo
        List<String> words = List.of("Gomu", "Gomu", "No", "Mi");

        // Agora queremos criar uma nova coleção, onde os elementos dessa
        // coleção vai ser cada letra das palavras

        // Fazendo na mão
        String[] letters = words.get(0).split("");
        System.out.println(Arrays.toString(letters));

        // Fazendo com o uso dos Streams
        List<String[]> collect = words.stream().map(m -> m.split("")).collect(Collectors.toList());

        // Para passar um Array para Stream fazemos
        // Array.stream()
        Arrays.stream(letters);
        List<String> lettersList = words.stream()
                .map(m -> m.split(""))
                .flatMap(Arrays::stream)
                .toList();

        System.out.println(lettersList);
    }
}
