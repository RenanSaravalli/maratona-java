package academy.devdojo.maratonajava.javacore.ZZBcomportamento.test;

import academy.devdojo.maratonajava.javacore.ZZBcomportamento.dominio.Car;
import academy.devdojo.maratonajava.javacore.ZZBcomportamento.interfaces.CarPredicate;

import java.util.ArrayList;
import java.util.List;
import java.util.function.Predicate;

public class ComportamentoPorParametroTest02 {
    private static List<Car> cars = List.of(new Car("Green", 2011), new Car("White", 1998), new Car("Red", 2020));

    public static void main(String[] args) {
        // Agora vamos usar a função, vamos criar uma
        // classe anônima para a interface e vamos definir
        // qualquer vai ser o test, ou seja qual vai ser o filtro
        List<Car> greenCars = filter(cars, new CarPredicate() {
            @Override
            public boolean test(Car car) {
                return car.getColor().equals("Green");
            }
        });
        System.out.println(greenCars);

        System.out.println("----------------------");

        // Podemos também utilizar a função Lambda

        List<Car> whiteCars = filter(cars, car -> car.getColor().equals("White"));
        System.out.println(whiteCars);
        System.out.println("---------------------");

        List<Car> carBeforeYear = filter(cars, car -> car.getYear() < 2015);
        System.out.println(carBeforeYear);
        System.out.println("-------------------");
    }

    // Queremos filtrar baseado no que estou passando
    // Agora a reponsabilidade da regra de negócio da filtragem, não vai ser mais
    // do métod, a responsabilidade da regra de negócio, vai ser enviada
    // na interface carPredicate através do polimorfismo
    public static List<Car> filter(List<Car> carList, CarPredicate carPredicate) {
        List<Car> filteredCarList = new ArrayList<>();
        for (Car car : carList) {
            if (carPredicate.test(car)) {
                filteredCarList.add(car);
            }
        }
        return filteredCarList;
    }

    // Utilizando o predicate
    public static List<Car> filterPredicate(List<Car> carList, Predicate<Car> carPredicate) {
        List<Car> filteredCarList = new ArrayList<>();
        for (Car car : carList) {
            if (carPredicate.test(car)) {
                filteredCarList.add(car);
            }
        }
        return filteredCarList;
    }



    // Como pode ver através desse métod definimos apenas 1 lógica de negócio que
    // vai mudar de acordo com a chamada, ou seja
    // o comportamento está vindo por parâmetro e podemos ir além, deixar
    // o métod ainda mais genérico para filtrar qualquer coisa.
    // pq já existe uma interface no java que faz isso oq fizemos com CarPredicate
    // Predicate
    // Vamos implementar isso na  ComportamentoPorParametroTest03
}
