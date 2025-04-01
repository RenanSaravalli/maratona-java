package academy.devdojo.maratonajava.javacore.Bintroducaometodos.teste;

import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.Estudante;
import academy.devdojo.maratonajava.javacore.Bintroducaometodos.dominio.ImpressoraEstudante;

public class EstudanteTeste01 {
    public static void main(String[] args) {
        Estudante estudante01 = new Estudante();
        Estudante estudante02 = new Estudante();
        ImpressoraEstudante impressora = new ImpressoraEstudante();

        estudante01.nome = "Midoriya";
        estudante01.idade = 15;
        estudante01.sexo = 'M';

        estudante02.nome = "Sakura";
        estudante02.idade = 16;
        estudante02.sexo = 'F';

        System.out.println(estudante01.nome);
        System.out.println(estudante01.idade);
        System.out.println(estudante01.sexo);

        System.out.println("-------------");

        System.out.println(estudante02.nome);
        System.out.println(estudante02.idade);
        System.out.println(estudante02.sexo);

        impressora.imprime(estudante01);
        impressora.imprime(estudante02);

        System.out.println("------nome-alterado------");

        impressora.imprime(estudante01);
        impressora.imprime(estudante02);
    }
}
// Quando trabalhamos com objetos do tipo referência estamos, passando uma
// Referência

// Quando passamos objetos como argumento, na verdade, estamos, passando a referência
// de onde o objeto está guardado.

// Podemos ter várias referências para o mesmo objeto.

// Quando estamos, passando parâmetros via referência tudo que fizer no objeto
// vai afetar o objeto

// As boas regras da progração diz que ao invés de alterarmos os dados que estamos
// passando no objeto se precisarmos realizar alguma alteração temos que retornar
// um novo objeto

