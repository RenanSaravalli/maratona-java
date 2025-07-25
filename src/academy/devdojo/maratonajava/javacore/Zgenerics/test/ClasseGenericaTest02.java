package academy.devdojo.maratonajava.javacore.Zgenerics.test;

import academy.devdojo.maratonajava.javacore.Zgenerics.dominio.Barco;
import academy.devdojo.maratonajava.javacore.Zgenerics.service.BarcoRentavelService;
import academy.devdojo.maratonajava.javacore.Zgenerics.service.CarroRentavelService;

public class ClasseGenericaTest02 {
    public static void main(String[] args) {
        BarcoRentavelService barcoRentavelServiceo = new BarcoRentavelService();
        Barco carro = barcoRentavelServiceo.buscarBarcoDisponivel();
        System.out.println("Usando barco por um mês");
        barcoRentavelServiceo.retornarBarcoAlugado(carro);
        // Perceba aqui é praticamente a mesma coisa só vai mudar o tipo

        //
    }
}
