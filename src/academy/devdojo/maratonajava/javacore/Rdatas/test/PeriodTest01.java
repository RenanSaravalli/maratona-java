package academy.devdojo.maratonajava.javacore.Rdatas.test;

import java.time.LocalDate;
import java.time.Period;

public class PeriodTest01 {
    public static void main(String[] args) {
        // Como vimos a Duration vai trabalhar com a parte do tempo com horas baseado em segundos e nanossegundos
        // e a Period vai representar pelos dias, meses e anos
        // é uma classe baseada na Data, podemos trabalhar com ela e com a Duration também
        // A Period vai aceitar apenas LocalDate

        LocalDate now = LocalDate.now();
        LocalDate nowAfterTwoYears = LocalDate.now().plusYears(2).plusDays(7);

        Period period1 = Period.between(now, nowAfterTwoYears);
        System.out.println(period1);
        // P2Y7D -> período de 2 anos e 7 dias

        // Da mesma forma na Duration temos acesso ao métod of
        Period p1 = Period.ofDays(10);
        Period p2 = Period.ofWeeks(58);
        Period p3 = Period.ofMonths(12);
        Period p4 = Period.ofYears(1);
        System.out.println(p1); // 10 dias tem 10 dias
        System.out.println(p2); // 58 semanas tem 406 dias
        System.out.println(p3); // 12 meses tem 12 meses
        System.out.println(p4); // 1 ano tem 1 ano

        // Period não vai conseguir retornar a quantidade de meses conforme a quantidade de dias
        System.out.println(p2.getMonths()); // Retorna 0

    }
}
