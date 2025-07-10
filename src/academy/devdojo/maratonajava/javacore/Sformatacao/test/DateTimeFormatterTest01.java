package academy.devdojo.maratonajava.javacore.Sformatacao.test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.Locale;

public class DateTimeFormatterTest01 {
    public static void main(String[] args) {
        // Essa é agora a classe responsável por formatação.
        // Quando você está trabalhando com formatação, toda vez que você vê a palavra format significa
        // que você está transformando do seu objeto para um String,
        // Toda Vez que tu vê a palavra Parse você está transformando de uma String para o seu Objeto

        LocalDate date = LocalDate.now();
        // Vamos formatar a data com aluns tipos já predefinidos
        String s1 = date.format(DateTimeFormatter.BASIC_ISO_DATE);
        String s2 = date.format(DateTimeFormatter.ISO_DATE);
        String s3 = date.format(DateTimeFormatter.ISO_LOCAL_DATE);
        // Formatando de objeto para String
        System.out.println(s1);
        System.out.println(s2);
        System.out.println(s3);

        // Parse de String para o objeto. Cuidado: A string tem que bater com o formato, e temos que passar o formato
        // no qual a String está.
        LocalDate l1 = LocalDate.parse("20250710", DateTimeFormatter.BASIC_ISO_DATE);
        LocalDate l2 = LocalDate.parse("2025-07-10", DateTimeFormatter.ISO_DATE);
        LocalDate l3 = LocalDate.parse("2025-07-10", DateTimeFormatter.ISO_LOCAL_DATE);

        System.out.println(l1);
        System.out.println(l2);
        System.out.println(l3);

        // Da mesma forma podemos utilizar para o LocalDateTime
        LocalDateTime ltdNow = LocalDateTime.now();
        String s4 = ltdNow.format(DateTimeFormatter.ISO_DATE_TIME);
        System.out.println(s4);
        LocalDateTime l4 = LocalDateTime.parse("2025-07-10T19:02:28.931227054", DateTimeFormatter.ISO_DATE_TIME);
        System.out.println(l4);

        // Nem sempre temos um formato predefinido no Java que vai atender oque queremos
        // digamos por exemplo que queremos
        // dd/MM/yyyy
        // MM/dd/yyyy
        // yyyy/MM/dd

        DateTimeFormatter formatoBr = DateTimeFormatter.ofPattern("dd/MM/yyyy");
        String nowBr = LocalDate.now().format(formatoBr);
        System.out.println(nowBr);
        // 10/07/2025
        // Para fazer o caminho contrário passar de String para objeto
        LocalDate localDateBR = LocalDate.parse(nowBr, formatoBr);
        System.out.println(localDateBR);

        // O DateTimeFormatter Também pode trabalhar com o Locale
        DateTimeFormatter dateTimeFormatterGY = DateTimeFormatter.ofPattern("dd.MMMM.yyyy", Locale.GERMAN);
        String StringlocalDateGy = LocalDate.now().format(dateTimeFormatterGY);
        System.out.println(StringlocalDateGy); // 10.Juli.2025
        // Podemos realizar o caminho de volta
        LocalDate localDateGy = LocalDate.parse("10.Juli.2025", dateTimeFormatterGY);
        System.out.println(localDateGy);

    }
}
