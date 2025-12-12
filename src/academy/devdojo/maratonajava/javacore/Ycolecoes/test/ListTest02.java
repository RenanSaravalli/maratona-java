package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import java.util.ArrayList;
import java.util.List;

public class ListTest02 {
    public static void main(String[] args) {
        List<String> nomesNinjas = new ArrayList<>();
        List<String> nomesNinjas2 = new ArrayList<>();
        nomesNinjas.add("Naruto");
        nomesNinjas.add("Sasuke");
        nomesNinjas2.add("Minato");
        nomesNinjas2.add("jiraya");
        nomesNinjas.remove("Naruto");

        nomesNinjas.addAll(nomesNinjas2);

        for (String nome : nomesNinjas) {
            System.out.println(nome);
        }

        nomesNinjas.add("Sakura");

        System.out.println("---------------------");
        for (int i = 0; i < nomesNinjas.size(); i++) {
            System.out.println(nomesNinjas.get(i));
        }

        List<Integer> idadeNinjas = new ArrayList<>();
        idadeNinjas.add(69);
    }



}
