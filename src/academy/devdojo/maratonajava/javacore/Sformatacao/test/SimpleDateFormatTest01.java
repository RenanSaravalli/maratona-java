package academy.devdojo.maratonajava.javacore.Sformatacao.test;

import java.text.SimpleDateFormat;
import java.util.Date;

public class SimpleDateFormatTest01 {
    public static void main(String[] args) {
        // Vamos ver mais uma classe para formatar datas de uma forma mais simples e flexível

        // Abaixo vamos criar nosso padrão de tradução
        String pattern = "'Brasil' dd 'de' MMMM 'de' yyyy";
        // Você pode adicionar palvras em aspas simples '' que o SimpleDateFormat vai desconsiderar
        // No exemplo acima criamos nosso padrão personalizado, Caso queira ver mais exemplos de formatação
        // Consulte a documentação

        String pattern2 = "'Catanduva' dd'/'MM'/'yy 'Agora são exatamente' kk 'e pouco'";

        // Instanciando o objeto passando nosso padrão de formatação
        SimpleDateFormat sdf = new SimpleDateFormat(pattern2);

        // E para formartar temos que passar uma data
        // Vamos passar a data de hoje
        System.out.println(sdf.format(new Date()));
    }
}
