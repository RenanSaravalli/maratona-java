package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class ListArrayConversaoTest01 {
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>();
        numeros.add(1);
        numeros.add(2);
        numeros.add(3);

        // Da maneira abaixo conseguimos pegar os valores de um arrayList e passar para um array
        Integer[] listToArray = numeros.toArray(new Integer[0]);
        System.out.println(Arrays.toString(listToArray));

        Integer[] numerosArray = new Integer[3];
        numerosArray[0] = 1;
        numerosArray[1] = 2;
        numerosArray[2] = 3;

        // Passando um array para uma lista
        List<Integer> arrayToList = Arrays.asList(numerosArray);
        arrayToList.set(0,12);
        // uma modificação que fizer na lista de uma array
        // Também será feita no array
        System.out.println(Arrays.toString(numerosArray));
        System.out.println(arrayToList);
        //[12, 2, 3] - numerosArray
        //[12, 2, 3] - arrayToList
        // Perceba que uma alteração feita na lista se replicou no array

        // Uma forma de corrigir isso pode ser da seguinte forma
        System.out.println("-------------");
        List<Integer> numerosList = new ArrayList<>(Arrays.asList(numerosArray));
        numerosList.add(15);
        System.out.println(numerosList);

        // Podemos criar usando apenas uma linha também
        List<Integer> list = Arrays.asList(1, 2, 3, 4, 5);
        List<Integer> list2 = List.of(1, 2, 3, 4);
    }
}
