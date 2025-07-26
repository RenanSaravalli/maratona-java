package academy.devdojo.maratonajava.javacore.ZZAclassesinternas.test;

public class OuterClassesTest02 {
     private String name = "Midoriya";

     void print(final String param) {
         String lastname = "Izuku";
          class LocalClass {
              public void printLocal() {
                  System.out.println(name + " " + lastname);
              }
          }
         LocalClass localClass = new LocalClass();
          localClass.printLocal();
     }

    public static void main(String[] args) {
        OuterClassesTest02 outer = new OuterClassesTest02();
        outer.print("Sexo");
    }
}
