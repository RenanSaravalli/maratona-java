package academy.devdojo.maratonajava.javacore.Rdatas.test;

import java.time.Instant;

public class InstantTest01 {
    public static void main(String[] args) {
        // Classe parecida com a date com a diferença que a date trabalha com milissegundos
        // e a instant trabalha com nanossegundos, guarda os nanossegundos de 1970 até agora
        // Para pegar um instant de agora
        Instant instant = Instant.now();
        System.out.println(instant); // 2025-07-09T19:14:01.705781156Z
        // Esse Z representa o zulu time (Horário neutro do mundo)

        // Se tu não saber a ZONA que essa data foi salva representando você vai ter um puta problemão
        // para pegar uma data precisa
        // Por isso é comum utilizarmos o zulu time (UTC) para pegarmos as nossas datas, por ser um data/horário neutro
        // É mais fácil realizar a conversão para a zona que preferir
        // Curiosidade: o nano por ser muito grande não cabe no Long então a galera do java o dividiu em 2
        System.out.println(instant.getNano());
        System.out.println(instant.getEpochSecond());

        // para trabalhar como seres humanos dias, messes, anos, eras pra gente fica melhor -> LocalDateTime
        // interessante se estiver trabalhando com aplicação
    }
}
