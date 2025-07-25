package academy.devdojo.maratonajava.javacore.Zgenerics.test;

import java.util.List;

public class WildcardTest02 {
    public static void main(String[] args) {
        List<Cachorro> cachorrosList = List.of(new Cachorro(), new Cachorro());
        List<Gato> gatosList = List.of(new Gato(), new Gato());
        // printConsulta(cachorrosList);
        // printConsulta(gatosList);

        // Agora vamos ter um erro de compilação
        // Quando comparamos aos arrays esse erro não existe
        // Esse erro de compilação existe justamente pq,
        // Uma vez que o código é compilado o java não sabe que tipo
        // de lista você está passando
        // Lembra do Type erasure. Por conta desse cara o java não
        // sabe depois de compilamos o java não etende no caso do exemplo
        // que oq estamos passando a lista de cachorros, e essa
        // lista de cachorros pode ser referenciada por uma
        // lista de animais
    }

    private static void printConsulta(List<Animal> animals) {
        for (Animal animal : animals) {
            animal.consulta();
        }
        Animal a = new Cachorro();
        animals.add(new Cachorro());
        // Isso pode, mas
        // quando estamos trabalhando com listas, o tipo da
        // lista no argumento do métod teríamos que passar exatamente oq foi definido
        // na sintaxe do argumento
        // AI POR ISSO HAHAHA TEMOS O CORINGA
        // o wildcardf
        // vamos nos aprofundar nele na próxima aula
    }
}
