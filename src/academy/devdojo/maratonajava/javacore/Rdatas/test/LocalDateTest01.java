package academy.devdojo.maratonajava.javacore.Rdatas.test;

import java.time.LocalDate;
import java.time.Month;
import java.time.temporal.ChronoField;
import java.util.Calendar;
import java.util.Date;

public class LocalDateTest01 {
    public static void main(String[] args) {
        System.out.println(new Date());
        System.out.println(Calendar.getInstance());
        // Temos a cima as versões mais antigas
        // Agora vamos ver as classes do pacote java.time que vai nos ajuda e são mais potentes

        // LocalDate
        // Com a LocalDate trabalhamos mais com a data em si, não temos a hora
        // Então como criamos uma data utilizando o LocalDate de uma Data específica, veja abaixo
        LocalDate date = LocalDate.of(2020, Month.JANUARY, 27);

        // Agora vamos ver como pegar a data de agora
        LocalDate dataAgora = LocalDate.now();

        // Vamos ver os métodos utilitários que vai nos ajudar a trabalhar com datas
        // Podemos pegar o ano
        System.out.println(date.getYear());
        // Podemos pegar o mês
        System.out.println(date.getMonth());
        // Caso queira o valor do mês
        System.out.println(date.getMonthValue());
        // Podemos pegar o dia da semana
        System.out.println(date.getDayOfWeek());
        // Podemos pegar o dia do mês
        System.out.println(date.getDayOfMonth());
        // Podemos pegar o dia do ano
        System.out.println(date.getDayOfYear());
        // Caso queira a quantidade de dias do mês
        System.out.println(date.lengthOfMonth());
        // Podemos ver se é um ano bissexto ou não
        System.out.println(date.isLeapYear());

        // Podemos ser mais personalizavel com o get
        System.out.println(date.get(ChronoField.YEAR));
        System.out.println(date.get(ChronoField.DAY_OF_MONTH));

        // Algumas coisas interessantes que eles também mudaram foi a formatação
        System.out.println(date);
        // Agora a data já vem formatada na forma certa de como geralmente colocamos as datas no banco de dados

        // para ver a data de agora
        System.out.println("Data de hoje: " + dataAgora);

        // Agora também temos a possibilidade de pegar uma data bem longa:
        System.out.println("Data máxima: " + LocalDate.MAX);
        System.out.println("Data mínima: " + LocalDate.MIN);

        // Em resume daqui para frente priorize trabalhar com a LocalDate
    }
}
