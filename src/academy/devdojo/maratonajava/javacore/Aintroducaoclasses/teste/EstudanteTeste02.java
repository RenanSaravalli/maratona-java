package academy.devdojo.maratonajava.javacore.Aintroducaoclasses.teste;

import academy.devdojo.maratonajava.javacore.Aintroducaoclasses.dominio.Estudante;

public class EstudanteTeste02 {
    public static void main(String[] args) {
        Estudante estudante = new Estudante();
        Estudante estudante2 = new Estudante();

        // Valores dos atributos quando ñ atribuímos
        estudante.nome = "Sanji"; // alterando o valor padrão de nome
        System.out.println(estudante.nome);  // null
        System.out.println(estudante.idade); // 0
        System.out.println(estudante.sexo);  // ''

        System.out.println("-------------------");
        // Mostrando o valor padrão de nome que foi definido na classe
        System.out.println(estudante2.nome);
        System.out.println(estudante2.sexo);
        System.out.println(estudante2.idade);
    }
}
