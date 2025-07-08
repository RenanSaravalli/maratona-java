package academy.devdojo.maratonajava.javacore.Rdatas.test;

import java.util.Calendar;
import java.util.Date;

public class CalendarTest01 {
    public static void main(String[] args) {
        // 2 classe de datas que a galera do
        // java criaram para tentar consertar os problemas que a classe date não tava conseguindo da conta praticamente
        // todos relacionados a internacionalização

        // Calendar é uma classe abstrata, ou seja, você não pode utilizar new
        // Como estamos no Brasil ele vai utilizar o calendário gregoriano
        Calendar calendar = Calendar.getInstance();
        System.out.println(calendar);
        // Você vai perceber que no calendar tu recebe informação para cacete
        // Para organizar as informações tu pode utilizar um pequeno hackzin para ver as informações
        Date date = calendar.getTime();
        System.out.println(date);
        // Tue Jul 08 17:37:45 BRT 2025

        // O Calendar possui alguns métodos bem úteis
        // Digamos que você quer saber qual é o primeiro dia da semana
        if (calendar.getFirstDayOfWeek() == Calendar.SUNDAY) {
            System.out.println("Domingo é o primeiro dia da semana");
        }
        System.out.println("Dia da semana: " + calendar.get(Calendar.DAY_OF_WEEK));
        System.out.println("Dia do mês: " + calendar.get(Calendar.DAY_OF_MONTH));
        System.out.println("Dia do ano: " + calendar.get(Calendar.DAY_OF_YEAR));
        System.out.println("Semana no Mês: " + calendar.get(Calendar.DAY_OF_WEEK_IN_MONTH));

        // Podemos adicionar dias e horas
        calendar.add(Calendar.DAY_OF_MONTH, 2);
        calendar.add(Calendar.HOUR, 2);
        // Observação no métod date caso tu passe uma quantidade de hora que vire o dia, o dia vai virar,
        // ou passar mais de 12 meses o ano vai virar
        Date newdate = calendar.getTime();
        System.out.println(newdate);

        // O métod roll vai impedir que essa virada aconteça
        calendar.roll(Calendar.HOUR, 21);
        Date newdate2 = calendar.getTime();
        System.out.println(newdate2);

    }
}
