package academy.devdojo.maratonajava.javacore.Sformatacao.test;

import java.text.DateFormat;
import java.util.Calendar;

public class DateFormatTest01 {
    public static void main(String[] args) {
        // Vamos ver como nós podemos formatar as nossas datas
        // Basicamente ela vai oferecer alguns métodos predefinidos para formatarmos
        Calendar calendar = Calendar.getInstance();
        DateFormat[] df = new DateFormat[7];

        df[0] = DateFormat.getInstance();
        // 08/07/2025 18:10

        df[1] = DateFormat.getDateInstance();
        // 8 de jul. de 2025

        df[2] = DateFormat.getDateTimeInstance();
        // 8 de jul. de 2025 18:10:33

        df[3] = DateFormat.getDateInstance(DateFormat.SHORT);
        // 08/07/2025

        df[4] = DateFormat.getDateInstance(DateFormat.MEDIUM);
        // 8 de jul. de 2025

        df[5] = DateFormat.getDateInstance(DateFormat.LONG);
        // 8 de julho de 2025

        df[6] = DateFormat.getDateInstance(DateFormat.FULL);
        // terça-feira, 8 de julho de 2025

        // Basicamente as opções acima são algumas formas de formatar datas automaticamete baseado na configuração
        // que o dateFormat te propõe
        // Lembrando que essa formatação é baseado na localização do seu computador
        // Temos que passar um Date para formatar

        for (DateFormat dateFormat : df) {
            System.out.println(dateFormat.format(calendar.getTime()));
        }

        // obs: para formatações um pouco mais avançadas vamos utilizar outra classe:
        // SimpleDateFormat
    }
}
