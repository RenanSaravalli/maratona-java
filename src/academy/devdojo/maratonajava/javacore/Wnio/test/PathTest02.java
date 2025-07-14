package academy.devdojo.maratonajava.javacore.Wnio.test;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardCopyOption;

public class PathTest02 {
    public static void main(String[] args) throws IOException {
       // Vamos pegar um diretório e criá-lo
        // Utilizamos o Paths
        Path pasta = Paths.get("pasta");

        // Caso o arquivo já exista ele lança uma exceção, para contornar isso verificamos se o arquivo existe
        if (Files.notExists(pasta)) {
            // Agora criamos o diretório com o métod abaixo
            Path pastaDirectory = Files.createDirectory(pasta);
        }
        // Podemos criar subpastas dentro de subpastas com outro métod createDirectories
        Path subPastaPath = Paths.get("pasta/subpasta/subsubpasta");
        Path subPastaDirectory = Files.createDirectories(subPastaPath);
        // O métod acima não lança uma exceção caso já exista as pastas ao chamá-lo

        // Agora como fazemos para criar um arquivo em si
        // Utilizamos o Files.createFile(), nele passamos um Path() -> o Caminho que o arquivo vai ser criado
        Path filePath = Paths.get(subPastaPath.toString(), "file.txt");
        if (Files.notExists(filePath)) {
            // Da mesma forma se você executar e o arquivo já exister o java lança uma exceção
            Path filePathCreated = Files.createFile(filePath);
        }

        // Movendo arquivos os renomeando
        Path origem = filePath;
        Path destino = Paths.get(filePath.getParent().toString(), "file_renamed.txt");
        Files.copy(origem, destino, StandardCopyOption.REPLACE_EXISTING);
        System.out.println(origem);

        // No caso acima origem é o caminho inteiro incluindo o arquivo pasta/subpasta/subsubpasta/file.txt
        // Agora destino vamos pegar a pasta a qual o file.txt está podemos fazer isso utilizando o comando
        // filePath.getParent().toString() que pega a pasta a qual o file.txt está, em seguida colocamos o nome do destino
        // e utilizamos o comando copy(origem, destino) colocando em seu parâmetro a origem e o destino do arquivo
        // Os valores de file.txt vão para file_renamed.txt
    }
}
