package academy.devdojo.maratonajava.javacore.ZZBcomportamento.test;

import academy.devdojo.maratonajava.javacore.ZZBcomportamento.dominio.Car;
import academy.devdojo.maratonajava.javacore.ZZBcomportamento.interfaces.CarPredicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class ComportamentoPorParametroTest03 {
    private static List<Car> cars = List.of(new Car("Green", 2011), new Car("White", 1998), new Car("Red", 2020));

    public static void main(String[] args) {
        List<Car> whiteCars = filter(cars, car -> car.getColor().equals("White"));
        System.out.println(whiteCars);
        System.out.println("---------------------");

        List<Car> carBeforeYear = filter(cars, car -> car.getYear() < 2015);
        System.out.println(carBeforeYear);
        System.out.println("-------------------");

        // Pode Ver que funcionou normalmente

        // MAS agora temos a vantagem de filtra por qualquer coisa

        // Filtrando pelos numeros pares
        List<Integer> numeros = List.of(1,2,3,4,5,6,7,8,9,10);
        System.out.println(filter(numeros, num -> num % 2 == 0));
        // [2, 4, 6, 8, 10]
        System.out.println(" ");
        // Economizamos boa quantidade de linha de código utilizando genrics e predicate
    }

    // Filtrando mais genérico
    private static <T> List<T> filter(List<T> list, Predicate<T> predicate) {
        List<T> filteredList = new ArrayList<>();
        for (T e : list) {
            if (predicate.test(e)) {
                filteredList.add(e);
            }
        }
        return filteredList;
    }
}
