package academy.devdojo.maratonajava.javacore.Zgenerics.test;

import academy.devdojo.maratonajava.javacore.Zgenerics.dominio.Barco;
import academy.devdojo.maratonajava.javacore.Zgenerics.dominio.Carro;
import academy.devdojo.maratonajava.javacore.Zgenerics.service.BarcoRentavelService;
import academy.devdojo.maratonajava.javacore.Zgenerics.service.RentalService;

import java.util.ArrayList;
import java.util.List;

public class ClasseGenericaTest03 {
    public static void main(String[] args) {
        List<Carro> carrosDisponiveis = new ArrayList<>(List.of(new Carro("BMW"), new Carro("Fusca")));
        List<Barco> barcosDisponiveis = new ArrayList<>(List.of(new Barco("Lancha"), new Barco("Canoa")));

        // Agora nosso sistema vai funcionar de acordo com o tipo que passarmos
        // Se definirmos o tipo como Carro, ele vai esperar os valores sendo do Tipo Carro.
        // Se definirmo o tipo como Barco, ele vai esperar os valores sendo do tipo Barco

        RentalService<Carro> rentalService = new RentalService<>(carrosDisponiveis);
        Carro carro = rentalService.buscarObjetoDisponível();
        System.out.println("Usando carro por 1 mês");
        rentalService.retornarObjetoAlugado(carro);

        System.out.println("-----------------");

        RentalService<Barco> rentalService2 = new RentalService<>(barcosDisponiveis);
        Barco barco = rentalService2.buscarObjetoDisponível();
        System.out.println("Usando barco por 1 mês");
        rentalService2.retornarObjetoAlugado(barco);

        // Através do uso de Gerics Conseguimos customizar o nosso código de uma forma
        // com uma classe podemos resolver o problema de 3,4...

    }
}
