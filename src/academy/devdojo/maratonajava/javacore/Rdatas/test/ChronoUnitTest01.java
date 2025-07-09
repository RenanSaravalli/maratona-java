package academy.devdojo.maratonajava.javacore.Rdatas.test;

import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;

public class ChronoUnitTest01 {
    public static void main(String[] args) {
        // Praticamente tudo que é relacionado a unidade de data e período é utilizado através dessa ChronoUnit
        LocalDateTime aniversario = LocalDateTime.of(2005, 07, 28, 00,00);
        LocalDateTime now = LocalDateTime.now();
        System.out.println(ChronoUnit.DAYS.between(aniversario, now));
        // Quantidade de dias no período acima

        System.out.println(ChronoUnit.MONTHS.between(aniversario, now));
        // Quantidade de meses no período acima

        System.out.println(ChronoUnit.WEEKS.between(aniversario, now));
        // Quantidade de semanas no período acima

        System.out.println(ChronoUnit.YEARS.between(aniversario,now));
        // Quantidade de anos no período acima
    }
}
