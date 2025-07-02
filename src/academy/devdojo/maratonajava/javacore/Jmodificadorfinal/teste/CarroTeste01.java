package academy.devdojo.maratonajava.javacore.Jmodificadorfinal.teste;

import academy.devdojo.maratonajava.javacore.Jmodificadorfinal.dominio.Carro;
import academy.devdojo.maratonajava.javacore.Jmodificadorfinal.dominio.Comprador;

public class CarroTeste01 {
    public static void main(String[] args) {
        Carro carro = new Carro();
        Comprador comprador2 = new Comprador();

        System.out.println(Carro.VELOCIDADE_LIMITE);

        // Objeto final sem o valor do atributo nome
        System.out.println(carro.COMPRADOR);

        carro.COMPRADOR.setNome("SAfado Jailson");

        // Objeto final com o atributo nome setado o valor
        System.out.println(carro.COMPRADOR);
    }
}
