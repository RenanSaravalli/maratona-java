package academy.devdojo.maratonajava.javacore.Ycolecoes.test;

import academy.devdojo.maratonajava.javacore.Ycolecoes.dominio.Smartphone;

public class EqualsTest01 {
    public static void main(String[] args) {
        Smartphone s1 = new Smartphone("1ABC2BCD2", "XINGON");
        Smartphone s2 = new Smartphone("1ABC2BCD2", "XINGON");

        System.out.println(s1.equals(s2));
        // Isso é falso

        // Vamos utilizar o equals para realizar comparação de objetos
        // o equals vai comparar a referência que os objetos fazem

        s2 = s1;

        System.out.println(s1.equals(s2));
        // Isso agora é verdadeiro
    }
}
