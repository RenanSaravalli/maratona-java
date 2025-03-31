package academy.devdojo.maratonajava.javacore.Bintroducaometodos.teste;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Calculadora;

public class CalculadoraTeste03 {
    public static void main(String[] args) {
        Calculadora calculadora = new Calculadora();

        double resultado = calculadora.divideDoisNumeros(10, 2);
        System.out.println(resultado);

        System.out.println(calculadora.divideDoisNumeros(10,0));
        System.out.println(calculadora.divideDoisNumeros02(10,0));

        System.out.println("----------------");

        calculadora.imprimeDivisaoDoisNumeros(20,0);
        calculadora.imprimeDivisaoDoisNumeros(86,5);
    }
}
