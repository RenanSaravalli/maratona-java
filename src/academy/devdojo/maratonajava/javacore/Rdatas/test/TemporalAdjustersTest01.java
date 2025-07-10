package academy.devdojo.maratonajava.javacore.Rdatas.test;

import academy.devdojo.maratonajava.javacore.Gassociacao.dominio.Local;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjusters;

public class TemporalAdjustersTest01 {
    public static void main(String[] args) {
        LocalDate now = LocalDate.now();
        now = now.plusDays(25);
        // Se ultrapassarmos a quantidade limite de dias do mês ele vira para o próximo mês.
        System.out.println(now);

        // POdemos utilizar o with para alterar para um número de dia, mês, ano em específico sem afetar, alterar as outras datas
        now = now.withDayOfMonth(30);
        // Agora o dia passa a ser 30
        System.out.println(now);

        System.out.println(now.withMonth(12));
        // mês agora é 12

        // Podemos passar um TemporalField no with
        now = now.with(ChronoField.YEAR_OF_ERA, 2030);
        System.out.println(now);

        // Dia 10/07 é uma Quinta-feira digamos que queria saber quando é a proxima quinta-feira
        now = LocalDate.now().with(TemporalAdjusters.next(DayOfWeek.THURSDAY));
        System.out.println(now);
        // No caso ele trás dia 17

        // Temos também o nextSame que trás o dia de acordo com o dia da semana passada sendo a mesma ou a próxima
        now = LocalDate.now().with(TemporalAdjusters.nextOrSame(DayOfWeek.THURSDAY));
        System.out.println(now);

        // Podemos querer pegar quando que foi a quinta-feira passada 03-07-2025
        now = LocalDate.now().with(TemporalAdjusters.previous(DayOfWeek.THURSDAY));
        System.out.println(now);

        // Podemos querer pegar quando que foi o primeiro e o último dia do mês
        now = LocalDate.now().with(TemporalAdjusters.firstDayOfMonth());
        System.out.println(now);
        System.out.println(now.getDayOfWeek());
        //último dia do mês
        now = LocalDate.now().with(TemporalAdjusters.lastDayOfMonth());
        System.out.println(now);
        System.out.println(now.getDayOfWeek());

        // Podemos pegar o primeiro mês do próximo ano
        now = LocalDate.now().with(TemporalAdjusters.firstDayOfNextYear());
        System.out.println(now);
        System.out.println(now.getDayOfWeek());

        // Podemos pegar o primeiro mês do próximo mês
        now = LocalDate.now().with(TemporalAdjusters.firstDayOfNextMonth());
        System.out.println(now);
        System.out.println(now.getDayOfWeek());

        /*Então a TemporalAdjusters vai funcionar dessa forma, você consegue manipular a data meio que plotando ela inteira*/
    }
}
