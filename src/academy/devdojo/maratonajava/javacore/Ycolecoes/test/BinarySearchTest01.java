package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class BinarySearchTest01 {
    public static void main(String[] args) {
        List<Integer> numeros = new ArrayList<>();
        numeros.add(2);
        numeros.add(0);
        numeros.add(4);
        numeros.add(3);

        // Binary Search vai fazer uma busca na lista que passarmos
        // vai retornar o índice caso ele encontre oque nós estamos procurando
        // ou caso ele não encontre, ele vai retornar algo seguindo a regra a baixo
        // (-(ponto de inserção) -1)
        // temos que passar obrigatóriamente uma lista que já esteja ordenada
        // index 0,1,2,3
        // value 0,2,3,4
        Collections.sort(numeros);
        System.out.println(Collections.binarySearch(numeros, 2));
    }
}
