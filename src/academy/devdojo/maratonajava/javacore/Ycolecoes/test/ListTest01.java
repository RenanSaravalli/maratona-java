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

    }
}
