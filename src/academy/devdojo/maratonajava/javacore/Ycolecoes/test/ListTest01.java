package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import java.util.ArrayList;
import java.util.List;

public class ListTest01 {
    public static void main(String[] args) {

        List<String> nomes = new ArrayList<>();
        // Forçando em tempo de compilação a List ser de Strings
        nomes.add("Sakura");
        nomes.add("Naruto");
        for (String nome : nomes) {
            System.out.println(nome);
        }

        for (int i = 0; i < nomes.size(); i++) {
            System.out.println(nomes.get(i));
        }

        nomes.remove(0);
        nomes.remove("Naruto");

        List<Integer> integerList = new ArrayList<>();
        integerList.add(1);
        integerList.add(2);

        List<Integer> integerList2 = new ArrayList<>();

        integerList2.addAll(integerList);

    }
}
