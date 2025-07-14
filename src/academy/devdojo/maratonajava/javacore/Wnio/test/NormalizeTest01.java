package academy.devdojo.maratonajava.javacore.Wnio.test;

import java.nio.file.Path;
import java.nio.file.Paths;

public class NormalizeTest01 {
    public static void main(String[] args) {
        String diretorioProjeto = "home/renan/dev";
        String arquivoTxt = "../../arquivo.txt";
        Path path1 = Paths.get(diretorioProjeto, arquivoTxt);
        System.out.println(path1);
        // home/renan/dev/../../arquivo.txt
        // Perceba que o diretório não está normalizado (../) -> Não voltou as pastas
        // para normalizar utilizamos -> .normalize()
        System.out.println(path1.normalize() );
        Path path2 = Paths.get("/home/./renan/./dev");
        System.out.println(path2);              // /home/./renan/./dev
        System.out.println(path2.normalize());  // /home/renan/dev

    }
}
