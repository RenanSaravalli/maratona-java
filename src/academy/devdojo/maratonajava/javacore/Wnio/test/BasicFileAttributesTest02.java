package academy.devdojo.maratonajava.javacore.Wnio.test;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.attribute.BasicFileAttributeView;
import java.nio.file.attribute.BasicFileAttributes;
import java.nio.file.attribute.FileTime;
import java.time.LocalDateTime;
import java.time.ZoneOffset;

public class BasicFileAttributesTest02 {
    public static void main(String[] args) throws IOException {
        Path path = Paths.get("pasta2/novo_path.txt");
        // Acessando alguns atributos do arquivo
        BasicFileAttributes basicFileAttributes = Files.readAttributes(path, BasicFileAttributes.class);
        FileTime creationTime = basicFileAttributes.creationTime();
        FileTime lastModifiedTime = basicFileAttributes.lastModifiedTime();
        FileTime lastAccesTime = basicFileAttributes.lastAccessTime();

        System.out.println("creationTime: " + creationTime);
        System.out.println("lastModifiedTime: " + lastModifiedTime);
        System.out.println("lastAccesTime: " + lastAccesTime);

        System.out.println(" ");

        // Normalmente os métodos que vão nos permitir realizar alterações nos arquivos terminam com view
        BasicFileAttributeView fileAttributeView = Files.getFileAttributeView(path, BasicFileAttributeView.class);
        FileTime newCreationTime = FileTime.fromMillis(System.currentTimeMillis());
        fileAttributeView.setTimes(lastModifiedTime, newCreationTime, creationTime);

        creationTime = fileAttributeView.readAttributes().creationTime();
        lastModifiedTime = fileAttributeView.readAttributes().lastModifiedTime();
        lastAccesTime = fileAttributeView.readAttributes().lastAccessTime();

        System.out.println("creationTime: " + creationTime);
        System.out.println("lastModifiedTime: " + lastModifiedTime);
        System.out.println("lastAccesTime: " + lastAccesTime);

        // Tudo que tem view é utilizado para fazer alteração no que eles disponibilizam e para pegar o objeto através da
        // getFileAttributeView



    }
}
