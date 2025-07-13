package academy.devdojo.maratonajava.javacore.Vio.test;

import java.io.File;
import java.io.FileReader;
import java.io.IOException;

public class FileReaderTest01 {
    public static void main(String[] args) {
        File file = new File("file.txt");
        // Como tu sabe quando trabalhamos com recursos do S.O. temos de fechá-los
        // Podemos fechar com o try com recursos da maneira abaixo
        try (FileReader fr = new FileReader(file)) {
            //char[] in = new char[30];
            //fr.read(in);
            //for (char c : in) {
              //  System.out.print(c);
            //}

            // Lendo o arquivo inteiro da maneira abaixo
            int i;
            while ((i=fr.read()) != -1){
                System.out.print((char) i);
            }
            // Ele vai lendo posição por posição verificando se é -1 caso não seja ele vai converter para
            // caractere o int e mostrar na tela

        } catch (IOException e) {
            e.printStackTrace();
        }

        // Read retorna um int e quando chefa ao final do arquivo ele retorna -1
        // Podemos adicionar tipo ded um buffer no argumento do read sendo um Array de char que ele vai adicionar
        // os valores do arquivo para dentro do array
    }
}
