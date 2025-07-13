package academy.devdojo.maratonajava.javacore.Vio.test;

import java.io.File;
import java.io.IOException;

public class FileTest02 {
    public static void main(String[] args) throws IOException {
        File diretorio = new File("pasta");
        // Criando um diretório
        boolean isDiretorio = diretorio.mkdir();
        System.out.println("Diretório criado: " + isDiretorio);

        // Agora como poderíamos fazer para criar um arquivo dentro do diretório
        // Temos duas opções:
        // 1 copiar o caminho tod e complementa com o arquivo que quer colocar lá dentro
        File arquivoDiretorio = new File("/home/renan/dev/java/maratona-java/pasta/arquivo.txt");
        boolean isFileCreated = arquivoDiretorio.createNewFile();
        System.out.println("Arquivo criado: " + isFileCreated);

        // 2 forma podemos passar o objeto que faz referência para o diretório
        File arquivoDiretorio2 = new File(diretorio,"arquivo2.txt");
        boolean isFileCreated2 = arquivoDiretorio2.createNewFile();
        System.out.println("Arquivo 2 criado: " + isFileCreated2);

        File arquivoRename = new File(diretorio, "arquivo_renomeado.txt");
        boolean isFileRenamed = arquivoDiretorio.renameTo(arquivoRename);
        System.out.println("Arquivo renomeado: " + isFileRenamed);

        // Para renomear um diretório é a mesma coisa
        File fileRenamed = new File("pasta2");
        boolean isDiretorioRenomeado = diretorio.renameTo(fileRenamed);
        System.out.println("O diretório foi renomeado: " + isDiretorioRenomeado);

        // Para criar um diretório utilizamos o mkdir()
        // Podemos renomear um arquivo utilizando o renameTo, para isso criamos um novo objeto de Referência File, nele passamos
        // como argumento o novo nome do arquivo, caso queira manter a localização do arquivo coloque o diretório que ele está
        // no objeto file que queira trocar o nome chame o métod renameTO()
    }
}
