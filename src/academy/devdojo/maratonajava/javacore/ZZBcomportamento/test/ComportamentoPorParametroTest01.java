package academy.devdojo.maratonajava.javacore.ZZBcomportamento.test;

import academy.devdojo.maratonajava.javacore.ZZBcomportamento.dominio.Car;

import java.util.ArrayList;
import java.util.List;

public class ComportamentoPorParametroTest01 {
    private static List<Car> cars = List.of(new Car("Green", 2011), new Car("White", 1998), new Car("Red", 2020));

    public static void main(String[] args) {
        System.out.println(filterGreenCar(cars));

        System.out.println("-----------------");

        System.out.println(filterCarByColor(cars, "Red"));

        System.out.println("-----------");

        System.out.println(filterCarByYearBefore(cars, 2015));
    }

    private static List<Car> filterGreenCar(List<Car> carList) {
        List<Car> greenCarList = new ArrayList<>();
        for (Car car : carList) {
            if (car.getColor().equals("Green")) {
                greenCarList.add(car);
            }
        }
        return greenCarList;
    }

    // Muito provavelmente o cliente pode pedir para você agora, legal renan,
    // mas agora eu quero um filtro para a cor vermelha, ai imagina o trampo de criar mais um métod
    // para filtrar da cor vermelha, para resolver essa duplicidade de código,
    // podemos passar a cor que vai ser comparada como parâmetro.

    private static List<Car> filterCarByColor(List<Car> carList, String color) {
        List<Car> filterCarListByColor = new ArrayList<>();
        for (Car car : carList) {
            if (car.getColor().equals(color)) {
                filterCarListByColor.add(car);
            }
        }

        return filterCarListByColor;
    }

    // Ai o cliente passa mais um requisito para você,
    // Agora ele quer os carros ordenados pelo ano
    private static List<Car> filterCarByYearBefore(List<Car>carList, int year) {
        List<Car> filterCarListByYear = new ArrayList<>();
        for (Car car : carList) {
            if (car.getYear() < year) {
                filterCarListByYear.add(car);
            }
        }

        return filterCarListByYear;

        // Se repararmos no nosso código apenas uma pequena parte
        // dele está sendo alterado, no caso o if
        // Agora pensa, e se a gente pudesse passar essa condição como parâmetro
        // não ia facilitar a nossa vida ?
    }
}
