package academy.devdojo.maratonajava.javacore.Rdatas.test;

import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;

public class LocalDateTimeTest01 {
    public static void main(String[] args) {
        // Praticamente uma junção das classes LocalDate e LocalTime
        // Criando a partir da atual data e horário
        LocalDateTime localDateTime = LocalDateTime.now();
        // Dessa forma temos a data e a hora atual
        System.out.println(localDateTime); // 2025-07-09T15:50:50.513686563

        // Falando dos métodos utilitários essa classe vai ter o mesmo métod das anteriores

        // Então vamos ver algumas coisas interanssantes. Podemos realizar o Parse de uma String para um objeto
        // LocalDate, LocalTime
        LocalDate ld = LocalDate.parse("2025-02-12");
        LocalTime lt = LocalTime.parse("10:45:00");
        System.out.println("Data: " + ld);
        System.out.println("Hora: " + lt);

        // Podemos também realizar uma junção de LocalDate e LocalTime
        LocalDateTime ldt01 = ld.atTime(lt);
        LocalDateTime ldt02 = lt.atDate(ld);

        System.out.println("Junção: " + ldt01);
        System.out.println("Junção: " + ldt02);
    }
}
