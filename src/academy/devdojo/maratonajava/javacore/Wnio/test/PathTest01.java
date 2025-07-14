package academy.devdojo.maratonajava.javacore.Wnio.test;

import java.nio.file.Path;
import java.nio.file.Paths;

public class PathTest01 {
    public static void main(String[] args) {
        // Agora vamos pegar um Path
        Path paths1 = Paths.get("/home/renan/dev/java/maratona-java/file.txt");
        Path paths2 = Paths.get("/home/renan/dev/java/maratona-java", "file.txt");
        Path paths3 = Paths.get("/home", "renan/dev/java/maratona-java/file.txt");
        Path paths4 = Paths.get("/home", "renan","dev","java", "maratona-java", "file.txt");
        System.out.println(paths1.getFileName());
        System.out.println(paths2.getFileName());
        System.out.println(paths3.getFileName());
        System.out.println(paths4.getFileName());

        // Encontrou o Arquivo de todas as formas acima
    }
}
