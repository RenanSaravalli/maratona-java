package academy.devdojo.maratonajava.javacore.Oexception.exception.test;

import java.io.File;
import java.io.IOException;

public class ExceptionTest02 {
    public static void main(String[] args) throws IOException{
        // Aqui podemos tratar a quela exceção mandando um email falando que não deu certo de criar o arquivo
        criarNovoArquivo();
    }

    public static void criarNovoArquivo()throws IOException {
        File file = new File("arquivo/teste.txt");
        try {
            // tratando a exceção
            boolean isCriado = file.createNewFile();
            System.out.println("Arquivo criado " + isCriado);
        } catch (IOException e){
            // exebi no console a merda
            e.printStackTrace();
            // Mas não sei oq o métod que vai chamar esse métod quer fazer
            // Então relançamos a exceção
            throw e;
        };
    }
}
