package academy.devdojo.maratonajava.javacore.Wnio.test;

import java.nio.file.Path;
import java.nio.file.Paths;

public class RelativizeTest01 {
    public static void main(String[] args) {
        // Dados dois paths por exemplo Path1 e Path2
        // Como é que fazemos para chegar no Path2 a partir do Path1

        Path dir = Paths.get("/home/renan");
        Path clazz = Paths.get("/home/renan/devdojofoda/OlaMundo.java");

        //  Como que fazemos para pegar onde esse OlaMundo.java se encontra

        Path pathToClass = dir.relativize(clazz);

        // Do meu /home/renan como fazemos para chegar na classe OlaMundo

        System.out.println(pathToClass);
        // devdojofoda/OlaMundo.java -> temos que percorrer este caminho para chegar

        // Vamos ver alguns exemplos lidando com caminhos absolutos e relativos

        Path absoluto1 = Paths.get("/home/renan");
        Path absoluto2 = Paths.get("/usr/local");
        Path absoluto3 = Paths.get("/home/renan/devdojofoda/OlaMundo.java");
        Path relativo1 = Paths.get("temp");
        Path relativo2 = Paths.get("temp/temp.2021921");

        System.out.println("1 " + absoluto1.relativize(absoluto3));
        System.out.println("2 " + absoluto3.relativize(absoluto1));
        System.out.println("3 " + absoluto1.relativize(absoluto2));
        System.out.println("3 " + relativo1.relativize(relativo2));
        //System.out.println("3 " + absoluto1.relativize(relativo1)); vai disparar uma exceção


    }
}
