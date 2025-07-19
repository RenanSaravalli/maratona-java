package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Smartphone;

import java.util.ArrayList;
import java.util.List;

public class SmartphoneListTest01 {
    public static void main(String[] args) {
        Smartphone s1 = new Smartphone("1ABC2BCD2", "XINGON");
        Smartphone s2 = new Smartphone("1ABC2BCD2", "XINGON");
        Smartphone s3 = new Smartphone("1ABC28690", "PERAPHONE");
        List<Smartphone> smartphones = new ArrayList<>();
        smartphones.add(s1);
        smartphones.add(s2);
        smartphones.add(0, s3);

        for (Smartphone smartphone : smartphones) {
            System.out.println(smartphone);
        }

        Smartphone s4 = new Smartphone("1ABC28690", "SAMARTPHONE");

        // Verificando se a lista já contém um item
        System.out.println(smartphones.contains(s4));
        // retorna true, pois já existe, o contains pega o equals que implementamos na classe Smartphone para comparar
        // os objetos

        // indexOf retorna o índice do objeto na list e -1 caso ele não exista
        int indexSmartphone4 = smartphones.indexOf(s4);
        System.out.println(indexSmartphone4);

        System.out.println(smartphones.indexOf(new Smartphone("kwmnd", "Seila")));
        // retorna -1

        // pegando um objeto através da lista
        System.out.println(smartphones.get(indexSmartphone4));

        // ATENÇÃO NÃO TEM JEITO
        // para achar os valores (objetos) que nós temos dentro da coleção utilizando o indexOf, ou contains
        // temos que ter o equals corretamente (podendo ser uma sobrescrista nossa de acordo com o contexto)
        // olha a sobrescrita na classe Smartphone. Por conta dessa sobrescrita conseguimos identificar que o
        // objeto está na lista pelo serialNumber dele

    }
}
