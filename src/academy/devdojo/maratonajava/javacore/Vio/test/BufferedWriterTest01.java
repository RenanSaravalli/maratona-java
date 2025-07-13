package academy.devdojo.maratonajava.javacore.Vio.test;

import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;

public class BufferedWriterTest01 {
    public static void main(String[] args) {
        // Praticamente a mesma coisa da fileWriter
        // A bufferedWriter recebe um fileWriter dentro do construtor
        File file = new File("file.txt");
        // Estamos encapsulando a FileWriter dentro de um BufferedWriter que é mais otimizado que vai utilizar um buffer
        try (
                FileWriter fw = new FileWriter(file, true);
                BufferedWriter bw = new BufferedWriter(fw)
        ){
            bw.write("Novinha que chega embraza e da choque no seu sistema");
            bw.newLine();
            bw.write("Cê pediu para te botar e eu boto com pressão");
            bw.flush();

        } catch (IOException e) {
            e.printStackTrace();
        }

        // Nem tod sistema operacional o \n representa a quebra de linha então a BufferedWritter tem seu
        // próprio métod que quebra a linha o BufferedWritter.newLine()
        // Da mesma forma que no FileWriter temos que utilizar o flush() para adicionar as informações no arquivo
        // antes de fecha-lo
        // lembrar de fechar o arquivo, a maneira acima fechamos utilizando o try com recursos
        // utiliza dados em memória
    }
}
