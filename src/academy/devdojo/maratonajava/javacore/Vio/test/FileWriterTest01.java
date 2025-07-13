package academy.devdojo.maratonajava.javacore.Vio.test;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

// File
// FileWriter
// FileReader
// BufferedWriter
// BufferedReader
public class FileWriterTest01 {
    public static void main(String[] args) {
        File file = new File("file.txt");
        // Você vai percerber que quando tu trabalha com o io, você vai começar a encadear as classes entre si
        // Lembrete: Quando você está trabalhando com leitura e escrita de arquivo, você quase sempre trabalha com recursos do
        // Sistema Operacional e quase sempre quando está trabalhando esse recurso tu precisa FECHAR oq você abriu
        try {

            FileWriter fw = new FileWriter(file, true);
            // Para escrever vamos utilizar o write
            fw.write("O DevDoj é maneirooooooo elegante melhor melhor melhor melhor\nContinuando a contoria bem legal empolgante na próxima linha");
            // Write é bem baixo nível (Não temos muitas opções)
            /*Pense quando estiver trabalhando com o arquivos sendo um túnel, e um vídeo no youtube com a barra de
            * Load (Bufferd) existe a chance de você fechar o vídeo e a barra não carregar por completo, da mesma forma
            * pode aconter quando se trabalha com arquivos, o arquivo pode ser fechado e todos os dados não terem sido
            * enviados, para que o envio de todos os dados aconteça utilizamos o métod flush() -> que vai dizer para enviar
            * tudo para o arquivo*/
            fw.flush();
            fw.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

        /*QUando utilziamos o FileWriter, como segundo parâmetro podemos dizer se queremos substituir o conteúdo por um novo
        * (Já faz isso por padrão) ou queremos ir adicionando mais conteudo ao final do antigo (só adicionar um true)*/
    }
}
