package academy.devdojo.maratonajava.javacore.Rdatas.test;

import java.time.LocalTime;
import java.time.temporal.ChronoField;

public class LocalTimeTest01 {
    public static void main(String[] args) {
        // Classe mais atualizada a partir do java 8 que vai nos ajudar a trabalhar com as horas

        // Como criamos um LocalTime?
        // LocalTime.of(24, 32, 12); Cuidado ao criar um hora assim a hora vai até 23

        // Criando passando um horário em específico
        LocalTime lt = LocalTime.of(23, 32, 12);

        System.out.println(lt);

        // Pegando o horário atual
        LocalTime timeNow = LocalTime.now();
        System.out.println(timeNow);

        // Vamos ter também alguns métodos interessantes para nos ajudarem parecido com a LocalDate
        System.out.println("Horas: " + timeNow.getHour());
        System.out.println("Minutos: " + timeNow.getMinute());
        System.out.println("Segundos: " + timeNow.getSecond());
        System.out.println(timeNow.get(ChronoField.CLOCK_HOUR_OF_DAY));

        // Alguns métodos interessantes é caso tu queira pegar meia noite até o máx do dia, ou seja
        // Se tu que a hora que o dia começou e a hora que terminou
        System.out.println(LocalTime.MIN); // 00:00
        System.out.println(LocalTime.MAX); // 23:59:59.999999999
    }
}
