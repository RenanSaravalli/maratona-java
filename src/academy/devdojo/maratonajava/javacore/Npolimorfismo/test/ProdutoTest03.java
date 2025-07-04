package academy.devdojo.maratonajava.javacore.Npolimorfismo.test;

import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Computador;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Produto;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.dominio.Tomate;
import academy.devdojo.maratonajava.javacore.Npolimorfismo.servico.CalculadoraImposto;

public class ProdutoTest03 {
    public static void main(String[] args) {
        Produto produto = new Computador("Ryzen 5 5600", 560.5);

        Tomate tomate = new Tomate("tomate pelado", 5);
        tomate.setDataValidade("05/07/2025");

        CalculadoraImposto.calcularImposto(tomate);
        System.out.println("---------------------------");
        CalculadoraImposto.calcularImposto(produto);
    }
}
