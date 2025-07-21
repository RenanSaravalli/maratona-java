package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class MapTest01 {
    public static void main(String[] args) {
        Map<String, String> map = new HashMap<>();

        // Para adicionarmos valores no map
        map.put("teklado", "teclado");
        map.put("mouze", "mouse");
        map.put("vc", "você");
        map.put("test", "você");
        map.putIfAbsent("vc", "Você2");
        // putIfAbsent só vai adicionar caso não exista

        System.out.println(map);

        // temos a possibilidade de iterar via chave ou via valor

        // podemos fazer um for nas chaves
        for (String key : map.keySet()) {
            System.out.println(key+" : " + map.get(key));
            // Desse for, podemos pegar o valor também, pois toda chave está
            // associada a um valor
        }

        System.out.println("-------------");

        // temos a possibilidade de iterar via valor

        for (String value : map.values()) {
            System.out.println(value);
        }

        System.out.println("---------------------");

        // Caso queira os dois ao mesmo tempo

        for (Map.Entry<String, String> entry : map.entrySet()) {
            System.out.println(entry);
            // ou entry.getKey()
            // ou entry.getValue()
        }

        // Para manter a ordem de inserção utilize
        Map<String, String> linkedHashMap = new LinkedHashMap<>();


    }
}
