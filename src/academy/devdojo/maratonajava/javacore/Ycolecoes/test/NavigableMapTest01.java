package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Consumidor;

import java.util.Map;
import java.util.NavigableMap;
import java.util.TreeMap;

public class NavigableMapTest01 {
    public static void main(String[] args) {
        NavigableMap<String, String> mapAbecaralho = new TreeMap<>();
        mapAbecaralho.put("B", "Letra B");
        mapAbecaralho.put("A", "Letra A");
        mapAbecaralho.put("D", "Letra D");
        mapAbecaralho.put("E", "Letra E");
        mapAbecaralho.put("C", "Letra C");

        for (Map.Entry<String,String> entry : mapAbecaralho.entrySet()) {
            System.out.println(entry.getKey() + " = " + entry.getValue());
            // Perceba que está ordenado em ordem alfabética
            //A = Letra A
            //B = Letra B
            //C = Letra C
            //D = Letra D
            //E = Letra E
        }

        System.out.println(mapAbecaralho.headMap("C"));
        // Vai pegar tod mund que vem antes do C
        // Podemos também incluir o c nesse resultado
        System.out.println(mapAbecaralho.headMap("C", true));

        // Basicamente vamos ter o mesmo métod do treeSet para o TreeMap

        System.out.println("-----------------");

//        Consumidor consumidor1 = new Consumidor("William Suane");
//        Consumidor consumidor2 = new Consumidor("Renan Saravalli");
//
//        NavigableMap<Consumidor,Consumidor> consumidorConsumidorMap = new TreeMap<>();
//        consumidorConsumidorMap.put(consumidor1,consumidor2);
//
//        for (Map.Entry<Consumidor,Consumidor> entry : consumidorConsumidorMap.entrySet()) {
//            System.out.println(entry.getKey() + " = " + entry.getValue());
//
//        }
    }
}
