package academy.devdojo.maratonajava.introducao;

public class Aula06EstruturasDeRepeticao01 {
    public static void main(String[] args) {
        // while, do while, for
        int cont = 0;
        while (cont < 10) {
            System.out.println(++cont);
        }
        cont = 5;
        do {
            System.out.println("Dentro do cuzinho do do while ");
            cont++;
        } while (cont < 10);

        for (int i = 0; i < 3; i++) {
            System.out.println("Cu: " + i);
        }
    }
}
