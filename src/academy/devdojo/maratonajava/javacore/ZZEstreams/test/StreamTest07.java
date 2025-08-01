package academy.devdojo.maratonajava.javacore.ZZEstreams.test;

import java.util.List;

public class StreamTest07 {
    public static void main(String[] args) {
        List<Integer> numeros = List.of(1,2,3,4,5,6);
        // Basicamente aqui temos uma lista de inteiros e queremos a soma de todos eles.
        // podemos utilizar o reduce, que basicamente vai reduzir os elementos dessa coleção para
        // apenas um único elemento
        numeros.stream().reduce((x,y) -> x+y).ifPresent(System.out::println);
        // o reduce aqui retornou um optional pois, pode acontecer de não ter nenhum valor dentro da coleção
        // um jeito de fazermos com que ele não retorne um optional é iniciar com o valor zero
        Integer somaTotalNumeros = numeros.stream().reduce(0, (x, y) -> x + y);
        System.out.println(somaTotalNumeros);

        // Podemos utilizar o method Reference para simplificar ainda mais o nosso código
        numeros.stream().reduce(Integer::sum).ifPresent(System.out::println);
        // ou
        System.out.println(numeros.stream().reduce(0, Integer::sum));

        System.out.println(" ");

        // Podemos aplicar na multiplicação única coisa é que não vamos ter o métod
        numeros.stream().reduce((x,y) -> x* y).ifPresent(System.out::println);
        System.out.println(numeros.stream().reduce(1, (x,y) -> x*y));

        // Podemos pegar o maior valor
        numeros.stream().reduce((x,y) -> x > y ? x : y).ifPresent(System.out::println);
        System.out.println(numeros.stream().reduce(0,Integer::max));
    }
}
