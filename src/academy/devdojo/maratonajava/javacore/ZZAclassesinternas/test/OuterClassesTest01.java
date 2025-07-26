 package academy.devdojo.maratonajava.javacore.ZZAclassesinternas.test;

public class OuterClassesTest01 {
    private String name = "Monkey D. Luffy";

    class Inner {
    // É como se fosse um métod, mas bem mais poderoso, pois
        // podemos declarar atributos e vai ter acesso a todos
        // os objetos da classe mais externa
        public void printOuterClassAttribute() {
            System.out.println(name);
            System.out.println(this);
            // nesse caso o this faz referência para a classe interna
            // para referênciar o this da classe externa fazemos
            System.out.println(OuterClassesTest01.this);
        }
    }

    public static void main(String[] args) {
        OuterClassesTest01 outerClass = new OuterClassesTest01();
        Inner inner = outerClass.new Inner();
        // Do objeto da classe de for, vamos criar um objeto da classe de dentro
        Inner inner2 = new OuterClassesTest01().new Inner();
        inner.printOuterClassAttribute();
        inner2.printOuterClassAttribute();
    }
}
