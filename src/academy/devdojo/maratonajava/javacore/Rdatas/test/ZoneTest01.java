package academy.devdojo.maratonajava.javacore.Rdatas.test;

import java.time.*;
import java.time.chrono.JapaneseDate;
import java.util.Map;

public class ZoneTest01 {
    public static void main(String[] args) {
        // O que são zonas: Famosas UTC da dia a zona a qual seu calendário vai estar formatado
        Map<String, String> shortIds = ZoneId.SHORT_IDS; // Todas as zonas que o java oferece suporte
        System.out.println(shortIds);

        // Podemos pegar a zona a qual seu SO se encontra
        System.out.println(ZoneId.systemDefault());
        // America/Sao_Paulo

        // Caso queira acessar uma ZoneId em específico
        ZoneId zoneTokyo = ZoneId.of("Asia/Tokyo");
        System.out.println(zoneTokyo);
        //Asia/Tokyo

        // Com essa zona podemos utilizar o LocalDateTime para alterar nosso horário
        LocalDateTime now = LocalDateTime.now();
        System.out.println("Padrão "+ now);
        
        // Agora para setar a zona
        ZonedDateTime nowTokyo = now.atZone(zoneTokyo);
        System.out.println("Tokyo " + nowTokyo);
        //Tokyo 2025-07-10T18:14:06.061354502+09:00[Asia/Tokyo] + 9horas

        // Podemos utilizar com o Instant, que no caso já vai aplicar o horário de acordo com a zona
        Instant instantNow = Instant.now();
        ZonedDateTime nowInstantTokyo = instantNow.atZone(zoneTokyo);
        System.out.println(nowInstantTokyo);
        //2025-07-11T06:17:16.616515826+09:00[Asia/Tokyo]

        // Existem alguns lugares que não sabemos exatamente qual zona utilizar
        // Exemplo digamos que queremos Manaus, não sei a zona de Manaus. Temos uma classe especial chamada: ZoneOffset
        // Ela vai nos deixar trabalhar com as zonas mas utilizando horários
        // pode ver que temos o mínimo e o máximo

        System.out.println(ZoneOffset.MIN);
        System.out.println(ZoneOffset.MAX );

        // Temos que colocar no formato correto: "00:00"

        ZoneOffset offsetManaus = ZoneOffset.of("-04:00");
        OffsetDateTime offsetDateTimeManaus = now.atOffset(offsetManaus);
        System.out.println(offsetDateTimeManaus);
        //2025-07-10T18:24:22.004212210-04:00
        OffsetDateTime offsetDateTimeManaus2 = OffsetDateTime.of(now, offsetManaus); // Mesma coisa que no de cima
        System.out.println(offsetDateTimeManaus2);

        // Da mesma forma podemos colocar no instant
        OffsetDateTime offsetDateTimeInstantManus = instantNow.atOffset(offsetManaus);
        System.out.println(offsetDateTimeInstantManus);

        // Tu sabe que temos diferentes tipos de calendário. O calendário japonês é diferente do nosso
        // Então vamos trabalhar com o calendário japonês

         // Exemplo tu quer saber como está o calendário japonês de acordo com a data de hoje
        JapaneseDate japaneseDate = JapaneseDate.from(LocalDate.now());
        System.out.println(japaneseDate);
        // Japanese Reiwa 7-07-10

        // Você também pode escolher a era de acordo com alguma outra data
        LocalDate localDateMeiji = LocalDate.of(1900, 2, 1);
        JapaneseDate meijiEra = JapaneseDate.from(localDateMeiji);
        System.out.println(meijiEra);
        // Japanese Meiji 33-02-01

    }
}
