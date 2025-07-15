package academy.devdojo.maratonajava.javacore.Wnio.test;

import java.nio.file.Path;
import java.nio.file.Paths;

public class ResolveTest03 {
    public static void main(String[] args) {
        Path dir = Paths.get("home/renan");
        Path arquivo = Paths.get("dev/arquivo.txt");
        Path resolve = dir.resolve(arquivo);
        System.out.println(resolve);
        // home/renan/dev/arquivo.txt

        // Mas cuidado ao misturar caminho absoluto com caminho relativo
        // Quando você utiliza o caminho absoluto (/caminho/caminho) no Resolve. Ele vai devolver o caminho absoluto
        // pois não tem oq resolver o caminho já é absoluto

        Path absoluto = Paths.get("/home/renan");
        Path relativo = Paths.get("dev");
        Path file = Paths.get("file.txt");

        System.out.println("1 " + absoluto.resolve(relativo));
        System.out.println("2 " + relativo.resolve(absoluto));
        System.out.println("3 " + absoluto.resolve(relativo).resolve(file));
        System.out.println("4 " + file.resolve(relativo));
        System.out.println("5 " + file.resolve(absoluto));

    }
}
