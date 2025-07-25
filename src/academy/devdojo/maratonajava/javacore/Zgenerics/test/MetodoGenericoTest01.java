package academy.devdojo.maratonajava.javacore.Zgenerics.test;

import academy.devdojo.maratonajava.javacore.Zgenerics.dominio.Barco;

import java.util.List;

public class MetodoGenericoTest01 {
    public static void main(String[] args) {
        criarArryComObjeto(new Barco("Canoa marota"));
    }
    public static <T> void criarArryComObjeto(T t){
        List<T> list = List.of(t);
        System.out.println(list);
    }
}
