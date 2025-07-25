package academy.devdojo.maratonajava.javacore.Zgenerics.test;

abstract class Animal {
    public abstract void consulta();
}
class Cachorro extends Animal {

    @Override
    public void consulta() {
        System.out.println("Consultando Doguinho");
    }
}

class Gato extends Animal {

    @Override
    public void consulta() {
        System.out.println("Consultando Gatinho");
    }
}
public class WildcardTest01 {
    public static void main(String[] args) {
        Cachorro[] cachorrosArray = {new Cachorro(), new Cachorro()};
        Gato[] gatosArray = {new Gato(), new Gato()};

        printConsulta(cachorrosArray);
        printConsulta(gatosArray);
        // Perceba que o comando a baixo funciona para os arrays
        // Mas quando partirmos para as listas vai ficar um pouco mais complicado
        Animal[] animalsArray = {new Gato(), new Cachorro()};
        // Basicamente o polimorfismo isso né
        Animal animal = new Gato();
        printConsulta(animalsArray);

    }

    private static void printConsulta(Animal[] animals) {
        for (Animal animal : animals) {
            animal.consulta();
        }
    }
}

