package academy.devdojo.maratonajava.javacore.ZZAclassesinternas.test;

class Animal {
    public void walk() {
        System.out.println("Animal Walk");
    }
}
// Agora imagine que você quer sobrescrever o métod acima
// mas por um tempo breve, tu não precisa criar uma outra classe,
// fazer o polimorfismo e sugir o código, tu pode usar uma classe anônima.

public class AnonymousClassesTest01 {
    public static void main(String[] args) {
        // Imagine que você quer sobrescrever o métod Walk,
        // somente nesse pedaço de código, Vamos criar uma classe anônima
        Animal animal = new Animal() {
          // Aqui estamos criando uma classe anônima que é uma subclasse de animal

            @Override
            public void walk() {
                System.out.println("Walking in the shadows");
            }
        };
        animal.walk();
        // Walking in the shadows
    }
}
