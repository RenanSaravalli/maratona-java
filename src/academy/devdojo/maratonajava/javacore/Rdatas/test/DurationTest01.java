package academy.devdojo.maratonajava.javacore.Rdatas.test;

import java.time.Duration;
import java.time.Instant;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.temporal.ChronoUnit;

public class DurationTest01 {
    public static void main(String[] args) {
        // Então para trabalhar com o Durantion você precisa de duas datas
        LocalDateTime now = LocalDateTime.now();
        LocalDateTime nowAfterTwoYears = LocalDateTime.now().plusYears(2);
        LocalTime timeNow = LocalTime.now();
        LocalTime timeMinus7Hours = LocalTime.now().minusHours(7);

        // Com o duration podemos ver quanto tempo passou de agora para outra quantidade de tempo utilizando o between
        Duration d1 = Duration.between(now, nowAfterTwoYears);
        Duration d2 = Duration.between(timeNow, timeMinus7Hours);
        Duration d3 = Duration.between(Instant.now(), Instant.now().plusSeconds(1000));
        System.out.println(d1);
        System.out.println(d2);
        System.out.println(d3);

        // Só tomar cuidado ao utilizar a duration, pois ela não aceita localDate, pois a localDate não possui segundos

        // podemos ver a quantidade de horas de acordo com uma quantidade de dias
        System.out.println(Duration.ofDays(20));
        // 20 dias tem 480 horas

        // Podemos utilizar of
        System.out.println(Duration.of(3, ChronoUnit.HOURS));
        // vai retornar 3 horas
    }
}
