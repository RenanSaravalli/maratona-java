package academy.devdojo.maratonajava.javacore.Vio.test;

import java.io.File;
import java.io.IOException;
import java.time.Instant;
import java.time.ZoneId;

public class FileTest01 {
    public static void main(String[] args) {
        File file = new File("file.txt");
        // Caso você queira salvar na mesma pasta Só colocar o nome do arquivo,
        // Caso queira salvar em outra pasta, adicionar o caminho
        // Mas apenas criar o objeto de File não acontece nada, temos que chamar o métod específico que cria o arquivo
        try {
            // file.delete(); -> Deleta o arquivo (Boa prática verificar se o arquivo existe antes de deletar )
            Boolean isCreated = file.createNewFile();
            System.out.println("Arquivo criado: " + isCreated);
            // Podemos pegar a pasta do arquivo
            System.out.println(file.getPath());
            // e o caminho absoluto
            System.out.println(file.getAbsolutePath());
            // Podemos verificar se é um arquivo ou diretório
            System.out.println("IsFile: " + file.isFile());
            System.out.println("IsDirectory: " + file.isDirectory());
            // Podemos verificar se o arquivo é oculto
            System.out.println("IsHidden: " + file.isHidden());
            // Podemos verificar a última vez que foi modificado (Vai retornar um long ai temos que converter)
            System.out.println("Last Modifed: " + Instant.ofEpochMilli(file.lastModified()).atZone(ZoneId.systemDefault()));
            if (file.exists()) {
                System.out.println("Arquivo deletado: " + file.delete());
            }
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}
