package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Ninja;

import java.util.ArrayList;
import java.util.List;

public class NinjaListTest01 {
    public static void main(String[] args) {
        Ninja naruto = new Ninja("Naruto", 19, "558032942", "Folha");
        Ninja sasuke = new Ninja("Sasuke", 19, "423141232", "Folha");
        Ninja sakura = new Ninja("Sakura", 19, "566634121", "Folha");
        Ninja kakashi = new Ninja("Kakashi", 19, "558032942", "Folha");

        List<Ninja> ninjas = new ArrayList<>();

        ninjas.add(naruto);
        ninjas.add(sasuke);
        ninjas.add(sakura);

//        ninjas.clear();

        for (Ninja ninja : ninjas) {
            System.out.println(ninja);
        }

        System.out.println(ninjas.contains(kakashi));
        System.out.println(ninjas.get(ninjas.indexOf(kakashi)));

        ninjas.add(1, kakashi);
    }
}
