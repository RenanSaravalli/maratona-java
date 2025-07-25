package academy.devdojo.maratonajava.javacore.Zgenerics.test;

import java.util.ArrayList;
import java.util.List;

public class WildcardTest03 {
    public static void main(String[] args) {
        List<Cachorro> cachorrosList = List.of(new Cachorro(), new Cachorro());
        List<Gato> gatosList = List.of(new Gato(), new Gato());
        printConsulta(cachorrosList);
        printConsulta(gatosList);

        // ? -> wildcard

        List<Animal> animals = new ArrayList<>();
        printConsulta(animals);

    }

    // Seja Animal ou qualquer filho
    private static void printConsulta(List<? extends Animal> animals) {
        // Aqui estamos falando que podemos adicionar qualquer objeto que
        // extend de Animal, mas ai assinamos um contrato o qual diz que não podemos adicionar
        // elementos na lista  (A lista que passarmos vai ser apenas para leitura).
        // independente se for uma interface ou uma classe abstrata a palavra vai ser extends
        for (Animal animal : animals) {
            animal.consulta();
        }
    }

    // Caso queira adicionar

    // Seja Animal ou seja pai de Animal
    private static void printConsultaAnimal(List<? super Animal> animals) {
        Animal cachoro = new Cachorro();
        Animal gato = new Gato();
        animals.add(cachoro);
        animals.add(gato);

    }

}
