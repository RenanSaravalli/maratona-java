package academy.devdojo.maratonajava.javacore.Vio.test;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;

public class BufferedReaderTest01 {
    public static void main(String[] args) {
        File file = new File("file.txt");
        // O buffered reader também vai encapsular o fileReader
        // vamos para a criação abaixo vamos declará-los dentro do try com recursos, para que eles se fechem
        try (
                FileReader fr = new FileReader(file);
                BufferedReader br = new BufferedReader(fr)
        ){
            String linha;
            while ((linha = br.readLine()) != null) {
                System.out.println(linha);
            }

        } catch (Exception e) {
            e.printStackTrace();
        }
        // o BufferedReader vai ler a linha inteira -> Fazemos isso com o métod readLine()
        // que em questão de performance é bem melhor você ler a linha inteira do que caractere por caractere
        // Quando ele chega no final ele retorna null.
        // Então temos que verificar se o valor retornado é diferente de null
    }
}
