package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.teste;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Carro;

public class CarroTeste01 {
    public static void main(String[] args) {
        Carro carro1 = new Carro();
        carro1.nome = "Fusca";
        carro1.modelo = "VW";
        carro1.ano = 1941;

        Carro carro2 = new Carro();
        carro2.nome = "Camaro";
        carro2.modelo = "Chevrolet";
        carro2.ano = 2010;

        carro1.imprimeValores();

        System.out.println("-----------------");

        carro2.imprimeValores();
    }
}
